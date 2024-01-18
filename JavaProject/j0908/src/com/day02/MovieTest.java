package com.day02;

import java.util.ArrayList;
import java.util.Scanner;

//클래스 Movie 정의 : 멤버변수 영화제목(title) 감독이름(director)
//모든 값을 초기화 하는 생성자 정의
//기생충:봉준호 같은 형태로 출력하는 toString() 메서드 재정의
//영화 3개를 저장하는 객체 배열을 선언하고 저장하여 출력
class Movie{
	private String title;
	private String director;
	
	public Movie(String title, String director) {
		this.title=title;
		this.director=director;
	}
	@Override
	public String toString() {
		return title + ":" + director;
	}
	
}


public class MovieTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//ArrayList 배열 클래스를 이용하여 제목과 감독을 추가하고 츨력
		//1. add() set() remove() get()
		//ArrayList<클래스타입> 이름 = new ArrayList<클래스타입>
		ArrayList<Movie> m = new ArrayList<Movie>();
		m.add(new Movie("기생충","봉준호"));
		m.add(new Movie("무빙", "강풀"));
		m.add(new Movie("영화제목", "감독이름"));
		
		
		for(Movie list:m) {
			System.out.println(list);
		}

	}

}
