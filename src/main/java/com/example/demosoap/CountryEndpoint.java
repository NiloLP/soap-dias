package com.example.demosoap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetDayRequest;
import io.spring.guides.gs_producing_web_service.GetDayResponse;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
	@Autowired
	private CountryRepository countryRepository;

	
	public CountryEndpoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDayRequest")
	@ResponsePayload
	public GetDayResponse getDias(@RequestPayload GetDayRequest request) {
		GetDayResponse response = new GetDayResponse();
		response.setDia(countryRepository.findDia(request.getName()));

		return response;
	}
}