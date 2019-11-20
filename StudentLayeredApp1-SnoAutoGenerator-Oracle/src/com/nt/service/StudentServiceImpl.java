package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOImpl;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		StudentDAO dao=null;
		int count=0;
		//write b.logic to calculate total,avg,result
		total=dto.getM1()+dto.getM2()+dto.getM3();
		//calculate avg
		avg=total/3.0f;
		if(dto.getM1()>=35 && dto.getM2()>=35 && dto.getM3()>=35){
			result="Pass";
		}
		else{
			result="fail";
		}
		//prpeare BO having Persistable DAta
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//create DAO class obj
		dao=new StudentDAOImpl();
		//use DAO
		count=dao.insert(bo);
		if(count==0)
				return "Registration failed";
		else
			   return "Registration succeded";
	}//method
}//class
