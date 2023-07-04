package Tutorial_4
import scala.io.StdIn

object Q02 {
  def main(args:Array[String]){
    println("Enter your integer: ")
    var integer=StdIn.readInt()
    PatternMatching(integer)
  }
  

  def PatternMatching(integer:Int):Unit={
    if(integer<0){
      println("Given number is Negative")
    }
    else if(integer==0){
      println("Given number is Zero")
    }
    else if(integer%2==0){
      println("Given number is Even")
    }
    else{
      println("Given number is Odd")
    }
}}
