package com.hxlxz.zxl.action;

import java.util.List;

import com.hxlxz.zxl.dao.ModelFunction;
import com.hxlxz.zxl.model.ModelMapping;

public class Action {

	public static void main(String[] args) throws Exception {
		ModelFunction g = new ModelFunction();
	
		//g1.setName("doris");
		//g.add(g1);
		//g1.setNum(4);
		//ModelMapping mm = g.query(1);
		List<ModelMapping> mm = g.queryListName("doris");
		for (ModelMapping modelMapping : mm) {
			System.out.println(modelMapping.toString());
		}
		
		//g.del(g1);
		//g.update(g1);

	}

}
