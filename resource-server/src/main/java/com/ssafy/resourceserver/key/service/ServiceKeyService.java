package com.ssafy.resourceserver.key.service;

import org.springframework.stereotype.Service;

public interface ServiceKeyService {

	String createServiceKey(Long teamId, Long clientId);
	String reCreateServiceKey(Long teamId, Long clientId);
}