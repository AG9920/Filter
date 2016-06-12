package com.bjsxt.dp.filter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "大家好:),<>,<script>,敏感";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter());
		fc.addFilter(new SensitiveFilter());
		fc.doFilter(request, response,fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
