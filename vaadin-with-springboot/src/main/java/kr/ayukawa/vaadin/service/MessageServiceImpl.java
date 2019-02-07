package kr.ayukawa.vaadin.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
	@Override
	public String getMessage() {
		return "Vaadin 웹사이트에 스프링 부트 적용중...";
	}
}
