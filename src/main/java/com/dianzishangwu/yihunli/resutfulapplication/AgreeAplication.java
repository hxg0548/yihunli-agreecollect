package com.dianzishangwu.yihunli.resutfulapplication;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;


import com.dianzishangwu.yihunli.restful.agreecollect.AgreeResource;


public class AgreeAplication extends Application{

	@Override
	public Set<Class<?>> getClasses(){
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(AgreeResource.class);
		return classes;
	}
}
