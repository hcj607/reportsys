package com.oppein.reportsys.domain.crm;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the crm_news database table.
 * 
 */
@Entity
@Table(name="crm_news")
@NamedQuery(name="CrmNew.findAll", query="SELECT c FROM CrmNew c")
public class CrmNew implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String author;

	@Lob
	private String content;

	@Column(name="create_time")
	private int createTime;

	private byte status;

	private String title;

	public CrmNew() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}