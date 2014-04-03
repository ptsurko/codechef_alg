package TEST

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.io.BufferedOutputStream

object Main {

  def main(args: Array[String]): Unit = {
    val br = new BufferedReader(new InputStreamReader(System.in));

    readLine(br.readLine());
    
    def readLine(str: String): Unit = {
      if (str.equals("42")) {
        return ();
      }
      
      println(str);
      readLine(br.readLine());
    }
  }
}