package com.bjsxt.dp.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	
	
	List<Filter> filters = new ArrayList<Filter>();
	int index =0;
	public void addFilter(Filter f){
		this.filters.add(f);
	}
	

	public void doFilter(Request request, Response response,FilterChain chain) {
		// TODO Auto-generated method stub
		if(index ==filters.size()) return;
		Filter f = filters.get(index);
		index++;
		f.doFilter(request,response,chain);
	}

}
