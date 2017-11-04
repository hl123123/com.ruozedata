

class ExtendsDemo {


}
//子类重写父类的方法或者属性时，一定要用override
 class Student(name:String,age:Int,major:String) extends person(name,age){
   println("Student Constructor enter...")
   override val school: String = "peiking"
   //override val age: Int = _
   //override def toString: String = "xuesheng tu string"
   println("Student Constructor enter---1")
 }
object ExtendsDemo{
  def main(args: Array[String]): Unit = {
    val student = new Student("huuh",21,"jisuanji")
    println(student.toString)
  }
}