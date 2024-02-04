class Solution {
    public int[] solution(int[] numbers) {
        int[] newNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newNumbers[i] = numbers[i] * 2;
        }

        return newNumbers;
    }
}
