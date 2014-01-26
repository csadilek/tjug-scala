object FunctionsAndCollections {
  //Syntax:
  val numbers = List(3, 10, 8, 17)                //> numbers  : List[Int] = List(3, 10, 8, 17)
  numbers.map(number => number * 2)               //> res0: List[Int] = List(6, 20, 16, 34)
  
  numbers.map(_ * 2)                              //> res1: List[Int] = List(6, 20, 16, 34)
  
  def doubleIt(number: Int) = number * 2          //> doubleIt: (number: Int)Int
  numbers.map(doubleIt)                           //> res2: List[Int] = List(6, 20, 16, 34)
  
  
  def forEachNumber(convert: Int => String) = {
    for (number <- numbers) {
      val result = convert(number)
      println(result)
    }
  }                                               //> forEachNumber: (convert: Int => String)Unit
  forEachNumber(n => "it is " + n)                //> it is 3
                                                  //| it is 10
                                                  //| it is 8
                                                  //| it is 17
  def adder(start: Int): Int => Int = {
    var total = start
    n => {
      println("adding " + n)
      total += n
      total
    }
  }                                               //> adder: (start: Int)Int => Int
  
  val myAdder = adder(5)                          //> myAdder  : Int => Int = <function1>
  myAdder(1)                                      //> adding 1
                                                  //| res3: Int = 6
  myAdder(5)                                      //> adding 5
                                                  //| res4: Int = 11
  
  //talk about first class functions
  
  //Collections functions:
  numbers.map("the number is " + _)               //> res5: List[String] = List(the number is 3, the number is 10, the number is 8
                                                  //| , the number is 17)
  
  numbers.foreach(println)                        //> 3
                                                  //| 10
                                                  //| 8
                                                  //| 17
  numbers.filter(_ > 9)                           //> res6: List[Int] = List(10, 17)
  
  val strings = List("Donny", "testing", "abcde") //> strings  : List[String] = List(Donny, testing, abcde)
  val byLength = strings.groupBy(_.length)        //> byLength  : scala.collection.immutable.Map[Int,List[String]] = Map(5 -> List
                                                  //| (Donny, abcde), 7 -> List(testing))
  byLength(5)                                     //> res7: List[String] = List(Donny, abcde)
  byLength(7)                                     //> res8: List[String] = List(testing)
  
  strings.exists(_.length > 5)                    //> res9: Boolean = true
  strings.exists(_.length > 10)                   //> res10: Boolean = false
  
  //To slide - anagram problem
  
  //Parallel collections
  val data = 1 to 10                              //> data  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6
                                                  //| , 7, 8, 9, 10)
  def calculation(number: Int) = {
    println("calculating " + number)
    Thread.sleep(500)
    number * 2
  }                                               //> calculation: (number: Int)Int
  
  //val result = data.map(calculation)
  //show it, then add in .par
  
  //To slide - Java 8 streams
}