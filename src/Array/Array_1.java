package Array;

import java.util.Arrays;

public class Array_1 {
    public static void main(String[] args){


        int[] lottos = {44, 1, 0, 0, 31, 25};
        for(int i = 0; i <6; i++){
            for(int j = i+1; j < 6; j++){
                if(lottos[i] == 0){
                    continue;
                }

                if(lottos[i] > lottos[j] ){
                    int temp = lottos[i];
                    lottos[i] = lottos[j];
                    lottos[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(lottos));
    }
}
