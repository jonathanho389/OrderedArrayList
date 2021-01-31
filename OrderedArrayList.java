import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

private int finder(T element){
  int index = 0;
  if(element == null){
    throw new IllegalArgumentException("no null values allowed");
  }
  while(index < super.size() && element.compareTo(super.get(index)) > 0){
    index++;
  }
  return index;
}

public boolean add(T element){
  super.add(finder(element),element);
  return true;
}

public void add(int index, T element){
  super.add(finder(element),element);
  }

public T set(int index, T element){
  if(element == null){
    throw new IllegalArgumentException("no null values allowed");
  }
  T original = super.get(index);
  super.remove(index);
  super.add(finder(element), element);
  return original;
  }
}
