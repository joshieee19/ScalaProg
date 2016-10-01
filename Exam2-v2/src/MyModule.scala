/**
  * Created by lara_villanueva on 9/10/2016.
  */
import java.lang.System.out.println
import scala.io.Source
object MyModule {

  def main(args: Array[String]): Unit = {
    //    println("JOsiah ")
    //    println(multiply(3)(10))
  }

}
  /*
    //NUMBER 1
    def conditional(x: String, p: String => Boolean, f: String => String): String = {
      if(p(x))
        f(x)
      else
        x
    }
    val a = conditional("Josiah", _.size > 4, _.reverse)
    println("Number 1 = " + a)

    //NUMBER 2 - high order function
    def multiply(x: Int) = (y: Int) => x * y
    val times = multiply(3)
    print("Numebr 2 = ")
    println(times(10))

    //NUMBER 3
      def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
        a => b => f(a,b)
      }

    //Hanoi Tower
    solve(3, "A", "B", "C")

    def solve(n: Int, start:String, aux:String, end:String):Unit={
      if (n==1) {
        println("Move Disc " + n + " from " + start + " to " + end)
      }else {
        solve(n-1, start, end, aux)
        println("Move Disc " + n + " from " + start + " to " + end)
        solve(n-1, aux, start, end)

      }
      // A B C = 3
      // A C B = 2
      // A B C = 1

    }

  //SAMPLE EX.
    def double(x: Int): Int = x * 2
  //  println(double(5))
  //  output 10

    def safeStringOp(s: String, f: String => String) = {
      //ano ung =>
        if (s != null)
          f(s)
        else s
    }

    //excersice week 6
    val stateCapitals = Map(
      "Alabama" -> "Montgomery",
      "Alaska" -> "Juneau",
      "Wyoming" -> "Cheyenne")
    println( "Unknown: " + stateCapitals.get("Non existing Value") )
    println( "Alabama: " + stateCapitals.get("Alabama").get )
    println( "Wyoming: " + stateCapitals.get("Wyoming").getOrElse("Oops!") )
    println( "Unknown: " + stateCapitals.get("Unknown").getOrElse("Oops2!") )


    val bools = Seq(true, false)
    for (bool <- bools) {
      bool  match {
        case true => println("Got heads")
        case false => println("Got tails")
      }
    }

    for {
      x <- Seq(1, 2, 2.7, "one", "two", 'four)
    } {
      val str = x match {
        case 1 => "int 1"
        case i: Int => "other int: "+i
        case d: Double => "a double: "+x
        case "one" => "string one" //
        case s: String => "other string: "+s
        case unexpected => "unexpected value: " + unexpected
      }
      println(str)
    }
    */

