package DateUtils


import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.{FileSystem, Path}


object NewDateUtils {
  def main(args: Array[String]): Unit = {
    //get configuration
    val conf = new Configuration()
    conf.set("fs.default.name", "hdfs://localhost:8020")
    val fs = FileSystem.get(conf)
    val outputPath = "hdfs://localhost:8020/spark/emp/"
    val loadTime = "201711112025"
    val partition = "/d=20171111/h=20"
    val filelist = fs.globStatus(new Path("spark/emp/temp/201711112025/d=20171111/h=20/*.txt"))
    var time = 0
    for (i <- 0 until filelist.length) {
      val nowpath = filelist(i).getPath.toString
      val newpaths = nowpath.replace(outputPath + "temp/" + loadTime, outputPath + "data/")
      println("-a-" + newpaths)
      newpaths.replace("part-r-", "")


    }


  }


}
