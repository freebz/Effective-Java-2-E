// 금전 계산에 부동 소수점 연산을 사용하는 잘못된 프로그램
public static void main(String[] args) {
    double funds = 1.00;
    int itemsBought = 0;
    for (double price = .10; funds >= price; price += .10) {
	funds -= price;
	itemBought++;
    }
    System.out.println(itemsBought + " items bought.");
    System.out.println("Change: $" + funds);
}
