package day04;

import java.util.Random;

public class D_05모두의마블 {

	public static void main(String[] args) {

		/*
		[문제]
			1. 철수는 지금 모두의 마블 게임을 하고있다.
			2. 게임은 0 ~ 20까지 이동할 수 있는 거리가 있다.
			3. 현재 철수의 차례이다.
			4. 철수의 위치는 시작점으로부터 9만큼 이동한 상태이다.
			5. 1 ~ 6의 숫자가 있는 주사위 2개를 던진다.
			6. 주사위 숫자의 합만큼 이동할 수 있다.
			7. 다음 이동할 철수의 위치를 출력하시오.
			
			8. 조건
				1) 두 주사위 숫자가 서로 다를 경우에는
				   현재 위치에서 주사위 숫자의 합만큼 이동한다.
				   예) 3, 5 => 8만큼 이동
				2) 두 주사위의 숫자가 같은 경우 보너스로 이동거리 6이 추가된다.
				   예) 2, 2 => 4 + 6 만큼 이동
				3) 14, 15, 16 번의 위치에 함정이 있다.
				   함정에 걸리면 다시 주사위 2개를 던지고
				   그 합이 6이하이면 [패널티] 처음 위치(0)로 이동한다.
				   그 합이 7이상이면 [패널티 없음] 함정을 탈출한다.(현재자리 유지)
				4) 20 이상의 값이 나오면 "승리"를 출력한다.
		 */
		Random r=new Random();
		int diceOne=r.nextInt(6)+1;
		int diceTwo=r.nextInt(6)+1;
//		int diceOne=5;
//		int diceTwo=5;
		int location=9;
		int move=diceOne+diceTwo;
		if (diceOne==diceTwo) {move=move+6;} 
		int locationC=location+move;
		
		System.out.println("현재위치 : "+location);
		System.out.println("주사위1 : "+diceOne);
		System.out.println("주사위2 : "+diceTwo);
		System.out.println("-------------------------");
		
		boolean trap=locationC==14||locationC==15||locationC==16;
		if(trap) {
			System.out.println("도착위치 : "+locationC);
			System.out.println("함정에 걸렸습니다.");
			if(move>6) {System.out.println("주사위의 합이 7이상이므로 [패널티 없음]. 현재위치 : "+locationC);}
			else {
				locationC=locationC-locationC;
				System.out.println("주사위의 합이 7미만이므로 [패널티]가 적용, 현재위치 : "+"'"+locationC+"'"+" ㅋ");
			}
		} else if(!trap) {System.out.println("도착위치 : "+locationC);}
		
		else if(locationC>=20) {System.out.println("승리");}
		
	}

}
