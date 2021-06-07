import scala.annotation.tailrec
import scala.util.{Left, Right}

/*
Your task is to process a sequence of integer numbers to determine the following statistics:

    o) minimum value
    o) maximum value
    o) number of elements in the sequence
    o) average value

For example: [6, 9, 15, -2, 92, 11]

    o) minimum value = -2
    o) maximum value = 92
    o) number of elements in the sequence = 6
    o) average value = 21.833333
*/
object CalcStats {

//  def main(args: Array[String]) = {
//    val list = List(6, 9, 15, -2, 92, 11)
//    val calc = new CalcStats(list)
//
//    println(s"min: ${calc.calc()}")
//  }
//
//  class CalcStats(list: List[Int]) {
//
//
//    def calc(): Either[Exception, (Int, Int, Int, Double)] = {
//     Left(new IllegalStateException("teste"))
//     Right((2,2,2, 2.0))
//    }
//
//    @tailrec
//    private def getMinimum(max, aver, totalEle, min: Int = list(0)): Int = {
//      list match {
//        case Nil => min
//        case (head :: tail) => {
//          getMinimum(tail, if (min < head) min else head)
//          getMa
//          getAve
//          getTotalEle
//        }
//        case _ => 0
//      }
//    }
//  }

//    def isListEmpty(list: Array[Int]): Boolean = list.isEmpty

}