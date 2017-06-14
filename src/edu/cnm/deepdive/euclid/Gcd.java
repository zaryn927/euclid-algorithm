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
      System.out.println(a + " " + b);
    } catch (NumberFormatException ex) {
      ex.printStackTrace();
      emitUsage();
    }

  }

}
