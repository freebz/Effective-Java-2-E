// 예외를 끔찍하게 남용한 사례. 이러면 곤란하다.
try {
    int i = 0;
    while(true)
	range[i++].climb();
} catch(ArrayIndexOutOfBoundsException e) {
}
