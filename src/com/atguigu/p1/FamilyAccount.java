package com.atguigu.p1;

public class FamilyAccount {

	public static void main(String[] args) {
		boolean loopFlag = true;
		int balance = 10000;
		String details = "收支\t账户金额\t收支金额\t说 明\n";
		do{
			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println("                 1 收支明细");
			System.out.println("                 2 登记收入");
			System.out.println("                 3 登记支出");
			System.out.println("                 4 退 出");
			System.out.println();
			System.out.println("                 请选择(1-4)：");
			char key = Utility.readMenuSelection();
			System.out.println();
			switch (key) {
			case '1':
				System.out.println("-----------------当前收支明细记录-----------------");
				System.out.println(details);
				System.out.println("--------------------------------------------------");
				break;
			case '2':
				System.out.println("本次收入金额：");
				int readNumber = Utility.readNumber();
				System.out.println("本次收入说明：");
				String readString = Utility.readString();
				balance += readNumber;
				details += "收入\t" + balance + "\t" + readNumber + "\t" + readString + "\n";
				System.out.println("---------------------登记完成---------------------");
				break;
			case '3':
				System.out.println("本次支出金额：");
				int readNumber2 = Utility.readNumber();
				System.out.println("本次支出说明：");
				String readString2 = Utility.readString();
				balance -= readNumber2;
				details += "支出\t" + balance + "\t" + readNumber2 + "\t" + readString2 + "\n";
				System.out.println("---------------------登记完成---------------------");
				break;
			case '4':
				System.out.println("确认是否退出(Y/N)：");
				char readConfirmSelection = Utility.readConfirmSelection();
				if (readConfirmSelection == 'Y') {
					loopFlag = false;
				break;
				}
			}
		}while (loopFlag);
	}
}