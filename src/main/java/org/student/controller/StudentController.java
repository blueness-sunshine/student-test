package org.student.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.student.api.StudentApi;



@RestController
@RequestMapping("/student")
public class StudentController {
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Resource
	private StudentApi studentApi;
	
	@RequestMapping(path = "/listStudent", method = RequestMethod.POST)
	public void listStudent(){
		logger.info("get students...");
		logger.info("the data are " + studentApi.listStudents());
	}
}
