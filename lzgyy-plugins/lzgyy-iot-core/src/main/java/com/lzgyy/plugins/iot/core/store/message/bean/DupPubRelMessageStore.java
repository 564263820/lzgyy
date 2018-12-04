package com.lzgyy.plugins.iot.core.store.message.bean;

import java.io.Serializable;

/**
 * 重发pubrel消息存储
 */
public class DupPubRelMessageStore implements Serializable {

	private static final long serialVersionUID = -4111642532532950980L;

	private String clientId;

	private int messageId;

	public String getClientId() {
		return clientId;
	}

	public DupPubRelMessageStore setClientId(String clientId) {
		this.clientId = clientId;
		return this;
	}

	public int getMessageId() {
		return messageId;
	}

	public DupPubRelMessageStore setMessageId(int messageId) {
		this.messageId = messageId;
		return this;
	}

}
