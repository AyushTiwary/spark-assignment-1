import org.apache.spark.rdd.RDD
import SparkConfObject._

class PageCount {

  def getFileData: RDD[String] = {
    sparkContext.textFile(filePath)
  }

  def getPageCount: Double = {
    getFileData.map(_.split(" ")(3).toLong).sum()
  }

}
