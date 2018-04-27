// 수정된 접근자 - 내부 필드의 방어적 복사본 생성
public Date start() {
    return new Date(start.getTime());
}

public Date end() {
    return new Date(end.getTime());
}
