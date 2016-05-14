package com.dianzishangwu.yihunli.restful.agreecollect;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.dianzishangwu.yihunli.domain.agreecollect.Agree;
import com.dianzishangwu.yihunli.service.agreecollectservice.AgreeService;


@Path("agrees")
public class AgreeResource {
	
	@Autowired
	private AgreeService agreeService;

	@POST	
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String createAgree(@BeanParam AgreeParaBean agreeParaBean){
		Agree agree = new Agree();
		agree.setArticleId(String.valueOf(agreeParaBean.getArticleId()));
		agree.setUserId(String.valueOf(agreeParaBean.getUserId()));
		return String.valueOf(agreeService.insertAgree(agree));
	}
	
	@GET
	@Path("{articleId:[0-9]+}")
	public String  selectAgrees(@PathParam("articleId") final String articleId){   
		return String.valueOf(agreeService.agreeNumByArticleId(articleId));
	}
}
