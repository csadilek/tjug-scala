object OptionDemo {
  //Slide about Option, reasoning

  case class Person(age: Int)

  //Step 1: show Option(...) and map
  //Step 2: show getOrElse
  val person = Option(Person(100))                //> person  : Option[OptionDemo.Person] = Some(Person(100))
  val age = person.map(_.age + 5)                 //> age  : Option[Int] = Some(105)
  age.getOrElse(50)                               //> res0: Int = 105

  val person2: Option[Person] = Option(null)      //> person2  : Option[OptionDemo.Person] = None
  val age2 = person2.map(_.age + 5)               //> age2  : Option[Int] = None
  age2.getOrElse(50)                              //> res1: Int = 50
  
  //Slide - Java equivalent
  
  age.getOrElse({println("calculating..."); Thread.sleep(1000); 10})
                                                  //> res2: Int = 105
  age.getOrElse(throw new Exception)              //> res3: Int = 105
  //show changing age to age2
}