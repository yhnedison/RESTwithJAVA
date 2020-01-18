package com.alexyu.messenger.service;

import java.util.*;

import com.alexyu.messenger.model.Message;

public class MessageService {
	
	// mimic calling DB and get data
	public List<Message> getAllMessages() {
		Message m1 = new Message(1, "Hello World", "Alex Yu");
		Message m2 = new Message(1, "Hello World2", "Alex Yu2");
		Message m3 = new Message(1, "Hello World3", "Alex Yu3");
		Message m4 = new Message(1, "Hello World4", "Alex Yu4");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		
		return list;
	}
}
