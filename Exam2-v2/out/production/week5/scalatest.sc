scala.io.Source.fromFile("Libraries\\Documents\\scalatest.txt")
  .getLines
  .flatMap(_.split("\\W+"))
  .foldLeft(Map.empty[String, Int]){
    (count, word) => count + (word -> (count.getOrElse(word, 0) + 1))
  }