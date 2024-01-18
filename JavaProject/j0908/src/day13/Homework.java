package day13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Address implements Serializable {
	private String name;
	private String age;
	private String phone;

	public Address(String name, String age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return name + ":" + age + ":" + phone;
	}
}

public class Homework {

	public static void main(String[] args) {
		ArrayList<Address> addressList = new ArrayList<>();

		try (Scanner scanner = new Scanner(System.in);
				FileOutputStream fout = new FileOutputStream("c:\\java\\person.txt");
				ObjectOutputStream oout = new ObjectOutputStream(fout);
				FileInputStream fin = new FileInputStream("c:\\java\\person.txt");
				ObjectInputStream oin = new ObjectInputStream(fin)) {

			while (true) {
				System.out.println("******메뉴선택******");
				System.out.println("1. 연락처 출력");
				System.out.println("2. 연락처 등록");
				System.out.println("3. 연락처 삭제");
				System.out.println("4. 끝내기");
				System.out.print("번호 선택 : ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					if (!addressList.isEmpty()) {
						for (int i = 0; i < addressList.size(); i++) {
							Address address = addressList.get(i);
							System.out.println((i +1) + ". " + address);
						}
					} else {
						System.out.println("등록된 연락처가 없음.");
					}
					break;
				case 2:
					System.out.print("이름 입력 : ");
					String name = scanner.next();
					System.out.print("나이 입력 : ");
					String age = scanner.next();
					System.out.print("번호 입력 : ");
					String phone = scanner.next();

					Address newAddress = new Address(name, age, phone);
					addressList.add(newAddress);
					oout.writeObject(newAddress);
					break;
				case 3:
					if (!addressList.isEmpty()) {
						System.out.print("삭제할 연락처의 번호를 입력: ");
						int index = scanner.nextInt();
						if (index >= 0 && index < addressList.size()) {
							addressList.remove(index-1);
							serializeAddressList(oout, addressList);
							System.out.println("연락처 삭제.");
						} else {
							System.out.println("없는 번호.");
						}
					} else {
						System.out.println("등록된 연락처가 없음.");
					}
					break;
				case 4:
					System.out.println("시스템 종료");
					return;
				default:
					System.out.println("잘못된 번호");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void serializeAddressList(ObjectOutputStream oout, ArrayList<Address> addressList)
			throws IOException {
		oout.reset();
		oout.writeObject(addressList);
	}
}