package com.thirdparty.demo.thirdpartyapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/data")
public class ThirdPartyData {
	
	
	private final RestTemplate restTemplate;
	
	@Autowired
	public ThirdPartyData (RestTemplate restTemplate)
	{
		this.restTemplate=restTemplate;
	}
	
	
	@RequestMapping("/fetch")
	public ResponseEntity<String> featchDataThird()
	{
		
		String Url = "https://randomuser.me/api/";
		
		ResponseEntity<String> responseEntity=restTemplate.getForEntity(Url, String.class);
		
		return responseEntity;
	}
	

}
