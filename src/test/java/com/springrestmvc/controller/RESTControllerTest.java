package com.springrestmvc.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.springrestmvc.dao.Message;
import com.springrestmvc.model.MessageModel;

/**
 * @author Ramasamy Kasiviswanathan
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class RESTControllerTest {

	@Spy
	MongoTemplate model = new MongoTemplate(new Mongo(), "local");
	
	@Spy
	MessageModel Message = new MessageModel();
	
	@InjectMocks
	RESTController controller;
	
	/**
	 * <p> Test the REST Controller</p>
	 */
	@Test
	public void workingMethodtest()
	{
		Message message = new Message();
		message.setMessageContent("messageContent");
		Mockito.when(model.findById("RestTest", Message.class)).thenReturn(message);
		org.junit.Assert.assertEquals("messageContent",controller.testWorking().getValue());
	}

}
