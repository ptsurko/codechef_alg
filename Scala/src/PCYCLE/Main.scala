package PCYCLE

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.io.BufferedOutputStream

object Main {

  def main(args: Array[String]): Unit = {
    val in = new BufferedReader(new InputStreamReader(System.in));
    val out = new PrintWriter(new BufferedOutputStream(System.out));

    val length = Integer.parseInt(in.readLine());

    if (length <= 0) {
      return
    }

    val permutation = for (numberStr <- in.readLine().split(" ")) yield Integer.parseInt(numberStr)
    val visitedIndices = new Array[Boolean](permutation.length);

    def findCycle(startIndex: Int, visitedCount: Int, result: List[List[Int]]): List[List[Int]] = {
      if (visitedCount == permutation.length)
        return result;
      else {
        var cycle = startIndex :: Nil;

        visitedIndices(startIndex - 1) = true;

        var nextIndex = permutation(startIndex - 1);
        while (nextIndex != startIndex) {
          visitedIndices(nextIndex - 1) = true;

          cycle = nextIndex :: cycle;
          nextIndex = permutation(nextIndex - 1);
        }
        cycle = nextIndex :: cycle;

        return findCycle(findFirstNonVisited(visitedIndices, startIndex - 1) + 1, visitedCount + cycle.length - 1, cycle :: result);
      }
    }
    
    val result: List[List[Int]] = findCycle(findFirstNonVisited(visitedIndices, 0) + 1, 0, List[List[Int]]());

    out.println(result.length);
    for (cycle <- result.reverse) {
      for (number <- cycle.reverse) {
        out.print(number + " ");
      }
      out.println();
    }

    out.flush();
    out.close();
  }
  def findFirstNonVisited(array: Array[Boolean], startIndex: Int): Int = {
    if (startIndex >= array.length)
      array.length;
    else if (!array(startIndex))
      startIndex;
    else
      findFirstNonVisited(array, startIndex + 1);
  }
}