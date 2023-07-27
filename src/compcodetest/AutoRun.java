package compcodetest;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

public class AutoRun {
    public static void main(String[] args) {
        //Given an English book in a text file, print the 10 most commonly occurring words in descending order
        //
        //Input: filename as String
        //Output: "<word>: <occurences>" on STDOUT for Top 10 words

        //1 : Start
        //2 : String words = ""
        //3 : SET count = 0, maxCount = 0
        //4 : Define ArrayList<String> words
        //5 :Use to read the file or txt
        //6 :read line from txt
        //7 : looping  and CONVERT each line and save in to the memory of number of occrence
        //8 : Add all words according to the count
        //9 : SET i=0;REPEAT STEP this
        //10 SET count =1
        //11 : SET j =i+1.Repeat step this STEP UNTIL j<word.size()
        //12 : if(words.get(i).equals(words.get(j)))   then
       // count = count +1;
        //13

        /*String word ="";
        int count = 0, maxCount =0;

        ArrayList<String> words = new ArrayList<String>();

        // for */

        Set<WordCount> wordCount = new HashSet<WordCount>();

        File file = new FIle("C\\fileName");
        String str = //reading the file

        String words = str.split("\\s+"); //

        for(String s : words){
            wordCount.add(new WordCount(s));
            wordCount.incCount() //all the counts
        }

        Collections.sort(wordCount,new WordCount); // word count is the number of comparater

        for(WordCount w : wordCount){
            sop
        }
//************ FOr Linked HAsh
        BufferedReader in = new BufferedReader(())// for the

        while ((str = in.readLine() != null)){
            str = str .toLowerCase();
            String[] Words =str.split("\\s+"); //
            for (String word : words){
                if(word.length() == 0){
                    continue;
                }

                Integer occ = wordCount.get(word);
                        if(occ == null){
                            occ =1;

                        }else {
                            occ ++
                        }
                        wordCount.put (word,occ)

            }
        }

        ArrayList<Integer> valueOfCount = new ArrayList<>();

        valueOfCount.addAll(wordCount.valueOfCount());

        Collections.sort(valueOfCount, Collections.reverseOrder());
        int last =-1;

        for(Integer i : valueOfCount.subList(0,9)){
            if(last == i)
                continue
                last =i;

            for(String s :wordCount.keySet()){
                if(wordCount.get(s) == i)
                    sop(s + " " + i);
            }

        }

    }

    public class WordCount{
        private  final String word;
        private  int occrrence;
    }

    @Override
    public  int compareTo(Word o){
        return count.compareTo(o.getCount());
    }
}
