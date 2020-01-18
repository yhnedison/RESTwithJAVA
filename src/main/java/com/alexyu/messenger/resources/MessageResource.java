package com.alexyu.messenger.resources;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alexyu.messenger.model.*;
import com.alexyu.messenger.service.*;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		return messageService.getAllMessages();
		// Jersey is responsble for converting models to xml here
	}
}
