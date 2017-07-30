package util;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map.Entry;

import org.junit.Before;
import org.junit.Test;

import po.Street;

public class CacheTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
/*		fail("Not yet implemented");*/
		
		System.out.println(Cache.streets.size());
		System.out.println(Cache.houses.size());
		for(int i = 0;i<Cache.areas.size();i++) {
			List<Street> streets = Cache.areas.get(i+1);
			for(Street st:streets) {
			System.out.println(st.getDistrict().getDistrictId()+"\t"+st.getStreetName());
			}
		}
		//Entry类型的输出
		System.out.println("Entry类型输出方式");
		for(Entry<Integer,List<Street>> entry: Cache.areas.entrySet()) {
			
			
			System.out.print("地区:"+entry.getKey()+"\t");
			for(Street st:entry.getValue()) {
				
				System.out.print("街道:"+st.getStreetName()+"\t");
				
				
				
			}
			
			System.out.println();
		}
		
		
		
	}

}
