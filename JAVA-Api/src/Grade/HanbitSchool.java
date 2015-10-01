package Grade;

import java.util.Scanner;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImp();
		String hak, name;
		int kor, eng, math;
		while (true){
			System.out.println("1.성적등록 2.학적부리스트 보기 3.학번으로 검색 4.이름으로 검색 5.성적순위 출력 6.이름순 출력 7.종료");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("학번 :");
				hak = scanner.next();
				System.out.println("이름 :");
				name = scanner.next();
				System.out.println("국어 :");
				kor = scanner.nextInt();
				System.out.println("영어 :");
				eng = scanner.nextInt();
				System.out.println("수학 :");
				math = scanner.nextInt();
				break;
			case 2:
				
				break;
			case 3:break;
			case 4:break;
			case 5:break;
			case 6:break;
			case 7:break;
			default:break;
			}
		}
	}

}
