package day39;

import java.util.Random;

class Lotto {
	int[] data=new int[8];
	boolean win=false;
	
	void print() {
		for(int i=0;i<8;i++) System.out.print(data[i]);
	}
}

class LottoDAO{
	Random r=new Random();
	Lotto[] set;
	int winner;
	
	void init() {
		set=new Lotto[5]; // null null null null null
		winner=r.nextInt(set.length); // 당첨 복권 인덱스 저장
		System.out.println("당첨 복권 인덱스 : "+winner);
		System.out.println("---------------------");
	}
	void createLotto(int idx) {
		Lotto lotto=new Lotto();
		for(int i=0;i<lotto.data.length;i++) {
			lotto.data[i]=r.nextInt(2);
			if(lotto.data[i]==1) lotto.data[i]=3;
		}
		set[idx]=lotto;
	}
	
	void createSet() {
		for(int i=0;i<set.length;i++) {
			createLotto(i);
			checkLotto(set[i]);
			if(winner==i&&!set[i].win) i--;
			if(winner!=i&&set[i].win) i--;
		}
	}

	void printSet() {
		for(Lotto lotto:set) {
			lotto.print();
			System.out.print("  ");
			System.out.println(lotto.win?"당첨":"꽝");
			System.out.println("------------------");
		}
	}
	
	void checkLotto(Lotto lotto) {
		int cnt=0;
		for(int num:lotto.data) {
			if(num==3) cnt++;
			else cnt=0;
			if(cnt==3) lotto.win=true;
		}
	}
	
	void run() {
		init();
		createSet();
		printSet();
	}
	
	
}
public class 클래스배열로또 {

	public static void main(String[] args) {
		LottoDAO dao=new LottoDAO();
		dao.run();
	}

}