import java.util.*;

public class SortedListWithEnd<T extends Comparable<? super T>>
{
    // the items
    private ArrayList<T> items;

    // the counter
    private static int queries = 0;

    // Constructors

    // from a collection
    public SortedListWithEnd(Collection<? extends T> c) {
        items = new ArrayList<T>(c);
        Collections.sort(items);
    }

    // from an array
    public  SortedListWithEnd(T[] arr) {
        items = new ArrayList<T>(arr.length);
        for (T item : arr) {
            items.add(item);
        }
        Collections.sort(items);
    }

    // Create a random list of integers
    public static  SortedListWithEnd<Integer> createRandomList(int lengthLower, int lengthHigher, int valueLower, int valueHigher) {
        Random rng = new Random();
        int length = lengthLower + rng.nextInt(lengthHigher - lengthLower);
        Integer[] randomItems = new Integer[length];

        int bound = valueHigher - valueLower;
        for (int i = 0; i < length; i++) {
            randomItems[i] = valueLower + rng.nextInt(bound);
        }

        return new  SortedListWithEnd<Integer>(randomItems);
    }

    @Override
    public String toString() {
        return items.toString();
    }

    // query the data structure
    public T get(int index) {
        queries++;
        if (index < items.size())
            return items.get(index);
        else
            return null;
    }

    public void add(T s){
       items.add(s);
    }

    public static int getCount() { return queries; }

    public int size(){
        return items.size();
    }

}