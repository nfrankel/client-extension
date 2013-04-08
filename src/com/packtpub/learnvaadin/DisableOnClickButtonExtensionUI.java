package com.packtpub.learnvaadin;

import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
@Title("Client Extension example")
public class DisableOnClickButtonExtensionUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		Button button = new Button("Submit");

		new DisableOnClickButtonExtension().extend(button);

		setContent(button);
	}
}