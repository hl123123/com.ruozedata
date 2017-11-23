package ExternalDatasource

import org.apache.spark.sql.SparkSession

object spark_ftp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("sprak_ftp").master("local[2]").getOrCreate()
    //Construct Spark dataframe using file in FTP server
    //read from FTP  server
    val df = spark.read.
      format("com.springml.spark.sftp").
      option("host", "localhost").
      option("username", "shuke").
      option("password", "***").
      option("fileType", "csv").
      option("delimiter", ",").
      option("inferSchema", "true").
      load("/Users/shuke/testfile/sample.csv")
    df.show(1)
    //write to FTP server
    df.write.format("com.springml.spark.sftp").
      option("host", "localhost").
      option("username", "shuke").
      option("password", "***").
      option("fileType", "csv").
      option("delimiter", ";").
      option("inferSchema", "true").
      save("/Users/shuke/testfile/sample1.csv")

  }
}
