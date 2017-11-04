object test1 {
  def main(args: Array[String]): Unit = {
    sayName()
    speed(time=100,distince = 25)
    println(sum(1 to 10:_*))//这种写法要注意
    println(printCourses(Array("hadoop","hive"):_*))//一样的写法
  }

  //定义方法可以给一个默认值，如果不传的话就给默认
  def sayName(name:String="zhanglei"):String = {
      name
  }
  //命名参数
  def speed(distince:Float,time:Float):Float = {
       distince*time
  }
  //变长参数
  def sum(nums:Int*)={
    var result=0
    for(num<-nums){
      result+=num
    }
    result
  }
  def printCourses(courses:String*)={
    courses.foreach(ele=>println(ele))
  }
    //









}
