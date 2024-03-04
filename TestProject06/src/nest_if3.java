
public class nest_if3 {

	public static void main(String[] args) {
		// if文(判定)の応用
		// if文 + else(else if) + ネスト の組み合わせ
		
		// もし、”ある数”(number)が100以下のとき、
		// ”ある数”(number)が20以下の場合は、未成年と表示。
		// そうでない場合で、77の場合は喜寿、88の場合は米寿と表示し、
		// それ以外は成人と表示する。
		int number = 36;
		
		if(number <= 100) {
			if(number < 20) {
				System.out.println("未成年");
			} else if(number == 77) {
				System.out.println("喜寿");
			} else if(number == 88) {
				System.out.println("米寿");
			} else {
				System.out.println("成人" + "\n");
			}
		}
		
		//もし、”ある数”(number2)が100以下のとき、
		// ”ある数”(number2)が20以下の場合は、未成年と表示。
		// そうでない場合で、77の場合は喜寿、88の場合は米寿と表示し、
		// それ以外は成人と表示する。
		// いずれの条件にも該当しない(FALSE)ので表示されない。
		int number2 = 110;
		
		if(number2 <= 100) {
			if(number2 < 20) {
				System.out.println("未成年");
			} else if(number2 == 77) {
				System.out.println("喜寿");
			} else if(number2 == 88) {
				System.out.println("米寿");
			} else {
				System.out.println("成人");
			}
		}

	}

}
