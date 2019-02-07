package kr.ayukawa.vaadin.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import kr.ayukawa.vaadin.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

@Route("")
public class MainView extends VerticalLayout {
	public MainView(@Autowired MessageService service) {
		Button button = new Button("클릭해보세요!");
		button.addClickListener(evt -> Notification.show(service.getMessage()));

		this.add(button);
	}
}
