package labpack.Lab6.view;

import labpack.Lab6.controller.LibraryManager;
import labpack.Lab6.model.dto.Book;
import labpack.Lab6.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이을 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);

        lm.insertMember(new Member(name , age , gender,0));

        System.out.println("==== 메뉴 ====");
        System.out.println("1.마이페이지");
        System.out.println("2.도서 전체 조회");
        System.out.println("3.도서 검색");
        System.out.println("4.도서 대여하기");
        System.out.println("0.프로그램 종료");


        while (true) {
            System.out.print("입력 : ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("bb");
                    return;
                default:
                    System.out.println("잘못입력");
                    break;
            }
        }
    }


// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
// LibraryManager의 insertMember() 메소드에 전달
// ==== 메뉴 ====
//       1. 마이페이지
//       2. 도서 전체 조회
//       3. 도서 검색
//       4. 도서 대여하기
//       0. 프로그램 종료하기

    // 무한 반복 실행
// LibraryManager의 myInfo() 호출하여 출력
// LibraryMenu의 selectAll() 호출
// LibraryMenu의 searchBook() 호출
// LibraryMenu의 rentBook() 호출
//        while ()
    public void selectAll() {

// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
// for문 이용하여 bList의 모든 도서 목록 출력
// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
//ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
        Book[] bList = lm.selectAll();
        System.out.println("전체 도서 조회)");
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 " + bList[i]);
        }
    }

    public void searchBook() {
// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
// LibraryManager의 searchBook() 에 전달
// 그 결과 값을 Book[] 자료형에 담기
        System.out.println("검색도서");
        String keyword = sc.next();
        System.out.println("검색도서목록조회");
        Book[] searchList = lm.searchBook(keyword);
        for (Book bk : searchList) {
            if (bk != null) {
                System.out.println(bk);
            }
        }
    }

    //// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
//// NullPointerException 발생 시 오류 해결하시오 ㅎㅎ
    public void rentBook() {
        selectAll();
        System.out.println("대여할 도서 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);
        if (result == 0)
            System.out.println("굳");
        else if (result == 1)
            System.out.println("나이제한");
        else
            System.out.println("굳 , 쿠폰 갯수를 확인해 보세요.");
//// 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출
//// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
//// LibraryManager의 rentBook() 에 전달
//// 그 결과 값을 result로 받고 그 result가
//// 0일 경우 → “성공적으로 대여되었습니다.” 출력
//// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
//// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
//마이페이지를 통해 확인하세요” 출력

    }
}




