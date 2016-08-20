package com.springrestmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springrestmvc.dao.Message;
import com.springrestmvc.model.MessageModel;

/**
 * @author Ramasamy Kasiviswanthan
 *
 */
@Controller
public class MainController
{
	@Autowired
	MongoTemplate mongo;
	
	/**
	 * <p>Request to load HTML Form</p>
	 * @param message
	 * @return
	 */
	@GetMapping(value="/working",produces=MediaType.TEXT_PLAIN_VALUE)
	public String testWorking(@ModelAttribute("messageModel") MessageModel message)
	{
		Message messageModel = mongo.findById("RestTest", Message.class);
		message.setValue(messageModel.getMessageContent());
		return "working";
	}
}
