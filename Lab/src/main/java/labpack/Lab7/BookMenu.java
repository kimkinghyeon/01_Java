package labpack.Lab7;

import labpack.Lab6.model.dto.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ==== ==== 도서 관리 프로그램 ==== ==== ");
        System.out.println("1. 새 책 추가\n" + "2. 책 정렬 (1.오름차 2.내림차)\n" + "3. 분서갱유\n" + "4. 책 검색\n" +
                "5. 전체 책 보기\n" + "6. 종료 ");

        System.out.print("입력 : ");
        int n = sc.nextInt();
        switch (n){
            case 1: inputBook();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: inputBook();
                break;
            case 5:
                break;
            case 6:
                return;
            default:
                System.out.println("입력 똑바로하셈");
        }

//*** 도서 관리 프로그램 ***
//        1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행
//        2. 도서정보 정렬 후 출력 // sortedBookList(정렬종류번호) 실행
// =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
//        정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
//        1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
//=> ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행
//        3. 도서 삭제 // deleteBook (도서 번호) 실행
// => seachBook()메소드를 이용
//=> 결과값 리턴 받아 0일 경우 “성공적으로 삭제”
//        1일 경우 “삭제할 글이 존재하지 않음”
//        4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
// => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
//        -1이 아닐 경우 printBook(index) 출력
//        5. 전체 출력 // displayAll() 실행
//=> 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
//        아닌 경우는 전체 출력
//        6. 끝내기 // main()으로 리턴
//        메뉴 번호 선택 : >> 입력 받음
// 메뉴 화면 반복 실행 처리
// 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행

    }
        public BookDTO inputBook () {
            // 도서 번호 : >> 임의 값 입
// "도서 제목 : " >> 입력 받음
// "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
// "도서 저자 : " >> 입력 받음
// 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO 객체 리턴
            Scanner sc = new Scanner(System.in);
            System.out.print("책 번호");
            int bNo = sc.nextInt();
            System.out.print("책 장르");
            int category = sc.nextInt();
            System.out.print("책 제목");
            String title = sc.next();
            System.out.println("책 저자");
            String author = sc.next();

            return new BookDTO(bNo,category ,title ,author);
        }

        public String inputBookTitle () {
// “도서 제목 : “ >> 입력 받음 >> 리턴
            Scanner sc = new Scanner(System.in);

            System.out.println("찾을 책");
            System.out.print("책제목 : ");
            return sc.nextLine();
        }
    }


