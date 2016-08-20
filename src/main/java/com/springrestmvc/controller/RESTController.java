package com.springrestmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrestmvc.dao.Message;
import com.springrestmvc.model.MessageModel;

/**
 * @author Ramasamy Kasiviswanathan
 *
 */
@RestController
@RequestMapping(value="/rest")
public class RESTController
{
	@Autowired
	private MessageModel message;
	
	@Autowired
	MongoTemplate mongo;
	
	/**
	 * <p>Request to produce rest JSON O/P</p>
	 * @return
	 */
	@GetMapping(value="/working", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MessageModel testWorking()
	{
		Message messageModel = mongo.findById("RestTest", Message.class);
		message.setValue(messageModel.getMessageContent());
		return message;
	}
}
