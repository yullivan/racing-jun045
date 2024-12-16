package racing;
import java.util.Collections;
import java.util.List;

public class Car {
    //차 이름 받기
    private String name;
    private int advance;  //각각 차들 횟수 저장

    public Car(String name, int advance) {
        this.name = name;
        this.advance = advance;
    }

    //글자수 10 미만
    public Car(String name) {
        if (name.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 이름 10글자 초과");
        }
        this.name = name;
        this.advance = 0;
    }

    public String getName() {
        return name;
    }

    public int getAdvance() {
        return advance;
    }

    //우승자 찾기 - max 활용
    public static List<Car> findWinner(List<Car> 자동차리스트) {
        List<Integer> 횟수_비교 = 자동차리스트.stream()
                .map(n ->n.getAdvance())
                .toList();

        //max 뽑기
        Integer max = Collections.max(횟수_비교);

        //max와 비교
        List<Car> 횟수순 = 자동차리스트.stream()
                .filter(n -> max == n.getAdvance())
                .toList();
        return  횟수순;
    }

    // 출력
    @Override
    public String toString() {
        return "Car{name='" + name + "', advance=" + advance + "}";
    }
}
