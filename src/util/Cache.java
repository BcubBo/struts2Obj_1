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
	
		
		House house,house1,house2,house3,house4,house5 = null;
			house = new House();
			house1 = new House();
			house2 = new House();
			house3 = new House();
			house4 = new House();
			house5 = new House();
			house.setTitle("第一间房子");
			house.setUser(u1);
			house.setStreet(new Street(1,"第一条街",new District(1,"第一个区")));
			house.setPrice(1000);
			house.setAddDate(new Date());
			house.setDistrict(house.getStreet().getDistrict());
		//
			house1.setTitle("第二间房子");
			house1.setUser(u2);
			house1.setStreet(new Street(2,"第二条街",new District(2,"第二个区")));
			house1.setPrice(2000);
			house1.setAddDate(new Date());
			house1.setDistrict(house1.getStreet().getDistrict());
		//
			house2.setTitle("第三间房子");
			house2.setUser(u3);
			house2.setStreet(new Street(3,"第三条街",new District(3,"第三个区")));
			house2.setPrice(3000);
			house2.setAddDate(new Date());
			house2.setDistrict(house2.getStreet().getDistrict());
			
		//
			house3.setTitle("第四间房子");
			house3.setUser(u4);
			house3.setStreet(new Street(4,"第四条街",new District(1,"第一个区")));
			house3.setPrice(4000);
			house3.setAddDate(new Date());
			house3.setDistrict(house2.getStreet().getDistrict());
		//
			house4.setTitle("第五间房子");
			house4.setUser(u5);
			house4.setStreet(new Street(5,"第五条街",new District(2,"第一个区")));
			house4.setPrice(5000);
			house4.setAddDate(new Date());
			house4.setDistrict(house2.getStreet().getDistrict());
		//
			house5.setTitle("第六间房子");
			house5.setUser(u6);
			house5.setStreet(new Street(6,"第六条街",new District(3,"第一个区")));
			house5.setPrice(6000);
			house5.setAddDate(new Date());
			house5.setDistrict(house2.getStreet().getDistrict());
		
		HouseType  houseType,houseType1,houseType2 = null;
		
			houseType = new HouseType(1,"一居");
			houseType1 = new HouseType(2,"二居");
			houseType2 = new HouseType(3,"三居");
		
		Street street,street1,street2,street3,street4,street5= null;
		
			street = 	house.getStreet();
			street1 = 	house1.getStreet();
			street2 = 	house2.getStreet();
			street3 = 	house3.getStreet();
			street4 = 	house4.getStreet();
			street5 = 	house5.getStreet();
		users = Arrays.asList(u1,u2,u3,u4,u5,u6);
		
		houses = Arrays.asList(house,house1,house2,house3,house4,house5);
		
		houseTypes = Arrays.asList(houseType,houseType1,houseType2);
		
		streets = Arrays.asList(street,street1,street2,street3,street4,street5);
		
		District district,district1,district2 = null;
			district = house.getDistrict();
			district1= house1.getDistrict();
			district2 = house2.getDistrict();
			//此处的获取District的方法是再street中定义的，而没有再house中设置street
		
		
		districts = Arrays.asList(district,district1,district2);
		
		
		areas = new HashMap<Integer,List<Street>>();
		

		
		Iterator<Street> st = null;
		List<Street> streetList1 = new ArrayList<Street>();
		List<Street> streetList2 = new ArrayList<Street>();
		List<Street> streetList3 = new ArrayList<Street>();
		st = streets.iterator();
		//
		while(st.hasNext()) {
			Street srt = st.next();
			
			
			if(srt.getDistrict().getDistrictId()==1) {
				
				
				
				streetList1.add(srt);
				
				
			}
			areas.put(district.getDistrictId(),streetList1);
		}
		st = streets.iterator();
		//
		while(st.hasNext()) {
			Street srt = st.next();
			
			
			if(srt.getDistrict().getDistrictId()==2) {
				
				
				
				streetList2.add(srt);
				
				
			}
			areas.put(district1.getDistrictId(),streetList2);
		}
		st = streets.iterator();
		//
		while(st.hasNext()) {
			Street srt = st.next();
			
			
			if(srt.getDistrict().getDistrictId()==3) {
				
				
				
				streetList3.add(srt);
				
				
			}
			areas.put(district2.getDistrictId(),streetList3);
		}
		
	}
	
	
	
	
	

}
