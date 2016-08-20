package com.springrestmvc.controller;
import org.junit.Assert;
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
 * @author Ramasamy Kasiviswanthan
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MainControllerTest {
	
	@Spy
	MongoTemplate model = new MongoTemplate(new Mongo(), "local");
	
	@InjectMocks
	MainController controller;
	
	/**
	 * <p> Test the Main controller</p>
	 * @throws Exception
	 */
	@Test
	public void workingMethodtest() throws Exception {
		MessageModel messageModel = Mockito.mock(MessageModel.class);
		Message message = new Message();
		message.setMessageContent("messageContent");
		Mockito.when(model.findById("RestTest", Message.class)).thenReturn(message);
		Assert.assertEquals("working",controller.testWorking(messageModel));
	}
}
