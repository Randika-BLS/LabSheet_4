package Tutorial_4
import scala.io.StdIn

object Q01 {
   def main(args:Array[String]){
     println("Enter your deposit amount Rs: ")
     var deposit=StdIn.readDouble()
   
      print(f"Amount of interest - Rs:${calculateInterest(deposit)}%.2f")
     
   def calculateInterest(deposit: Double): Double = {

  
  if (deposit <= 20000) {
    deposit * 0.02 
  } else if (deposit <= 200000) {
    deposit * 0.04 
  } else if (deposit <= 2000000) {
    deposit * 0.035 
  } else {
    deposit * 0.065 
  }

}
}
}