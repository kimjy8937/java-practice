package com.greedy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Application6 {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("해리포터와 마법사의 돌", "J.K. 롤링", 1997, 10900),
                new Book("해리포터와 비밀의 방", "J.K. 롤링", 1998, 11900),
                new Book("다빈치 코드", "댄 브라운", 2003, 15900),
                new Book("천사와 악마", "댄 브라운", 2000, 12900),
                new Book("호빗", "J.R.R. 톨킨", 1937, 8990)
        );

        // 1. 특정 저자(J.K. 롤링)의 도서 제목 리스트를 반환
        List<String> booksByAuthor = books.stream().filter(b -> Objects.equals(b.getAuthor(), "J.K. 롤링")).map(Book::getTitle).toList();

//                // 2. 2000년 이후 출판된 도서 중 가장 비싼 도서의 제목을 반환
        String mostExpensiveBookAfter2000 = books.stream().filter(b -> b.getPublicationYear() >= 2000).max((a,b) -> (int) (a.getPrice() - b.getPrice())).map(Book::getTitle).get();// 코드 작성
//
//                // 3. 각 출판 연도별로 도서의 수를 계산하여 맵으로 반환
        Map<Integer, Long> booksCountByYear = books.stream().collect(Collectors.groupingBy(Book::getPublicationYear, Collectors.counting()));// 코드 작성
//
          System.out.println(booksByAuthor); // 출력 예시: ["해리포터와 마법사의 돌", "해리포터와 비밀의 방"]
          System.out.println(mostExpensiveBookAfter2000); // 출력 예시: "다빈치 코드"
          System.out.println(booksCountByYear); // 출력 예시: {1997=1, 1998=1, 2000=1, 2003=1, 1937=1}
    }
}
