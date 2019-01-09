package junit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dxd.pojo.FileSource;
import com.dxd.service.IFileUploadService;
import com.dxd.service.ISqlserverService;
import com.dxd.service.IWaterMarkService;
import com.dxd.utils.ParameterUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class SpringTest {

	@Resource
	private IFileUploadService fileService;

	@Resource
	private ISqlserverService sqlserverService;

	@Resource
	private IWaterMarkService wmService;



	@Test
	public void test7() throws Exception {
		//DynamicDataSourceHolder.setDataSource("dataSource2");
		//System.out.println(sqlserverService.findTest(2));
		/*Product product = new Product();

		List<Product> list = sqlserverService.findProduct(product, 1, 10);

		for (Product product2 : list) {
			System.out.println(product2.getKiwi());
		}*/
		//System.out.println(wmService.findSoption("00071480-961a-4c77-b860-a7e5d432690f"));

		 List<FileSource> list = wmService.findMainImage("7f427ca8-888a-4881-9a48-d7b827626699");

		 for (FileSource fileSource : list) {
			System.out.println(fileSource);
		}
	}




	@Test
	public void test() {
		List<FileSource> list = fileService.findAll();
		for (FileSource fileSource : list) {
			System.out.println(fileSource);
		}
	}

	@Test
	public void test2() {
		// TODO Auto-generated constructor stub
		String value = ParameterUtil.getParameterValue("fileSourceDir");
		System.out.println(value);
	}


	@Test
	public void test3() {//map 集合的遍历
		Map<String, Object> map = new HashMap<>();
		map.put("one", "ces2");
		map.put("two", "ces1");
		map.put("three", "ces3");
		//方法一 把map的key value 转为entry 放进集合 再遍历
		for (Entry<String, Object> i : map.entrySet()) {
			System.out.println(i.getKey());
		}
		System.out.println("--------------");
		//方法二 把map的key 放进集合 通过遍历key来遍历找到对应value
		Iterator it=map.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------");
		//方法三 只能遍历value值
 		for (Object i : map.values()) {
			System.out.println(i);
		}
 		//方法四 普遍取值
		for (String key : map.keySet()) {
			System.out.println("key= " + key + " and value= " + map.get(key));
		}
	}

	@Test
	public void testHashSet() {
		Set<Object> set = new HashSet<>();
		set.add("sjkfhkjsf");
		set.add(123456);
		set.add(5645.33);
		for (int i = 0; i < 100; i++) {
			Iterator<Object> iterator  = set.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			System.out.println("-------------------------");
		}

	}

	@Test
	public void test4() {//String的创建与赋值
		String string = new String("123456");//创建两个对象  一个进入string池里面  string指向string池里面的内容
		//string = "123456";
		String string2 = new String("123456");//创建一个对象，直接指向string池里面的内容
		//string2 = "123456";
		String s1 = "123456";
		String s2 = "123456";
		System.out.println(s1 == s2);
		System.out.println(string == s1);
		System.out.println(string2 == s1);
		System.out.println(string == string2);
		System.out.println("========");
		System.out.println(s1.equals(s2));
		System.out.println(string.equals(s1));
		System.out.println(string2.equals( s1));
		System.out.println(string.equals(string2));
	}


	@Test
	public void test5() throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Set<Object> set = new HashSet<>();
		set.add("sjkfhkjsf");
		set.add(123456);
		set.add(5645.33);
	}



}
