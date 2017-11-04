class People {
  var name: String = _
  var age: Int =_

  def eat():String ={

    name+"eat......"

  }
  def watchFootball(teamName:String):String={
          name+""+teamName
  }
}
object Simp{
  def main(args: Array[String]): Unit = {
    val peo = new People
    peo.name="Mei"
    peo.age=30
    peo.eat()
    peo.watchFootball("shuke")

  }
}