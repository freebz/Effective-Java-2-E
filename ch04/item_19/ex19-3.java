// 정적 임포트 기능을 활용해 상수 이름 앞의 클래스명 제거
import static com.effectivejava.science.PhysicalConstants.*;

public class Test {
    double atoms(double mols) {
	return AVOGADROS_NUMBER * mols;
    }
    ...
    // PhysicalConstants을 사용할 일이 많다면 정적 임포트가 적절
}
