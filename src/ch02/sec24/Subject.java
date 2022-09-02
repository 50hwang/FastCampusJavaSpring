package ch02.sec24;
/*
 * ch02.sec23. ArrayList를 활용한 간단한 성적 산출 프로그램
 * 
 * 1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
 * Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
 * Lee 학생은 국어 100점, 수학 50점입니다.
 * Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다.
 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요.
 * 
 */

/* 2. 과목 클래스 */

public class Subject {
	
	private String name;
	private int scorePoint;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getScorePoint() {
		return scorePoint;
	}

	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
}
