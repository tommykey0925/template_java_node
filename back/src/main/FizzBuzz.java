import java.util.function.Predicate;
import java.util.function.BiConsumer;

class FizzBuzz {

  static Predicate<Integer> fizzP = (i) -> i % 3 == 0;
  static Predicate<Integer> buzzP = (i) -> i % 5 == 0;
  static BiConsumer<Integer, String> bc = (i, s) -> System.out.println(i + s);
  static String[] strAry = new String[]{"Fizz", "Buzz", "FizzBuzz", ""};

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      exec(i);
    }
  }

  static void exec(Integer seqInt) {
    boolean isFizzBuzz = fizzP.test(seqInt) && buzzP.test(seqInt);
    if (fizzP.test(seqInt) && !isFizzBuzz) {
      bc.accept(seqInt, strAry[0]);
    } else if (buzzP.test(seqInt) && !isFizzBuzz) {
      bc.accept(seqInt, strAry[1]);
    } else if (isFizzBuzz) {
      bc.accept(seqInt, strAry[2]);
    } else {
      bc.accept(seqInt, strAry[3]);
    }
  }

}