package com.ohgiraffers.secation03.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {
        /*
        * 깊은 복사
        *
        * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
        * 또 다른 배열에 복사를 해놓은 것
        * 서로 같은 값을 가지고 있지만, 두 대별 서로 다른 배열이기에
        * 하나의 배열에 값을 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
        *
        * 깊은 복사 방법 4가지
        * 1. for 문을 이용한 동일한 인덱스의 값 복사
        * 2. object 의 clone()을 이용한 복사
        * 3. System 의 arrayCopy()를 이용한 복사
        * 4. Array 의 copyOf()를 이용한 복사
        * 가장 많이 사용되는 방식 copyOf() 메소드
        * clone() 이전 배열과 같은 배열밖에 만들 수 없다는 특징
        *   -> clone()이외 다른 복사 방법은 배열의 길이를 조절 가능
        * */

        // 원본 배열 할당 및 초기화
        int[] originArr = new int[] {1,2,3,4,5};

        print(originArr);

        //for문을 이용한 동일한 인덱스 값 복사
        int[] copyArr1 = new int[10];

        for (int i = 0; i < originArr.length; i++){
            copyArr1[i] = originArr[i];
            //copyArr1 배열은 10이기 떄문에 + /n 만큼 입력하면 칸이 옮겨감
        }
        print(copyArr1);
        // 원본 배열과 같은 값을 가지고 있지만, 나머지 인덱스는 다른 값
        // hashcode ( 주소값 ) 이 다르다.

        // object clone()을 이용한 복사
        int[] copyArr2 = originArr.clone();
        System.out.println("copy2");
        print(copyArr2);
        // System 의 arrayCopy()를 이용한 복사
        int[] copyArr3 = new int[10];
        //원본 배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스. 복사할 길이
        System.arraycopy(originArr,0,copyArr3,0,originArr.length);
        System.out.println("copy3");
        print(copyArr3);
        // Arrays 의 copyOf()
        int[] copyArr4 = Arrays.copyOf(originArr,5);
        System.out.println("copy4");
        print(copyArr4); // 복사한 만큼의 값은 같지만 , 길이도 다르고 , 주소도 다르다.
    }
    public  static  void print(int[] iarr){
        System.out.println("iarr의 hashcode : " + iarr.hashCode());
        for (int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}
