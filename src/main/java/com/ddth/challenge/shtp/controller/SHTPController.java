package com.ddth.challenge.shtp.controller;

import com.ddth.challenge.shtp.algorithm.ShortestPath;
import com.ddth.challenge.shtp.model.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SHTPController {

	private static ResponseMessage res = new ResponseMessage();
	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/graph/shortestPath")
	public ResponseMessage getShortestPath(){
		ResponseMessage hm = new ResponseMessage();
		hm.setMessage(lastestMessage);
		hm.setStatus("OK");
		return hm;
	}

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/graph/allShortestPath")
	public ResponseMessage getAllShortestPath(){
		ResponseMessage hm = new ResponseMessage();
		hm.setMessage(lastestMessage);
		hm.setStatus("OK");
		return hm;
	}



	@PostMapping(value="/graph")
	public HttpStatus setResponseMessage(@RequestBody ResponseMessage message){
		lastestMessage = message.getMessage();
		return HttpStatus.OK;
	}


}
