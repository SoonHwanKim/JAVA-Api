package Grade;
/**
 * 
 * @file_name  : Grade.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 10. 1.
 * @story      : 성적표 관리 객체 클래스
 */
public class Grade {
	private int kor, eng, math;
	private String hak,name; // 학번은 유일한 ID값
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getHak() {
		return hak;
	}
	public String getName() {
		return name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal(){
		int Total = 0;
		return Total;
	}
	@Override
	public String toString() {
		return "성적 [학번 : " + this.getHak() 
				+ "이름 : " + this.getName() 
				+ "국어 : " + this.getKor() 
				+ "영어 : " + this.getEng() 
				+ "수학 : " + this.getMath()+"]";
	}
}
