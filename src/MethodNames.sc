object SymbolicNames {
  //Show equivalence, and ctrl click to get to method declaration
  val a = 3                                       //> a  : Int = 3
  a + 4                                           //> res0: Int = 7
  a.+(4)                                          //> res1: Int = 7
  
  1 to 10                                         //> res2: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  1.to(10)                                        //> res3: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7
                                                  //| , 8, 9, 10)
  
  val b = BigInt(1234)                            //> b  : scala.math.BigInt = 1234
  val c = BigInt("23472842492834723423423423423") //> c  : scala.math.BigInt = 23472842492834723423423423423
  c * (b + 50)                                    //> res4: scala.math.BigInt = 30139129760799784875675675675132
  
  //Good for more than just math:
  import java.util.Date
  import scala.math.Ordered._
  val d1 = new Date                               //> d1  : java.util.Date = Sun Jan 26 11:37:02 EST 2014
  val d2 = new Date                               //> d2  : java.util.Date = Sun Jan 26 11:37:02 EST 2014
  d1 < d2                                         //> res5: Boolean = true
  
  case class Money(amount: Double, currency: String) {
    def +(other: Money) = Money(amount + other.amount, currency) //alt: copy(amount = amount + other.amount)
    def *(num: Int) = Money(amount * num, currency) //alt: copy(amount = amount * num)
  }
  
  val m1 = Money(10, "CAD")                       //> m1  : SymbolicNames.Money = Money(10.0,CAD)
  val m2 = Money(15, "CAD")                       //> m2  : SymbolicNames.Money = Money(15.0,CAD)
  m1 + m2                                         //> res6: SymbolicNames.Money = Money(25.0,CAD)
  m1 * 5                                          //> res7: SymbolicNames.Money = Money(50.0,CAD)
  
  
  import scala.collection.mutable._
  val set = Set("a", "b")                         //> set  : scala.collection.mutable.Set[String] = Set(a, b)
  set += "c"                                      //> res8: SymbolicNames.set.type = Set(c, a, b)
  set -= "a"                                      //> res9: SymbolicNames.set.type = Set(c, b)
  
  val map = Map("test" -> 50, "test2" -> 55)      //> map  : scala.collection.mutable.Map[String,Int] = Map(test2 -> 55, test -> 5
                                                  //| 0)
  map("test")                                     //> res10: Int = 50
  map("test") = 20
  map                                             //> res11: scala.collection.mutable.Map[String,Int] = Map(test2 -> 55, test -> 2
                                                  //| 0)
  map("test3") = 1000
  map                                             //> res12: scala.collection.mutable.Map[String,Int] = Map(test2 -> 55, test3 -> 
                                                  //| 1000, test -> 20)
    
}