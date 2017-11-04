import java.io.{FileInputStream, InputStream}
import java.sql._
import java.util.Properties

object JDBCUtils {
  //val url ="jdbc:mysql://localhost:3306"
  //reflect
  classOf[com.mysql.jdbc.Driver]
  //
  val pro = new Properties()
  val in = new FileInputStream("/Users/shuke/ruozedata/jdbc.properties")
  pro.load(in)
  val conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("username"), pro.getProperty("password"))
//  def getConnect(): Connection = {
//    //麻烦的写法
//    //    val pro = new Properties()
//    //    val pros = new Properties()
//    //    val  in = new FileInputStream("/Users/shuke/ruozedata/jdbc.properties")
//    //    pros.load(in)
//    //    //DriverManager.getConnection(pros.getProperty("url"),pro)
//    DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("username"), pro.getProperty("password"))
//  }

  //查询元数据的方法
  def getMeta(): Unit ={
    //val conn = JDBCUtils.getConnect()
    val dbMeta = conn.getMetaData
    val productName = dbMeta.getDatabaseProductName




  }

  //查询数据库
  def getDataBase() :StringBuilder = {
    //val conn = JDBCUtils.getConnect()
    val stmt = conn.createStatement()
    val res = stmt.executeQuery("show databases")
    var array = new StringBuilder
    while (res.next()){
       val a: String = res.getString(1)
       array.append(a).append(",")
    }
       array.deleteCharAt(array.length-1)
       array
  }

  //查询表
  def getTable(table:String) ={





  }

  //查询语句
  def searchFromMysql() = {
    //val conn = JDBCUtils.getConnect()
    val stmt = conn.createStatement()
    val res = stmt.executeQuery("")


  }


  //关闭连接 依次关闭 ResultSet Statement Connect

  def colseCon(con: Connection) {
    try {
      if (!con.isClosed || con != null) {
        con.close()
      }

    }
    catch {
      case e: Exception =>
        e.getMessage
    }

  }

  def closeCon(stmt: Statement): Unit = {
    try {
      if (!stmt.isClosed || stmt != null) {
        stmt.close()
      }
    }
    catch {
      case e: Exception =>
        e.getMessage
    }
  }

  def closeCon(res: ResultSet): Unit = {
    try {
      if (!res.isClosed || res != null) {
        res.close()
      }

    }
    catch {
      case e: Exception =>
        e.getMessage
    }
  }
}

