import org.apache.commons.lang3.StringUtils
import RichString._

object Implicits {
  val name = "John Smith"                         //> name  : String = John Smith

  //Step 1: Manual conversion from String to RichString
  //RichString.str2Rich(name).substrAfter(" ")

  //Step 2: Implicit conversion from String to RichString
  name.substrAfter(" ")                           //> res0: String = Smith
  "Christian Sadilek".substrAfter(" ")            //> res1: String = Sadilek
}

object RichString {
  implicit def str2Rich(str: String): RichString = new RichString(str)
}

class RichString(str: String) {
  def substrAfter(separator: String) = StringUtils.substringAfter(str, separator)
}