package com.conversiondemo.ConvertionDemo;

import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import Services.Services;

public class App 
{
    public static void main( String[] args ) throws StreamReadException, DatabindException, IOException
    {
    	Services service=new Services();
    	service.EmployeeManagement();
    	//service.OnlineShoppingCart();
    	//service.UniversityStudents();
    	//service.Complex4University();
    	//service.Complex5Ecommerce();
    	//service.CRM();
    	//service.StoreEcommerce();
    	//service.PlatformShopease();
    	//service.InsurancePolicy();
    	//service.onlineLearningPlatform();
    	//service.orderSystem();
    	//service.realEstate();
    	//service.researchProject();
    	//service.smartCity();
    	//service.sportsTournamet();
    	//service.studentInfoSystem();
    	//service.supplyChain();
    	//service.travelAgency();
    	//service.travelBooking();
    	//service.universityWrapper();
    }
}
