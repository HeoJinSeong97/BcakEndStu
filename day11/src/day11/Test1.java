package day11;

import java.util.Scanner;

public class Test1 {
	static int idx = 2;
	static int todayTotalM =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] menu = new String[5];
		int[] menuP = new int[5];
		int[] menuC = new int[5];// 재고
//		초기메뉴 2개 설정
//		System.out.println("초기메뉴 등록");
//		for (int i = 0; i < 2; i++) {
//			System.out.print("메뉴 " + (i + 1) + " : ");
//			menu[i] = sc.next();
//			System.out.print("가격 " + (i + 1) + " : ");
//			menuP[i] = sc.nextInt();
//		}
		menu[0] = "아메리카노";
		menu[1] = "카페라떼";
		menuP[0] = 4800;
		menuP[1] = 5200;
		menuC[0] = 2;
		menuC[1] = 2;

		int who = 111;
		boolean ans = true;
		while (ans) {
			do {
				System.out.println("관리자 : 1, 손님 : 0");
				who = sc.nextInt();
				if (who == 1 || who == 0)
					break;
			} while (true);
//		1 혹은 0인 값이 입력이 아닌경우 반복해서 옳바른 값을 입력하도록 한다.

			if (who == 1) {
//			관리자
				staff(menu, menuP, menuC);
			} else {
//			사용자
				customer(menu, menuP, menuC);
			}
			System.out.println("종료하시겠습니까? y or n");
			String s = sc.next();
			ans = checkAns(s);

		}

	}

private static void staff(String[] menu, int[] menuP, int[] menuC) {
//		메뉴추가 메뉴이름변경 가격확인 총판매액확인 재고항목->재고관리
//		메뉴추가
		Scanner sc = new Scanner(System.in);

		printMenu(menu);
		int act = sc.nextInt();

		if (act == 1) {
//			메뉴추가
			System.out.print("메뉴 이름을 적어주세요 : ");
			String name = sc.next();
			System.out.print("메뉴 가격을 적어주세요 : ");
			int pay = sc.nextInt();

			if (idx < 5) {
//				메뉴 개수가 5보다 작을경우 추가가 가능하기 때문에 추가한다.
				menu[idx] = name;
				menuP[idx] = pay;
				menuC[idx] = 2;
				idx++;
			} else {
//				추가할 수 있는 공간이 없기 때문에 안내문구를 보여준다
				System.out.println("메뉴를 추가할 공간이 없습니다.");
			}

		} else if (act == 2) {
			printMenu(menu);
//			메뉴이름 변경
			System.out.print("변경을 원하는 메뉴 이름을 적어주세요 : ");
			String serchName = sc.next();
			String changeName;

			for (int i = 0; i < menuP.length; i++) {
//				메뉴에 입력한 메뉴가 존재하면 b를 true로 바꾼다.
				if (menu[i].equals(serchName)) {
					System.out.print("변경가능, 입력:");
					changeName = sc.next();
					menu[i] = changeName;
					break;
				}
				System.out.println("메뉴가 존재하지 않습니다.");
			}

		} else if (act == 3) {
//			총 판매액 확인
			System.out.println("총 판매액 " + todayTotalM + "원");
		} else if (act == 4) {
			printMenu(menu);
//			메뉴에 대한 재고를 수정한다.
			System.out.print("메뉴 이름을 적어주세요 : ");
			String serchName = sc.next();
			for (int i = 0; i < menuC.length; i++) {
				if (menu[i].equals(serchName)) {
					System.out.println("변경할 재고: ");
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
//		메뉴추가
		while (true) {
			System.out.print("추가할 메뉴 이름을 적어주세요 : ");
			String name = sc.next();
			if (!menuIsCheck(menu, name)) {
//				메뉴가 중복이면 돌아간다.
				continue;
			}
			
			System.out.print("메뉴 가격을 적어주세요 : ");
			int pay = sc.nextInt();

			if (idx < 5) {
//			메뉴 개수가 5보다 작을경우 추가가 가능하기 때문에 추가한다.
				menu[idx] = name;
				menuP[idx] = pay;
				menuC[idx] = 2;
				idx++;
			} else {
//			추가할 수 있는 공간이 없기 때문에 안내문구를 보여준다
				System.out.println("메뉴를 추가할 공간이 없습니다.");
				break;
			}
		}
	}

	static void printMenu(String[] menu) {
		System.out.println("업무 ");
		System.out.println("1. 메뉴추가 ");
		System.out.println("2. 메뉴이름 변경 ");
		System.out.println("3. 총 판매액 확인 ");
		System.out.println("4. 재고관리 ");
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
			System.out.println("다시 입력해주세요 y or n");
			ans = sc.next();
			return checkAns(ans);
		}
	}
private static void customer(String[] menu, int[] menuP, int[] menuC) {
//		고객이 주문상품을 확인하고 주문한다.
		Scanner sc = new Scanner(System.in);

		int sel;
		int total = 0;
		int ea = 0;
		String s;
		boolean ans = true;
		while (ans) {
			System.out.println("메뉴선택");
			for (int i = 0; i < idx; i++) {
				if (!menu[i].equals(null)) {
					System.out.println((i + 1) + ". " + menu[i]);
					if (menuC[i] == 0) // 재고가 없을 경우에 주문불가 텍스트를 표시한다.
						System.out.println("  주문불가");
				}
			}

			System.out.print("입력:");
			sel = sc.nextInt();

			System.out.println(menu[sel - 1] + " 남은 재고 수량 : " + menuC[sel - 1] + "EA");
			System.out.print("수량:");
			ea = sc.nextInt();
			while (ea > menuC[sel - 1]) {
				System.out.println("재고부족으로 주문이 불가능합니다. 다시 입력해주세요");
				ea = sc.nextInt();

			}
			total += menuP[sel - 1] * ea;
			System.out.println("[" + menu[sel - 1] + "]" + "를" + ea + "개 선택했습니다.");
			menuC[sel - 1] -= ea;

			System.out.println("주문의 총 금액은 " + total + "원 입니다.");
			System.out.println();

			System.out.println("추가주문하시겠습니까? 'y' or 'n' ");
			s = sc.next();
			ans = checkAns(s);
		}
		todayTotalM += total;

	}

}

