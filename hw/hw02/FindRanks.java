import java.util.*;


public class FindRanks{
    private static final boolean debug = false;

    private static void debug(String output) {
        if (debug)
            System.out.println(output);
    }


    public static <T extends Comparable<? super T>> ArrayList<T> find_ranks1(SortedListWithEnd<T> list1, SortedListWithEnd<T> list2, int [] ranks) {


        ArrayList<T> items = new ArrayList<T>();

        for(int rank: ranks){

            int count = 0;  
            int ind1 = 0;
            int ind2 = 0; 
            int num_queries = 0; 
            int remaining;
            T item1 = null;
            T item2 = null;
            T curr_item = null;
            int total = list1.size() + list2.size();

            if(total == 0){
                return items;
            }


            if(rank < total) {
                while(ind1 <= list1.size() && ind2 <= list2.size()){
                    count++;
                    
                    item1 = list1.get(ind1);
                    item2 = list2.get(ind2);

                    int comp = item1.compareTo(item2); 

                    if(comp > 0){
                        curr_item = item1;
                        ind1++;
                    }
                    else{
                        curr_item = item2;
                        ind2++;
                    }

                }

                if(count < rank){
                    remaining = rank - count;
                    if(ind1 < list1.size()){
                        curr_item = list1.get(ind1+remaining);
                    }
                    else{
                        curr_item = list2.get(ind2+remaining);
                    }
                }

            }
            items.add(curr_item);
            if(debug){
                System.out.println("# queries for rank"+SortedListWithEnd.getCount());
            }
        }
        return items;
    }



   public static <T extends Comparable<? super T>> ArrayList<T> find_ranks2(SortedListWithEnd<T> list1, SortedListWithEnd<T> list2, int [] ranks) {

        // write code here

        
        return null;

    }

    public static void main(String [] args){


        // Write your test cases here
    }

        
}