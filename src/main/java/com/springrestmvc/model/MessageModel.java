package com.springrestmvc.model;

import java.io.Serializable;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MessageModel implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2810552840956960668L;
	private String value;
	
	/**
	 * @return the value
	 */
	public String getValue()
	{
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value)
	{
		this.value = value;
	}
}
