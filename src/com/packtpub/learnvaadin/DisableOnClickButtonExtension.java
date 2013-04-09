package com.packtpub.learnvaadin;

import com.packtpub.learnvaadin.client.DisableOnClickButtonRpc;
import com.packtpub.learnvaadin.client.DisableOnClickButtonSharedState;
import com.vaadin.server.AbstractExtension;
import com.vaadin.shared.communication.ServerRpc;
import com.vaadin.ui.Button;

@SuppressWarnings("serial")
public class DisableOnClickButtonExtension extends AbstractExtension {

	private Button button;

	private ServerRpc rpc = new DisableOnClickButtonRpc() {

		@Override
		public void disableButton(String disabledLabel) {

			button.setCaption(disabledLabel);
			button.setEnabled(false);
		}
	};

	public DisableOnClickButtonExtension(String disabledLabel) {

		registerRpc(rpc);

		getState().setDisabledLabel(disabledLabel);
	}

	protected void extend(Button button) {

		this.button = button;

		super.extend(button);
	}

	@Override
	protected DisableOnClickButtonSharedState getState() {

		return (DisableOnClickButtonSharedState) super.getState();
	}
}
