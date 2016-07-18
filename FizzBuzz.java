public class FizzBuzz {

  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++) {
      String text = "";

      if(i % 3 == 0) {
        text = "Fizz";
        if(i % 5 == 0) {
          text+= "Buzz";
        }
        System.out.println(text);
      }
      System.out.println(i);
    }
  }
}
