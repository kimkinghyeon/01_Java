package com.ohgiraffers.section04.sort;

public class Application04 {
    public static void main(String[] args) {
        // 버블정렬
        /*
         * 인접한 두개의 숫자를 검사하여 정렬하는 방법
         * 구현이 쉽다는 장점이 있으며, 이미 어느정도 정렬된 데이터를 정렬할 떄 빠름 */
        // [6,5,4,3,2,1} 역순으로 되어있을떄 바꿀게 많아서 느림
        int[] iarr = {2, 5, 4, 6, 1, 3};

        int temp;

        for (int i = iarr.length - 1; i >= 0; i--) {

            // 바로 옆에있는 수를 비교
            for (int j = 0; j < i; j++) {

                if (iarr[j] > iarr[j + 1]) {

                    temp = iarr[j];
                    iarr[j] = iarr[j + 1];
                    iarr[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < iarr.length; i++)
            System.out.print(iarr[i] + " ");
    }
}


