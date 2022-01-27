package com;
import static org.junit.Assert.*;  
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
  
import java.util.List;  
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;  


//@RunWith(org.mockito.runners.MockitoJUnitRunner.class)
@RunWith(PowerMockRunner.class)
public class TestearListaTest {
	
	@Test  
    public void retornarValor() {  
  
        List mocklist = mock(List.class);  
                           when(mocklist.size()).thenReturn(5);  
  
        //assertEquals(5, mocklist.size());  
        //assertEquals(2, mocklist.size());  
        assertEquals(2, mocklist.size()); 
          
        System.out.println(mocklist.size());  
        System.out.println(mocklist);  
        
    }  

}
