package Grade;

import java.util.ArrayList;

import javax.xml.validation.Validator;

public interface GradeService {
	public void input(String hak, String name, int kor, int eng, int math);
	public ArrayList<Grade> getList();
	public Grade searchByHak(String hak);
	public ArrayList<Grade> searchByName(String name);
	public ArrayList<Grade> descGradeByTotal(); // 성적률 내림차순으로 정렬(300 , 270, 230)
	public ArrayList<Grade> ascGradeByName(); // 성적을 이름에 따라 오름차순(ㄱ, ㄴ, ㄷ)


}
