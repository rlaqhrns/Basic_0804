package bank;

import java.util.Scanner;

public class BankClient {
	private int current =0;
	private Scanner scanner =new Scanner(System.in);
	private boolean done =false;
	private Bank bank =new Bank();
	
	public void run() {

		while(!done) {
			System.out.println("입력(0=나가기,1=신규,2=선택,3=예금, 4=대출,5=목록보기,6=이자):");
			int cnum =scanner.nextInt();
			processCommand(cnum);
		}

	}
	private void processCommand(int cnum) {
		if(cnum==0 )quit();
		else if(cnum==1) newAccount();
		else if(cnum==2) select();
		else if(cnum==3) deposit();
		else if(cnum==4) authorizeLoan();
		else if(cnum==5) showAll();
		else if(cnum==6) addInterest();
		else System.out.println("잘못 입력하셨습니다.");
	}

	private void addInterest() {
		bank.addInterest();
	}
	private void showAll() {
		System.out.println(bank.toString());
	
	}
	private void authorizeLoan() {
		System.out.println("대출 금액을 입력하세요");
		int loanamt =scanner.nextInt();
		if(bank.authorizeLoan(current,loanamt)) {
			System.out.println("대출 승인이 이루어졌습니다.");
		}
		else System.out.println("대출 승인 거절되었습니다");
	}
	private void deposit() {
		System.out.println("예금액을 입력하세요");
		int amt =scanner.nextInt();
		bank.deposit(current, amt);
	}
	private void select() {
		System.out.println("계좌 입력하세요");
		current = scanner.nextInt();
		int balance =bank.getBalance(current);
		System.out.println(current + "계좌의 잔고는" +balance +"입니다.");
	}
	private void newAccount() {
		current =bank.newAccount();
		System.out.println("당신의 계좌 번호 는 현재 "+ current +"입니다.");
	}
	private void quit() {
		done=true;
		System.out.println("잘가세요");
	}

}
