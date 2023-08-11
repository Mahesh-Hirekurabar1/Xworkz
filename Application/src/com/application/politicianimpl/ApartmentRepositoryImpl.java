package com.application.politicianimpl;

import com.application.politician.ApartmentRepository;

public class ApartmentRepositoryImpl implements ApartmentRepository {


	private String[] names=new String[APARTMENT_NAMES];
	private int index=0;

	@Override
	public  String start(String name) {
		System.out.println("Invoking name in  ApartmentRepositoryImpl");
		if(index<APARTMENT_NAMES)
		{
			this.names[index]=name;
			System.out.println("Index at="+this.index);
			System.out.println("Name of apartment="+names[index]);
			index=index+1;
			System.out.println("Index after increasing="+this.index);
		}
		else
		{
			System.err.println("index is exceeded,gives exception");
		}

		return null;
	}
	public void display()
	{
		for(int start=0;start<names.length;start++)
		{
			System.out.println("Names at index  "+start+" is ="+names[start]);
		}
	}






}