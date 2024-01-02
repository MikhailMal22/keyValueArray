package junit_testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Entry;
import model.KeyValueArray;

class InfoSystemTest {

	@Test
	void test1() 
	{
		String key = "TEST";
		Integer value = 1234;
		Entry en = new Entry(key,value);
		assertEquals(1234,en.getValue());
	}
	
	@Test
	void test2() 
	{
		String key = "TEST";
		Integer value = 1234;
		Entry en = new Entry(key,value);
		assertEquals("TEST",en.getKey());
	}
	
	@Test
	void test3() 
	{
		KeyValueArray test = new KeyValueArray();
		assertEquals(true,test.isEmpty());
	}
	
	@Test
	void test4() 
	{
		KeyValueArray test = new KeyValueArray();
		String key = "TEST";
		Integer value = 1234;
		test.put(key, value);
		assertEquals(false,test.isEmpty());
	}
	@Test
	void test5() 
	{
		KeyValueArray test = new KeyValueArray();
		String key = "TEST";
		Integer value = 1234;
		test.put(key, value);
		assertEquals(1234,test.get(key));
	}
	@Test
	void test6() 
	{
		KeyValueArray test = new KeyValueArray();
		String key = "TEST";
		Integer value = 1234;
		String key2 = "TEST";
		Integer value2 = 4617;
		test.put(key, value);
		test.put(key2, value2);
		assertEquals(4617,test.get(key));
	}
	@Test
	void test7() 
	{
		KeyValueArray test = new KeyValueArray();
		String key = "TEST";
		Integer value = 1234;
		String key2 = "TEST2";
		Integer value2 = 4617;
		test.put(key, value);
		test.put(key2, value2);
		test.remove(key2);
		assertEquals(null,test.get(key2));
	}
	@Test
	void test8() 
	{
		KeyValueArray test = new KeyValueArray();
		String key = "TEST";
		Integer value = 1234;
		String key2 = "TEST2";
		Integer value2 = 4617;
		test.put(key, value);
		test.put(key2, value2);
		String[] keys = {"TEST","TEST2"};
		String[] keys2 = test.keySet();
		assertEquals(keys[0],keys2[0]);
	}
	@Test
	void test9() 
	{
		KeyValueArray test = new KeyValueArray();
		String key = "TEST";
		Integer value = 1234;
		String key2 = "TEST2";
		Integer value2 = 4617;
		test.put(key, value);
		test.put(key2, value2);
		int[] values = {1234,4617};
		int[] values2 = test.values();
		assertEquals(values[0],values2[0]);
	}

}
