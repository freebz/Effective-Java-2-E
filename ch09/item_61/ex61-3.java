// 예외 연결
try {
    ... // 낮은 수준의 추상화 계층 이용
} catch (LowerLevelException cause) {
    throw new HigherLevelException(cause);
}
