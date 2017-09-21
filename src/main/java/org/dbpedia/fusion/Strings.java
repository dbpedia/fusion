package org.dbpedia.fusion;

import org.apache.commons.collections.map.HashedMap;
import org.rdfhdt.hdt.hdt.HDTManager;

import java.util.Map;

public class Strings {

    private static Map<String, String> dbToWD = null;


    public static Map<String,String> getMap() {

        if (dbToWD == null) {
            Map<String, String> hm = new HashedMap();
            hm.put("http://dbpedia.org/ontology/LunarCrater" , "http://www.wikidata.org/entity/Q1348589");
            hm.put("http://dbpedia.org/ontology/Archeologist" , "http://www.wikidata.org/entity/Q3621491");
            hm.put("http://dbpedia.org/ontology/Enzyme" , "http://www.wikidata.org/entity/Q8047");
            hm.put("http://dbpedia.org/ontology/SongWriter" , "http://www.wikidata.org/entity/Q753110");
            hm.put("http://dbpedia.org/ontology/Square" , "http://www.wikidata.org/entity/Q174782");
            hm.put("http://dbpedia.org/ontology/University" , "http://www.wikidata.org/entity/Q3918");
            hm.put("http://dbpedia.org/ontology/AnatomicalStructure" , "http://www.wikidata.org/entity/Q4936952");
            hm.put("http://dbpedia.org/ontology/TelevisionShow" , "http://www.wikidata.org/entity/Q15416");
            hm.put("http://dbpedia.org/ontology/LaunchPad" , "http://www.wikidata.org/entity/Q1353183");
            hm.put("http://dbpedia.org/ontology/MusicFestival" , "http://www.wikidata.org/entity/Q868557");
            hm.put("http://dbpedia.org/ontology/Tax" , "http://www.wikidata.org/entity/Q8161");
            hm.put("http://dbpedia.org/ontology/Racecourse" , "http://www.wikidata.org/entity/Q1777138");
            hm.put("http://dbpedia.org/ontology/IceHockeyPlayer" , "http://www.wikidata.org/entity/Q11774891");
            hm.put("http://dbpedia.org/ontology/FilmFestival" , "http://www.wikidata.org/entity/Q220505");
            hm.put("http://dbpedia.org/ontology/TheatreDirector" , "http://www.wikidata.org/entity/Q3387717");
            hm.put("http://dbpedia.org/ontology/SpaceShuttle" , "http://www.wikidata.org/entity/Q48806");
            hm.put("http://dbpedia.org/ontology/Prison" , "http://www.wikidata.org/entity/Q40357");
            hm.put("http://dbpedia.org/ontology/HandballPlayer" , "http://www.wikidata.org/entity/Q13365117");
            hm.put("http://dbpedia.org/ontology/Religious" , "http://www.wikidata.org/entity/Q2566598");
            hm.put("http://dbpedia.org/ontology/Painter" , "http://www.wikidata.org/entity/Q1028181");
            hm.put("http://dbpedia.org/ontology/WaterRide" , "http://www.wikidata.org/entity/Q2870166");
            hm.put("http://dbpedia.org/ontology/Tower" , "http://www.wikidata.org/entity/Q12518");
            hm.put("http://dbpedia.org/ontology/Protein" , "http://www.wikidata.org/entity/Q8054");
            hm.put("http://dbpedia.org/ontology/Town" , "http://www.wikidata.org/entity/Q3957");
            hm.put("http://dbpedia.org/ontology/RomanEmperor" , "http://www.wikidata.org/entity/Q842606");
            hm.put("http://dbpedia.org/ontology/ReligiousBuilding" , "http://www.wikidata.org/entity/Q1370598");
            hm.put("http://dbpedia.org/ontology/PowerStation" , "http://www.wikidata.org/entity/Q159719");
            hm.put("http://dbpedia.org/ontology/Engineer" , "http://www.wikidata.org/entity/Q81096");
            hm.put("http://dbpedia.org/ontology/Name" , "http://www.wikidata.org/entity/Q82799");
            hm.put("http://dbpedia.org/ontology/Farmer" , "http://www.wikidata.org/entity/Q131512");
            hm.put("http://dbpedia.org/ontology/Locomotive" , "http://www.wikidata.org/entity/Q93301");
            hm.put("http://dbpedia.org/ontology/Wrestler" , "http://www.wikidata.org/entity/Q13474373");
            hm.put("http://dbpedia.org/ontology/GolfTournament" , "http://www.wikidata.org/entity/Q15061650");
            hm.put("http://dbpedia.org/ontology/Sales" , "http://www.wikidata.org/entity/Q194189");
            hm.put("http://dbpedia.org/ontology/AdultActor" , "http://www.wikidata.org/entity/Q488111");
            hm.put("http://dbpedia.org/ontology/GridironFootballPlayer" , "http://www.wikidata.org/entity/Q14128148");
            hm.put("http://dbpedia.org/ontology/NationalAnthem" , "http://www.wikidata.org/entity/Q23691");
            hm.put("http://dbpedia.org/ontology/AcademicConference" , "http://www.wikidata.org/entity/Q2020153");
            hm.put("http://dbpedia.org/ontology/Treadmill" , "http://www.wikidata.org/entity/Q683267");
            hm.put("http://dbpedia.org/ontology/Settlement" , "http://www.wikidata.org/entity/Q486972");
            hm.put("http://dbpedia.org/ontology/Producer" , "http://www.wikidata.org/entity/Q3282637");
            hm.put("http://dbpedia.org/ontology/Software" , "http://www.wikidata.org/entity/Q7397");
            hm.put("http://dbpedia.org/ontology/Opera" , "http://www.wikidata.org/entity/Q1344");
            hm.put("http://dbpedia.org/ontology/President" , "http://www.wikidata.org/entity/Q30461");
            hm.put("http://dbpedia.org/ontology/RacingDriver" , "http://www.wikidata.org/entity/Q378622");
            hm.put("http://dbpedia.org/ontology/TennisPlayer" , "http://www.wikidata.org/entity/Q10833314");
            hm.put("http://dbpedia.org/ontology/Event" , "http://www.wikidata.org/entity/Q1656682");
            hm.put("http://dbpedia.org/ontology/Band" , "http://www.wikidata.org/entity/Q215380");
            hm.put("http://dbpedia.org/ontology/Country" , "http://www.wikidata.org/entity/Q6256");
            hm.put("http://dbpedia.org/ontology/Fencer" , "http://www.wikidata.org/entity/Q737498Q13381863");
            hm.put("http://dbpedia.org/ontology/Fish" , "http://www.wikidata.org/entity/Q152");
            hm.put("http://dbpedia.org/ontology/Magazine" , "http://www.wikidata.org/entity/Q41298");
            hm.put("http://dbpedia.org/ontology/Galaxy" , "http://www.wikidata.org/entity/Q318");
            hm.put("http://dbpedia.org/ontology/Manhwa" , "http://www.wikidata.org/entity/Q562214");
            hm.put("http://dbpedia.org/ontology/Taxon" , "http://www.wikidata.org/entity/Q16521");
            hm.put("http://dbpedia.org/ontology/LawFirm" , "http://www.wikidata.org/entity/Q613142");
            hm.put("http://dbpedia.org/ontology/Ocean" , "http://www.wikidata.org/entity/Q9430");
            hm.put("http://dbpedia.org/ontology/Airport" , "http://www.wikidata.org/entity/Q1248784");
            hm.put("http://dbpedia.org/ontology/SoccerPlayer" , "http://www.wikidata.org/entity/Q937857");
            hm.put("http://dbpedia.org/ontology/Island" , "http://www.wikidata.org/entity/Q23442");
            hm.put("http://dbpedia.org/ontology/Muscle" , "http://www.wikidata.org/entity/Q7365");
            hm.put("http://dbpedia.org/ontology/InformationAppliance" , "http://www.wikidata.org/entity/Q1067263");
            hm.put("http://dbpedia.org/ontology/Psychologist" , "http://www.wikidata.org/entity/Q212980");
            hm.put("http://dbpedia.org/ontology/Stream" , "http://www.wikidata.org/entity/Q47521");
            hm.put("http://dbpedia.org/ontology/Surfer" , "http://www.wikidata.org/entity/Q13561328");
            hm.put("http://dbpedia.org/ontology/Hospital" , "http://www.wikidata.org/entity/Q16917");
            hm.put("http://dbpedia.org/ontology/HotSpring" , "http://www.wikidata.org/entity/Q177380");
            hm.put("http://dbpedia.org/ontology/Philosopher" , "http://www.wikidata.org/entity/Q4964182");
            hm.put("http://dbpedia.org/ontology/Church" , "http://www.wikidata.org/entity/Q16970");
            hm.put("http://dbpedia.org/ontology/Tunnel" , "http://www.wikidata.org/entity/Q44377");
            hm.put("http://dbpedia.org/ontology/Rower" , "http://www.wikidata.org/entity/Q13382576");
            hm.put("http://dbpedia.org/ontology/Valley" , "http://www.wikidata.org/entity/Q39816");
            hm.put("http://dbpedia.org/ontology/Writer" , "http://www.wikidata.org/entity/Q36180");
            hm.put("http://dbpedia.org/ontology/Ideology" , "http://www.wikidata.org/entity/Q7257");
            hm.put("http://dbpedia.org/ontology/SoccerManager" , "http://www.wikidata.org/entity/Q628099");
            hm.put("http://dbpedia.org/ontology/Poem" , "http://www.wikidata.org/entity/Q5185279");
            hm.put("http://dbpedia.org/ontology/Politician" , "http://www.wikidata.org/entity/Q82955");
            hm.put("http://dbpedia.org/ontology/Monarch" , "http://www.wikidata.org/entity/Q116");
            hm.put("http://dbpedia.org/ontology/Road" , "http://www.wikidata.org/entity/Q34442");
            hm.put("http://dbpedia.org/ontology/Volcano" , "http://www.wikidata.org/entity/Q8072");
            hm.put("http://dbpedia.org/ontology/Newspaper" , "http://www.wikidata.org/entity/Q11032");
            hm.put("http://dbpedia.org/ontology/AmericanFootballPlayer" , "http://www.wikidata.org/entity/Q14128148");
            hm.put("http://dbpedia.org/ontology/AcademicJournal" , "http://www.wikidata.org/entity/Q737498");
            hm.put("http://dbpedia.org/ontology/TableTennisPlayer" , "http://www.wikidata.org/entity/Q13382519");
            hm.put("http://dbpedia.org/ontology/VolleyballPlayer" , "http://www.wikidata.org/entity/Q15117302");
            hm.put("http://dbpedia.org/ontology/Non-ProfitOrganisation" , "http://www.wikidata.org/entity/Q163740");
            hm.put("http://dbpedia.org/ontology/School" , "http://www.wikidata.org/entity/Q3914");
            hm.put("http://dbpedia.org/ontology/Region" , "http://www.wikidata.org/entity/Q3455524");
            hm.put("http://dbpedia.org/ontology/LightNovel" , "http://www.wikidata.org/entity/Q747381");
            hm.put("http://dbpedia.org/ontology/SiteOfSpecialScientificInterest" , "http://www.wikidata.org/entity/Q422211");
            hm.put("http://dbpedia.org/ontology/Entomologist" , "http://www.wikidata.org/entity/Q3055126");
            hm.put("http://dbpedia.org/ontology/PoliticalParty" , "http://www.wikidata.org/entity/Q7278");
            hm.put("http://dbpedia.org/ontology/Presenter" , "http://www.wikidata.org/entity/Q13590141");
            hm.put("http://dbpedia.org/ontology/Watermill" , "http://www.wikidata.org/entity/Q185187");
            hm.put("http://dbpedia.org/ontology/EthnicGroup" , "http://www.wikidata.org/entity/Q41710");
            hm.put("http://dbpedia.org/ontology/Holiday" , "http://www.wikidata.org/entity/Q1445650");
            hm.put("http://dbpedia.org/ontology/Insect" , "http://www.wikidata.org/entity/Q1390");
            hm.put("http://dbpedia.org/ontology/Mineral" , "http://www.wikidata.org/entity/Q7946");
            hm.put("http://dbpedia.org/ontology/MusicalWork" , "http://www.wikidata.org/entity/Q2188189");
            hm.put("http://dbpedia.org/ontology/Mosque" , "http://www.wikidata.org/entity/Q32815");
            hm.put("http://dbpedia.org/ontology/Gene" , "http://www.wikidata.org/entity/Q7187");
            hm.put("http://dbpedia.org/ontology/GovernmentAgency" , "http://www.wikidata.org/entity/Q327333");
            hm.put("http://dbpedia.org/ontology/Flag" , "http://www.wikidata.org/entity/Q14660");
            hm.put("http://dbpedia.org/ontology/RallyDriver" , "http://www.wikidata.org/entity/Q10842936");
            hm.put("http://dbpedia.org/ontology/Mollusca" , "http://www.wikidata.org/entity/Q25326");
            hm.put("http://dbpedia.org/ontology/Wine" , "http://www.wikidata.org/entity/Q282");
            hm.put("http://dbpedia.org/ontology/Museum" , "http://www.wikidata.org/entity/Q33506");
            hm.put("http://dbpedia.org/ontology/FigureSkater" , "http://www.wikidata.org/entity/Q13219587");
            hm.put("http://dbpedia.org/ontology/Manga" , "http://www.wikidata.org/entity/Q8274");
            hm.put("http://dbpedia.org/ontology/PeriodicalLiterature" , "http://www.wikidata.org/entity/Q1092563");
            hm.put("http://dbpedia.org/ontology/Vein" , "http://www.wikidata.org/entity/Q9609");
            hm.put("http://dbpedia.org/ontology/Plant" , "http://www.wikidata.org/entity/Q756");
            hm.put("http://dbpedia.org/ontology/Guitar" , "http://www.wikidata.org/entity/Q6607");
            hm.put("http://dbpedia.org/ontology/Swimmer" , "http://www.wikidata.org/entity/Q10843402");
            hm.put("http://dbpedia.org/ontology/Factory" , "http://www.wikidata.org/entity/Q83405");
            hm.put("http://dbpedia.org/ontology/Ambassador" , "http://www.wikidata.org/entity/Q121998");
            hm.put("http://dbpedia.org/ontology/Parliament" , "http://www.wikidata.org/entity/Q35749");
            hm.put("http://dbpedia.org/ontology/RadioProgram" , "http://www.wikidata.org/entity/Q1555508");
            hm.put("http://dbpedia.org/ontology/ScreenWriter" , "http://www.wikidata.org/entity/Q28389");
            hm.put("http://dbpedia.org/ontology/Lawyer" , "http://www.wikidata.org/entity/Q40348");
            hm.put("http://dbpedia.org/ontology/Planet" , "http://www.wikidata.org/entity/Q634");
            hm.put("http://dbpedia.org/ontology/MovieDirector" , "http://www.wikidata.org/entity/Q2526255");
            hm.put("http://dbpedia.org/ontology/Family" , "http://www.wikidata.org/entity/Q8436");
            hm.put("http://dbpedia.org/ontology/Gate" , "http://www.wikidata.org/entity/Q53060");
            hm.put("http://dbpedia.org/ontology/Shrine" , "http://www.wikidata.org/entity/Q697295");
            hm.put("http://dbpedia.org/ontology/Population" , "http://www.wikidata.org/entity/Q33829");
            hm.put("http://dbpedia.org/ontology/Village" , "http://www.wikidata.org/entity/Q532");
            hm.put("http://dbpedia.org/ontology/Theatre" , "http://www.wikidata.org/entity/Q24354");
            hm.put("http://dbpedia.org/ontology/Drama" , "http://www.wikidata.org/entity/Q25372");
            hm.put("http://dbpedia.org/ontology/ProtectedArea" , "http://www.wikidata.org/entity/Q473972");
            hm.put("http://dbpedia.org/ontology/Employer" , "http://www.wikidata.org/entity/Q3053337");
            hm.put("http://dbpedia.org/ontology/MusicGenre" , "http://www.wikidata.org/entity/Q188451");
            hm.put("http://dbpedia.org/ontology/Year" , "http://www.wikidata.org/entity/Q577");
            hm.put("http://dbpedia.org/ontology/Priest" , "http://www.wikidata.org/entity/Q42603");
            hm.put("http://dbpedia.org/ontology/Sport" , "http://www.wikidata.org/entity/Q349");
            hm.put("http://dbpedia.org/ontology/Nerve" , "http://www.wikidata.org/entity/Q9620");
            hm.put("http://dbpedia.org/ontology/Hotel" , "http://www.wikidata.org/entity/Q27686");
            hm.put("http://dbpedia.org/ontology/FashionDesigner" , "http://www.wikidata.org/entity/Q3501317");
            hm.put("http://dbpedia.org/ontology/Library" , "http://www.wikidata.org/entity/Q7075");
            hm.put("http://dbpedia.org/ontology/Organ" , "http://www.wikidata.org/entity/Q1444");
            hm.put("http://dbpedia.org/ontology/Profession" , "http://www.wikidata.org/entity/Q28640");
            hm.put("http://dbpedia.org/ontology/Model" , "http://www.wikidata.org/entity/Q4610556");
            hm.put("http://dbpedia.org/ontology/Ligament" , "http://www.wikidata.org/entity/Q39888");
            hm.put("http://dbpedia.org/ontology/Activity" , "http://www.wikidata.org/entity/Q1914636");
            hm.put("http://dbpedia.org/ontology/Winery" , "http://www.wikidata.org/entity/Q156362");
            hm.put("http://dbpedia.org/ontology/RecordLabel" , "http://www.wikidata.org/entity/Q18127");
            hm.put("http://dbpedia.org/ontology/MetroStation" , "http://www.wikidata.org/entity/Q928830");
            hm.put("http://dbpedia.org/ontology/Cat" , "http://www.wikidata.org/entity/Q146");
            hm.put("http://dbpedia.org/ontology/Food" , "http://www.wikidata.org/entity/Q2095");
            hm.put("http://dbpedia.org/ontology/Play" , "http://www.wikidata.org/entity/Q25379");
            hm.put("http://dbpedia.org/ontology/Album" , "http://www.wikidata.org/entity/Q482994");
            hm.put("http://dbpedia.org/ontology/Meeting" , "http://www.wikidata.org/entity/Q2761147");
            hm.put("http://dbpedia.org/ontology/NuclearPowerStation" , "http://www.wikidata.org/entity/Q134447");
            hm.put("http://dbpedia.org/ontology/Airline" , "http://www.wikidata.org/entity/Q46970");
            hm.put("http://dbpedia.org/ontology/Media" , "http://www.wikidata.org/entity/Q340169");
            hm.put("http://dbpedia.org/ontology/MountainPass" , "http://www.wikidata.org/entity/Q133056");
            hm.put("http://dbpedia.org/ontology/Work" , "http://www.wikidata.org/entity/Q386724");
            hm.put("http://dbpedia.org/ontology/Glacier" , "http://www.wikidata.org/entity/Q35666");
            hm.put("http://dbpedia.org/ontology/Rocket" , "http://www.wikidata.org/entity/Q41291");
            hm.put("http://dbpedia.org/ontology/GolfPlayer" , "http://www.wikidata.org/entity/Q13156709");
            hm.put("http://dbpedia.org/ontology/Saint" , "http://www.wikidata.org/entity/Q43115");
            hm.put("http://dbpedia.org/ontology/HistoricalPeriod" , "http://www.wikidata.org/entity/Q11514315");
            hm.put("http://dbpedia.org/ontology/SquashPlayer" , "http://www.wikidata.org/entity/Q16278103");
            hm.put("http://dbpedia.org/ontology/Altitude" , "http://www.wikidata.org/entity/Q190200");
            hm.put("http://dbpedia.org/ontology/Anime" , "http://www.wikidata.org/entity/Q1107");
            hm.put("http://dbpedia.org/ontology/Book" , "http://www.wikidata.org/entity/Q571");
            hm.put("http://dbpedia.org/ontology/Language" , "http://www.wikidata.org/entity/Q315");
            hm.put("http://dbpedia.org/ontology/Language" , "http://www.wikidata.org/entity/Q34770");
            hm.put("http://dbpedia.org/ontology/Restaurant" , "http://www.wikidata.org/entity/Q11707");
            hm.put("http://dbpedia.org/ontology/GeologicalPeriod" , "http://www.wikidata.org/entity/Q392928");
            hm.put("http://dbpedia.org/ontology/Game" , "http://www.wikidata.org/entity/Q11410");
            hm.put("http://dbpedia.org/ontology/Legislature" , "http://www.wikidata.org/entity/Q11204");
            hm.put("http://dbpedia.org/ontology/Actor" , "http://www.wikidata.org/entity/Q33999");
            hm.put("http://dbpedia.org/ontology/Egyptologist" , "http://www.wikidata.org/entity/Q1350189");
            hm.put("http://dbpedia.org/ontology/Pyramid" , "http://www.wikidata.org/entity/Q12516");
            hm.put("http://dbpedia.org/ontology/Skyscraper" , "http://www.wikidata.org/entity/Q11303");
            hm.put("http://dbpedia.org/ontology/WindMotor" , "http://www.wikidata.org/entity/Q15854792");
            hm.put("http://dbpedia.org/ontology/Drug" , "http://www.wikidata.org/entity/Q8386");
            hm.put("http://dbpedia.org/ontology/Tournament" , "http://www.wikidata.org/entity/Q500834");
            hm.put("http://dbpedia.org/ontology/Train" , "http://www.wikidata.org/entity/Q870");
            hm.put("http://dbpedia.org/ontology/Windmill" , "http://www.wikidata.org/entity/Q38720");
            hm.put("http://dbpedia.org/ontology/SportsLeague" , "http://www.wikidata.org/entity/Q623109");
            hm.put("http://dbpedia.org/ontology/ProgrammingLanguage" , "http://www.wikidata.org/entity/Q9143");
            hm.put("http://dbpedia.org/ontology/RugbyPlayer" , "http://www.wikidata.org/entity/Q13415036");
            hm.put("http://dbpedia.org/ontology/Person" , "http://www.wikidata.org/entity/Q5");
            hm.put("http://dbpedia.org/ontology/Person" , "http://www.wikidata.org/entity/Q215627");
            hm.put("http://dbpedia.org/ontology/Dog" , "http://www.wikidata.org/entity/Q25324");
            hm.put("http://dbpedia.org/ontology/Motorcycle" , "http://www.wikidata.org/entity/Q34493");
            hm.put("http://dbpedia.org/ontology/Port" , "http://www.wikidata.org/entity/Q44782");
            hm.put("http://dbpedia.org/ontology/Statistic" , "http://www.wikidata.org/entity/Q1949963");
            hm.put("http://dbpedia.org/ontology/Prefecture" , "http://www.wikidata.org/entity/Q515716");
            hm.put("http://dbpedia.org/ontology/SpaceMission" , "http://www.wikidata.org/entity/Q2133344");
            hm.put("http://dbpedia.org/ontology/RailwayLine" , "http://www.wikidata.org/entity/Q728937");
            hm.put("http://dbpedia.org/ontology/Street" , "http://www.wikidata.org/entity/Q79007");
            hm.put("http://dbpedia.org/ontology/Monastery" , "http://www.wikidata.org/entity/Q44613");
            hm.put("http://dbpedia.org/ontology/RailwayTunnel" , "http://www.wikidata.org/entity/Q1311958");
            hm.put("http://dbpedia.org/ontology/GivenName" , "http://www.wikidata.org/entity/Q202444");
            hm.put("http://dbpedia.org/ontology/Artery" , "http://www.wikidata.org/entity/Q9655");
            hm.put("http://dbpedia.org/ontology/Archipelago" , "http://www.wikidata.org/entity/Q33837");
            hm.put("http://dbpedia.org/ontology/TennisTournament" , "http://www.wikidata.org/entity/Q13219666");
            hm.put("http://dbpedia.org/ontology/Synagogue" , "http://www.wikidata.org/entity/Q34627");
            hm.put("http://dbpedia.org/ontology/Judge" , "http://www.wikidata.org/entity/Q16533");
            hm.put("http://dbpedia.org/ontology/Ship" , "http://www.wikidata.org/entity/Q11446");
            hm.put("http://dbpedia.org/ontology/Award" , "http://www.wikidata.org/entity/Q618779");
            hm.put("http://dbpedia.org/ontology/Cemetery" , "http://www.wikidata.org/entity/Q39614");
            hm.put("http://dbpedia.org/ontology/FormerMunicipality" , "http://www.wikidata.org/entity/Q19730508");
            hm.put("http://dbpedia.org/ontology/Musical" , "http://www.wikidata.org/entity/Q2743");
            hm.put("http://dbpedia.org/ontology/BrownDwarf" , "http://www.wikidata.org/entity/Q101600");
            hm.put("http://dbpedia.org/ontology/Bone" , "http://www.wikidata.org/entity/Q265868");
            hm.put("http://dbpedia.org/ontology/City" , "http://www.wikidata.org/entity/Q515");
            hm.put("http://dbpedia.org/ontology/Economist" , "http://www.wikidata.org/entity/Q188094");
            hm.put("http://dbpedia.org/ontology/ShoppingMall" , "http://www.wikidata.org/entity/Q11315");
            hm.put("http://dbpedia.org/ontology/Journalist" , "http://www.wikidata.org/entity/Q1930187");
            hm.put("http://dbpedia.org/ontology/Hormone" , "http://www.wikidata.org/entity/Q8047");
            hm.put("http://dbpedia.org/ontology/Agent" , "http://www.wikidata.org/entity/Q24229398");
            hm.put("http://dbpedia.org/ontology/Mill" , "http://www.wikidata.org/entity/Q44494");
            hm.put("http://dbpedia.org/ontology/MilitaryUnit" , "http://www.wikidata.org/entity/Q176799");
            hm.put("http://dbpedia.org/ontology/PublicService" , "http://www.wikidata.org/entity/Q161837");
            hm.put("http://dbpedia.org/ontology/Disease" , "http://www.wikidata.org/entity/Q12136");
            hm.put("http://dbpedia.org/ontology/Grape" , "http://www.wikidata.org/entity/Q10978");
            hm.put("http://dbpedia.org/ontology/RaceTrack" , "http://www.wikidata.org/entity/Q1777138");
            hm.put("http://dbpedia.org/ontology/Monument" , "http://www.wikidata.org/entity/Q4989906");
            hm.put("http://dbpedia.org/ontology/Artist" , "http://www.wikidata.org/entity/Q483501");
            hm.put("http://dbpedia.org/ontology/Novel" , "http://www.wikidata.org/entity/Q8261");
            hm.put("http://dbpedia.org/ontology/Skater" , "http://www.wikidata.org/entity/Q847400");
            hm.put("http://dbpedia.org/ontology/Garden" , "http://www.wikidata.org/entity/Q1107656");
            hm.put("http://dbpedia.org/ontology/Eukaryote" , "http://www.wikidata.org/entity/Q19088");
            hm.put("http://dbpedia.org/ontology/VicePresident" , "http://www.wikidata.org/entity/Q42178");
            hm.put("http://dbpedia.org/ontology/BaseballLeague" , "http://www.wikidata.org/entity/Q6631808");
            hm.put("http://dbpedia.org/ontology/SpaceStation" , "http://www.wikidata.org/entity/Q25956");
            hm.put("http://dbpedia.org/ontology/Constellation" , "http://www.wikidata.org/entity/Q8928");
            hm.put("http://dbpedia.org/ontology/Skier" , "http://www.wikidata.org/entity/Q4270517");
            hm.put("http://dbpedia.org/ontology/SerialKiller" , "http://www.wikidata.org/entity/Q484188");
            hm.put("http://dbpedia.org/ontology/Abbey" , "http://www.wikidata.org/entity/Q160742");
            hm.put("http://dbpedia.org/ontology/Linguist" , "http://www.wikidata.org/entity/Q14467526");
            hm.put("http://dbpedia.org/ontology/Pope" , "http://www.wikidata.org/entity/Q19546");
            hm.put("http://dbpedia.org/ontology/ChemicalCompound" , "http://www.wikidata.org/entity/Q11173");
            hm.put("http://dbpedia.org/ontology/Beer" , "http://www.wikidata.org/entity/Q44");
            hm.put("http://dbpedia.org/ontology/OverseasDepartment" , "http://www.wikidata.org/entity/Q202216");
            hm.put("http://dbpedia.org/ontology/Intercommunality" , "http://www.wikidata.org/entity/Q3153117");
            hm.put("http://dbpedia.org/ontology/NobleFamily" , "http://www.wikidata.org/entity/Q13417114");
            hm.put("http://dbpedia.org/ontology/WorldHeritageSite" , "http://www.wikidata.org/entity/Q9259");
            hm.put("http://dbpedia.org/ontology/Comic" , "http://www.wikidata.org/entity/Q245068");
            hm.put("http://dbpedia.org/ontology/BroadcastNetwork" , "http://www.wikidata.org/entity/Q141683");
            hm.put("http://dbpedia.org/ontology/NobelPrize" , "http://www.wikidata.org/entity/Q7191");
            hm.put("http://dbpedia.org/ontology/Marriage" , "http://www.wikidata.org/entity/Q8445");
            hm.put("http://dbpedia.org/ontology/HockeyTeam" , "http://www.wikidata.org/entity/Q4498974");
            hm.put("http://dbpedia.org/ontology/Murderer" , "http://www.wikidata.org/entity/Q16266334");
            hm.put("http://dbpedia.org/ontology/Bridge" , "http://www.wikidata.org/entity/Q12280");
            hm.put("http://dbpedia.org/ontology/Mountain" , "http://www.wikidata.org/entity/Q8502");
            hm.put("http://dbpedia.org/ontology/CyclingRace" , "http://www.wikidata.org/entity/Q15091377");
            hm.put("http://dbpedia.org/ontology/Archive" , "http://www.wikidata.org/entity/Q166118");
            hm.put("http://dbpedia.org/ontology/Cave" , "http://www.wikidata.org/entity/Q35509");
            hm.put("http://dbpedia.org/ontology/HandballTeam" , "http://www.wikidata.org/entity/Q10517054");
            hm.put("http://dbpedia.org/ontology/Scientist" , "http://www.wikidata.org/entity/Q901");
            hm.put("http://dbpedia.org/ontology/ResearchProject" , "http://www.wikidata.org/entity/Q1298668");
            hm.put("http://dbpedia.org/ontology/Locality" , "http://www.wikidata.org/entity/Q3257686");
            hm.put("http://dbpedia.org/ontology/Animal" , "http://www.wikidata.org/entity/Q729");
            hm.put("http://dbpedia.org/ontology/Singer" , "http://www.wikidata.org/entity/Q177220");
            hm.put("http://dbpedia.org/ontology/Criminal" , "http://www.wikidata.org/entity/Q2159907");
            hm.put("http://dbpedia.org/ontology/Mammal" , "http://www.wikidata.org/entity/Q7377");
            hm.put("http://dbpedia.org/ontology/Medicine" , "http://www.wikidata.org/entity/Q11190");
            hm.put("http://dbpedia.org/ontology/Election" , "http://www.wikidata.org/entity/Q40231");
            hm.put("http://dbpedia.org/ontology/MobilePhone" , "http://www.wikidata.org/entity/Q17517");
            hm.put("http://dbpedia.org/ontology/Aircraft" , "http://www.wikidata.org/entity/Q11436");
            hm.put("http://dbpedia.org/ontology/FictionalCharacter" , "http://www.wikidata.org/entity/Q95074");
            hm.put("http://dbpedia.org/ontology/Biomolecule" , "http://www.wikidata.org/entity/Q206229");
            hm.put("http://dbpedia.org/ontology/Station" , "http://www.wikidata.org/entity/Q719456");
            hm.put("http://dbpedia.org/ontology/River" , "http://www.wikidata.org/entity/Q4022");
            hm.put("http://dbpedia.org/ontology/Organisation" , "http://www.wikidata.org/entity/Q43229");
            hm.put("http://dbpedia.org/ontology/PlayWright" , "http://www.wikidata.org/entity/Q214917");
            hm.put("http://dbpedia.org/ontology/SkiResort" , "http://www.wikidata.org/entity/Q130003");
            hm.put("http://dbpedia.org/ontology/BaseballPlayer" , "http://www.wikidata.org/entity/Q10871364");
            hm.put("http://dbpedia.org/ontology/RoadTunnel" , "http://www.wikidata.org/entity/Q2354973");
            hm.put("http://dbpedia.org/ontology/NaturalRegion" , "http://www.wikidata.org/entity/Q1970725");
            hm.put("http://dbpedia.org/ontology/Zoo" , "http://www.wikidata.org/entity/Q43501");
            hm.put("http://dbpedia.org/ontology/CultivatedVariety" , "http://www.wikidata.org/entity/Q4886");
            hm.put("http://dbpedia.org/ontology/Castle" , "http://www.wikidata.org/entity/Q23413");
            hm.put("http://dbpedia.org/ontology/Instrument" , "http://www.wikidata.org/entity/Q225829");
            hm.put("http://dbpedia.org/ontology/Mayor" , "http://www.wikidata.org/entity/Q30185");
            hm.put("http://dbpedia.org/ontology/Photographer" , "http://www.wikidata.org/entity/Q33231");
            hm.put("http://dbpedia.org/ontology/GolfCourse" , "http://www.wikidata.org/entity/Q1048525");
            hm.put("http://dbpedia.org/ontology/Dam" , "http://www.wikidata.org/entity/Q12323");
            hm.put("http://dbpedia.org/ontology/RugbyLeague" , "http://www.wikidata.org/entity/Q10962");
            hm.put("http://dbpedia.org/ontology/SoccerClub" , "http://www.wikidata.org/entity/Q476028");
            hm.put("http://dbpedia.org/ontology/Asteroid" , "http://www.wikidata.org/entity/Q3863");
            hm.put("http://dbpedia.org/ontology/Guitarist" , "http://www.wikidata.org/entity/Q855091");
            hm.put("http://dbpedia.org/ontology/Weapon" , "http://www.wikidata.org/entity/Q728");
            hm.put("http://dbpedia.org/ontology/Polyhedron" , "http://www.wikidata.org/entity/Q172937");
            hm.put("http://dbpedia.org/ontology/Lake" , "http://www.wikidata.org/entity/Q23397");
            hm.put("http://dbpedia.org/ontology/Celebrity" , "http://www.wikidata.org/entity/Q211236");
            hm.put("http://dbpedia.org/ontology/Letter" , "http://www.wikidata.org/entity/Q9788");
            hm.put("http://dbpedia.org/ontology/Letter" , "http://www.wikidata.org/entity/Q133492");
            hm.put("http://dbpedia.org/ontology/AcademicSubject" , "http://www.wikidata.org/entity/Q11862829");
            hm.put("http://dbpedia.org/ontology/Lighthouse" , "http://www.wikidata.org/entity/Q39715");
            hm.put("http://dbpedia.org/ontology/MemberOfParliament" , "http://www.wikidata.org/entity/Q486839");
            hm.put("http://dbpedia.org/ontology/SolarEclipse" , "http://www.wikidata.org/entity/Q3887");
            hm.put("http://dbpedia.org/ontology/Deity" , "http://www.wikidata.org/entity/Q178885");
            hm.put("http://dbpedia.org/ontology/RailwayStation" , "http://www.wikidata.org/entity/Q55488");
            hm.put("http://dbpedia.org/ontology/Poet" , "http://www.wikidata.org/entity/Q49757");
            hm.put("http://dbpedia.org/ontology/Boxing" , "http://www.wikidata.org/entity/Q32112");
            hm.put("http://dbpedia.org/ontology/TelevisionHost" , "http://www.wikidata.org/entity/Q947873");
            hm.put("http://dbpedia.org/ontology/Manhua" , "http://www.wikidata.org/entity/Q754669");
            hm.put("http://dbpedia.org/ontology/WaterTower" , "http://www.wikidata.org/entity/Q274153");
            hm.put("http://dbpedia.org/ontology/MythologicalFigure" , "http://www.wikidata.org/entity/Q15410431");
            hm.put("http://dbpedia.org/ontology/HistoricalRegion" , "http://www.wikidata.org/entity/Q1620908");
            hm.put("http://dbpedia.org/ontology/Building" , "http://www.wikidata.org/entity/Q41176");
            hm.put("http://dbpedia.org/ontology/Astronaut" , "http://www.wikidata.org/entity/Q11631");
            hm.put("http://dbpedia.org/ontology/TermOfOffice" , "http://www.wikidata.org/entity/Q524572");
            hm.put("http://dbpedia.org/ontology/AdministrativeRegion" , "http://www.wikidata.org/entity/Q3455524");
            hm.put("http://dbpedia.org/ontology/Bodybuilder" , "http://www.wikidata.org/entity/Q15982795");
            hm.put("http://dbpedia.org/ontology/Single" , "http://www.wikidata.org/entity/Q134556");
            hm.put("http://dbpedia.org/ontology/Casino" , "http://www.wikidata.org/entity/Q133215");
            hm.put("http://dbpedia.org/ontology/Cartoon" , "http://www.wikidata.org/entity/Q627603");
            hm.put("http://dbpedia.org/ontology/Contest" , "http://www.wikidata.org/entity/Q476300");
            hm.put("http://dbpedia.org/ontology/Spacecraft" , "http://www.wikidata.org/entity/Q40218");
            hm.put("http://dbpedia.org/ontology/RadioHost" , "http://www.wikidata.org/entity/Q2722764");
            hm.put("http://dbpedia.org/ontology/VideoGame" , "http://www.wikidata.org/entity/Q7889");
            hm.put("http://dbpedia.org/ontology/Governor" , "http://www.wikidata.org/entity/Q132050");
            hm.put("http://dbpedia.org/ontology/TradeUnion" , "http://www.wikidata.org/entity/Q178790");
            hm.put("http://dbpedia.org/ontology/MountainRange" , "http://www.wikidata.org/entity/Q46831");
            hm.put("http://dbpedia.org/ontology/AustralianRulesFootballPlayer" , "http://www.wikidata.org/entity/Q13414980");
            hm.put("http://dbpedia.org/ontology/BasketballPlayer" , "http://www.wikidata.org/entity/Q3665646");
            hm.put("http://dbpedia.org/ontology/Chancellor" , "http://www.wikidata.org/entity/Q373085");
            hm.put("http://dbpedia.org/ontology/LegalCase" , "http://www.wikidata.org/entity/Q2334719");
            hm.put("http://dbpedia.org/ontology/Broadcaster" , "http://www.wikidata.org/entity/Q15265344");
            hm.put("http://dbpedia.org/ontology/MusicDirector" , "http://www.wikidata.org/entity/Q1198887");
            hm.put("http://dbpedia.org/ontology/illustrator" , "http://www.wikidata.org/entity/P110");
            hm.put("http://dbpedia.org/ontology/mother" , "http://www.wikidata.org/entity/P25");
            hm.put("http://dbpedia.org/ontology/icd9" , "http://www.wikidata.org/entity/P493");
            hm.put("http://dbpedia.org/ontology/followedBy" , "http://www.wikidata.org/entity/P156");
            hm.put("http://dbpedia.org/ontology/sudocId" , "http://www.wikidata.org/entity/P269");
            hm.put("http://dbpedia.org/ontology/releaseDate" , "http://www.wikidata.org/entity/P577");
            hm.put("http://dbpedia.org/ontology/author" , "http://www.wikidata.org/entity/P50");
            hm.put("http://dbpedia.org/ontology/city" , "http://www.wikidata.org/entity/P131");
            hm.put("http://dbpedia.org/ontology/populationTotal" , "http://www.wikidata.org/entity/P1082");
            hm.put("http://dbpedia.org/ontology/meshId" , "http://www.wikidata.org/entity/P486");
            hm.put("http://dbpedia.org/ontology/foundedBy" , "http://www.wikidata.org/entity/P112");
            hm.put("http://dbpedia.org/ontology/designer" , "http://www.wikidata.org/entity/P287");
            hm.put("http://dbpedia.org/ontology/apparentMagnitude" , "http://www.wikidata.org/entity/P1215");
            hm.put("http://dbpedia.org/ontology/architecturalStyle" , "http://www.wikidata.org/entity/P149");
            hm.put("http://dbpedia.org/ontology/founder" , "http://www.wikidata.org/entity/P112");
            hm.put("http://dbpedia.org/ontology/emblem" , "http://www.wikidata.org/entity/P158");
            hm.put("http://dbpedia.org/ontology/genre" , "http://www.wikidata.org/entity/P136");
            hm.put("http://dbpedia.org/ontology/formationDate" , "http://www.wikidata.org/entity/P571");
            hm.put("http://dbpedia.org/ontology/unloCode" , "http://www.wikidata.org/entity/P1937");
            hm.put("http://dbpedia.org/ontology/starring" , "http://www.wikidata.org/entity/P161");
            hm.put("http://dbpedia.org/ontology/originalLanguage" , "http://www.wikidata.org/entity/P364");
            hm.put("http://dbpedia.org/ontology/ofsCode" , "http://www.wikidata.org/entity/P771");
            hm.put("http://dbpedia.org/ontology/endDate" , "http://www.wikidata.org/entity/P582");
            hm.put("http://dbpedia.org/ontology/icaoLocationIdentifier" , "http://www.wikidata.org/entity/P239");
            hm.put("http://dbpedia.org/ontology/ideology" , "http://www.wikidata.org/entity/P1142");
            hm.put("http://dbpedia.org/ontology/anthem" , "http://www.wikidata.org/entity/P85");
            hm.put("http://dbpedia.org/ontology/icaoAirlineCode" , "http://www.wikidata.org/entity/P230");
            hm.put("http://dbpedia.org/ontology/doctoralAdvisor" , "http://www.wikidata.org/entity/P184");
            hm.put("http://dbpedia.org/ontology/diocese" , "http://www.wikidata.org/entity/P708");
            hm.put("http://dbpedia.org/ontology/dcc" , "http://www.wikidata.org/entity/P1036");
            hm.put("http://dbpedia.org/ontology/birthName" , "http://www.wikidata.org/entity/P1477");
            hm.put("http://dbpedia.org/ontology/follows" , "http://www.wikidata.org/entity/P155");
            hm.put("http://dbpedia.org/ontology/einecsNumber" , "http://www.wikidata.org/entity/P232");
            hm.put("http://dbpedia.org/ontology/league" , "http://www.wikidata.org/entity/P118");
            hm.put("http://dbpedia.org/ontology/okatoCode" , "http://www.wikidata.org/entity/P721");
            hm.put("http://dbpedia.org/ontology/viafId" , "http://www.wikidata.org/entity/P214");
            hm.put("http://dbpedia.org/ontology/ndlId" , "http://www.wikidata.org/entity/P349");
            hm.put("http://dbpedia.org/ontology/citizenship" , "http://www.wikidata.org/entity/P27");
            hm.put("http://dbpedia.org/ontology/ecNumber" , "http://www.wikidata.org/entity/P591");
            hm.put("http://dbpedia.org/ontology/iataAirlineCode" , "http://www.wikidata.org/entity/P229");
            hm.put("http://dbpedia.org/ontology/spouse" , "http://www.wikidata.org/entity/P26");
            hm.put("http://dbpedia.org/ontology/battle" , "http://www.wikidata.org/entity/P607");
            hm.put("http://dbpedia.org/ontology/fuelSystem" , "http://www.wikidata.org/entity/P1211");
            hm.put("http://dbpedia.org/ontology/launchVehicle" , "http://www.wikidata.org/entity/P375");
            hm.put("http://dbpedia.org/ontology/primeMinister" , "http://www.wikidata.org/entity/P6");
            hm.put("http://dbpedia.org/ontology/iso31661Code" , "http://www.wikidata.org/entity/P297");
            hm.put("http://dbpedia.org/ontology/iso31661Code" , "http://www.wikidata.org/entity/P298");
            hm.put("http://dbpedia.org/ontology/iso31661Code" , "http://www.wikidata.org/entity/P299");
            hm.put("http://dbpedia.org/ontology/musicalArtist" , "http://www.wikidata.org/entity/P175");
            hm.put("http://dbpedia.org/ontology/residence" , "http://www.wikidata.org/entity/P263");
            hm.put("http://dbpedia.org/ontology/istat" , "http://www.wikidata.org/entity/P635");
            hm.put("http://dbpedia.org/ontology/launchDate" , "http://www.wikidata.org/entity/P619");
            hm.put("http://dbpedia.org/ontology/award" , "http://www.wikidata.org/entity/P166");
            hm.put("http://dbpedia.org/ontology/developer" , "http://www.wikidata.org/entity/P178");
            hm.put("http://dbpedia.org/ontology/employer" , "http://www.wikidata.org/entity/P108");
            hm.put("http://dbpedia.org/ontology/composer" , "http://www.wikidata.org/entity/P86");
            hm.put("http://dbpedia.org/ontology/builder" , "http://www.wikidata.org/entity/P176");
            hm.put("http://dbpedia.org/ontology/industry" , "http://www.wikidata.org/entity/P452");
            hm.put("http://dbpedia.org/ontology/signature" , "http://www.wikidata.org/entity/P109");
            hm.put("http://dbpedia.org/ontology/killedBy" , "http://www.wikidata.org/entity/P157");
            hm.put("http://dbpedia.org/ontology/cosparId" , "http://www.wikidata.org/entity/P247");
            hm.put("http://dbpedia.org/ontology/birthYear" , "http://www.wikidata.org/entity/P569");
            hm.put("http://dbpedia.org/ontology/deathDate" , "http://www.wikidata.org/entity/P570");
            hm.put("http://dbpedia.org/ontology/rkdArtistsId" , "http://www.wikidata.org/entity/P650");
            hm.put("http://dbpedia.org/ontology/country" , "http://www.wikidata.org/entity/P17");
            hm.put("http://dbpedia.org/ontology/deathPlace" , "http://www.wikidata.org/entity/P20");
            hm.put("http://dbpedia.org/ontology/discoverer" , "http://www.wikidata.org/entity/P61");
            hm.put("http://dbpedia.org/ontology/giniCoefficient" , "http://www.wikidata.org/entity/P1125");
            hm.put("http://dbpedia.org/ontology/cinematography" , "http://www.wikidata.org/entity/P344");
            hm.put("http://dbpedia.org/ontology/creator" , "http://www.wikidata.org/entity/P170");
            hm.put("http://dbpedia.org/ontology/amgid" , "http://www.wikidata.org/entity/P1562");
            hm.put("http://dbpedia.org/ontology/foundingDate" , "http://www.wikidata.org/entity/P571");
            hm.put("http://dbpedia.org/ontology/kingdom" , "http://www.wikidata.org/entity/P75");
            hm.put("http://dbpedia.org/ontology/handedness" , "http://www.wikidata.org/entity/P552");
            hm.put("http://dbpedia.org/ontology/continent" , "http://www.wikidata.org/entity/P30");
            hm.put("http://dbpedia.org/ontology/individualisedGnd" , "http://www.wikidata.org/entity/P227");
            hm.put("http://dbpedia.org/ontology/sex" , "http://www.wikidata.org/entity/P21");
            hm.put("http://dbpedia.org/ontology/iso6391Code" , "http://www.wikidata.org/entity/P218");
            hm.put("http://dbpedia.org/ontology/coatOfArms" , "http://www.wikidata.org/entity/P94");
            hm.put("http://dbpedia.org/ontology/inflow" , "http://www.wikidata.org/entity/P200");
            hm.put("http://dbpedia.org/ontology/coden" , "http://www.wikidata.org/entity/P1159");
            hm.put("http://dbpedia.org/ontology/county" , "http://www.wikidata.org/entity/P131");
            hm.put("http://dbpedia.org/ontology/inseeCode" , "http://www.wikidata.org/entity/P374");
            hm.put("http://dbpedia.org/ontology/diseasesDb" , "http://www.wikidata.org/entity/P557");
            hm.put("http://dbpedia.org/ontology/license" , "http://www.wikidata.org/entity/P275");
            hm.put("http://dbpedia.org/ontology/bnfId" , "http://www.wikidata.org/entity/P268");
            hm.put("http://dbpedia.org/ontology/child" , "http://www.wikidata.org/entity/P40");
            hm.put("http://dbpedia.org/ontology/almaMater" , "http://www.wikidata.org/entity/P69");
            hm.put("http://dbpedia.org/ontology/isPartOf" , "http://www.wikidata.org/entity/P361");
            hm.put("http://dbpedia.org/ontology/alias" , "http://www.wikidata.org/entity/P742");
            hm.put("http://dbpedia.org/ontology/placeOfBurial" , "http://www.wikidata.org/entity/P119");
            hm.put("http://dbpedia.org/ontology/chromosome" , "http://www.wikidata.org/entity/P1057");
            hm.put("http://dbpedia.org/ontology/editor" , "http://www.wikidata.org/entity/P98");
            hm.put("http://dbpedia.org/ontology/headquarter" , "http://www.wikidata.org/entity/P159");
            hm.put("http://dbpedia.org/ontology/pdb" , "http://www.wikidata.org/entity/P638");
            hm.put("http://dbpedia.org/ontology/nutsCode" , "http://www.wikidata.org/entity/P605");
            hm.put("http://dbpedia.org/ontology/landingDate" , "http://www.wikidata.org/entity/P620");
            hm.put("http://dbpedia.org/ontology/discovered" , "http://www.wikidata.org/entity/P575");
            hm.put("http://dbpedia.org/ontology/birthDate" , "http://www.wikidata.org/entity/P569");
            hm.put("http://dbpedia.org/ontology/genus" , "http://www.wikidata.org/entity/P74");
            hm.put("http://dbpedia.org/ontology/ceo" , "http://www.wikidata.org/entity/P169");
            hm.put("http://dbpedia.org/ontology/education" , "http://www.wikidata.org/entity/P69");
            hm.put("http://dbpedia.org/ontology/party" , "http://www.wikidata.org/entity/P102");
            hm.put("http://dbpedia.org/ontology/date" , "http://www.wikidata.org/entity/P585");
            hm.put("http://dbpedia.org/ontology/causeOfDeath" , "http://www.wikidata.org/entity/P509");
            hm.put("http://dbpedia.org/ontology/crewMember" , "http://www.wikidata.org/entity/P1029");
            hm.put("http://dbpedia.org/ontology/capital" , "http://www.wikidata.org/entity/P36");
            hm.put("http://dbpedia.org/ontology/bibsysId" , "http://www.wikidata.org/entity/P1015");
            hm.put("http://dbpedia.org/ontology/recordLabel" , "http://www.wikidata.org/entity/P264");
            hm.put("http://dbpedia.org/ontology/homeport" , "http://www.wikidata.org/entity/P504");
            hm.put("http://dbpedia.org/ontology/terytCode" , "http://www.wikidata.org/entity/P1653");
            hm.put("http://dbpedia.org/ontology/bSide" , "http://www.wikidata.org/entity/P1432");
            hm.put("http://dbpedia.org/ontology/iataLocationIdentifier" , "http://www.wikidata.org/entity/P238");
            hm.put("http://dbpedia.org/ontology/compressionRatio" , "http://www.wikidata.org/entity/P1247");
            hm.put("http://dbpedia.org/ontology/order" , "http://www.wikidata.org/entity/P70");
            hm.put("http://dbpedia.org/ontology/artist" , "http://www.wikidata.org/entity/P175");
            hm.put("http://dbpedia.org/ontology/manager" , "http://www.wikidata.org/entity/P286");
            hm.put("http://dbpedia.org/ontology/father" , "http://www.wikidata.org/entity/P22");
            hm.put("http://dbpedia.org/ontology/nlaId" , "http://www.wikidata.org/entity/P409");
            hm.put("http://dbpedia.org/ontology/isniId" , "http://www.wikidata.org/entity/P213");
            hm.put("http://dbpedia.org/ontology/absoluteMagnitude" , "http://www.wikidata.org/entity/P1457");
            hm.put("http://dbpedia.org/ontology/colour" , "http://www.wikidata.org/entity/P462");
            hm.put("http://dbpedia.org/ontology/highwaySystem" , "http://www.wikidata.org/entity/P16");
            hm.put("http://dbpedia.org/ontology/isbn" , "http://www.wikidata.org/entity/P212");
            hm.put("http://dbpedia.org/ontology/isbn" , "http://www.wikidata.org/entity/P957");
            hm.put("http://dbpedia.org/ontology/director" , "http://www.wikidata.org/entity/P57");
            hm.put("http://dbpedia.org/ontology/computingPlatform" , "http://www.wikidata.org/entity/P400");
            hm.put("http://dbpedia.org/ontology/cpu" , "http://www.wikidata.org/entity/P880");
            hm.put("http://dbpedia.org/ontology/nisCode" , "http://www.wikidata.org/entity/P1567");
            hm.put("http://dbpedia.org/ontology/orcidId" , "http://www.wikidata.org/entity/P496");
            hm.put("http://dbpedia.org/ontology/team" , "http://www.wikidata.org/entity/P54");
            hm.put("http://dbpedia.org/ontology/iso6393Code" , "http://www.wikidata.org/entity/P220");
            hm.put("http://dbpedia.org/ontology/province" , "http://www.wikidata.org/entity/P131");
            hm.put("http://dbpedia.org/ontology/icd10" , "http://www.wikidata.org/entity/P494");
            hm.put("http://dbpedia.org/ontology/isil" , "http://www.wikidata.org/entity/P791");
            hm.put("http://dbpedia.org/ontology/orientation" , "http://www.wikidata.org/entity/P91");
            hm.put("http://dbpedia.org/ontology/currencyCode" , "http://www.wikidata.org/entity/P498");
            hm.put("http://dbpedia.org/ontology/generalManager" , "http://www.wikidata.org/entity/P505");
            hm.put("http://dbpedia.org/ontology/coverArtist" , "http://www.wikidata.org/entity/P736");
            hm.put("http://dbpedia.org/ontology/flag" , "http://www.wikidata.org/entity/P41");
            hm.put("http://dbpedia.org/ontology/ethnicity" , "http://www.wikidata.org/entity/P172");
            hm.put("http://dbpedia.org/ontology/currency" , "http://www.wikidata.org/entity/P38");
            hm.put("http://dbpedia.org/ontology/doctoralStudent" , "http://www.wikidata.org/entity/P185");
            hm.put("http://dbpedia.org/ontology/elo" , "http://www.wikidata.org/entity/P1087");
            hm.put("http://dbpedia.org/ontology/address" , "http://www.wikidata.org/entity/P969");
            hm.put("http://dbpedia.org/ontology/distributor" , "http://www.wikidata.org/entity/P750");
            hm.put("http://dbpedia.org/ontology/discipline" , "http://www.wikidata.org/entity/P101");
            hm.put("http://dbpedia.org/ontology/constellation" , "http://www.wikidata.org/entity/P59");
            hm.put("http://dbpedia.org/ontology/basedOn" , "http://www.wikidata.org/entity/P144");
            hm.put("http://dbpedia.org/ontology/ulanId" , "http://www.wikidata.org/entity/P245");
            hm.put("http://dbpedia.org/ontology/iso6392Code" , "http://www.wikidata.org/entity/P219");
            hm.put("http://dbpedia.org/ontology/movement" , "http://www.wikidata.org/entity/P135");
            hm.put("http://dbpedia.org/ontology/namedAfter" , "http://www.wikidata.org/entity/P138");
            hm.put("http://dbpedia.org/ontology/highestPoint" , "http://www.wikidata.org/entity/P610");
            hm.put("http://dbpedia.org/ontology/gameEngine" , "http://www.wikidata.org/entity/P408");
            hm.put("http://dbpedia.org/ontology/owner" , "http://www.wikidata.org/entity/P127");
            hm.put("http://dbpedia.org/ontology/editing" , "http://www.wikidata.org/entity/P1040");
            hm.put("http://dbpedia.org/ontology/taoiseach" , "http://www.wikidata.org/entity/P6");
            hm.put("http://dbpedia.org/ontology/manufacturer" , "http://www.wikidata.org/entity/P176");
            hm.put("http://dbpedia.org/ontology/launchSite" , "http://www.wikidata.org/entity/P448");
            hm.put("http://dbpedia.org/ontology/lccnId" , "http://www.wikidata.org/entity/P244");
            hm.put("http://dbpedia.org/ontology/religion" , "http://www.wikidata.org/entity/P140");
            hm.put("http://dbpedia.org/ontology/musicBy" , "http://www.wikidata.org/entity/P86");
            hm.put("http://dbpedia.org/ontology/district" , "http://www.wikidata.org/entity/P131");
            hm.put("http://dbpedia.org/ontology/crosses" , "http://www.wikidata.org/entity/P177");
            hm.put("http://dbpedia.org/ontology/occupation" , "http://www.wikidata.org/entity/P106");
            hm.put("http://dbpedia.org/ontology/birthPlace" , "http://www.wikidata.org/entity/P19");
            hm.put("http://dbpedia.org/ontology/imdbId" , "http://www.wikidata.org/entity/P345");
            hm.put("http://dbpedia.org/ontology/maintainedBy" , "http://www.wikidata.org/entity/P126");
            hm.put("http://dbpedia.org/ontology/selibrId" , "http://www.wikidata.org/entity/P906");
            hm.put("http://dbpedia.org/ontology/family" , "http://www.wikidata.org/entity/P71");
            hm.put("http://dbpedia.org/ontology/settlement" , "http://www.wikidata.org/entity/P131");
            hm.put("http://dbpedia.org/ontology/startDate" , "http://www.wikidata.org/entity/P580");
            hm.put("http://dbpedia.org/ontology/abbreviation" , "http://www.wikidata.org/entity/P743");
            hm.put("http://dbpedia.org/ontology/architect" , "http://www.wikidata.org/entity/P84");
            hm.put("http://dbpedia.org/ontology/eyeColor" , "http://www.wikidata.org/entity/P1340");
            hm.put("http://dbpedia.org/ontology/instrument" , "http://www.wikidata.org/entity/P1303");
            hm.put("http://dbpedia.org/ontology/locatedInArea" , "http://www.wikidata.org/entity/P131");
            hm.put("http://dbpedia.org/ontology/constructionMaterial" , "http://www.wikidata.org/entity/P186");
            hm.put("http://dbpedia.org/ontology/deathCause" , "http://www.wikidata.org/entity/P509");
            hm.put("http://dbpedia.org/ontology/atomicNumber" , "http://www.wikidata.org/entity/P1086");
            hm.put("http://dbpedia.org/ontology/areaCode" , "http://www.wikidata.org/entity/P473");
            hm.put("http://dbpedia.org/ontology/classis" , "http://www.wikidata.org/entity/P77");

            dbToWD = hm;

        }

        return dbToWD;

    }



    static String[] properties = new String[]{
            "abbeychurchBlessing", "abbeychurchBlessingCharge", "abbreviation", "ableToGrind", "absoluteMagnitude", "abstentions", "abstract", "academicAdvisor", "academicDiscipline", "academyAward", "acceleration", "access", "accessDate", "achievement", "acquirementDate", "actingHeadteacher", "activeYears", "activeYearsEndDate", "activeYearsEndDateMgr", "activeYearsEndYear", "activeYearsEndYearMgr", "activeYearsStartDate", "activeYearsStartDateMgr", "activeYearsStartYear", "activeYearsStartYearMgr", "activity", "actScore", "added", "address", "addressInRoad", "adjacentSettlement", "administrativeCenter", "administrativeCollectivity", "administrativeDistrict", "administrativeHeadCity", "administrativeStatus", "administrator", "afdbId", "affair", "affiliate", "affiliation", "afiAward", "age", "agency", "agencyStationCode", "ageRange", "agglomeration", "agglomerationArea", "agglomerationDemographics", "agglomerationPopulation", "agglomerationPopulationTotal", "agglomerationPopulationYear", "aggregation", "aircraftAttack", "aircraftBomber", "aircraftElectronic", "aircraftFighter", "aircraftHelicopter", "aircraftHelicopterAttack", "aircraftHelicopterCargo", "aircraftHelicopterMultirole", "aircraftHelicopterObservation", "aircraftHelicopterTransport", "aircraftHelicopterUtility", "aircraftInterceptor", "aircraftPatrol", "aircraftRecon", "aircraftTrainer", "aircraftTransport", "aircraftType", "aircraftUser", "airDate", "airportUsing", "aitaCode", "albedo", "album", "albumRuntime", "alias", "allcinemaId", "allegiance", "alliance", "almaMater", "alongside", "alpsGroup", "alpsMainPart", "alpsMajorSector", "alpsSection", "alpsSoiusaCode", "alpsSubgroup", "alpsSubsection", "alpsSupergroup", "alternativeName", "alternativeTitle", "altitude", "alumni", "amateurDefeat", "amateurFight", "amateurKo", "amateurNoContest", "amateurTeam", "amateurTie", "amateurTitle", "amateurVictory", "amateurYear", "americanComedyAward", "amgid", "amsterdamCode", "analogChannel", "animal", "animator", "anniversary", "announcedFrom", "annualTemperature", "anthem", "apcPresident", "apoapsis", "apofocus", "apparentMagnitude", "appearancesInLeague", "appearancesInNationalTeam", "appointer", "approach", "approvedByLowerParliament", "approvedByUpperParliament", "approximateCalories", "apskritis", "archipelago", "architect", "architectualBureau", "architecturalMovement", "architecturalStyle", "area", "areaCode", "areaDate", "areaLand", "areaMetro", "areaOfCatchment", "areaOfCatchmentQuote", "areaOfSearch", "areaQuote", "areaRank", "areaRural", "areaTotal", "areaTotalRanking", "areaUrban", "areaWater", "argueDate", "arielAward", "arm", "army", "arrestDate", "arrondissement", "artery", "artificialSnowArea", "artist", "artisticFunction", "artPatron", "ascent", "asiaChampionship", "aSide", "aspectRatio", "assembly", "assets", "assetUnderManagement", "assistantPrincipal", "associate", "associatedAct", "associatedBand", "associatedMusicalArtist", "associatedRocket", "associateEditor", "associateStar", "associationOfLocalGovernment", "astrologicalSign", "asWikiText", "atcPrefix", "atcSuffix", "atcSupplemental", "athletics", "athleticsDiscipline", "atomicNumber", "atPage", "atRowNumber", "attorneyGeneral", "australiaOpenDouble", "australiaOpenMixed", "australiaOpenSingle", "author", "authority", "authorityMandate", "authorityTitle", "automobileModel", "automobilePlatform", "autonomy", "availableSmartCard", "average", "averageAnnualGeneration", "averageClassSize", "averageDepth", "averageDepthQuote", "averageSpeed", "avifaunaPopulation", "award", "awardName", "awayColourHexCode", "background", "backhand", "badGuy", "baftaAward", "band", "bandMember", "barangays", "barPassRate", "basedOn", "battingSide", "battle", "battleHonours", "beatifiedBy", "beatifiedDate", "beatifiedPlace", "bedCount", "believers", "beltwayCity", "bestFinish", "bestLap", "bestRankDouble", "bestRankSingle", "bestWsopRank", "bestYearWsop", "bgafdId", "bibsysId", "bicycleInformation", "biggestCity", "bigPoolRecord", "billed", "binomial", "binomialAuthority", "bioavailability", "bioclimate", "biome", "bird", "birthDate", "birthName", "birthPlace", "birthSign", "birthYear", "bishopric", "blackLongDistancePisteNumber", "blackSkiPisteNumber", "blazon", "blazonCaption", "blazonLink", "blazonRatio", "block", "blockAlloy", "bloodGroup", "bloodType", "blueLongDistancePisteNumber", "blueSkiPisteNumber", "bnfId", "board", "bodyDiscovered", "bodyStyle", "boiler", "boilerPressure", "boilingPoint", "book", "booster", "border", "borough", "bourgmestre", "bowlRecord", "boxerCategory", "boxerStyle", "bpnId", "brainInfoNumber", "brainInfoType", "branchFrom", "branchTo", "brand", "breeder", "bridgeCarries", "britishComedyAwards", "britishOpen", "britishWins", "broadcastArea", "broadcastNetwork", "broadcastRepeater", "broadcastStationClass", "broadcastTranslator", "bronzeMedalDouble", "bronzeMedalist", "bronzeMedalMixed", "bronzeMedalSingle", "bSide", "budget", "budgetYear", "builder", "building", "buildingEndDate", "buildingEndYear", "buildingStartDate", "buildingStartYear", "buildingType", "bustSize", "bustWaistHipSize", "cableCar", "calculationNeeds", "callSign", "callsignMeaning", "campus", "campusSize", "campusType", "canBaggageChecked", "cannonNumber", "canonizedBy", "canonizedDate", "canonizedPlace", "canton", "capacity", "capacityFactor", "capital", "capitalCoordinates", "capitalCountry", "capitalDistrict", "capitalElevation", "capitalMountain", "capitalPlace", "capitalPosition", "capitalRegion", "captureDate", "carbohydrate", "carcinogen", "careerPoints", "careerPrizeMoney", "careerStation", "cargoFuel", "cargoGas", "cargoWater", "carNumber", "case", "casNumber", "casSupplemental", "casualties", "catch", "category", "caterer", "catholicPercentage", "causalties", "causedBy", "causeOfDeath", "ccaState", "ceeb", "ceiling", "cemetery", "censusYear", "center", "centuryBreaks", "ceo", "ceremonialCounty", "certification", "certificationDate", "cesarAward", "chain", "chairLabel", "chairman", "chairmanTitle", "chairperson", "champion", "championInDouble", "championInDoubleFemale", "championInDoubleMale", "championInMixedDouble", "championInSingle", "championInSingleFemale", "championInSingleMale", "championships", "chancellor", "channel", "chaplain", "characterInPlay", "chEBI", "chef", "chiefEditor", "chiefPlace", "child", "childOrganisation", "choreographer", "chorusCharacterInPlay", "christeningDate", "chromosome", "cinematography", "circle", "circuitLength", "circuitName", "circulation", "circumcised", "cites", "citizenship", "city", "cityLink", "cityRank", "citySince", "cityType", "class", "classes", "classification", "classis", "climate", "climbUpNumber", "closed", "closeTo", "closingDate", "closingFilm", "closingYear", "clothingSize", "clothSize", "club", "clubsRecordGoalscorer", "cluster", "cmpEvaDuration", "cmykCoordinateBlack", "cmykCoordinateCyanic", "cmykCoordinateMagenta", "cmykCoordinateYellow", "co2Emission", "coach", "coachClub", "coachedTeam", "coachingRecord", "coachSeason", "coalition", "coastLength", "coastLine", "coatOfArms", "code", "codeBook", "codeDistrict", "codeIndex", "codeLandRegistry", "codeListOfHonour", "codeMemorial", "codeMunicipalMonument", "coden", "codeNationalMonument", "codeProvincialMonument", "codeSettlement", "codeStockExchange", "coemperor", "coExecutiveProducer", "collaboration", "colleague", "collection", "collectionSize", "collectivityMinority", "college", "collegeHof", "colonialName", "colorChart", "colour", "colourHexCode", "colourName", "combatant", "comic", "comitat", "command", "commandant", "commander", "commandModule", "commandStructure", "comment", "commissioner", "commissionerDate", "commissioningDate", "committee", "committeeInLegislature", "commonName", "commune", "communityIsoCode", "company", "comparable", "competition", "competitionTitle", "compiler", "completionDate", "complexion", "complexity", "component", "composer", "compressionRatio", "computingInput", "computingMedia", "computingPlatform", "configuration", "conflict", "congressionalDistrict", "connectsReferencedTo", "connotation", "consecration", "conservationStatus", "conservationStatusSystem", "constellation", "construction", "constructionMaterial", "contest", "continent", "continentalTournament", "continentalTournamentBronze", "continentalTournamentGold", "continentalTournamentSilver", "continentRank", "contractAward", "contractor", "convictionDate", "coolingSystem", "copilote", "coProducer", "coronationDate", "cosparId", "cost", "costumeDesigner", "council", "councilArea", "country", "countryOrigin", "countryRank", "countryWithFirstAstronaut", "countryWithFirstSatellite", "countryWithFirstSatelliteLaunched", "countryWithFirstSpaceflight", "county", "countySeat", "course", "cousurper", "coverArtist", "cpu", "created", "creationChristianBishop", "creationYear", "creativeDirector", "creator", "creatorOfDish", "credit", "crest", "crew", "crewMember", "crews", "crewSize", "criteria", "crosses", "crownDependency", "cuisine", "cultivatedVariety", "curator", "currency", "currencyCode", "currentCity", "currentLeague", "currentlyUsedFor", "currentMember", "currentPartner", "currentProduction", "currentRank", "currentRecord", "currentSeason", "currentStatus", "currentTeam", "currentTeamManager", "currentTeamMember", "currentWorldChampion", "custodian", "cyclistGenre", "cylinderBore", "cylinderCount", "daira", "dam", "damage", "damsire", "danseCompetition", "danseScore", "date", "dateAct", "dateAgreement", "dateBudget", "dateClosed", "dateCompleted", "dateConstruction", "dateExtended", "dateLastUpdated", "dateOfAbandonment", "dateOfBurial", "dateUnveiled", "dateUse", "davisCup", "day", "daylightSavingTimeZone", "dbnlCodeDutch", "dcc", "deadInFightDate", "deadInFightPlace", "dean", "deanery", "deathAge", "deathCause", "deathDate", "deathPlace", "deathYear", "debut", "debutTeam", "debutWork", "dec", "decay", "decideDate", "declination", "decommissioningDate", "decoration", "deFactoLanguage", "defeat", "defeatAsMgr", "definition", "delegateMayor", "delegation", "deliveryDate", "deme", "demographics", "demographicsAsOf", "demolitionDate", "demolitionYear", "demonym", "denomination", "density", "department", "departmentCode", "departmentPosition", "depictionDescription", "depth", "depthQuote", "depths", "deputy", "derivative", "derivedWord", "description", "designCompany", "designer", "destination", "destructionDate", "detectionMethod", "detractor", "developer", "dfE", "diameter", "different", "digitalChannel", "digitalSubChannel", "diocese", "diploma", "director", "disappearanceDate", "disbanded", "discharge", "dischargeAverage", "disciple", "discipline", "discontinued", "discovered", "discoverer", "discovery", "diseasesDb", "displacement", "dissolutionDate", "dissolutionYear", "dissolved", "distance", "distanceLaps", "distanceToBelfast", "distanceToCapital", "distanceToCardiff", "distanceToCharingCross", "distanceToDouglas", "distanceToDublin", "distanceToEdinburgh", "distanceToLondon", "distanceToNearestCity", "distanceTraveled", "dist_ly", "dist_pc", "distributingCompany", "distributingLabel", "distributor", "district", "division", "dockedTime", "doctoralAdvisor", "doctoralStudent", "documentDesignation", "documentNumber", "domain", "dorlandsPrefix", "dorlandsSuffix", "draft", "draftLeague", "draftPick", "draftPosition", "draftRound", "draftTeam", "draftYear", "drainsFrom", "drainsTo", "drama", "dressCode", "drugbank", "dryCargo", "dubber", "duration", "dutchArtworkCode", "dutchCOROPCode", "dutchMIPCode", "dutchNAIdentifier", "dutchPPNCode", "dutchRKDCode", "dutchWinkelID", "dynasty", "eastPlace", "ecNumber", "editing", "editor", "editorTitle", "education", "educationPlace", "educationSystem", "effectiveRadiatedPower", "egafdId", "einecsNumber", "ekatteCode", "electionDate", "electionDateLeader", "electionMajority", "elementAbove", "elementBlock", "elementGroup", "elementPeriod", "elevation", "elevationQuote", "elevatorCount", "elo", "eloRecord", "emblem", "eMedicineSubject", "eMedicineTopic", "emmyAward", "employer", "employersCelebration", "endangeredSince", "endCareer", "endDate", "endDateTime", "endingTheme", "endOccupation", "endowment", "endPoint", "endReign", "endYear", "endYearOfInsertion", "endYearOfSales", "enemy", "engine", "engineer", "enginePower", "engineType", "ensembl", "enshrinedDeity", "entourage", "entrezgene", "eparchy", "episode", "episodeNumber", "epoch", "eptFinalTable", "eptItm", "eptTitle", "equipment", "equity", "era", "eruption", "eruptionYear", "escalafon", "escapeVelocity", "espnId", "established", "establishment", "eTeatrId", "ethnicGroup", "ethnicGroupsInYear", "ethnicity", "eurobabeIndexId", "europeanAffiliation", "europeanChampionship", "europeanParliamentGroup", "europeanUnionEntranceDate", "event", "eventDate", "eventDescription", "executiveHeadteacher", "executiveProducer", "exhibition", "existence", "expedition", "explorer", "externalOrnament", "extinctionDate", "extinctionYear", "eyeColor", "eyeColour", "eyes", "faaLocationIdentifier", "facilityId", "facultySize", "failedLaunches", "family", "familyMember", "fansgroup", "fareZone", "fastestDriver", "fastestDriverCountry", "fastestDriverTeam", "fastestLap", "fat", "fate", "father", "fauna", "fc", "fcRuns", "fdaUniiCode", "feastDay", "feat", "feature", "features", "fedCup", "federalState", "federation", "fees", "fibahof", "field", "fight", "fighter", "fileExtension", "filename", "fileSize", "fileURL", "fillingStation", "film", "filmAudioType", "filmColourType", "filmFareAward", "filmNumber", "filmPolskiId", "filmRuntime", "filmVersion", "finalFlight", "finalLost", "finalLostDouble", "finalLostSingle", "finalLostTeam", "finalPublicationDate", "finalPublicationYear", "fipsCode", "firstAirDate", "firstAppearance", "firstAscent", "firstAscentPerson", "firstAscentYear", "firstBroadcast", "firstDriver", "firstDriverCountry", "firstDriverTeam", "firstFlight", "firstFlightEndDate", "firstFlightStartDate", "firstGame", "firstLaunch", "firstLaunchDate", "firstLaunchRocket", "firstLeader", "firstMention", "firstOlympicEvent", "firstOwner", "firstPlace", "firstPopularVote", "firstProMatch", "firstPublicationDate", "firstPublicationYear", "firstPublisher", "firstRace", "firstWin", "firstWinner", "flag", "flagBearer", "flagBorder", "flagCaption", "flagLink", "flagSize", "flashPoint", "floodingDate", "floorArea", "floorCount", "flora", "flower", "flyingHours", "foalDate", "followedBy", "followingEvent", "follows", "foot", "footedness", "forces", "foresterDistrict", "format", "formationDate", "formationYear", "formerBandMember", "formerBroadcastNetwork", "formerCallsign", "formerChannel", "formerChoreographer", "formerCoach", "formerHighschool", "formerName", "formerPartner", "formerTeam", "formula", "fossil", "foundation", "foundationPlace", "foundedBy", "founder", "foundingDate", "foundingYear", "fourthCommander", "frazioni", "free", "freeDanseScore", "freeFlightTime", "freeLabel", "freeProgCompetition", "freeProgScore", "freeScoreCompetition", "frequency", "frequencyOfPublication", "frequentlyUpdated", "friend", "frontierLength", "frozen", "fuel", "fuelCapacity", "fuelConsumption", "fuelSystem", "fuelType", "fuelTypeName", "fullCompetition", "fullScore", "functionEndDate", "functionEndYear", "functionStartDate", "functionStartYear", "fundedBy", "galicianSpeakersDate", "galicianSpeakersPercentage", "galleryItem", "gameArtist", "gameEngine", "gameModus", "games", "garrison", "gasChambers", "gaudiAward", "geminiAward", "gender", "geneLocation", "geneLocationEnd", "geneLocationStart", "generalCouncil", "generalManager", "generationUnits", "geneReviewsId", "geneReviewsName", "genomeDB", "genre", "genus", "geolocDepartment", "geolocDual", "geologicPeriod", "geology", "giniCoefficient", "giniCoefficientAsOf", "giniCoefficientCategory", "giniCoefficientRanking", "glycemicIndex", "gnisCode", "gnl", "goalsInLeague", "goalsInNationalTeam", "goldenCalfAward", "goldenGlobeAward", "goldenRaspberryAward", "goldMedalDouble", "goldMedalist", "goldMedalMixed", "goldMedalSingle", "governingBody", "government", "governmentCountry", "governmentElevation", "governmentMountain", "governmentPlace", "governmentPosition", "governmentRegion", "governmentType", "governor", "governorate", "governorGeneral", "goyaAward", "grades", "grammyAward", "grandsire", "grave", "grayPage", "graySubject", "greekName", "greenLongDistancePisteNumber", "greenSkiPisteNumber", "gridReference", "grindingCapability", "gross", "grossDomesticProduct", "grossDomesticProductAsOf", "grossDomesticProductNominalPerCapita", "grossDomesticProductPerPeople", "grossDomesticProductPurchasingPowerParityPerCapita", "grossDomesticProductRank", "ground", "groundsForLiquidation", "groupCommemorated", "growingGrape", "guest", "gun", "gymApparatus", "hairColor", "hairColour", "hairs", "hallOfFame", "hand", "handedness", "handisport", "hasAbsorbedMunicipality", "hasAnnotation", "hasChannel", "hasInput", "hasInsidePlace", "hasJunctionWith", "hasKMLData", "hasNaturalBust", "hasOutsidePlace", "hasSurfaceForm", "hasVariant", "head", "headAlloy", "headChef", "headLabel", "headOfFamily", "headquarter", "headteacher", "height", "heightAboveAverageTerrain", "heightAgainst", "heightAttack", "heir", "heisman", "heritageRegister", "hgncid", "highestBreak", "highestBuildingInYear", "highestMountain", "highestPlace", "highestPoint", "highestPointIsland", "highestPosition", "highestRank", "highestRegion", "highestState", "highschool", "highwaySystem", "hipSize", "historicalMap", "historicalName", "historicalRegion", "hof", "homage", "homeArena", "homeColourHexCode", "homeport", "homeStadium", "hometown", "honours", "hopmanCup", "horseRidingDiscipline", "house", "hraState", "hsvCoordinateHue", "hsvCoordinateSaturation", "hsvCoordinateValue", "hubAirport", "humanDevelopmentIndex", "humanDevelopmentIndexAsOf", "humanDevelopmentIndexRank", "humanDevelopmentIndexRankingCategory", "hybrid", "iafdId", "iataAirlineCode", "iataLocationIdentifier", "ibdbId", "icaoAirlineCode", "icaoLocationIdentifier", "icd1", "icd10", "icd9", "icdo", "iconographicAttributes", "id", "idAllocine", "identificationSymbol", "ideology", "idNumber", "iftaAward", "iihfHof", "illiteracy", "illustrator", "imageSize", "imdbId", "impactFactor", "impactFactorAsOf", "imposedDanseCompetition", "imposedDanseScore", "inCemetery", "inchi", "inclination", "income", "incumbent", "individualisedGnd", "individualisedPnd", "industry", "infantMortality", "inflow", "influenced", "influencedBy", "information", "informationName", "ingredient", "ingredientName", "initiallyUsedFor", "inn", "innervates", "inscription", "inseeCode", "installedCapacity", "institution", "instrument", "intercommunality", "interest", "internationalAffiliation", "internationally", "internationalPhonePrefix", "internationalPhonePrefixLabel", "introduced", "introductionDate", "iobdbId", "isbn", "isCityState", "isHandicappedAccessible", "isil", "island", "isniId", "iso31661Code", "iso6391Code", "iso6392Code", "iso6393Code", "isoCode", "isoCodeRegion", "isPartOf", "isPartOfAnatomicalStructure", "isPartOfMilitaryConflict", "isPartOfName", "isPartOfWineRegion", "isPeerReviewed", "isRouteStop", "issDockings", "issn", "ist", "istat", "ithfDate", "iucnCategory", "iupacName", "jockey", "jointCommunity", "jstor", "judge", "juniorSeason", "juniorTeam", "juniorYearsEndYear", "juniorYearsStartYear", "jureLanguage", "jurisdiction", "jutsu", "keyPerson", "khlDraft", "khlDraftTeam", "khlDraftYear", "killedBy", "kindOfCoordinate", "kindOfCriminal", "kindOfCriminalAction", "kindOfRock", "kingdom", "kinOfLanguage", "knownFor", "ko", "lahHof", "lake", "land", "landArea", "landeshauptmann", "landingDate", "landingSite", "landingVehicle", "landPercentage", "landRegistryCode", "landskap", "landtag", "landtagMandate", "language", "languageCode", "languageFamily", "languageRegulator", "largestCity", "largestMetro", "largestSettlement", "largestWin", "lastAirDate", "lastAppearance", "lastElectionDate", "lastFamilyMember", "lastFlight", "lastFlightEndDate", "lastFlightStartDate", "lastLaunch", "lastLaunchDate", "lastLaunchRocket", "lastPosition", "lastProMatch", "lastPublicationDate", "lastRace", "lastSeason", "lastWin", "laterality", "latestElection", "latestPreviewDate", "latestPreviewVersion", "latestReleaseDate", "latestReleaseVersion", "latinName", "launch", "launchDate", "launches", "launchPad", "launchSite", "launchVehicle", "laurenceOlivierAward", "lawCountry", "layingDown", "layout", "lcc", "lccn", "lccnId", "lchfDraft", "lchfDraftTeam", "lchfDraftYear", "leader", "leaderFunction", "leaderName", "leaderParty", "leadership", "leaderTitle", "leadTeam", "leadYear", "league", "leagueManager", "leftChild", "leftTributary", "legalArrondissement", "legalArticle", "legalForm", "legislativePeriodName", "length", "lengthQuote", "lengthReference", "lethalOnChickens", "lethalOnMice", "lethalOnRabbits", "lethalOnRats", "liberationDate", "libretto", "licenceLetter", "licenceNumber", "licenceNumberLabel", "license", "licensee", "lieutenancy", "lieutenancyArea", "lieutenant", "lifeExpectancy", "limit", "lineLength", "linguisticsTradition", "linkedSpace", "linkedTo", "listItemOf", "literaryGenre", "littlePoolRecord", "livingPlace", "loadLimit", "localAuthority", "locality", "localization", "localizationThumbnail", "localizationThumbnailCaption", "localPhonePrefix", "locatedInArea", "location", "locationCity", "locationCountry", "locationIdentifier", "locationName", "locomotive", "locusSupplementaryData", "logo", "longDistancePisteKilometre", "longDistancePisteNumber", "longName", "longtype", "lounge", "lowerAge", "lowerEarthOrbitPayload", "lowest", "lowestMountain", "lowestPlace", "lowestPoint", "lowestPosition", "lowestRegion", "lowestState", "lunarEvaTime", "lunarLandingSite", "lunarModule", "lunarOrbitTime", "lunarRover", "lunarSampleMass", "lunarSurfaceTime", "lymph", "lyrics", "magazine", "maidenFlight", "maidenFlightRocket", "maidenVoyage", "mainBuilding", "mainCharacter", "mainDomain", "mainFamilyBranch", "mainInterest", "mainIsland", "mainIslands", "mainOrgan", "mainspan", "maintainedBy", "majorIsland", "majorityFloorLeader", "majorityLeader", "majorShrine", "makeupArtist", "management", "managementCountry", "managementElevation", "managementMountain", "managementPlace", "managementPosition", "managementRegion", "manager", "managerClub", "managerSeason", "managerTitle", "managerYears", "managerYearsEndYear", "managerYearsStartYear", "managingEditor", "mandate", "manufacturer", "map", "mapCaption", "mapDescription", "march", "marketCapitalisation", "mascot", "mass", "massif", "mastersWins", "matchPoint", "material", "max", "maxAbsoluteMagnitude", "maxApparentMagnitude", "maximumArea", "maximumAreaQuote", "maximumBoatBeam", "maximumBoatLength", "maximumDepth", "maximumDepthQuote", "maximumDischarge", "maximumElevation", "maximumInclination", "maximumTemperature", "maxTime", "mayor", "mayorArticle", "mayorCouncillor", "mayorFunction", "mayorMandate", "mayorTitle", "mbaId", "meaning", "meanRadius", "meanTemperature", "measurements", "medalist", "media", "mediaItem", "mediaType", "medlinePlus", "meetingBuilding", "meetingCity", "meetingRoad", "meltingPoint", "member", "memberOfParliament", "membership", "membershipAsOf", "mentor", "mergedIntoParty", "mergedSettlement", "mergerDate", "meshId", "meshName", "meshNumber", "messierName", "metropolitanBorough", "mgiid", "militaryBranch", "militaryCommand", "militaryFunction", "militaryGovernment", "militaryRank", "militaryUnit", "militaryUnitSize", "millsCodeBE", "millsCodeDutch", "millsCodeNL", "millsCodeNLVerdwenen", "millsCodeNLWindmotoren", "millSpan", "millType", "min", "minimumArea", "minimumAreaQuote", "minimumDischarge", "minimumElevation", "minimumInclination", "minimumTemperature", "minority", "minorityFloorLeader", "minorityLeader", "minTime", "mirDockings", "mission", "missionDuration", "missions", "model", "modelEndDate", "modelEndYear", "modelLineVehicle", "modelStartDate", "modelStartYear", "molecularWeight", "monarch", "month", "mood", "mostDownPoint", "mostWins", "mother", "motto", "mount", "mountainRange", "mouthCountry", "mouthDistrict", "mouthElevation", "mouthMountain", "mouthPlace", "mouthPosition", "mouthRegion", "mouthState", "movement", "movie", "mukhtar", "municipality", "municipalityAbsorbedBy", "municipalityCode", "municipalityRenamedTo", "municipalityType", "museum", "museumType", "musicalArtist", "musicalBand", "musicalKey", "musicBand", "musicBy", "musicComposer", "musicFormat", "musicFusionGenre", "musicians", "musicSubgenre", "musicType", "muteCharacterInPlay", "mvp", "mythology", "naacpImageAward", "name", "nameAsOf", "namedAfter", "nameDay", "namedByLanguage", "nameInCantoneseChinese", "nameInHangulKorean", "nameInHanjaKorean", "nameInJapanese", "nameInMindongyuChinese", "nameInMinnanyuChinese", "nameInPinyinChinese", "nameInSimplifiedChinese", "nameInTraditionalChinese", "nameInWadeGilesChinese", "names", "narrator", "nation", "nationalAffiliation", "nationalChampionship", "nationalFilmAward", "nationality", "nationalOlympicCommittee", "nationalRanking", "nationalSelection", "nationalTeam", "nationalTeamMatchPoint", "nationalTeamYear", "nationalTopographicSystemMapNumber", "nationalTournament", "nationalTournamentBronze", "nationalTournamentGold", "nationalTournamentSilver", "nationalYears", "ncaaSeason", "ncaaTeam", "ncbhof", "ndlId", "nearestCity", "neighboringMunicipality", "neighbourConstellations", "neighbourhood", "neighbourRegion", "nerve", "netIncome", "network", "networth", "newspaper", "nextEntity", "nextEvent", "nextMission", "nflCode", "nflSeason", "nflTeam", "ngcName", "nisCode", "nlaId", "nndbId", "nobelLaureates", "noContest", "nominee", "nonFictionSubject", "nonProfessionalCareer", "northEastPlace", "northPlace", "northWestPlace", "notableCommander", "notableFeatures", "notableIdea", "notableStudent", "notableWine", "notableWork", "note", "noteOnPlaceOfBurial", "noteOnRestingPlace", "notes", "notifyDate", "notSolubleIn", "novel", "nrhpReferenceNumber", "nrhpType", "nssdcId", "number", "numberBuilt", "numberOfAcademicStaff", "numberOfAlbums", "numberOfArrondissement", "numberOfBombs", "numberOfBronzeMedalsWon", "numberOfCanton", "numberOfCantons", "numberOfCapitalDeputies", "numberOfCity", "numberOfClassrooms", "numberOfClubs", "numberOfCollectionItems", "numberOfCompetitors", "numberOfCounties", "numberOfCountries", "numberOfCrew", "numberOfDeaths", "numberOfDependency", "numberOfDistrict", "numberOfDistricts", "numberOfDoctoralStudents", "numberOfEmployees", "numberOfEntrances", "numberOfEpisodes", "numberOfFederalDeputies", "numberOfFilms", "numberOfGoals", "numberOfGoldMedalsWon", "numberOfGraduateStudents", "numberOfGraves", "numberOfHoles", "numberOfHouses", "numberOfIntercommunality", "numberOfIsland", "numberOfIslands", "numberOfLanes", "numberOfLaps", "numberOfLaunches", "numberOfLawyers", "numberOfLines", "numberOfLiveAlbums", "numberOfLocations", "numberOfMatches", "numberOfMembers", "numberOfMembersAsOf", "numberOfMinistries", "numberOfMunicipalities", "numberOfNeighbourhood", "numberOfNewlyIntroducedSports", "numberOfOffices", "numberOfOfficials", "numberOfOrbits", "numberOfPads", "numberOfPages", "numberOfParkingSpaces", "numberOfParticipatingAthletes", "numberOfParticipatingFemaleAthletes", "numberOfParticipatingMaleAthletes", "numberOfParticipatingNations", "numberOfPeopleAttending", "numberOfPeopleLicensed", "numberOfPiersInWater", "numberOfPixels", "numberOfPlatformLevels", "numberOfPlayers", "numberOfPostgraduateStudents", "numberOfProfessionals", "numberOfReactors", "numberOfRestaurants", "numberOfRockets", "numberOfRooms", "numberOfRun", "numberOfSeasons", "numberOfSeats", "numberOfSeatsInParliament", "numberOfSettlement", "numberOfSilverMedalsWon", "numberOfSpans", "numberOfSpeakers", "numberOfSports", "numberOfSportsEvents", "numberOfStaff", "numberOfStars", "numberOfStateDeputies", "numberOfStations", "numberOfStudents", "numberOfStudioAlbums", "numberOfSuites", "numberOfTeams", "numberOfTracks", "numberOfTurns", "numberOfUndergraduateStudents", "numberOfVehicles", "numberOfVillages", "numberOfVineyards", "numberOfVisitors", "numberOfVisitorsAsOf", "numberOfVolumes", "numberOfVolunteers", "numberOfWineries", "numberSold", "nutsCode", "observatory", "occupation", "oclc", "offeredClasses", "office", "officerInCharge", "officialLanguage", "officialName", "officialOpenedBy", "officialSchoolColour", "ofsCode", "oilSystem", "okatoCode", "oldcode", "oldDistrict", "oldName", "oldProvince", "oldTeamCoached", "olivierAward", "olympicGames", "olympicGamesBronze", "olympicGamesGold", "olympicGamesSilver", "olympicGamesWins", "olympicOathSwornBy", "olympicOathSwornByAthlete", "olympicOathSwornByJudge", "omim", "onChromosome", "ons", "openAccessContent", "openingDate", "openingFilm", "openingTheme", "openingYear", "operatingIncome", "operatingSystem", "operator", "opponent", "opponents", "orbitalEccentricity", "orbitalFlights", "orbitalInclination", "orbitalPeriod", "orbits", "orcidId", "order", "orderDate", "orderInOffice", "ordination", "organ", "organisation", "organisationMember", "organSystem", "orientation", "origin", "originalDanseCompetition", "originalDanseScore", "originalEndPoint", "originalLanguage", "originallyUsedFor", "originalMaximumBoatBeam", "originalMaximumBoatLength", "originalName", "originalStartPoint", "originalTitle", "origo", "orogeny", "orthologousGene", "other", "otherActivity", "otherAppearances", "otherChannel", "otherFamilyBranch", "otherFuelType", "otherFunction", "otherInformation", "otherLanguage", "otherMedia", "otherName", "otherOccupation", "otherParty", "otherServingLines", "otherSportsExperience", "otherWins", "outflow", "output", "outskirts", "overallRecord", "oversight", "owner", "owningCompany", "owningOrganisation", "owns", "painter", "parent", "parentCompany", "parentMountainPeak", "parentOrganisation", "parish", "parkingInformation", "parkingLotsCars", "parkingLotsTrucks", "parliament", "parliamentaryGroup", "parliamentType", "part", "partialFailedLaunches", "participant", "participatingIn", "particularSign", "partner", "party", "partyNumber", "passengersPerDay", "passengersPerYear", "passengersUsedSystem", "pastMember", "pastor", "patent", "patron", "patronSaint", "pccSecretary", "pdb", "peabodyAward", "penaltiesTeamA", "penaltiesTeamB", "penaltyScore", "penisLength", "peopleName", "perCapitaIncome", "perCapitaIncomeAsOf", "perCapitaIncomeRank", "percentage", "percentageAlcohol", "percentageFat", "percentageLiteracyMen", "percentageLiteracyWomen", "percentageLiterate", "percentageOfAreaWater", "performer", "periapsis", "perifocus", "perimeter", "period", "person", "personFunction", "personName", "pgaWins", "philosophicalSchool", "phonePrefix", "phonePrefixLabel", "photographer", "phylum", "picture", "pictureDescription", "pictureFormat", "picturesCommonsCategory", "piercing", "pisciculturalPopulation", "pistonStroke", "place", "placeOfBurial", "placeOfWorship", "plant", "playerInTeam", "playerSeason", "playerStatus", "playingTime", "playRole", "plays", "pluviometry", "podium", "podiums", "pole", "poleDriver", "poleDriverCountry", "poleDriverTeam", "polePosition", "poles", "policeName", "polishFilmAward", "politicalFunction", "politicalLeader", "politicalMajority", "politicalPartyInLegislature", "politicalPartyOfLeader", "politicalSeats", "politicGovernmentDepartment", "popularVote", "population", "populationAsOf", "populationDensity", "populationMetro", "populationMetroDensity", "populationPctChildren", "populationPctMen", "populationPctWomen", "populationPlace", "populationQuote", "populationRural", "populationRuralDensity", "populationTotal", "populationTotalRanking", "populationTotalReference", "populationUrban", "populationUrbanDensity", "populationYear", "portfolio", "portrayer", "position", "postalCode", "power", "powerOutput", "powerType", "precursor", "predecessor", "prefaceBy", "prefect", "prefectMandate", "prefecture", "prefix", "premiereDate", "premierePlace", "premiereYear", "presenter", "presentMunicipality", "presentName", "president", "presidentGeneralCouncil", "presidentGeneralCouncilMandate", "presidentRegionalCouncil", "presidentRegionalCouncilMandate", "previousDemographics", "previousEditor", "previousEntity", "previousEvent", "previousInfrastructure", "previousMission", "previousName", "previousPopulation", "previousPopulationTotal", "previousWork", "price", "primaryFuelType", "primate", "primeMinister", "primogenitor", "principal", "principalArea", "principalEngineer", "probowlPick", "procedure", "producedBy", "producer", "produces", "product", "production", "productionCompany", "productionEndDate", "productionEndYear", "productionStartDate", "productionStartYear", "productionYears", "productShape", "profession", "programCost", "programmeFormat", "programmingLanguage", "project", "projectBudgetFunding", "projectBudgetTotal", "projectCoordinator", "projectEndDate", "projectKeyword", "projectObjective", "projectParticipant", "projectReferenceID", "projectStartDate", "projectType", "prominence", "promotion", "pronunciation", "proPeriod", "proSince", "prospectLeague", "prospectTeam", "proTeam", "protectionStatus", "protein", "protestantPercentage", "provCode", "provides", "province", "provinceIsoCode", "provinceLink", "provost", "proYear", "pseudonym", "pubchem", "publication", "publicationDate", "publiclyAccessible", "publisher", "purchasingPowerParity", "purchasingPowerParityRank", "purchasingPowerParityYear", "purpose", "qatarClassic", "quebecerTitle", "quotation", "quote", "ra", "race", "raceHorse", "raceLength", "raceResult", "races", "raceTrack", "raceWins", "racketCatching", "radio", "radioStation", "radius_ly", "railGauge", "railwayLineUsingTunnel", "railwayPlatforms", "railwayRollingStock", "range", "rank", "rankAgreement", "rankArea", "rankInFinalMedalCount", "ranking", "rankingsDoubles", "rankingsSingles", "rankingWins", "rankPopulation", "rating", "ratio", "rebuildDate", "rebuilder", "rebuildingDate", "rebuildingYear", "recentWinner", "recommissioningDate", "recordDate", "recordedIn", "recordLabel", "rector", "redline", "redListIdNL", "redLongDistancePisteNumber", "redSkiPisteNumber", "refcul", "reference", "reffBourgmestre", "refgen", "refgeo", "refpol", "refseq", "refseqmrna", "refseqprotein", "regency", "regentOf", "regime", "region", "regionalCouncil", "regionalLanguage", "regionalPrefecture", "regionLink", "regionServed", "regionType", "registration", "registryNumber", "reign", "reigningPope", "reignName", "related", "relatedFunctions", "relatedMeanOfTransportation", "relatedPlaces", "relation", "relative", "relativeAtomicMass", "releaseDate", "releaseLocation", "relics", "relief", "religion", "religiousHead", "religiousHeadLabel", "religiousOrder", "reopened", "reopeningDate", "reopeningYear", "reportingMark", "representative", "requirement", "reservations", "residence", "resolution", "restingDate", "restingPlace", "restingPlacePosition", "restoreDate", "result", "retentionTime", "retired", "retiredRocket", "retirementDate", "revenue", "review", "rgbCoordinateBlue", "rgbCoordinateGreen", "rgbCoordinateRed", "ridId", "rightAscension", "rightChild", "rightTributary", "rival", "river", "riverBranch", "riverBranchOf", "riverMouth", "rkdArtistsId", "road", "rocket", "rocketFunction", "rocketStages", "rolandGarrosDouble", "rolandGarrosMixed", "rolandGarrosSingle", "role", "roleInEvent", "roofHeight", "rotationPeriod", "route", "routeActivity", "routeDirection", "routeEnd", "routeEndDirection", "routeEndLocation", "routeJunction", "routeLine", "routeNext", "routeNumber", "routePrevious", "routeStart", "routeStartDirection", "routeStartLocation", "routeTypeAbbreviation", "royalAnthem", "ruling", "runningMate", "runtime", "runwayDesignation", "runwayLength", "runwaySurface", "runwayWidth", "ruralMunicipality", "saint", "salary", "sales", "sameName", "satellite", "satellitesDeployed", "satScore", "scale", "scene", "school", "schoolBoard", "schoolCode", "schoolNumber", "schoolPatron", "scientificName", "score", "screenActorsGuildAward", "sea", "season", "seasonManager", "seasonNumber", "seatingCapacity", "seatNumber", "second", "secondCommander", "secondDriver", "secondDriverCountry", "secondLeader", "secondPlace", "secondPopularVote", "secondTeam", "secretaryGeneral", "security", "seiyu", "selection", "selectionPoint", "selectionYear", "selibrId", "senator", "senior", "seniority", "seniunija", "sentence", "series", "service", "serviceEndDate", "serviceEndYear", "serviceModule", "serviceNumber", "serviceStartDate", "serviceStartYear", "servingRailwayLine", "servingSize", "servingTemperature", "sessionNumber", "setDesigner", "settingOfPlay", "settlement", "settlementAttached", "setupTime", "sex", "sexualOrientation", "shape", "shareDate", "shareOfAudience", "shareSource", "sharingOutPopulation", "sharingOutPopulationYear", "sheading", "shipBeam", "shipCrew", "shipDisplacement", "shipDraft", "shipLaunch", "shoeNumber", "shoeSize", "shoot", "shoots", "shoreLength", "shortProgCompetition", "shortProgScore", "show", "showJudge", "shuttle", "sibling", "signature", "significantBuilding", "significantDesign", "significantProject", "signName", "silCode", "silverMedalDouble", "silverMedalist", "silverMedalMixed", "silverMedalSingle", "simcCode", "similar", "sire", "siren", "sisterCollege", "sisterNewspaper", "sisterStation", "sixthFormStudents", "sizeBlazon", "sizeLogo", "sizeMap", "sizeThumbnail", "size_v", "skiLift", "skills", "skinColor", "skiPisteKilometre", "skiPisteNumber", "skiTow", "slogan", "smiles", "snowParkNumber", "soccerLeaguePromoted", "soccerLeagueRelegated", "soccerLeagueSeason", "soccerLeagueWinner", "soccerTournamentClosingSeason", "soccerTournamentLastChampion", "soccerTournamentMostSteady", "soccerTournamentMostSuccesfull", "soccerTournamentOpeningSeason", "soccerTournamentThisSeason", "soccerTournamentTopScorer", "solicitorGeneral", "solubility", "solventWithBadSolubility", "solventWithGoodSolubility", "solventWithMediocreSolubility", "soundRecording", "source", "sourceConfluence", "sourceConfluenceCountry", "sourceConfluenceElevation", "sourceConfluenceMountain", "sourceConfluencePlace", "sourceConfluencePosition", "sourceConfluenceRegion", "sourceConfluenceState", "sourceCountry", "sourceDistrict", "sourceElevation", "sourceMountain", "sourcePlace", "sourcePosition", "sourceRegion", "sourceState", "sourceText", "southEastPlace", "southPlace", "southWestPlace", "sovereignCountry", "space", "spacecraft", "spacestation", "spacewalkBegin", "spacewalkEnd", "speaker", "specialEffects", "specialist", "speciality", "specialTrial", "species", "speedLimit", "spike", "splitFromParty", "spokenIn", "spokesperson", "sport", "sportCountry", "sportDiscipline", "sportGoverningBody", "sportsFunction", "sportSpecialty", "spouse", "spouseName", "spurOf", "spurType", "squadNumber", "stadium", "staff", "starRating", "starring", "start", "startCareer", "startDate", "startDateTime", "startOccupation", "startPoint", "startReign", "startWct", "startWqs", "startYear", "startYearOfInsertion", "startYearOfSales", "state", "stateDelegate", "stateOfOrigin", "stateOfOriginPoint", "stateOfOriginTeam", "stateOfOriginYear", "stationEvaDuration", "stationStructure", "stationVisitDuration", "statistic", "statisticLabel", "statisticValue", "statisticYear", "statName", "status", "statusManager", "statusYear", "statValue", "stellarClassification", "stockExchange", "storyEditor", "strength", "structuralSystem", "student", "style", "stylisticOrigin", "subClassis", "subdivision", "subdivisionLink", "subdivisionName", "subdivisions", "subFamily", "subGenus", "subjectOfPlay", "subjectTerm", "sublimationPoint", "subMunicipalityType", "suborbitalFlights", "subOrder", "subprefecture", "subPrefecture", "subregion", "subsequentInfrastructure", "subsequentWork", "subsidiary", "subsystem", "subsystemLink", "subtitle", "subTribus", "successfulLaunches", "successor", "sudocId", "summerAppearances", "summerTemperature", "superbowlWin", "superFamily", "superintendent", "superOrder", "superTribus", "supplementalDraftRound", "supplementalDraftYear", "supplies", "supply", "suppreddedDate", "surfaceArea", "surfaceFormOccurrenceOffset", "surfaceGravity", "surfaceType", "swimmingStyle", "symbol", "synonym", "systemOfLaw", "systemRequirements", "tag", "taoiseach", "targetAirport", "targetSpaceStation", "taste", "tattoo", "taxon", "teachingStaff", "team", "teamCoached", "teamManager", "teamName", "teamPoint", "teamSize", "teamTitle", "technique", "televisionSeries", "temperature", "temple", "templeYear", "tempPlace", "tenant", "tennisSurfaceType", "termOfOffice", "termPeriod", "territory", "terytCode", "tessitura", "testaverage", "theology", "third", "thirdCommander", "thirdDriver", "thirdDriverCountry", "thirdPlace", "thirdTeam", "throwingSide", "thumbnail", "thumbnailCaption", "tie", "time", "timeInSpace", "timeshiftChannel", "timeZone", "title", "titleDate", "titleDouble", "titleLanguage", "titleSingle", "toll", "tonyAward", "topFloorHeight", "topic", "topLevelDomain", "topSpeed", "torchBearer", "torqueOutput", "totalCargo", "totalDiscs", "totalLaunches", "totalMass", "totalPopulation", "totalTracks", "totalTravellers", "touristicSite", "tournamentOfChampions", "tournamentRecord", "towerHeight", "trackLength", "trackNumber", "trackWidth", "tradeMark", "trainer", "trainerClub", "trainerYears", "training", "translatedMotto", "translator", "transmission", "tree", "tribus", "trustee", "tu", "tuition", "tvComId", "tvShow", "twinCountry", "twinTown", "type", "typeCoordinate", "typeOfElectrification", "typeOfGrain", "typeOfStorage", "typeOfYeast", "uciCode", "ulanId", "umbrellaTitle", "undraftedYear", "unesco", "unicode", "uniprot", "unitaryAuthority", "unitCost", "unitedStatesNationalBridgeId", "university", "unknownOutcomes", "unloCode", "updated", "upperAge", "urbanArea", "uRN", "usedInWar", "uses", "usingCountry", "usk", "usOpenDouble", "usOpenMixed", "usOpenSingle", "usopenWins", "usSales", "usurper", "utcOffset", "value", "valvetrain", "variantOf", "varietals", "vehicle", "vehicleCode", "vehiclesPerDay", "vein", "veneratedIn", "version", "v_hb", "viafId", "viceChancellor", "viceLeader", "viceLeaderParty", "vicePresident", "vicePrimeMinister", "vicePrincipal", "vicePrincipalLabel", "victim", "victims", "victory", "victoryAsMgr", "victoryPercentageAsMgr", "virtualChannel", "visitorsPercentageChange", "visitorsPerDay", "visitorsPerYear", "visitorStatisticsAsOf", "visitorsTotal", "voice", "voiceType", "volcanicActivity", "volcanicType", "volcanoId", "voltageOfElectrification", "volume", "volumeQuote", "volumes", "vonKlitzingConstant", "votesAgainst", "votesFor", "wagon", "waistSize", "war", "ward", "water", "waterArea", "watercourse", "waterPercentage", "watershed", "waterwayThroughTunnel", "wavelength", "weapon", "webcast", "websiteLabel", "weddingParentsDate", "weight", "westPlace", "whaDraft", "whaDraftTeam", "whaDraftYear", "wheelbase", "wholeArea", "width", "widthQuote", "wikidataSplitIri", "wikiPageCharacterSize", "wikiPageDisambiguates", "wikiPageEditLink", "wikiPageExternalLink", "wikiPageExtracted", "wikiPageHistoryLink", "wikiPageID", "wikiPageInDegree", "wikiPageInterLanguageLink", "wikiPageLength", "wikiPageModified", "wikiPageOutDegree", "wikiPageRedirects", "wikiPageRevisionID", "wikiPageRevisionLink", "wikiPageWikiLink", "wikiPageWikiLinkText", "wilaya", "wimbledonDouble", "wimbledonMixed", "wimbledonSingle", "wineProduced", "wineRegion", "wineYear", "wingArea", "wingspan", "wins", "winsAtAlpg", "winsAtAsia", "winsAtAus", "winsAtChallenges", "winsAtChampionships", "winsAtJapan", "winsAtJLPGA", "winsAtKLPGA", "winsAtLAGT", "winsAtLET", "winsAtLPGA", "winsAtMajors", "winsAtNWIDE", "winsAtOtherTournaments", "winsAtPGA", "winsAtProTournaments", "winsAtSenEuro", "winsAtSun", "winsInEurope", "winterAppearances", "winterTemperature", "wordBefore", "work", "workArea", "world", "worldChampionTitleYear", "worldOpen", "worldTeamCup", "worldTournament", "worldTournamentBronze", "worldTournamentGold", "worldTournamentSilver", "woRMS", "worstDefeat", "wptFinalTable", "wptItm", "wptTitle", "writer", "wsopItm", "wsopWinYear", "wsopWristband", "year", "yearElevationIntoNobility", "yearOfConstruction", "yearOfElectrification", "years", "youthClub", "youthWing", "youthYears", "zdb", "zipCode", "zodiacSign"
    };

    static String[] languages = new String[]{"af",
            "als",
            "am",
            "an",
            "ar",
            "arz",
            "ast",
            "az",
            "azb",
            "ba",
            "bar",
            "bat_smg",
            "be",
            "bg",
            "bn",
            "bpy",
            "br",
            "bs",
            "bug",
            "ca",
            "ce",
            "ceb",
            "ckb",
            "commons",
            "cs",
            "cv",
            "cy",
            "da",
            "de",
            "el",
            "en",
            "eo",
            "es",
            "et",
            "eu",
            "fa",
            "fi",
            "fo",
            "fr",
            "fy",
            "ga",
            "gd",
            "gl",
            "gu",
            "he",
            "hi",
            "hr",
            "hsb",
            "ht",
            "hu",
            "hy",
            "ia",
            "id",
            "io",
            "is",
            "it",
            "ja",
            "jv",
            "ka",
            "kk",
            "kn",
            "ko",
            "ku",
            "ky",
            "la",
            "lb",
            "li",
            "lmo",
            "lt",
            "lv",
            "mg",
            "min",
            "mk",
            "ml",
            "mn",
            "mr",
            "mrj",
            "ms",
            "my",
            "mzn",
            "nah",
            "nap",
            "nds",
            "ne",
            "new",
            "nl",
            "nn",
            "no",
            "oc",
            "or",
            "os",
            "pa",
            "pl",
            "pms",
            "pnb",
            "pt",
            "qu",
            "ro",
            "ru",
            "sa",
            "sah",
            "scn",
            "sco",
            "sh",
            "si",
            "simple",
            "sk",
            "sl",
            "sq",
            "sr",
            "su",
            "sv",
            "sw",
            "ta",
            "te",
            "tg",
            "th",
            "tl",
            "tr",
            "tt",
            "uk",
            "ur",
            "uz",
            "vec",
            "vi",
            "vo",
            "wa",
            "war",
            "wikidata",
            "yi",
            "yo",
            "zh",
            "zh_min_nan",
            "zh_yue"};
}
