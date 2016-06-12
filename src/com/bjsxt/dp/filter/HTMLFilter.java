package com.bjsxt.dp.filter;

public class HTMLFilter implements Filter {


	public void doFilter(Request request, Response response,FilterChain chain) {
		request.requestStr= request.requestStr.replace('<', '{').replace('>', '}');
		chain.doFilter(request, response, chain);
		response.responseStr += "-----HTMLFilter";
		
	}

}
