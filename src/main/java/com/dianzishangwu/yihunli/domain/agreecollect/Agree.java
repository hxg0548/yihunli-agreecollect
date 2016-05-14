package com.dianzishangwu.yihunli.domain.agreecollect;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="agree_info",
              indexes={@Index(columnList="userId",name="user_Id_index"),
                   @Index(columnList="articleId",name="article_Id_index")})
public class Agree implements Serializable{

	@Id
	private String userId;
	@Id
	private String articleId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getArticleId() {  
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	
}
