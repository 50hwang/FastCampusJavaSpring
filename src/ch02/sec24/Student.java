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

/* 1. 학생 클래스 */

import java.util.ArrayList; //ArrayList를 사용하기 위한 패키지 필요

/* 학생 클래스 */
public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	/* 학생 생성자 설정 */
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	}

	/* 과목 ArrayList에 추가 메소드 */
	public void addSubject(String name, int score) {

		Subject subject = new Subject();

		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}

	/* 학생 정보 출력 메소드 */
	public void showStudentInfo() {

		int total = 0;

		for (Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + "과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
}