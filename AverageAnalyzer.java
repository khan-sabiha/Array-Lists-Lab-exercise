

import java.util.ArrayList;


public class AverageAnalyzer {

    private ArrayList<Integer> values;

    public AverageAnalyzer(ArrayList<Integer> values){
        this.values = values;


    }

    // Calculates the mean of an array list.
    public double mean(){
        double sum = 0;
        for (int i = 0; i < values.size(); i++){
            sum += values.get(i);
        }
        return sum/values.size(); //remove this, default value for template
    }


    //Calculates the mode of an array list.
    public int mode(){
        int maxcount = 0;
        int value = 0;
        for (int i = 0; i < values.size(); i++ ){
            int count= 0;
            for (int j = 0; j < values.size(); j++){
                if(values.get(j).equals(values.get(i))){
                    count++;
                }
            }
            if (count > maxcount){
                maxcount = count;
                value = values.get(i);

            }

        }
        return value; //remove this, default value for template
    }
}
