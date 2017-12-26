
public class IfVsSwitch {

	public static void main(String[] args) {
//		runIf1();
//		runIf2();
		runSwitch();
	}
	
	public static void runIf1() {
		int n = 3;
		if (n == 1) {
			System.out.println("If1: n = 1");
		} else if (n == 2) {
			System.out.println("If1: n = 2");
		} else if (n == 3) {
			System.out.println("If1: n = 3");
		} else if (n == 4) {
			System.out.println("If1: n = 4");
		} else {
			System.out.println("If1: n = Invalid");
		}
	}
	
	public static void runIf2() {
		int n = 3;
		boolean valid = false;
		if (n == 1) {
			System.out.println("If2: n = 1");
			valid = true;
		}
		if (n == 2) {
			System.out.println("If2: n = 2");
			valid = true;
		}
		if (n == 3) {
			System.out.println("If2: n = 3");
			valid = true;
		}
		if (n == 4) {
			System.out.println("If2: n = 4");
			valid = true;
		}
		if (!valid) {
			System.out.println("If2: n = Invalid");
		}
	}
	
	public static void runSwitch() {
		int n = 3;
		switch (n) {
		case 1:
			System.out.println("Switch: n = 1");
			break;
		case 2:
			System.out.println("Switch: n = 2");
			break;
		case 3:
			System.out.println("Switch: n = 3");
		case 4:
			System.out.println("Switch: n = 4");
//			break;
		default:
			System.out.println("Switch: n = Invalid");
			break;
		}
	}

}
