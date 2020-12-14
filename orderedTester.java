import java.util.*;
public class orderedTester{
  public static void main(String[] args) {
    OrderedArrayList<Integer> brian = new OrderedArrayList<Integer>();
    brian.add(7); brian.add(4); brian.add(3); brian.add(2); brian.add(6);
    brian.add(2, 5);
    System.out.println(brian);
  }
}
