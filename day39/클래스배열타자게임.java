package day39;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Word {
	String word;
	int ranPos;

	void setRandomWordPos(String sample, int rIdx) {
		word = sample;
		ranPos = rIdx;
	}

	String printWord() {
		String a = "";
		for (int i = 0; i < word.length(); i++) {
			if (i == ranPos)
				a += "*";
			else
				a += word.charAt(i);
		}
		return a;
	}
	
	String printOriginalWord() {
		String a = "";
		for (int i = 0; i < word.length(); i++) {
			a += word.charAt(i);
		}
		return a;
	}
	
}

class WordDAO {
	Random r = new Random();
	String[] wordSampleList = { "java", "jsp", "python", "android", "spring" };
	boolean[] checkList = new boolean[wordSampleList.length]; // 이미선택한단어 체크용
	int count = wordSampleList.length; // 단어 개수(게임종료용카운트)

	Word w = new Word();

	void init() {

	}

	// MainSection=====================================================
	
	boolean checkAnswer(String myans, String realans) {

		if (myans.equals(realans)) {
			count--;
			return true;
		}
		return false;
	}

	void run() {
		
		
		
		int cnt = 0;
		String[] temp = new String[wordSampleList.length];
		for (int i = 0; i < temp.length; i++)
			temp[i] = wordSampleList[i];
		while (true) {
			int i = r.nextInt(wordSampleList.length);
			if (checkList[i] == false) {
				w.word = wordSampleList[i];
				w.ranPos = r.nextInt(w.word.length());
				temp[cnt] = w.printWord();
				wordSampleList[cnt] = w.printOriginalWord();
				checkList[i] = true;
				cnt++;
			} else
				continue;
			if (cnt == 5)
				break;
		}

		for (int i = 0; i < checkList.length; i++)
			checkList[i] = false;

		System.out.println("탬프 " + Arrays.toString(temp));
		System.out.println("원래배열 " + Arrays.toString(wordSampleList));

		cnt = 0;
		while (true) {
			System.out.println(temp[cnt]);
			String ans = getStringValue("정답");
			if (!checkAnswer(ans, wordSampleList[cnt])) {
				System.out.println("오답이다.");
				continue;
			} else {
				System.out.println("정답이다.");
				cnt++;
			}
			if (cnt == 5) {
				System.out.println("★CLEAR★");
				break;
			}
		}

	}

	// Tools==========================================================
	String getStringValue(String msg) {
		Scanner s = new Scanner(System.in);
		System.out.print(msg + "을 입력하다 : ");
		return s.next();
	}

}

public class 클래스배열타자게임 {

	public static void main(String[] args) {

		WordDAO dao = new WordDAO();
		
		System.out.println("타이머 시작");

		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기 : 밀리세컨드 단위 1초 ==  1000
		for(int i =0; i < 1000000;i++){
			System.out.println("test");
			dao.run();
			break;
		}
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		double secDiffTime = (afterTime - beforeTime) / 1000.0; //두 시간에 차 계산

		System.out.println("타이머 끝 : " + secDiffTime);
		

	}
}
