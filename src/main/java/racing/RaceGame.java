package racing;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static racing.Car.findWinner;

// 반복문 랜덤 후 전진, 정지
public class RaceGame {

    public static void race(List<Car> 자동차리스트) {

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 라운드 수 입력 받기
        System.out.print("몇 회 시행할까요?");
        int count = scanner.nextInt();  // 사용자로부터 정수 입력 받기
        Random rand = new Random();  // 랜덤 객체 생성

        // 라운드 입력 수만큼 반복
        for (int round = 1; round <= count; round++) {
            System.out.println("레이스 시작");

            for (Car car : 자동차리스트) {
                int dice = rand.nextInt(6) + 1; // 랜덤 값 생성

                // 3이상 전진, 2이하 정지
                if (dice >= 3) {
                    car.getAdvance(); // 전진
                    System.out.println(car.getName() + car.getAdvance());
                } else {
                    System.out.println(car.getName() + car.getAdvance());
                }
            }
        }

        // 우승자
        List<Car> winners = findWinner(자동차리스트);
        for (Car car : winners) {
            System.out.println("우승자"+ car.getName());
        }

    }


}
