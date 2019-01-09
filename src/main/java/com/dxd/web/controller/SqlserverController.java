package com.dxd.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dxd.pojo.Message;
import com.dxd.pojo.Page;
import com.dxd.pojo.Product;
import com.dxd.pojo.Search;
import com.dxd.service.ISqlserverService;
@Controller
@RequestMapping("product")
public class SqlserverController {

	@Resource
	private ISqlserverService sqlserverService;
	@RequestMapping("details")
	@ResponseBody
	public Object getTest(Search vo,Integer page,Integer limit) throws Exception {
		String key = vo.getKeyword().trim();
		if (!key.equals("") && key!=null) {
			if (isNumeric0(key)) {
				vo.setSku(key);
				vo.setKeyword(null);
			}
		}
		int all = sqlserverService.findAllProduct(vo);
		List<Product> list = sqlserverService.findProduct(vo,page,limit);
		return new Message(0,"success",all,list);
	}
	/*@RequestMapping("details")
	@ResponseBody
	public Object getTest(String kws,Integer page,Integer limit) throws Exception {
		String key = kws.trim();
		if (!key.equals("")) {
			Product product = new Product();
			if (isNumeric0(key)) {
				product.setSku(key);
			} else {
				product.setDuckweedTitle(key);
			}
			List<Product> all = sqlserverService.findAllProduct(product);
			List<Product> list = sqlserverService.findProduct(product,page,limit);
			return new Message(0,"success",all.size(),list);
		}
		return null;
	}*/

	@RequestMapping("all")
	@ResponseBody
	public Object getTest(Integer page,Integer limit) throws Exception {
		Search search=new Search();
		List<Product> list = sqlserverService.findProduct(search,page,limit);
		int all = sqlserverService.findAllProduct(search);
		return new Message(0,"success",all,list);
	}

	/**
	 * 判断是否是纯数字
	 * @param String
	 * @return boolean
	 */
	public boolean isNumeric0(String str) {
		for (int i = str.length(); --i >= 0;) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57)
				return false;
		}
		return true;
	}

	@RequestMapping("search")
	@ResponseBody
	public Object getInfo(Page page,Search vo) throws Exception {
		System.out.println(page);
		System.out.println(vo);
		return null;
	}



}
