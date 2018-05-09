// 상태 검사 메서드를 거쳐서 무점검 예외 메서드 호출
if (obj.actionPermitted(args)) {
    obj.action(args);
} else {
    // 예외적 상황 처리
    ...
}
