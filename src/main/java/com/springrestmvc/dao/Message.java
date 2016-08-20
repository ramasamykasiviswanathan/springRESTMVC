package com.springrestmvc.dao;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="message")
public class Message implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5004617236703670905L;
	
	@Id
	private String messageID;
	@Field(value="message")
	private String messageContent;
	@Field(value="desc")
	private String messageDescription;
	@Field(value="lang")
	private String language;
	/**
	 * @return the messageID
	 */
	public String getMessageID() {
		return messageID;
	}
	/**
	 * @param messageID the messageID to set
	 */
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	/**
	 * @return the messageContent
	 */
	public String getMessageContent() {
		return messageContent;
	}
	/**
	 * @param messageContent the messageContent to set
	 */
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	/**
	 * @return the messageDescription
	 */
	public String getMessageDescription() {
		return messageDescription;
	}
	/**
	 * @param messageDescription the messageDescription to set
	 */
	public void setMessageDescription(String messageDescription) {
		this.messageDescription = messageDescription;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
}
