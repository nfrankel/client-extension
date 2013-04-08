package com.packtpub.learnvaadin;

import com.packtpub.learnvaadin.client.DisableOnClickButtonSharedState;
import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.Button;

@SuppressWarnings("serial")
public class DisableOnClickButtonExtension extends AbstractExtension {

	public DisableOnClickButtonExtension(String disabledLabel) {

		getState().setDisabledLabel(disabledLabel);
	}

	protected void extend(Button button) {

		super.extend(button);
	}

	@Override
	protected DisableOnClickButtonSharedState getState() {

		return (DisableOnClickButtonSharedState) super.getState();
	}
}
