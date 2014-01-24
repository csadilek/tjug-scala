object RegularClasses {

  val p = new Person()                            //> p  : Person = Person@f9997e
  p.first = "Christian"                           //> First name set to Christian
  p.last = "Sadilek"                              //> Last name set to Sadilek.
                                                  //|     Full name is "Christian Sadilek".
}

class Person {
  private var _first: String = ""
  private var _last: String = ""
 
  //Step 1: Show simple type inference initializing this field with 0
  //val age = 0
  private var age: Int = 0
  
  //Step 2: Introduce Getter/Setter => uniform access
  def first = _first
  def first_=(value : String) {
    println(s"First name set to $value")
  	_first = value
  }

	//Step 3: Show String interpolation and triple quoted Strings
  def last = _last
  def last_=(value : String) {
    println(s"""Last name set to $value.
    Full name is "$first $value".""")
  	_first = value
  }
}