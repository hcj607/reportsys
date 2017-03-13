package com.oppein.reportsys.configuration.dbproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @author chenjianqi
 * @date 2017/3/8
 * 功能：获取客户模块数据源的配置属性
 */
@ConfigurationProperties(prefix = "crm.datasource")
public class CrmDatasourceProperties {

	private String url;

	private String username;

	private String password;

	private String uniqueResourceName;

	private int borrowConnectionTimeout;

	private int maxPoolSize;

	private int minPoolSize;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUniqueResourceName() {
		return uniqueResourceName;
	}

	public void setUniqueResourceName(String uniqueResourceName) {
		this.uniqueResourceName = uniqueResourceName;
	}

	public int getBorrowConnectionTimeout() {
		return borrowConnectionTimeout;
	}

	public void setBorrowConnectionTimeout(int borrowConnectionTimeout) {
		this.borrowConnectionTimeout = borrowConnectionTimeout;
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}
	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}
	public void setMinPoolSize(int minPoolSize) {
		this.minPoolSize = minPoolSize;
	}
	public int getMinPoolSize() {
		return minPoolSize;
	}


}
