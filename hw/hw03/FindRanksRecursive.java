import java.util.*;


public class FindRanksRecursive{
    private static final boolean debug = false;

    private static void debug(String output) {
        if (debug)
            System.out.println(output);
    }

    /**
     * @param <T>
     * @param list
     * @param target
     * @param index
     * @return
     */

    public static <T extends Comparable<? super T>> T max(T item1, T item2){
        if(item1.compareTo(item2) < 0){ //item2 higher rank
            return item2;
        }
        else{
            return item1;
        }
    }

    public static <T extends Comparable<? super T>> T min(T item1, T item2){
        if(item1.compareTo(item2) < 0){ //item2 higher rank
            return item1;
        }
        else{
            return item2;
        }
    }


    public static <T extends Comparable<? super T>> T find(SortedListWithEnd<T> list1, int start1, int end1, SortedListWithEnd<T> list2, int start2, int end2, int k){

        if (k==1){ //base case
            return min(list1.get(start1), list2.get(start2));
        }


        int ind1 = k/2; 
        int ind2 = k/2; 


        T item1 = list1.get(ind1); 
        T item2 = list2.get(ind2); 

        
        int newk = k/2;
        int new_start1 = start1; 
        int new_end1 = end1;
        int new_start2 = start2;
        int new_end2 = end2;

        if(item1.compareTo(item2) == 0){ 
                return item1;
            } 
        else if(item1.compareTo(item2) > 0){ 
            new_start1 = ind1;
            new_end2 = ind2; 

        }
        else{ 
            new_start2 = ind2;
            new_end1 = ind1;

        }

        return find(list1, new_start1, new_end1, list2, new_start2, new_end2, newk);
    }

    

    public static <T extends Comparable<? super T>> ArrayList<T> find_ranks(SortedListWithEnd<T> list1, SortedListWithEnd<T> list2, int [] ranks) {

        
        ArrayList<T> items = new ArrayList<T>();

        for(int rank: ranks){
            if(rank > list1.size() + list2.size() | rank < 1){
                items.add(null);
            }
            else{
                 T curr_item = find(list1, 0, list1.size()-1, list2, 0, list2.size()-1, rank);
                items.add(curr_item);
            }
           
        }
        return items;
        
    }



    public static void main(String [] args){

        ArrayList<String> l1 = new ArrayList<>(List.of("A", "C", "D", "E", "F", "G", "H", "I", "J")); 
        ArrayList<String> l2 = new ArrayList<>(List.of("B", "C", "D", "D", "F", "G", "H", "K", "L")); 
        

        SortedListWithEnd<String> list1 = new SortedListWithEnd<String>(l1);
        SortedListWithEnd<String> list2 = new SortedListWithEnd<String>(l2);


       int [] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
       ArrayList<String> items = find_ranks(list1, list2, ranks);
       System.out.println(list1);
       System.out.println(list2);
       System.out.println(items);


        // Write your test cases here



    }

        
}