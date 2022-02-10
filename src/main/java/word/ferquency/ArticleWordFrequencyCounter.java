package word.ferquency;

import java.util.*;
import java.util.concurrent.*;

public class ArticleWordFrequencyCounter {
    private static ArrayList<String> readStrings() {
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        try{
            while(in.hasNextLine()){
                list.add(in.nextLine().toLowerCase().replaceAll("[.]", ""));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            in.close();
        }
        return list;
    }
    public static void main(String args[] ) throws Exception {
        ArticleWordFrequencyCounter awfc = new ArticleWordFrequencyCounter();
        List<String> stringsList = awfc.readStrings();

        /* Enter your code here. */
        Map<String, Integer> wordCounter = new ConcurrentHashMap<>();
        stringsList.parallelStream().forEach(string -> {
            String [] words = string.split("\\s+");
            Arrays.stream(words).parallel().forEach(word -> {
                wordCounter.put(word, wordCounter.get(word) != null ? wordCounter.get(word) + 1 : 1);
            });
        });
        Thread.sleep(5);
        System.out.println(wordCounter);


    }
}
