// 기존 enum 자료형에 없는 메서드를 switch 문을 사용해 구현한 사례
public static Operation inverse(Operation op) {
    switch(op) {
    case PLUS:   return Operation.MINUS;
    case MINUS:  return Operation.PLUS;
    case TIMES:  return Operation.DIVIDE;
    case DIVIDE: return Operation.TIMES;
    default: throw new AssertionError("Unknown op: " + op);
    }
}
