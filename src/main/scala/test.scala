object test {
  def main(args: Array[String]): Unit = {
    val name: String = "ssss"
    val money: Float = 4.4f
    val i = 10.asInstanceOf[String]//强制类型转换
     i.isInstanceOf[String]//类型判断

    def four(x:Int,y:Int)=x+y
    //条件表达式
    1 to 10 //等价于 1.to(10) 左闭🈶️右闭
    Range(1,10)//左闭右开
    Range(1,10,2)//(1,3,5,....)
    1.until(10)//底层也是用了range
    var (num,sum) =(100,0)
    while (num>0){
      sum = sum+num
      num=num-1
    }
    sum
    //数组
    Array("hadoop","hive","hbase","spark").foreach(e=>println(e))
    for(i<- 1 to 10 if i%2==0){
      print(i)
    }

  }

  def add(x:Int,y:Int):Int ={
         x+y
  }
}
