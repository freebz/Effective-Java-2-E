// 제네릭 Stack의 사용 예
public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    for (String arg : args)
	stack.push(arg);
    while (!stack.isEmpty())
	System.out.println(stack.pop().toUpperCase());
}



class EdlayQueue<E extends Delayed> implements BlockingQueue<E>;
