package day02;

public class C_05연습문제 {

	public static void main(String[] args) {

		/*
		 * [문제] 아래 변수 a, b, c 중에서 a가 가장 큰 수인지 여부를 true 또는 false로 표현하시오. [정답] true
		 */
		int a = 100;
		int b = 2;
		int c = 5;

		boolean check1 = a > c && a > b;

		System.out.println(check1);

		a = 3;

		boolean check2 = a > c && a > b;

		System.out.println(check2);

		System.out.println("----------------------------------------");

		/*
		 * [문제] 3과목의 평균이 60점 이상이면 합격이다. 단, 어느 한 과목이 50점 미만이면 불합격이다. 아래 시험점수는 합격인지 여부를
		 * 판단해 true 또는 false로 표현하시오. [정답] false
		 */

		int kor = 100;
		int eng = 87;
		int math = 49;

		double avg = (kor + eng + math) / 3;

		boolean check3 = avg >= 60 && kor >= 50 && eng >= 50 && math >= 50;
		System.out.println(check3);

		System.out.println("----------------------------------------");

		/*
		 * [문제] 고속버스를 타고 여행을 떠나려한다. 출발시간까지 1시간 여유가 있다. 고속버스역과 상점을 시속 3km를 걸어서 왕복을 하고 10분
		 * 동안 물건을 산다고 하면 역에서 1.3km 떨어진 상점을 다녀올 수 있는지 여부를 판단해 true 또는 false로 표현하시오. [정답]
		 * false
		 */

		int entireTime = 60;
		int shoppingTime = 10;
		int walkPerMin = 3000 / 60;
		int takenTime = 1300 / walkPerMin;

		boolean check4 = entireTime > (takenTime * 2) + shoppingTime;

		System.out.println(check4);

	}

}
