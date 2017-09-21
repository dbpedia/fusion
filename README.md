# fusion
algorithms to fuse dbpedia

```
# download data with

mkdir -p data/hdt
cd data/hdt
wget -r --no-parent http://downloads.dbpedia.org/2016-10/tmp/data/
```

```

export MAVEN_OPTS="-Xmx230G"
mvn exec:java -Dexec.mainClass="org.dbpedia.fusion.Fuse"

```
actually, `-Xmx12G` is enough , just put it here, because I can
