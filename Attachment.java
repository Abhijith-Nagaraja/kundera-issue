package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ATTACHMENT", schema = "test@twingo")
public class Attachment
{

	public Attachment() {
		// TODO Auto-generated constructor stub
	}
	
	public Attachment(String attachmentId, String fileName, String fileType) {
		setAttachmentId(attachmentId);
		setFileName(fileName);
		setFileType(fileType);
	}
	
	@Id
	@Column(name="ATTCHMENT_ID")
	private String attachmentId;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Column(name = "FILE_TYPE")
	private String fileType;

	public String getAttachmentId() {
		return attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	

}
