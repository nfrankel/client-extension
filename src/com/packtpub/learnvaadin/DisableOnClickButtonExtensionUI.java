package com.packtpub.learnvaadin;

import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Title("Client Extension example")
public class DisableOnClickButtonExtensionUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		String disabledLabel = request.getParameter("label");

		final Button submitButton = new Button("Submit");

		new DisableOnClickButtonExtension(disabledLabel == null ? "Please wait..." : disabledLabel).extend(submitButton);

		Button queryButton = new Button("Query");

		queryButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {

				Notification.show("Enabled: " + submitButton.isEnabled());
			}
		});

		HorizontalLayout layout = new HorizontalLayout(submitButton, queryButton);

		layout.setSpacing(true);
		layout.setMargin(true);

		setContent(layout);
	}
}