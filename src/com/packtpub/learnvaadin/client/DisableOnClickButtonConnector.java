package com.packtpub.learnvaadin.client;

import static com.vaadin.client.ApplicationConnection.DISABLED_CLASSNAME;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.packtpub.learnvaadin.DisableOnClickButtonExtension;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.client.ui.VButton;
import com.vaadin.shared.ui.Connect;

@SuppressWarnings("serial")
@Connect(DisableOnClickButtonExtension.class)
public class DisableOnClickButtonConnector extends AbstractExtensionConnector {

	private DisableOnClickButtonRpc rpc = RpcProxy.create(DisableOnClickButtonRpc.class, this);

	@Override
	public DisableOnClickButtonSharedState getState() {

		return (DisableOnClickButtonSharedState) super.getState();
	}

	@Override
	protected void extend(ServerConnector target) {

		final VButton button = (VButton) ((ComponentConnector) target).getWidget();

		button.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				String disabledLabel = getState().getDisabledLabel();

				button.setEnabled(false);
				button.addStyleName(DISABLED_CLASSNAME);
				button.setText(disabledLabel);

				rpc.disableButton(disabledLabel);
			}
		});
	}
}
