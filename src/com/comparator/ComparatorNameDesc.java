package com.comparator;

import java.util.Comparator;

import com.vo.ProductVO;

public class ComparatorNameDesc implements Comparator<ProductVO> {


	@Override
	public int compare(ProductVO o1, ProductVO o2) {
		 if (o1.getName().compareTo(o2.getName()) > 0) {
		      return -1; // x에 대해서는 오름차순
		    }
		    else if (o1.getName().compareTo(o2.getName()) == 0) {
		    	if (o1.getProduct_id() > o2.getProduct_id()) { 
		        return -1;
		      }
		    }
		    return 1;
		  }
		

}
