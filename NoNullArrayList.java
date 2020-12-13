import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    if(element == null){
      throw new IllegalArgumentException("You can't add null values");
    }
    return super.add(element);
  }
}
