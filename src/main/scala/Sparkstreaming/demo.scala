package Sparkstreaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

class demo {

}

//one stack to rule them all
object demo {
  def main(args: Array[String]): Unit = {
    //创建sparkStreaming 的context
    val conf = new SparkConf().setMaster("local[2]").setAppName("readFromFile")
    val ssc = new StreamingContext(conf, Seconds(1))
    val lines = ssc.textFileStream("file://User/shuke/text/")
    val line = lines.flatMap(_.split(" ")).map(x => (x, 1)).reduceByKey(_ + _)
    line.print()
    ssc.start()
    ssc.awaitTermination()
    ssc.stop()
  }
}