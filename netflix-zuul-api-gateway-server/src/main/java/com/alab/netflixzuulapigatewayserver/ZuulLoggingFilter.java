package com.alab.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() {
		// can put here business logic for the filter the data 
		
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// uses to implement the logic yo filter anything here
		
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("request -> {} requesturi -> {}", 
				request, request.getRequestURI());
		
		return null;
	}

	@Override
	public String filterType() {
		
		// pre :- before the request executed 
		// post :- After the request executed
		// error: error that cause any exception
		
		return "pre";
	}

	@Override
	public int filterOrder() {
		
		return 1;
	}
	
	

}
