package com.bit.spring05.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.resources.jndi.Handler;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.bit.spring05.model.GuestDao;
import com.bit.spring05.model.GuestDaoImf;
import com.bit.spring05.model.entity.GuestVo;

/*
get-> 1 2
post-> 1 2 3 4 5
post,err-> 1 2 3

1. handleRequest
2. handleRequestInternal
3. onBind
4. onSubmit
5. doSubmitAction

*/
public class AddController extends SimpleFormController{
	private GuestDao dao;
	
	public void setDao(GuestDao dao) {
		this.dao = dao;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return super.handleRequest(request, response);
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("handleRequestInternal");
		return super.handleRequestInternal(request, response);
	}
	
	@Override
	protected void onBind(HttpServletRequest request, Object command,
			BindException errors) throws Exception {
		List errList=errors.getAllErrors();
		Map<String,String> errs=new HashMap<String,String>();
		for(int i=0;i<errList.size();i++){
			System.out.println(errList.get(i));
		}
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		System.out.println("onSubmit");
		if(errors.hasErrors())return new ModelAndView("guest/add");
		return super.onSubmit(request, response, command, errors);
	}
	
	@Override
	protected void doSubmitAction(Object command) throws Exception {
		dao.insertOne((GuestVo)command);
		
	}
	
	
	

}
