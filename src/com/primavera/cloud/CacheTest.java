package com.primavera.cloud;

import java.io.IOException;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class CacheTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create a cache manager
				CacheManager cm = CacheManager.getInstance();
				
				//2. Create a cache called "cache1"
				cm.addCache("cache1");
				
				//3. Get a cache called "cache1"
				Cache cache = cm.getCache("cache1");
				
				UserSession sc = new UserSession();
		         sc.setLastActiveTime(System.currentTimeMillis());
		         sc.setSessionId(1L);
		         sc.setTransactionId("1");
				
				//4. Put few elements in cache
				cache.put(new Element("1", sc));
				
				
				//5. Get element from cache
				Element ele = cache.get("1");
				
				
				//6. Print out the element
				UserSession output = (ele == null ? null : (UserSession)ele.getObjectValue());
				System.out.println(output.getLastActiveTime());
				
				try {
					cache.removeAll();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 

				//8. shut down the cache manager
				cm.shutdown();
	}

}
