package com;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import com.programacionweb.mockito.ManejarServicio;
import com.programacionweb.mockito.ComponenteDependiente;

public class ComponenteDependienteTest {
	@Test
	public void testMockito() {

		ManejarServicio doService = mock(ManejarServicio.class);

		List<String> combinedlist = Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use w3eHibernate ",
				" Use Spring MVC ");
		
		when(doService.getTodos("dummy")).thenReturn(combinedlist);

		ComponenteDependiente business = new ComponenteDependiente(doService);

		List<String> alltd = business.getTodosforHibernate("dummy");

		System.out.println(alltd);
		assertEquals(1, alltd.size());
	}

}
