public class Demo {
   public static void main(String []args) {
      String str = "testdemo";
      Scanner s= new Scanner(System.in);
      System.out.println("enter the string:");
      String a= s.nextLine();
      System.out.println("String: "+str);
      int index = str.indexOf( a );
      System.out.printf(a" is at index %d", index);
   }
}