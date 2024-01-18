package com.array;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] seats = new int[10];
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("-----------------");
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println("\n-----------------");
            for (int seat : seats) {
                System.out.print(seat + " ");
            }
            System.out.println("\n-----------------");

            System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
            int seatNumber = s.nextInt();

            if (seatNumber == -1) {
                break; 
            } else if (seatNumber < 1 || seatNumber > 10) {
                System.out.println("잘못된 입력입니다.");
                continue;
            } else if (seats[seatNumber - 1] == 1) {
                System.out.println("이미 예약된 좌석입니다.");
                continue;
            }

            seats[seatNumber - 1] = 1;
            System.out.println("예약되었습니다.");
        }

        s.close();
    }
}
