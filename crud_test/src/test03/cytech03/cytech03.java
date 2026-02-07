package test03.cytech03;

import java.time.Instant;

public class cytech03 {

	public static void main(String[] args) {
		long seconds = Instant.now().getEpochSecond();
		if(seconds % 2 == 0) {
			System.out.println("偶数です。");
		}else
			System.out.println("奇数です。");
				
		// TODO 自動生成されたメソッド・スタブ

	}

}
