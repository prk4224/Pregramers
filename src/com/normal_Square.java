package com;

public class normal_Square {
    public long solution(int w, int h) {

        // long type으로 형변환을 해주는 이유는 w*h를 한후 long type으로 보낼때 음수 쓰레기 값을 보냄.
        long wl = Long.parseLong(String.valueOf(w));
        long hl = Long.parseLong(String.valueOf(h));

        long big = Math.max(wl,hl);
        long small = Math.min(wl,hl);

        long anwser =  (long)(wl*hl) - (wl+hl - gcd(big,small));

        return anwser;

    }
    public static long gcd(long big, long small){

        if(small == 0) return big;
        else return gcd(small,big%small);
    }
}
