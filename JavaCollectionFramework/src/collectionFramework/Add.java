package collectionFramework;
//Q1:- Create An ArrayList to add 10 Integer Objects and print only Prime Numbers from them.
import java.util.ArrayList;
public class Add {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(11);
		num.add(15);
		num.add(17);
		num.add(21);
		num.add(22);
		num.add(25);
		num.add(31);
		num.add(45);
		num.add(56);
		for (int i = 0; i < num.size(); i++) {
			int flag = 0;
			for (int j = 2; j <=num.get(i) / 2; j++) {
				if (num.get(i) % j == 0) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println(num.get(i));
			}
		}
	}
}