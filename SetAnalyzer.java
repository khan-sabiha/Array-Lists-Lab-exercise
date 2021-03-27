

import java.util.ArrayList;


public class SetAnalyzer<T> {


    public SetAnalyzer() {

    }

    //Calculates the intersection(common elements between two array list) of the two lists.
    public ArrayList<T> intersection(ArrayList<T> list1, ArrayList<T> list2) {
        ArrayList<T> list3 = new ArrayList<T>();
        for (T i : list1) {
            if (list2.contains(i)) {
                list3.add(i);
            }
        }
        return list3;
    }

    //Calculates the union (all the elements of the two array lists) of two array lists.
   public ArrayList<T> union(ArrayList<T> list1, ArrayList<T> list2){
           ArrayList<T> list3 = new ArrayList<T>();
           for(T i :list1) {
               list3.add(i);
           }
            for (T j :list2 ) {
                if(!list1.contains(j)){
                    list3.add(j);
                }

            }
        return list3;

    }
}
