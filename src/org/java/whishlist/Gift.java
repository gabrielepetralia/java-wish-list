package org.java.whishlist;

public class Gift {
	private String name;
	public String recipient;
	
	public Gift(String name, String recipient) {
		setName(name);
		setRecipient(recipient);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	@Override
	public String toString() {
		return getName() + " -> " + getRecipient();
	}
	
}
