package com.dianzishangwu.yihunli.service.agreecollectservice;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dianzishangwu.yihunli.dao.agreecollectdao.AgreeDao;
import com.dianzishangwu.yihunli.domain.agreecollect.Agree;

@Service
public class AgreeService {
	
    @Autowired
	private AgreeDao agreeDao;
	
	public Serializable insertAgree(Agree agree){
		return agreeDao.save(agree);
	}
	
	public void deleteAgree(Agree agree){
		agreeDao.delete(agree);
	}
	
	public long agreeNumByArticleId(String articledId){
		 return agreeDao.findCountByCondition(Agree.class, "articleId", articledId, "=");
	}
	
}
