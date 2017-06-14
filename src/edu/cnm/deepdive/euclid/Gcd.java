package edu.cnm.deepdive.euclid;

public class Gcd {
  
  public static final String USAGE = "Usage:%n"
      + "\tjava [options] edu.cnm.deepdive.euclid.Gcd [a b]%n" 
      + "%n" 
      + "where%n"
      + "\toptions = VM options%n" 
      + "\t[a b] = two integers for GCD calculation%n";
  
  private static void emitUsage() {
    System.out.printf(USAGE);
  }

  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int g = gcd(a,b);
      System.out.printf("The GCD of %d and %d is %d%n",a,b,g);
    } catch (ArrayIndexOutOfBoundsException ex){
      emitUsage();
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      emitUsage();
    }

  }
  
  public static int gcd(int a, int b){
    if(a < 0 || b < 0){
      a = Math.abs(a);
      b = Math.abs(b);
    }
    if(a == 0){
      return b;
    }else if(b == 0){
      return a;
    }
    while(a != b){
      if(a > b){
        a -= b;
      }else if(b > a){
        b -= a;
      }
    }
    return a;
  }

}
