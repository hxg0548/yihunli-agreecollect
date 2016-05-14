package com.dianzishangwu.yihunli.restful.agreecollect;

import javax.ws.rs.QueryParam;

public class AgreeParaBean {

	public AgreeParaBean(){}
	@QueryParam("userId")
	private int userId;
	
	@QueryParam("articleId")
	private int articleId;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	
}
