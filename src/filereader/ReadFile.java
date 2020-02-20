package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        int count = 0, maxCount = 0;
        boolean status = false;
        String[] dupkicate = new String[]{"computer","he","me","this"};
        try {
            FileReader fl = new FileReader("src//data.txt");
            BufferedReader bf = new BufferedReader(fl);
            String s, word = null;
            while ((s = bf.readLine()) != null) {
                String[] str = s.split("[.,!? ]+");
                for (String data : str) {
                    status = isWordExist(data,dupkicate);
                    if (true == status) {
                        words.add(data);
                    }

                }
            }
            System.out.println(words);
            System.out.println(Arrays.asList(dupkicate));

            for (int i = 0; i < words.size(); i++) {
                count = 1;
                for (int j = i + 1; j < words.size(); j++) {
                    if (words.get(i).equals(words.get(j))) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    word = words.get(i);
                }

            }
            System.out.println(word);
            bf.close();

        } catch (FileNotFoundException e) {
            System.out.println("file location does not have file!");
        } catch (IOException e) {
            System.out.println("file has no data!");
        }
    }

    private static boolean isWordExist(String data, String[] duplicate) {
        List<String>wordList = new ArrayList<>(Arrays.asList(duplicate));
        if (wordList.contains(data)){
            return false;
        }else
            return true;
    }
}
