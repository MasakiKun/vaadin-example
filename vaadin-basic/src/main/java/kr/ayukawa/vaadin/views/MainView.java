package kr.ayukawa.vaadin.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import kr.ayukawa.vaadin.service.MessageService;
import kr.ayukawa.vaadin.service.MessageServiceImpl;

@Route("")
public class MainView extends VerticalLayout {
	MessageService service = new MessageServiceImpl();

	public MainView() {
		Button button = new Button("클릭해보세요!");
		button.addClickListener(evt -> Notification.show(this.service.getMessage()));

		this.add(button);
	}
}
