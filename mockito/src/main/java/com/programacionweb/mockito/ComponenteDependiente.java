package com.programacionweb.mockito;

import java.util.ArrayList;
import java.util.List;

public class ComponenteDependiente {

	public ManejarServicio doService;

	public ComponenteDependiente(ManejarServicio doService) {
		this.doService = doService;
	}

	public List<String> getTodosforHibernate(String user) {

		List<String> hibernatelist = new ArrayList<String>();
		List<String> Combinedlist = doService.getTodos(user);

		for (String todo : Combinedlist) {
			if (todo.contains("Hibernate")) {
				hibernatelist.add(todo);
			}
		}

		return hibernatelist;
	}

}
