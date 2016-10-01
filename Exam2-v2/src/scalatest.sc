var current = scala.io.Source.fromFile("D:\\scalatest.txt")
  .getLines
  .flatMap(_.split("\\W+"))
  .foldLeft(Map.empty[String, Int]){
    (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
  }

/*
current.toSeq.sortBy(_._1)foreach{

}
*/
