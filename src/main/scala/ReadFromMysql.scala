//import java.io.FileInputStream
//import java.util.Properties
//
//object ReadFromMysql {
//  def main(args: Array[String]): Unit = {
//    val jdbcmysql = JDBCUtils
//    val conn = jdbcmysql.getConnect()
//    val stmt = conn.createStatement()
//    val res = stmt.executeQuery("select * from test.test limit 10")
//    while (res.next()){
//      val user_id = res.getString("user_id")
//      val order_num = res.getString("order_num")
//      println(user_id+" "+order_num)
//    }
//   print(jdbcmysql.getDataBase())
//  }
//}
