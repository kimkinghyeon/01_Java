package labpack.Lab7;

import java.util.ArrayList;

public class BookManager {
    private ArrayList<BookDTO> bookList;
    public BookManager(){
        // bookList 인스턴스 생성
bookList = new ArrayList<BookDTO>();
    }
    public void addBook(BookDTO book) {
//bookList에 도서 추가
        bookList.add(book);
    }
    public void deleteBook(int index){
//전달받은 index로 삭제
        bookList.remove(index);
    }
    public int searchBook(String title){
//도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
        //도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
        int num = -1;
        for (int i = 0; i < bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(title)){
                num = i;
                break;
            }
        }
        return num;
    }

    public void printBook(int index){
// index에 해당하는 객체 출력
        if (index == -1){
            System.out.println("조회한 책 없");
        } else {
            System.out.println(bookList.get(index));
        }
    }
    public void displayAll(){
// 도서 전체 리스트를 출력
        if (bookList.isEmpty()){
            System.out.println("아 읽을 책 없다고 ㅋㅋ");
        } else {
            for (int i = 0; i < bookList.size(); i++){
                System.out.println(bookList.get(i));
            }
        }
    }
    public ArrayList<BookDTO> sortedBookList(int select){
// 전달받은 매개변수의 값에 따라 정렬(1. 오름차순,2. 내림차순)
// for문을 이용하여 ArrayList<BookDTO> 에 추가
// 해당 배열 주소 값 리턴
        if (select == 1){
            bookList.sort(new AscCategory());
        } else {
            bookList.sort(new DescCategory());
        }
        return bookList;
    }
    public void printBookList(ArrayList<BookDTO> br) {
// 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력
    for (BookDTO bk : br){
        System.out.println(bk);
    }
    }
}
