package com.MyUtiliti.EqualsIsNotEqualTo;

import java.util.ArrayList;

public class EqualsIsNotEqualTo {

    static public ArrayList<String> equalsValueArrayList = new ArrayList<>();
    static public ArrayList<String> notEqualsValueArrayList = new ArrayList<>();

    public EqualsIsNotEqualTo(ArrayList<String> whatSerchArrayList, ArrayList<String> whearSerchArrayList){

        for (int i = 0; i < whatSerchArrayList.size(); i++){
            //System.out.println(whatSerchArrayList.get(i));
            boolean notEquals = false;

            for (int y = 0; y < whearSerchArrayList.size(); y++) {

                //System.out.println(whatSerchArrayList.get(i));
                //System.out.println(whearSerchArrayList.get(y));

                if (whatSerchArrayList.get(i).equals(whearSerchArrayList.get(y))){
                    notEquals = true;
                    equalsValueArrayList.add(whatSerchArrayList.get(i));
                    break;
                }


            }
            if (notEquals == false){
                notEqualsValueArrayList.add(whatSerchArrayList.get(i));
            }

        }
    }
}
