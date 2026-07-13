import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> result = new ArrayList<>();

        String digits = "123456789";

        for (int length = 2; length <= 9; length++) {

            for (int start = 0; start + length <= 9; start++) {

                String part = digits.substring(start, start + length);

                int number = Integer.parseInt(part);

                if (number >= low && number <= high) {
                    result.add(number);
                }
            }
        }

        return result;
    }
}