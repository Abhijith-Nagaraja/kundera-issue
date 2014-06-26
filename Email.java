package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EMAIL", schema = "test@twingo")
@NamedQueries({
    @NamedQuery(name="EMAIL.findAll",
                query="SELECT m FROM Email m"),
    @NamedQuery(name="EMAIL.findBySubject",
                query="SELECT c FROM Email c WHERE c.subject LIKE :subject"),
})
/*
 * ,
    @NamedQuery(name="findBySubject",
                query="SELECT c FROM MAIL c WHERE c.subject LIKE :subject"),
 */
public class Email
{
	public Email() {
		init();
	}
	
	@Id
	@Column(name="MESSAGE_ID")
	private String messageId;

	@Column(name = "SUBJECT")
	private String subject;

	@Column(name = "BODY")
	private String body;
	
	@Column(name = "zipcode")
	private int zipcode;

	@Embedded
	private Contact from;

	@ElementCollection
	@CollectionTable(name = "TO")
	private List<Contact> to;

	@OneToMany (cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
	@JoinColumn(name="MESSAGE_ID")
	private List<Attachment> attachments;

	private void init() {
		to = new ArrayList<Contact>();
		attachments = new ArrayList<Attachment>();
	}
	
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode( int zipcode ) {
		this.zipcode = zipcode;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Contact getFrom() {
		return from;
	}

	public void setFrom(Contact from) {
		this.from = from;
	}

	public List<Contact> getTo() {
		return to;
	}

	public void setTo(List<Contact> to) {
		this.to = to;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	
	public void addTo(Contact contact) {
		to.add(contact);		
	}
	
	public void addAttachment(Attachment attachment) {
		attachments.add(attachment);
	}


}
