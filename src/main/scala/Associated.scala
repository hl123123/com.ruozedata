class Associated {
  //def apply: Associated = new Associated()
  def printb() {
    println("use class")
  }


}

object Associated {

  //def apply(): Associated =  new Associated()
  def apply() = {
     new Associated
  }

  def printa() {
    print("use object")
  }


}

object ApplyDemo {
  def main(args: Array[String]): Unit = {
    val a = new Associated()
     a.printb()
    val b = Associated()
     b.printb()


  }
}
