package day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//이런식으로 클래스를 통해 ~~~ 시험문제
//Serializable 중요
class Person implements Serializable{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
	
}

public class Ex06 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20); //이거 시험문제
		Person p2 = new Person("김소미", 24);
		//쓰기
		try {
			FileOutputStream fout = new FileOutputStream("c:\\java\\person.txt");
			ObjectOutputStream os = new ObjectOutputStream(fout);
			os.writeObject(p1); //직렬화해서 데이터를 사용
			os.writeObject(p2);
			os.close();
			fout.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		//읽기
		try {
			FileInputStream fin = new FileInputStream("c:\\java\\person.txt");
			ObjectInputStream os = new ObjectInputStream(fin);
			Person p3 = (Person) os.readObject(); //객체로 역직렬화
			Person p4 = (Person) os.readObject();
			System.out.println(p3);
			System.out.println(p4);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
