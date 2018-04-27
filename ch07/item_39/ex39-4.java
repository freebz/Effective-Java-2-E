// Period 객체 내부를 노린 두 번째 공격 형태
Date start = new Date();
Date end = new Date();
Period p = new Period(start, end);
p.end().setYear(78); // p의 내부를 변경!
