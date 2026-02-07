package test09.cytech09;

public class cytech09 {

	public static void main(String[] args) {
		String [] subjects = {"国語","数学","理科","社会"};
		
		int[][] scores = {
				{90,80,70,60},
				{22,33,44,55},
				{13,14,15,16},
				{70,95,90,85},
				{89,86,96,90}};
		for (int i = 0; i < scores.length; i++) {
			System.out.println("「学生" + (i + 1) + "」");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(subjects[j] + ":" + scores[i][j] + "点");}
			System.out.println();
		}

	}

}
