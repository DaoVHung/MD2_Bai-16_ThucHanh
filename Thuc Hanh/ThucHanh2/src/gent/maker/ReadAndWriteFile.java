package gent.maker;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {


    List<Integer> numbers = new ArrayList<>();
    try{
        File file = new File(filePath);
        if(!file.exists()){
            throw new FileNotFoundException();
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine()) != null){
            numbers.add(Integer.parseInt(line));
        }
        br.close();
    }catch (Exception e){
        System.err.println("File ko ton tai hoac loi noi dung !");
    }
    return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedReader = new BufferedWriter(writer);
            bufferedReader.write("GIA TRI LON NHAT LA : " + max);
            bufferedReader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
