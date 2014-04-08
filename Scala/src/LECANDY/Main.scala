package LECANDY

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.io.PrintWriter
import java.io.BufferedOutputStream

object Main {

  def main(args: Array[String]): Unit = {
    val in = new BufferedReader(new InputStreamReader(System.in));
    val out = new PrintWriter(new BufferedOutputStream(System.out));

    val testCases = Integer.parseInt(in.readLine());
    
    for(testCase <- 1 to testCases) {
      val tokenizer = new StringTokenizer(in.readLine());
      val animalCount = Integer.parseInt(tokenizer.nextToken());
      val maxFood = Integer.parseInt(tokenizer.nextToken());
      val requiredFood = in.readLine().split(" ").map(s => Integer.parseInt(s)).foldLeft(0)((a, b) => a + b);
      out.println(if (requiredFood <= maxFood) "Yes" else "No");
    }
    
    out.flush();
    out.close();
  }
}