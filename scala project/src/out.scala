import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import  java.io._;

/**
  * Created by Villanueva and Sarte
  */
object out {
  def main(args: Array[String]) {

    import java.io._

    val pw = new PrintWriter(new File("D:\\output.txt" ))
    val file = scala.io.Source.fromFile("D:\\input.txt")
      .getLines()
      .toList
      .flatMap(_.split(" "))
      .filter(x => x.matches("[a-zA-Z]+"))
      .sorted
      .groupBy(x => x)
      .map(y => (y._1, y._2.length))
      .toList
      .sorted

    for (c <- file) {
      pw.write(c._1 + " " +c._2 + "\r\n")
    }
    pw.close()

  }


}
