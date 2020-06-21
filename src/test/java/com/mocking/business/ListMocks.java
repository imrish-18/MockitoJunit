package com.mocking.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class ListMocks {

	List mock=Mockito.mock(List.class);
	@Test
	public void sizeTest()
	{
		when(mock.size()).thenReturn(5);
	assertEquals(5, mock.size());
		
	}
	@Test
	public void returnDifferentValues()
	{
		when(mock.size()).thenReturn(5).thenReturn(10);
	assertEquals(5, mock.size());
	assertEquals(10, mock.size());
		
	}
	@Test
	public void withParameterTest()
	{
		when(mock.get(0)).thenReturn("imrish").thenReturn(10);
	assertEquals("imrish", mock.get(0));
	assertEquals(10, mock.get(0));
		
	}
	
	
	@Test
	public void argumentCaptureTest()
	{
		mock.add("hello");
		ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		assertEquals("hello", captor.getValue());
	}
	
	@Test
	public void mulitpleArgumentCaptureTest()
	{
		mock.add("hello");
		mock.add("rish");
		ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);
		//verify(mock); check only once
		verify(mock,times(2)).add(captor.capture());
		List<String> list=captor.getAllValues();
		assertEquals("hello", list.get(0));
		assertEquals("rish", list.get(1));
		
		
	}
	
@Test
public void mocking()

{
	
// mock does not contain original value 
	ArrayList<String> arrayList=Mockito.mock(ArrayList.class);
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.size());
	arrayList.add("rish");
	arrayList.add("rishabh");
	System.out.println(arrayList.size());
	when(arrayList.size()).thenReturn(5);
	System.out.println(arrayList.size());
	}

@Test
public void mockingSpy()

{
	// spy contains original behavior
	ArrayList<String> arrayList=Mockito.spy(ArrayList.class);
	arrayList.add("rish2");
	System.out.println(arrayList.get(0));
	System.out.println(arrayList.size());
	arrayList.add("rish");
	arrayList.add("rishabh");
	System.out.println(arrayList.size());
	when(arrayList.size()).thenReturn(5);
	System.out.println(arrayList.size());
}

}