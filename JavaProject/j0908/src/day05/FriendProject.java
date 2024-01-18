package day05;

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

public class FriendProject {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Friend[] high = new Friend[1];
		Friend[] univ = new Friend[1];
		int highIndex = 0;
		int univIndex = 0;
		String name, tel, address, job, major;

		int choice = 1;
		while (choice != 5 && choice < 5 && choice > 0) {
			System.out.println("");
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 고교 정보 저장");
			System.out.println("2. 대학 친구 저장");
			System.out.println("3. 전체 정보 출력");
			System.out.println("4. 기본 정보 출력");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택:");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				if (highIndex >= high.length) {
					high = Arrays.copyOf(high, high.length + 1);
				}
				System.out.print("이름 : ");
				name = s.next();
				System.out.print("전화 : ");
				tel = s.next();
				System.out.print("주소 : ");
				address = s.next();
				System.out.print("직업 : ");
				job = s.next();
				high[highIndex] = new HighFriend(name, tel, address, job);
				System.out.println("입력 완료!");

				highIndex++;
				break;
			case 2:
				if (univIndex >= univ.length) {
					univ = Arrays.copyOf(univ, univ.length + 1);
				}
				System.out.print("이름 : ");
				name = s.next();
				System.out.print("전화 : ");
				tel = s.next();
				System.out.print("주소 : ");
				address = s.next();
				System.out.print("직업 : ");
				major = s.next();
				univ[univIndex] = new UnivFriend(name, tel, address, major);
				System.out.println("입력 완료!");

				univIndex++;
				break;
			case 3:
				if (high[0] != null) {
					for (Friend list : high) {
						list.all();
					}
				}
				if (univ[0] != null) {
					for (Friend list : univ) {
						list.all();
					}
				}
				if (univ[0] == null && high[0] == null) {
					System.out.println("입력된 정보가 없습니다.");
				}

				break;
			case 4:
				if (high[0] != null) {
					for (Friend list : high) {
						list.defaultinfo();
					}
				}
				if (univ[0] != null) {
					for (Friend list : univ) {
						list.defaultinfo();
					}
				}
				if (univ[0] == null && high[0] == null) {
					System.out.println("입력된 정보가 없습니다.");
				}
				break;
			case 5:
				System.out.println("종료");
				return;
			}// switch

		}

	}// main

}
