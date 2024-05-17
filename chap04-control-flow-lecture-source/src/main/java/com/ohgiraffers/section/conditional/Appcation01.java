package com.ohgiraffers.section.conditional;

public class Appcation01 {
    // 실행용 클래스
    public static void main(String[] args) {

        A_If aIf = new A_If();

        //aIf.testSimpLeIfStatement();
        //aIf.testNestedIfStatement();

        B_IfElse b_ifElse = new B_IfElse();

        //b_ifElse.testSimpleIfElseStatement();
        //b_ifElse.testNestedIfElseStatement();

        C_IfElseIf c_ifElseIf = new C_IfElseIf();

        //c_ifElseIf.testSimpleIfElseIfStatement();
        //c_ifElseIf.testNestedIfElseIfStatement();

        D_switch d_switch = new D_switch();

        //d_switch.testSimpleSwitchStatement();
        //d_switch.testSwitchVendingMachine();
        d_switch.testDoggy();

    }
}
