import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object SparkConfObject {

  Logger.getLogger("org").setLevel(Level.OFF)

  val sparkConf: SparkConf = new SparkConf()
    .setAppName("Spark-Assignment1")
    .setMaster("local[*]")
      .set("spark.eventLog.enabled",  "false")

  val sparkContext: SparkContext = new SparkContext(sparkConf)

  val filePath: String = "src/main/resources/pagecounts"
}