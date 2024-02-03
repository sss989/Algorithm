class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int max =1;
        
        //최대공약수 구하기
        for (int i=1; i<=numer && i<= denom; i++){
            if(denom%i==0 && numer%i==0){
                max = i;
            }
        }
        // 분자, 분모 최대공약수로 나눠서 answer에 저장
        int[] answer = {numer/max, denom/max};
        return answer;
    }
}