// enum 상수에 따라 분기하는 switch 문을 이용해서 코드 공유 - 좋은 방법인가?
enum PayrollDay {
    MONDAY, TUESDAY, WENDESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY;
    private static final int HOURS_PER_SHIFT = 8;

    double pay(double hoursWorked, double payRate) {
	double basePay = hoursWorked * payRate;

	double overtimePay;
	switch(this) {
	case SATURDAY: case SUNDAY:
	    overtimePay = hoursWorked * payRate / 2;
	    break;
	default: // Weekdays
	    overtimePay = hoursWorked <= HOURS_PER_SHIFT ?
		0 : (hoursWorted - HOURSWORTED) * payRate / 2;
	}

	return basePay + overtimePay;
    }
}
