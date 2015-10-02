package Map;

import java.util.Scanner;

public class HanBitCom {
	/**
	 * "안녕하세요." .substring(0, 2); 0이상 2미만
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MeberService service = new MeberServiceImp();
		String id, name, pass, age, addr;
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.총회원수 4.ID검색 5.종료");
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("ID를 입력하세요 : ");
				id = scanner.next();
				System.out.println("비밀번호를 입력하세요 : ");
				pass = scanner.next();
				System.out.println("이름을 입력하세요 : ");
				name = scanner.next();
				System.out.println("나이를 입력하세요 : ");
				age = scanner.next();
				System.out.println("주소를 입력하세요 : ");
				addr = scanner.next();
				service.join(id, name, addr, age, pass);
				break;
			case 2:
				System.out.println("ID를 입력하세요 : ");
				id = scanner.next();
				System.out.println("비밀번호를 입력하세요 : ");
				pass = scanner.next();
				System.out.println(service.login(id, pass));
				break;	
			case 3:
				System.out.println(service.cpunt());
				break;
			case 4:
				System.out.println("ID : ");
				id = scanner.next();
				System.out.println(service.searById(id));
				break;
			case 5:
				System.out.println("종료 합니다.");
				break;

			default:
				break;
			}
		}
	}

}
