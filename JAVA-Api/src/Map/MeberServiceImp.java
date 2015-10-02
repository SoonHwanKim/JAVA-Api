package Map;

import java.util.HashMap;
import java.util.Map;

public class MeberServiceImp implements MeberService{
	Map<String, Meber> map = new HashMap<String, Meber>();
	Meber meber = new Meber();
			

	@Override
	public void join(String id, String name, String addr, String age, String pass) {
		meber.setId(id);
		meber.setName(name);
		meber.setAge(age);
		meber.setPass(pass);
		meber.setAddr(addr);
		map.put(id, meber);
	}

	@Override
	public String login(String id, String pass) {
		String result = "";
		/**
		 * 환영합니다.서울에 사시는 30세 홍길동님.
		 * 비번이 다릅니다. 다시 입력하세요
		 * 입력하신 ID는 존재하지 않거나 일치하지 않습니다. 다시 입력해 주세요.
		 * Map에서 벨류값만 가져오는 메소드는 map.get("키값")
		 */
		
		if (map.get(id)!=null && map.get(id).getId().equals(id) && map.get(id).getPass().equals(pass)) {
			result = "환영합니다. "+ meber.getAddr()+"에"+"사시는"+meber.getAge()+"세"+meber.getName();
		}else if (map.get(id)!=null && map.get(id).getId().equals(id)) {
			result = "비번이 다릅니다. 다시 입력하세요";
		}else{
			result = "입력하신 ID는 존재하지 않거나 일치하지 않습니다. 다시 입력해 주세요.";
		}
		return result;
	}
		
		
	
	@Override
	public int cpunt() {
		return map.size();
	}

	@Override
	public Meber searById(String id) {
			return map.get(id);
		
	}

}
