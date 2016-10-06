/**
  * Created by Villanueva and Sarte
  */
object out {
  def main(args: Array[String]) {
    import java.io._

    val pw = new PrintWriter(new File("D:\\output.txt" ))
    val file = scala.io.Source.fromFile("D:\\input.txt")
    //Sir nakasave po sya sa D://
      .getLines().toList.flatMap(_.split(" "))
      .filter(x => x.matches("[a-zA-Z]+")&& x.length > 1)
      .sorted.groupBy(x => x)
      .map(y => (y._1, y._2.length))
      .toList.sorted

    for (c <- file) {
      pw.write(c._1 + " - " +c._2 + "\r\n")
    }
    pw.close()
  }
}
