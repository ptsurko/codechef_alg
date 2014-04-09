package GCD2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.io.BufferedOutputStream
object Main {
  def main(args: Array[String]): Unit = {
    val in = new BufferedReader(new InputStreamReader(System.in));
    val out = new PrintWriter(new BufferedOutputStream(System.out));
    val testCases = Integer.parseInt(in.readLine());
    for(testCase <- 1 to testCases) {
      val s = in.readLine().trim().split(" ");
      val a = Integer.parseInt(s(0));
      val b = s(1);
      if (a == 0)
        out.println(b);
      else
        out.println(gcd2(b, a));
    };
    out.flush();
    out.close();
  }
  def gcd2(a:String, b:Int) = gcd(b, mod(a, b))
  def gcd(a:Int,b:Int):Int =
    if (b==0) a else gcd(b,a%b)
  def mod(ln:String,sn:Int):Int = {
    if (sn == 0) return 0;
    var r = 0;
    for(di <- 0 to ln.length - 1) {
      var d = Integer.parseInt(ln.charAt(di).toString);
      r=(r*10+d)%sn;
    }
    r;
  }
}

