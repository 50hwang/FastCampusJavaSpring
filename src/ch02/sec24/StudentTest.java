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

/* 3. 실행 클래스 */

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 75);
		studentKim.addSubject("수학", 80);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("=================================================");
		studentKim.showStudentInfo();
		
	}

}
