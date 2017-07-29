package ognl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

		
		House house,house1,house2 = null;
		house = new House();
		house1 = new House();
		house2 = new House();
		house.setTitle("第一间房子");
		house.setUser(u1);
		house.setStreet(new Street(1,"第一条街",new District(1,"第一个区")));
		house1.setTitle("第二间房子");
		house1.setUser(u2);
		house1.setStreet(new Street(2,"第二条街",new District(2,"第二个区")));
		house2.setTitle("第三间房子");
		house2.setUser(u3);
		house2.setStreet(new Street(3,"第三条街",new District(3,"第三个区")));
		House[] houses = new House[] {house,house1,house2};
		for(House h:houses) {
		System.out.println("使用java普通方式输出内容>>>>>>>>>>"
				+
				"标题:"
				+
				h.getTitle()+"\t"
				+
				"用户名:"+
				h.getUser().
				getUsername()
				+
				"\t"
				+
				"地区名:"+h.getStreet().
				getDistrict().
				getDistrictName()+
				"<<<<<<<<<<<<<");
	
		
		
		}
		
		
		
		
		
		Object[] root = new Object[]{house,house1,house2};

		String[] expressionArgs = new String[]{"title","user.username","street.district.districtName"};
		try {
			for(Object r:root) {

			System.out.println("OGNL方式进行输出>>>>>>>>>>>>>>>>>标题:"+
					Ognl.getValue(expressionArgs[0],r)+"\t用户名:"+
					Ognl.getValue(expressionArgs[1],r)+"\t地区名:"+
					Ognl.getValue(expressionArgs[2],r)+
					"<<<<<<>>>>>>>"
					
					);
			}
		} catch (OgnlException e) {
			e.printStackTrace();
		}
		
		//////////////////
		
		Map<String,Object> context = new HashMap<String,Object>();
		
		context.put("h", house);
		context.put("h1", house1);
		context.put("h2", house2);
		String[] keys= {"h","h1","h2"};
		for(int i = 0;i<context.size();i++) {
			Object r = context.get(keys[i]);
				try {
					System.out.println("OGNL方式访问Map输出>>>>>>>>>>>>>>>>>标题:"+
							Ognl.getValue(expressionArgs[0],context,r)+"\t用户名:"+
							Ognl.getValue(expressionArgs[1],context,r)+"\t地区名:"+
							Ognl.getValue(expressionArgs[2],context,r)+
							"<<<<<<>>>>>>>"
							
							);

				} catch (OgnlException e) {
					e.printStackTrace();
				}

				
				
			
			
		}//for最外层,OGNL访问Map使用部分方式访问
		for(int i = 0;i<130;i++) {
			System.out.print("=");
			if(i==129) {
				
				System.out.println();
			}
		}
		
		for(int i = 0;i<context.size();i++) {
			Object r = context.get(keys[i]);
				try {

					System.out.println("OGNL完整表达方式>>访问Map输出>>>>>>>>>>>>>>>>>标题:"+
							Ognl.getValue("#context."+keys[i]+"."+expressionArgs[0],context,r)+"\t用户名:"+
							Ognl.getValue("#context."+keys[i]+"."+expressionArgs[1],context,r)+"\t地区名:"+
							Ognl.getValue("#context."+keys[i]+"."+expressionArgs[2],context,r)+
							"<<<<<<>>>>>>>"
							
							);
				} catch (OgnlException e) {
					e.printStackTrace();
				}

				
				
			
			
		}//for最外层，OGNL访问Map使用全部限定语句进行访问
		
		
		
		
	}

}
