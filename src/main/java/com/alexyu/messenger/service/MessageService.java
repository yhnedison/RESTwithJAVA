package com.alexyu.messenger.service;

import java.util.*;

import com.alexyu.messenger.database.DatabaseClass;
import com.alexyu.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Hello World", "Alex Yu"));
		messages.put(2L, new Message(1, "Hello World2", "Alex Yu2"));
		messages.put(3L, new Message(1, "Hello World3", "Alex Yu3"));
		messages.put(4L, new Message(1, "Hello World4", "Alex Yu4"));
	}
	// mimic calling DB and get data
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
