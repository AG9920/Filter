package com.bjsxt.dp.filter;

import java.io.File;

public class SensitiveFilter implements Filter {
 

	public void doFilter(Request request, Response response,FilterChain chain) {
		// TODO Auto-generated method stub
		request.requestStr = request.requestStr.replace("√Ù∏–", "≤ª√Ù∏–");
		chain.doFilter(request, response, chain);
		response.responseStr += "-----SensitiveFilter";
	}

}
