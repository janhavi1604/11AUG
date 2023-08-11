package com.consumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
public class CallQualityDemo {

	ArrayList<CallQualityFeedBack> itemList=new ArrayList<>();
	
	CallQualityDemo()
	{
		itemList.add(new CallQualityFeedBack(1,"201235","Good",4));
		itemList.add(new CallQualityFeedBack(2,"25123","Poor",1));
		itemList.add(new CallQualityFeedBack(3,"289652","average",3));
		itemList.add(new CallQualityFeedBack(1,"201235","Excellent",5));
		
	}
	
	public void forEach(Consumer<CallQualityFeedBack> c)
	{
		for(CallQualityFeedBack i:itemList)
		{
			c.accept(i);
			
		}
	}
	
	public void forEach(Predicate<CallQualityFeedBack>c)
	{
		for(CallQualityFeedBack i:itemList)
		{
			if(c.test(i))
			{
				System.out.println(i+"Call Quality is good");
			}
			else
			{
				System.out.println(i+"Call Quality is bad");
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallQualityDemo obj =new CallQualityDemo();
		obj.forEach((e)->System.out.println(e));
		obj.forEach((e)->e.getRating()>3);

	}

}
