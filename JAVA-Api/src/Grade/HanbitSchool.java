package Grade;

import java.util.Scanner;
import java.util.ArrayList;

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
				service.input(hak, name, kor, eng, math);
				break;
			case 2:
				ArrayList<Grade> vec = service.getList();
				System.out.println(vec);
				break;
			case 3:
				System.out.println("학번 :");
				hak = scanner.next();
				System.out.println(service.searchByHak(hak));
				break;
			case 4:
				System.out.println("이름 :");
				name = scanner.next();
				System.out.println(service.searchByName(name));
				break;
			case 5:
				System.out.println(service.descGradeByTotal());
				break;
			case 6:
				System.out.println(service.ascGradeByName());
				break;
			case 7:
				System.out.println("종료");
				break;
			default:break;
			}
		}
	}

}
