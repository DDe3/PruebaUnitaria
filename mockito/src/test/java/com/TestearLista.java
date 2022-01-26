package com;
import static org.junit.Assert.*;  
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
  
import java.util.List;  
import org.junit.Test;  

public class TestearLista {
	
	@Test  
    public void retornarValor() {  
  
        List mocklist = mock(List.class);  
                           when(mocklist.size()).thenReturn(5);  
  
        assertEquals(5, mocklist.size());  
        //assertEquals(2, mocklist.size());  
          
        System.out.println(mocklist.size());  
        System.out.println(mocklist);  
    }  

}
