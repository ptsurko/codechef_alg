package MUFFINS3

import java.io.PrintWriter
import java.io.BufferedOutputStream

object Main {

  def main(args: Array[String]): Unit = {
    val testCases = Integer.parseInt(Console.in.readLine());
    val out = new PrintWriter(new BufferedOutputStream(System.out));
    
    for(i <- 1 to testCases) {
      val cakeCount = Integer.parseInt(Console.in.readLine());
      
      out.println(cakeCount / 2 + 1);
    }
    
    out.flush();
    out.close();
  }
}