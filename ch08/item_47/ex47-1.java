private static final Random rnd = new Random();

// 흔하긴 하나 문제가 심각한 코드
static int random(int n) {
    return Math.abs(rnd.nextInt()) % n;
}
