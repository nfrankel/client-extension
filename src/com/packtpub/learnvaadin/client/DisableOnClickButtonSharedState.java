package com.packtpub.learnvaadin.client;

import com.vaadin.shared.communication.SharedState;

@SuppressWarnings("serial")
public class DisableOnClickButtonSharedState extends SharedState {

	private String disabledLabel;

	public String getDisabledLabel() {
		return disabledLabel;
	}

	public void setDisabledLabel(String disabledLabel) {
		this.disabledLabel = disabledLabel;
	}
}
