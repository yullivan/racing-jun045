package racing;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceGameTest {

    //차 이름, 횟수 저장 리스트로
    // 난수 생성 - 차별로 주사위 돌려서 전진,정지
    //max 값 공동우승자
    @Test
    void 테스트() {
        Car car1 = new Car("현대",4);  //이름, 차별 전진횟수 저장
        Car car2 = new Car("포르쉐",3);
        Car car3 = new Car("테슬라",4);
        Car car4 = new Car("도요타",2);
        List<Car> 자동차리스트 = List.of(car1,car2,car3,car4);


//        // 사용자로부터 라운드 수 입력 받기
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("몇 회 시행할까요?");
//        int count = scanner.nextInt();  // 사용자로부터 정수 입력 받기


        List<Car> 우승자 = Car.findWinner(자동차리스트);
        assertThat(우승자).isEqualTo(List.of(4,4));

    }

    @Test
    void 이름오류() {
        Car error = new Car("차1234567890",5);
        assertThat(error).isEqualTo(IllegalArgumentException.class);


    }
}
