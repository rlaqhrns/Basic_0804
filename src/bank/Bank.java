package bank;

import java.util.HashMap;
import java.util.Set;

public class Bank {
	private HashMap<Integer,Integer> accounts = new HashMap<>();
	private double rate =0.01;
	private int nextacct =0;
	
	public void addInterest() {
		Set<Integer> accts = accounts.keySet();
		for(int i:accts) {
			int balance = accounts.get(i);
			int newbalace = (int)(balance *(1+rate));
			accounts.put(i, newbalace);
		}
	}
	@Override
	public String toString() {
		Set<Integer> accts = accounts.keySet();
		String result = "은행은 " + accts.size() +"갯수의  계좌를 가지고 있습니다.";
		for(int i:accts) result +="\t 계좌 " +i+": 잔고 = " + accounts.get(i) ;
		return result;
	}
	public int newAccount() {
		int acctnum =nextacct++;
		accounts.put(acctnum, 0);
		return acctnum;
	}
	public boolean authorizeLoan(int acctnum, int loanamt) {
		int balance = accounts.get(acctnum);
		return balance >= loanamt/2;
	}
	public void deposit(int acctnum, int amt) {
		int balance =accounts.get(acctnum);
		accounts.put(acctnum, balance+amt);
		
	}
	public int getBalance(int acctnum) {
		return accounts.get(acctnum);
	}
}
		

