package com.primavera.cloud;

import java.io.Serializable;

public class UserSession implements Serializable{
	private Long sessionId;
	private Long lastActiveTime;
	private String transactionId;
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public Long getLastActiveTime() {
		return lastActiveTime;
	}
	public void setLastActiveTime(Long lastActiveTime) {
		this.lastActiveTime = lastActiveTime;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
