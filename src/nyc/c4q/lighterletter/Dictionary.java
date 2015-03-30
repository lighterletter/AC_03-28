package nyc.c4q.lighterletter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-john on 3/28/15.
 */
public class Dictionary {


    private final ArrayList<String> dictArray;

    public  Dictionary(String filename) {

        dictArray = new ArrayList<String>();
        try {
            Scanner fileSearch = new Scanner(new File(filename));

            String text;

            while (fileSearch.hasNext()) {
                text = fileSearch.next();
                dictArray.add(text);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();

        }

    }

    public static void main(String [] args){

        File dictionary = new File("/Users/c4q-john/Desktop/accesscode/AC_03-28/src/nyc/c4q/lighterletter/words");


    }






}
