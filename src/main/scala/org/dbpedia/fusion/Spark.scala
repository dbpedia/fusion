package org.dbpedia.convert.api
import org.apache.spark.{SparkConf, SparkContext}
import org.dbpedia.extraction.destinations.Quad


  object Spark {
    def main(args: Array[String]) {
      val conf = new SparkConf()
        .setAppName("sort-example")
        .setMaster("local[*]")
        .registerKryoClasses(Array(Class.forName("org.dbpedia.extraction.destinations.Quad")));
      // Create a Scala Spark Context.
      val sc = new SparkContext(conf)
      // Load our input data.
      val input = sc.textFile("/home/shellmann/IdeaProjects/JSONDump/data/mappingbased_literals_wkd_uris_el.tql.bz2")

      input
        //Sort all lines as strings
        .sortBy(s => s)
        // convert lines to Quads
        .filter(s => !s.startsWith("#"))
        .flatMap {
          case Quad(quad) => Some(quad)
          case _ => None
        }
        .filter(_.subject.nonEmpty)
        .filter(_.predicate.equalsIgnoreCase("http://dbpedia.org/ontology/birthDate"))
        .sortBy(_.subject)
        // Group quads by subject
        .groupBy(_.subject)
        // have them again sorted to save them as sorted
        //      .sortBy(_._1)
        .filter(_._2.size > 1)
        .filter(_._2.map(_.value.replace("0", "")).toSet.size > 1) // at least 2 different values
        .filter(_._2.map(q => q.context.substring(q.context.indexOf('?'))).toSet.size > 1) // from at least 2 different sources
        // quads should be converted to json-ld
        .map { qg => {
        qg._1 + "\t" + qg._2.map(qs => {
          val lang = try {qs.context.substring(7, qs.context.indexOf("."))} catch {case _:Throwable => ""}
          lang.replace("www","wkd").replace("dbpedia","en") + ":" + qs.value
        }).mkString("\t")
      }}
        .saveAsTextFile("/home/shellmann/IdeaProjects/JSONDump/data/birthdates.tsv")


    }
  }


