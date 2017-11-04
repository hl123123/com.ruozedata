class ConstrutorDemo {
//构造方法

}
//主构造器
class person(val name:String,val age:Int){
  println("Person Constructor enter ..." )
  val school = "ustc"
  var gender:String=_
  def this(name:String,age:Int,gender:String){
    this(name,age)
    this.gender=gender
    /**
      * this 修饰的是附属构造器
      * 每一个附属构造器必须调用已经存在的主构造器或者其他附属构造器
      */

  }

}
object ConstrutorDemo {
  def main(args: Array[String]): Unit = {
    val person = new person("huuh",20)
    println(person.name)
    val person1 = new person("huhhu",20,"femail")

  }
}
