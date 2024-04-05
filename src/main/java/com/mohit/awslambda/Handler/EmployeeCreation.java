package com.mohit.awslambda.Handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import Entity.Employee;

public class EmployeeCreation implements RequestHandler<String,Employee>{

	@Override
	public Employee handleRequest(String input, Context context) {
		return new Employee("1","Mohit Saini","13015");
	}

}
