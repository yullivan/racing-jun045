package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RaceGameTest {

    //차 이름 받기
    // 클래스에 이름, 쵯수
    // 리스트 형태로 변경

    @Test
    void 차테스트() {
        Car car1 = new Car("현대",4);  //이름, 차별 전진횟수 저장
        Car car2 = new Car("포르쉐",3);
        Car car3 = new Car("테슬라",4);
        Car car4 = new Car("도요타",2);
        List<Car> 자동차리스트 = List.of(car1,car2,car3,car4);
        //값 리스트로 저장
        //반복문? ( 반복횟수 3이상이면 전진 , 2이하면 정지)
        //max 값 공동우승자

        List<Car> 우승자 = Car.findWinner(자동차리스트);
        Assertions.assertThat(우승자).isEqualTo(List.of(4,4));

    }
}
