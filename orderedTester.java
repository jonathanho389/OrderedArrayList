import java.util.*;
public class orderedTester{
  public static void main(String[] args) {
    OrderedArrayList<Integer> brian = new OrderedArrayList<Integer>();
    brian.add(3); brian.add(2); brian.add(3); brian.add(4); brian.add(5);
    brian.set(3, 2);
    System.out.println(brian);

  }
}
