package ognl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import po.District;
import po.House;
import po.Street;
import po.User;

public class OgnlTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
/*		fail("Not yet implemented");*/
		User u1,
			 u2,
			 u3,
			 u4,
			 u5,
			 u6 = null;

		User[] users = new User[] {
				 u1 = new User("st_01","iiii","bcubbo@bcubbo.com")
				,u2 = new User("st_02","oooo","bcubbo@bcubbo.com")
				,u3 = new User("st_03","mmmm","bcubbo@bcubbo.com")
				,u4 = new User("st_04","pppp","bcubbo@bcubbo.com")
				,u5 = new User("st_05","xxxx","bcubbo@bcubbo.com")
				,u6 = new User("st_06","qqqq","bcubbo@bcubbo.com")
		};



		
		List<User> userList = new ArrayList<User>();
		//用户数组
		
		for(int i = 0;i<users.length;i++) {
			
			userList.add(users[i]);

		}

		
		House house = new House();
		house.setTitle("第一间房子");
		house.setUser(u1);
		house.setStreet(new Street(1,"第一条街",new District(1,"第一个区")));
		System.out.println("使用java普通方式输出内容:"+house.getStreet().getDistrict().getDistrictName());
		
		
		
		
		
		
/*		Object root = null;
		String expression = "";
		try {
			Ognl.getValue(expression,root);
		} catch (OgnlException e) {
			e.printStackTrace();
		}*/
		
		
		
	}

}
