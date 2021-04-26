package day11;

import java.util.Scanner;

public class Test1 {
	static int idx = 2;
	static int todayTotalM =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] menu = new String[5];
		int[] menuP = new int[5];
		int[] menuC = new int[5];// ���
//		�ʱ�޴� 2�� ����
//		System.out.println("�ʱ�޴� ���");
//		for (int i = 0; i < 2; i++) {
//			System.out.print("�޴� " + (i + 1) + " : ");
//			menu[i] = sc.next();
//			System.out.print("���� " + (i + 1) + " : ");
//			menuP[i] = sc.nextInt();
//		}
		menu[0] = "�Ƹ޸�ī��";
		menu[1] = "ī���";
		menuP[0] = 4800;
		menuP[1] = 5200;
		menuC[0] = 2;
		menuC[1] = 2;

		int who = 111;
		boolean ans = true;
		while (ans) {
			do {
				System.out.println("������ : 1, �մ� : 0");
				who = sc.nextInt();
				if (who == 1 || who == 0)
					break;
			} while (true);
//		1 Ȥ�� 0�� ���� �Է��� �ƴѰ�� �ݺ��ؼ� �ǹٸ� ���� �Է��ϵ��� �Ѵ�.

			if (who == 1) {
//			������
				staff(menu, menuP, menuC);
			} else {
//			�����
				customer(menu, menuP, menuC);
			}
			System.out.println("�����Ͻðڽ��ϱ�? y or n");
			String s = sc.next();
			ans = checkAns(s);

		}

	}

private static void staff(String[] menu, int[] menuP, int[] menuC) {
//		�޴��߰� �޴��̸����� ����Ȯ�� ���Ǹž�Ȯ�� ����׸�->������
//		�޴��߰�
		Scanner sc = new Scanner(System.in);

		printMenu(menu);
		int act = sc.nextInt();

		if (act == 1) {
//			�޴��߰�
			System.out.print("�޴� �̸��� �����ּ��� : ");
			String name = sc.next();
			System.out.print("�޴� ������ �����ּ��� : ");
			int pay = sc.nextInt();

			if (idx < 5) {
//				�޴� ������ 5���� ������� �߰��� �����ϱ� ������ �߰��Ѵ�.
				menu[idx] = name;
				menuP[idx] = pay;
				menuC[idx] = 2;
				idx++;
			} else {
//				�߰��� �� �ִ� ������ ���� ������ �ȳ������� �����ش�
				System.out.println("�޴��� �߰��� ������ �����ϴ�.");
			}

		} else if (act == 2) {
			printMenu(menu);
//			�޴��̸� ����
			System.out.print("������ ���ϴ� �޴� �̸��� �����ּ��� : ");
			String serchName = sc.next();
			String changeName;

			for (int i = 0; i < menuP.length; i++) {
//				�޴��� �Է��� �޴��� �����ϸ� b�� true�� �ٲ۴�.
				if (menu[i].equals(serchName)) {
					System.out.print("���氡��, �Է�:");
					changeName = sc.next();
					menu[i] = changeName;
					break;
				}
				System.out.println("�޴��� �������� �ʽ��ϴ�.");
			}

		} else if (act == 3) {
//			�� �Ǹž� Ȯ��
			System.out.println("�� �Ǹž� " + todayTotalM + "��");
		} else if (act == 4) {
			printMenu(menu);
//			�޴��� ���� ��� �����Ѵ�.
			System.out.print("�޴� �̸��� �����ּ��� : ");
			String serchName = sc.next();
			for (int i = 0; i < menuC.length; i++) {
				if (menu[i].equals(serchName)) {
					System.out.println("������ ���: ");
					menuC[i] = sc.nextInt();
				}
			}

		}

	}
	static boolean menuIsCheck(String[] menu, String str) {
		for (int i = 0; i < menu.length; i++) {
			if (str.equals(menu[i])) {
				return false;
			}
		}
		return true;
	}
	static void addMenu(String[] menu, int[] menuP, int[] menuC) {
		Scanner sc = new Scanner(System.in);
//		�޴��߰�
		while (true) {
			System.out.print("�߰��� �޴� �̸��� �����ּ��� : ");
			String name = sc.next();
			if (!menuIsCheck(menu, name)) {
//				�޴��� �ߺ��̸� ���ư���.
				continue;
			}
			
			System.out.print("�޴� ������ �����ּ��� : ");
			int pay = sc.nextInt();

			if (idx < 5) {
//			�޴� ������ 5���� ������� �߰��� �����ϱ� ������ �߰��Ѵ�.
				menu[idx] = name;
				menuP[idx] = pay;
				menuC[idx] = 2;
				idx++;
			} else {
//			�߰��� �� �ִ� ������ ���� ������ �ȳ������� �����ش�
				System.out.println("�޴��� �߰��� ������ �����ϴ�.");
				break;
			}
		}
	}

	static void printMenu(String[] menu) {
		System.out.println("���� ");
		System.out.println("1. �޴��߰� ");
		System.out.println("2. �޴��̸� ���� ");
		System.out.println("3. �� �Ǹž� Ȯ�� ");
		System.out.println("4. ������ ");
		System.out.println("--------------------------------------------------");
	}

	static boolean checkAns(String ans) {
		Scanner sc = new Scanner(System.in);
		String[] dataNo = {"x", "X", "no", "NO", "n"};
		for (int i = 0; i < dataNo.length; i++) {
			if (ans.equals(dataNo[i].toString())) {
				return false;
			}
		}
		if(ans.equals("o")||ans.equals("O")||ans.equals("YES")||ans.equals("yes")||
				ans.equals("y")){
			return true;
		}else {
			System.out.println("�ٽ� �Է����ּ��� y or n");
			ans = sc.next();
			return checkAns(ans);
		}
	}
private static void customer(String[] menu, int[] menuP, int[] menuC) {
//		���� �ֹ���ǰ�� Ȯ���ϰ� �ֹ��Ѵ�.
		Scanner sc = new Scanner(System.in);

		int sel;
		int total = 0;
		int ea = 0;
		String s;
		boolean ans = true;
		while (ans) {
			System.out.println("�޴�����");
			for (int i = 0; i < idx; i++) {
				if (!menu[i].equals(null)) {
					System.out.println((i + 1) + ". " + menu[i]);
					if (menuC[i] == 0) // ��� ���� ��쿡 �ֹ��Ұ� �ؽ�Ʈ�� ǥ���Ѵ�.
						System.out.println("  �ֹ��Ұ�");
				}
			}

			System.out.print("�Է�:");
			sel = sc.nextInt();

			System.out.println(menu[sel - 1] + " ���� ��� ���� : " + menuC[sel - 1] + "EA");
			System.out.print("����:");
			ea = sc.nextInt();
			while (ea > menuC[sel - 1]) {
				System.out.println("���������� �ֹ��� �Ұ����մϴ�. �ٽ� �Է����ּ���");
				ea = sc.nextInt();

			}
			total += menuP[sel - 1] * ea;
			System.out.println("[" + menu[sel - 1] + "]" + "��" + ea + "�� �����߽��ϴ�.");
			menuC[sel - 1] -= ea;

			System.out.println("�ֹ��� �� �ݾ��� " + total + "�� �Դϴ�.");
			System.out.println();

			System.out.println("�߰��ֹ��Ͻðڽ��ϱ�? 'y' or 'n' ");
			s = sc.next();
			ans = checkAns(s);
		}
		todayTotalM += total;

	}

}

