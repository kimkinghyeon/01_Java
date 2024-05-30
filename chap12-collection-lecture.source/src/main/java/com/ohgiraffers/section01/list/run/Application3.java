package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application3 {

    public static void main(String[] args) {

        /* Stack
        * 후입선출(LIFO - Last In First Out) 방식의 자료구조*/

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        /* Stack 을 사용할때
        * add() 도 이용가능하지만 Vector 의 메소드이다.
        * push() 를 사용하는 것이 좋다*/
        // integerStack.add(6);

        System.out.println("integerStack = " + integerStack);

        /* 스택에서 요소를 찾을 때 search()
        * 인덱스가 아닌, 위에서부터의 순번을 의미
        * 가장 상단의 위치가 0 이 아니라 1부터 시작.
        * 역순으로 본다고 보면 될듯 */
        System.out.println("integerStack.search(5) :" + integerStack.search(5));
        System.out.println("integerStack.search(4) :" + integerStack.search(4));
        System.out.println("integerStack.search(3) :" + integerStack.search(3));
        System.out.println("integerStack.search(2) :" + integerStack.search(2));
        System.out.println("integerStack.search(1) :" + integerStack.search(1));

        /* stack 에서 값을 꺼내는 메소드
        * peak() : 해당 스택의 가장 마지막에 있는 요소 반환
        * pop() : 해당 스택의 가장 마지막에 있는 요소 반환, 반환 후 제거*/

        System.out.println("integerStack.peek()" + integerStack.peek());
        System.out.println("integerStack.pop()" + integerStack.pop());
//        System.out.println("integerStack" + integerStack);
//        System.out.println("integerStack.pop()" + integerStack.pop());
//        System.out.println("integerStack.pop()" + integerStack.pop());
//        System.out.println("integerStack.pop()" + integerStack.pop());
//        System.out.println("integerStack.pop()" + integerStack.pop());
        // 이렇게 하면 배열안에 값이 다 사라져 컴파일 에러 발생


    }

}
