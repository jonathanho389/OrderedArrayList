import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private void sorting(){
    int size = super.size();
    T original = super.get(0);
    for(int i = 0;i < super.size();i++){
      for(int j = i + 1;j < super.size();j++){
        if((Integer)super.get(i) > (Integer)super.get(j)){
          original = super.get(i);
          super.set(i, super.get(j));
          super.set(j, original);
        }
      }
    }
  }
}
