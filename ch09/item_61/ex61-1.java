// 예외 변환
try {
    // 낮은 수준의 추상화 계층 이용
    ...
} catch(LowerLevelException e) {
    throw new HigherLevelException(...);
}
