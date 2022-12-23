package day39;

import java.util.Arrays;
import java.util.Random;

class Player {
	String name;
	Card c1;
	Card c2;
	boolean win; 
}

class Card {
	String shape;
	int num;
}

class CardGame{
	Card deck[] = new Card[40];
	String shapes[] = {"♠", "◇", "♡", "♣"};
	
	void init() {
		int ncnt=1;
		int scnt=0;
		for(int i=0;i<deck.length;i++) {
			deck[i]=new Card();
			deck[i].num=ncnt;
			deck[i].shape=shapes[scnt];
			ncnt++;
			if(i%10==9) {scnt++;ncnt=1;}
		}
	}
	
	void shuffle() {
		Random r=new Random();
		Card[] temp=new Card[deck.length];
		for(int i=0;i<50;i++) {
			int sf=r.nextInt(deck.length);
			temp[0]=deck[0];
			deck[0]=deck[sf];
			deck[sf]=temp[0];
		}
	}
	
	void pickCard() {
//		Player p=new Player();
		Player[] pc= {new Player(), new Player()};
		
		
		Card c1=deck[0];
		pc[0].c1=c1;
		Card c2=deck[1];
		pc[0].c2=c2;
		Card c3=deck[2];
		pc[1].c1=c3;
		System.out.println(pc[0].c1+":"+pc[0].c2);
		
	}
	
	void run() {
		init();
		for(int i=0;i<deck.length;i++) {
			System.out.println(deck[i].shape+":"+deck[i].num);
		}
		shuffle();
		System.out.println("==============================");
		for(int i=0;i<deck.length;i++) {
			System.out.println(deck[i].shape+":"+deck[i].num);
		}
		pickCard();
		
	}
}

public class 클래스배열카드게임 {
	
	public static void main(String[] args) {
		CardGame cg=new CardGame();
		cg.run();
	}

}
