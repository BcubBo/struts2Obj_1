package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import po.District;
import po.House;
import po.HouseType;
import po.Street;
import po.User;

public class Cache {
	
	public static List<User> users;
	
	public static List<House> houses;
	
	public static List<HouseType> houseTypes;
	
	public static List<Street> streets;
	
	public static List<District> districts;
	
	public static Map<Integer,List<Street>> areas;
	
	static {
		
		User u1,
			 u2,
			 u3,
			 u4,
			 u5,
			 u6 = null;
	
		User[] userArray = new User[] {
				 u1 = new User("st_01","iiii","bcubbo@bcubbo.com")
				,u2 = new User("st_02","oooo","bcubbo@bcubbo.com")
				,u3 = new User("st_03","mmmm","bcubbo@bcubbo.com")
				,u4 = new User("st_04","pppp","bcubbo@bcubbo.com")
				,u5 = new User("st_05","xxxx","bcubbo@bcubbo.com")
				,u6 = new User("st_06","qqqq","bcubbo@bcubbo.com")
		};
	
		
		House house,house1,house2 = null;
			house = new House();
			house1 = new House();
			house2 = new House();
			house.setTitle("第一间房子");
			house.setUser(u1);
			house.setStreet(new Street(1,"第一条街",new District(1,"第一个区")));
			house.setPrice(1000);
			house.setAddDate(new Date());
		//
			house1.setTitle("第二间房子");
			house1.setUser(u2);
			house1.setStreet(new Street(2,"第二条街",new District(2,"第二个区")));
			house1.setPrice(2000);
			house1.setAddDate(new Date());
		//
			house2.setTitle("第三间房子");
			house2.setUser(u3);
			house2.setStreet(new Street(3,"第三条街",new District(3,"第三个区")));
			house2.setPrice(3000);
			house2.setAddDate(new Date());
			
		
		
		HouseType  houseType,houseType1,houseType2 = null;
		
			houseType = new HouseType(1,"一居");
			houseType1 = new HouseType(2,"二居");
			houseType2 = new HouseType(3,"三居");
		
		Street street,street1,street2 = null;
		
			street = house.getStreet();
			street1 = house1.getStreet();
			street2 = house2.getStreet();
		
		users = Arrays.asList(u1,u2,u3,u4,u5,u6);
		
		houses = Arrays.asList(house,house1,house2);
		
		houseTypes = Arrays.asList(houseType,houseType1,houseType2);
		
		streets = Arrays.asList(street,street1,street2);
		
		District district,district1,district2 = null;
			district = house.getDistrict();
			district1= house1.getDistrict();
			district2 = house2.getDistrict();
		
		
		districts = Arrays.asList(district,district1,district2);
		
		
		areas = new HashMap<Integer,List<Street>>();
		
		areas.put(district.getDistrictId(), null);
		
		Iterator<Street> st = streets.iterator();
		
		while(st.hasNext()) {
			
			
			
			
			
		}
		
		
	}
	
	
	
	
	

}
