

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[] arr1 = {'h','e','l','l','o'};
        char[] arr2 = {'w','o','r','l','d'};

        char[] re = new char[arr1.length+arr2.length];

        int idx=0;
        for(int i=0;i<arr1.length;i++){
          re[idx] = arr1[i];
          idx++;
        }
        for(int i=0;i<arr2.length;i++){
          re[idx] = arr2[i];
          idx++;
        }
        for(int i=0;i<re.length;i++){
          System.out.print(re[i]+"");
        }
    }
}