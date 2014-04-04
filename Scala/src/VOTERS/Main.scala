package VOTERS

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.io.BufferedOutputStream

object Main {
  def max2(a: Int, b: Int): Int = if (a > b) a else b;
    
    def min3(indices: IndexedSeq[Tuple3[Int, IndexedSeq[Int], Int]]): Int  = {
      var min = indices(0)._3;
      for(ind <- indices if min > ind._3) {
        min = ind._3;
      }
      
      return min;
    }
    
  def main(args: Array[String]): Unit = {
    val in = new BufferedReader(new InputStreamReader(System.in));
    val out = new PrintWriter(new BufferedOutputStream(System.out));
    
    val strs = in.readLine().split(" ");
    val voteNum1: Int = Integer.parseInt(strs(0));
    val voteNum2: Int = Integer.parseInt(strs(1));
    val voteNum3: Int = Integer.parseInt(strs(2));
    
    val votes1 = for(i <- 1 to voteNum1) yield Integer.parseInt(in.readLine().trim());
    val votes2 = for(i <- 1 to voteNum2) yield Integer.parseInt(in.readLine().trim());
    val votes3 = for(i <- 1 to voteNum3) yield Integer.parseInt(in.readLine().trim());
    
    var indices = Array((0, votes1, votes1(0)), (0, votes2, votes2(0)), (0, votes3, votes3(0)));
    var res = new Array[Int](max2(max2(voteNum1, voteNum2), voteNum3));
    var resIndex = 0;
    
    while(indices.length != 0) {
      val min = min3(indices);
      val count = indices.count(ind => ind._3 == min);
      
      if (count > 1) {
        res(resIndex) = min;
        resIndex += 1;
      }
      
      indices = for(ind <- indices if (ind._3 == min && ind._1 + 1 < ind._2.length) || ind._3 != min) yield {
        if (ind._3 == min)
          (ind._1 + 1, ind._2, ind._2(ind._1 + 1))
        else
          ind
      }
    }
 
    
    out.println(resIndex);
    for(i <- 0 to resIndex - 1)
      out.println(res(i));
    
    out.flush();
    out.close();
  }
}