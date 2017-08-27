package com.joe.easysocket.ext.dataworker.mvc.container;

import com.joe.easysocket.ext.dataworker.mvc.Bean;

import java.util.Map;

/**
 * 注册器
 * 
 * @author joe
 *
 * @param <T>
 *            要注册的组件的类型
 */
public interface Register<T extends Bean> {
	/**
	 * 注册组件
	 * 
	 * @param name
	 *            组件名
	 * @param component
	 *            要注册的组件
	 */
	public void register(String name, T component);

	/**
	 * 注册组件
	 * 
	 * @param components
	 *            组件map，key为组件名，value为组件实例
	 */
	public void register(Map<String, T> components);

	/**
	 * 注册组件
	 * 
	 * @param clazz
	 *            组件class
	 * @param component
	 *            组件实例
	 */
	public void register(Class<T> clazz, T component);
}
