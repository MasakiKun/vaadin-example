package kr.ayukawa.vaadin.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {
	@Override
	public String getMessage() {
		return "Vaadin + Spring 웹페이지 만드는 중...";
	}
}
