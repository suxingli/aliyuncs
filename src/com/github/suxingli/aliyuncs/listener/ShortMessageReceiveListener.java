package com.github.suxingli.aliyuncs.listener;

import com.github.suxingli.aliyuncs.bean.ShortMessageReceive;
import com.github.suxingli.aliyuncs.exception.ShortMessageReceiveException;

/**
 * 短信回执监听器
 * @author 苏行利
 * @date 2019-08-28 10:55:20
 */
public interface ShortMessageReceiveListener {

	/**
	 * 回执
	 * @author 苏行利
	 * @param receives 短信回执列表
	 * @throws ShortMessageReceiveException
	 * @date 2019-08-28 11:58:23
	 */
	public void receive(ShortMessageReceive... receives) throws ShortMessageReceiveException;

}