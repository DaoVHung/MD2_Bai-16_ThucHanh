
package gent.maker;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile writeFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\MD-2\\Bai-16\\Thuc Hanh\\ThucHanh2\\src\\gent\\maker\\number.txt";
        String PATH_RESULT = "D:\\MD-2\\Bai-16\\Thuc Hanh\\ThucHanh2\\src\\gent\\maker\\result.txt";
        List<Integer> numbers = writeFile.readFile(PATH_NUMBER);
        int max = findMax(numbers);
        writeFile.writeFile(PATH_RESULT, max);
    }
}
