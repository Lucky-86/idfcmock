package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.StudentDao;
import dto.StudentDto;

@Controller
public class StudentController {
	@Autowired
	StudentDto dto;
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/create")
	public ModelAndView insert()
	{
		ModelAndView view=new ModelAndView("insert.jsp");
		view.addObject("stdobject", dto);
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/insert")
	public void save(StudentDto std)
	{
		dao.insert(std);
	}
	
	@RequestMapping("/fetch")
	public ModelAndView fetch()
	{
		ModelAndView view=new ModelAndView("fetch.jsp");
		view.addObject("fetchobj", dto);
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/displaydetails")
	public ModelAndView display(StudentDto std)
	{
		int id=std.getId();
		StudentDto dto1= dao.fetch(id);
		ModelAndView view=new ModelAndView("display.jsp");
		view.addObject("key", dto1);
		return view;
	}
}
