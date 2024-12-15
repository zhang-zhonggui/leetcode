package day2024.month5.day5;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k == 0) {
            return res;
        } else if(k > 0) {
            for(int i = 0; i < n; i++) {
                int idx = i + 1;
                int cnt = 0;
                for(int j = 0; j < k; j++) {
                    if(idx >= n) idx = 0;
                    cnt += code[idx];
                    idx++;
                }
                res[i] = cnt;
            }
        } else {
            for(int i = 0; i < n; i++) {
                int idx = i - 1;
                int cnt = 0;
                for(int j = 0; j < -k; j++) {
                    if(idx < 0) idx = n - 1;
                    cnt += code[idx];
                    idx--;
                }
                res[i] = cnt;
            }
        }
        return res;
    }
}
