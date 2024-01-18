package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

abstract class Friend {
	protected String name;
	protected String tel;
	protected String address;

	public Friend(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	abstract public void defaultinfo();

	abstract public void all();
}

class HighFriend extends Friend {
	private String job;

	public HighFriend(String name, String tel, String address, String job) {
		super(name, tel, address);
		this.job = job;
	}

	@Override
	public void defaultinfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + tel);
		System.out.println("");
	}

	@Override
	public void all() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("직업 : " + job);
		System.out.println("");
	}

}

class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String tel, String address, String major) {
		super(name, tel, address);
		this.major = major;
	}

	@Override
	public void defaultinfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + tel);
		System.out.println("전공 : " + major);
		System.out.println("");
	}

	@Override
	public void all() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + tel);
		System.out.println("주소 : " + address);
		System.out.println("전공 : " + major);
		System.out.println("");
	}

}

//중간고사는 칸채워넣기
class FriendHandle {
	private Friend[] friends;
	private int numoff;

	public FriendHandle(int num) {
		friends = new Friend[num];
		numoff = 0;
	}

	// 친구를 추가할 때마다 객체배열의 값들의 배열 증가
	public void friendnum(Friend f) {
		friends[numoff++] = f;
	}

	// 배열에 친구를 추가하는 메서드 정의
	public void addinfo(int choice) {
		String name, tel, address, job, major;
		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		name = s.next();
		System.out.print("전화 : ");
		tel = s.next();
		System.out.print("주소 : ");
		address = s.next();

		if (choice == 1) {
			System.out.print("직업 : ");
			job = s.next();
			friendnum(new HighFriend(name, tel, address, job));
		} else {
			System.out.print("전공 : ");
			major = s.next();
			friendnum(new UnivFriend(name, tel, address, major));
		}
	}

	// 전체 정보를 출력하는 메서드
	public void showAll() {
		for (int i = 0; i < numoff; i++) {
			friends[i].all();
		}
	}

	// 기본 정보를 출력하는 메서드
	public void showDefaultinfo() {
		for (int i = 0; i < numoff; i++) {
			friends[i].defaultinfo();
		}
	}
}

//메인은 코드가 깔끔해야함.(함수 호출만 하는 식으로)
public class FriendProject {
	public static void main(String[] args) {
		FriendHandle friend = new FriendHandle(100);
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("******메뉴선택******");
			System.out.println("1. 고교 정보 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. 프로그램 종료");
			System.out.print("번호 선택 : ");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
			case 2:
				friend.addinfo(choice);
				break;
			case 3:
				friend.showAll();
				break;
			case 4:
				friend.showDefaultinfo();
				break;
			case 5:
				System.out.println("시스템 종료");
				return;
			default:
				System.out.println("잘못된 번호");
				break;
			}
		}
	}// main

}
