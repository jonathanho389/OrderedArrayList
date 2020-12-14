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

public boolean add(T element){
  super.add(element);
  sorting();
  return true;
}

public void add(int index, T element){
  super.add(element);
  sorting();
  }

public T set(int index, T element){
  T original = super.get(index);
  super.add(element);
  super.remove(index);
  sorting();
  return original;
  }
}
