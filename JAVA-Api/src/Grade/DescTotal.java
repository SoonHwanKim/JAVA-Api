package Grade;

import java.util.Comparator;
/**
 * 
 * @file_name  : DescTotal.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 10. 1.
 * @story      : 총점 내림차순
 */
public class DescTotal implements Comparator<Grade> {

	@Override
	public int compare(Grade front, Grade back) {
		return front.getTotal() < back.getTotal()?
				1 : 0;
		
		/**
		 * 삼항연산자
		 * (컨디션) ? (거짓이라면 다시 컨디션을 주고) ? true : false : false ;
		 * if(){
		 * }else{
		 * 	  if(){
		 *      }else{
		 *      }
		 * }
		 */
				
	}

}
