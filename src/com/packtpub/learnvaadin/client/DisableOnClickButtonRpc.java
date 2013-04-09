package com.packtpub.learnvaadin.client;

import com.vaadin.shared.communication.ServerRpc;

public interface DisableOnClickButtonRpc extends ServerRpc {

	void disableButton(String disabledLabel);
}
