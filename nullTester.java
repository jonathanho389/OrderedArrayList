import java.util.*;
public class nullTester{
  public static void main(String[] args) {
    NoNullArrayList<Integer> paint = new NoNullArrayList<Integer>(5);
    paint.add(1);
    System.out.println(paint.get(0));
    //paint.add(null);
    //paint.add(1, null);
    paint.set(1, null);
  }
}
