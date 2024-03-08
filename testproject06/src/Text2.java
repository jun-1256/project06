
public class Text2 {

	public static void main(String[] args) {
		// if文(判定)の応用
		// if文 + else(else if) + ネスト の組み合わせ
		
		// もし”ある数”(a)が0より大きいとき、
		// ”ある数”(a)が2と等しければ、Aと表示する。
		// そうでない場合で、”ある数”(a)が3と等しいとき、Bと表示する。
		// それ以外の場合は、Cと表示する。
		int a = 10;
		
		if(a > 0) {
			if(a == 2) {
				System.out.println("A");
			} else if(a == 3) {
				System.out.println("B");
			} else {
				System.out.println("C" + "\n");
			}
		}
		
		// もし”ある数”(a2)が0より大きいとき、
		// ”ある数”(a2)が2と等しければ、Aと表示する。
		// そうでない場合で、”ある数”(a2)が3と等しいとき、Bと表示する。
		// それ以外の場合は、Cと表示する。
		int a2 = 2;
		
		if(a2 > 0) {
			if(a2 == 2) {
				System.out.println("A" + "\n");
			} else if(a2 == 3) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}
		
		// もし、”ある数”(number)が100以下のとき、
		// ”ある数”(number)が20以下の場合は、未成年と表示。
		// そうでない場合で、77の場合は喜寿、88の場合は米寿と表示し、
		// それ以外は成人と表示する。
		int number = 88;
		
		if(number <= 100) {
			if(number < 20) {
				System.out.println("未成年");
			} else if(number == 77) {
				System.out.println("喜寿");
			} else if(number == 88) {
				System.out.println("米寿" + "\n");
			} else {
				System.out.println("成人");
			}
		}

	}

}
