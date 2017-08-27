package com.joe.easysocket.ext.dataworker.mvc.filter;

import com.joe.easysocket.ext.dataworker.mvc.Bean;
import com.joe.easysocket.ext.dataworker.mvc.context.RequestContext;
import com.joe.easysocket.ext.dataworker.mvc.context.ResponseContext;

/**
 * filter接口，用户必须实现该接口并且加上{@link com.joe.easysocket.ext.dataworker.mvc.container.Provider}注解
 * 
 * @author joe
 *
 */
public interface NioFilter extends Bean {
	/**
	 * 请求filter
	 * 
	 * @param request
	 *            请求上下文
	 */
	void requestFilter(RequestContext.RequestWrapper request);

	/**
	 * 响应filter
	 * 
	 * @param request
	 *            请求上下文
	 * @param response
	 *            响应上下文
	 */
	void responseFilter(RequestContext.RequestWrapper request, ResponseContext.Response response);
}
