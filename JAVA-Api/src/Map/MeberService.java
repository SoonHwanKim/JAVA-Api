package Map;

public interface MeberService {
	//회원가입
	public void join(String id, String name, String addr, String age, String pass);
	//로그임
	public String login(String id, String pass);
	//총회원
	public int cpunt();
	//아이디 검색
	public Meber searById(String id);

}
