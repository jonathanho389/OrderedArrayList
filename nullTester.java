import java.util.*;
public class nullTester{
  public static void main(String[] args) {
    NoNullArrayList<Integer> pain = new NoNullArrayList<Integer>(5);
    pain.add(1);
    System.out.println(pain.get(0));
    //pain.add(null);
    pain.add(1, null);
  }
}
