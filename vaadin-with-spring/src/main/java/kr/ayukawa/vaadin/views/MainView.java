package kr.ayukawa.vaadin.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {
	public MainView() {
		Button button = new Button("클릭해보세요!");
		button.addClickListener(evt -> Notification.show("버튼이 클릭되었습니다"));

		this.add(button);
	}
}
