class AbstractDemo {

}
/*
/类的一个或者多个方法没有完整的实现 abstract 修饰类
 */
abstract class Person2 {
  def spark
  val name:String
  val age:Int
}
class Student2 extends  Person2 {
  override def spark: Unit = println("aaaaa")

  override val age: Int = 1
  override val name: String = "aa"
}

object AbstractDemo{
  def main(args: Array[String]): Unit = {
    val stu = new Student2
  }
}