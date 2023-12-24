
package com.example.demo.Controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@Controller
public class UserController {

	Logger logger = LoggerFactory.getLogger("UserController.class");
	
	@Autowired
	UserService serv;
	
	
	
		@GetMapping("/")
		public String Index(Model model) {
			
			logger.info("Home method");
		   model.addAttribute("entity", new UserEntity());
		   
			return "index";
		}
		
		

		
		@PostMapping("/addUser")
		public String handleSubmitButton( UserEntity entity , Model model) {
			
			logger.info("addUser method");
			model.addAttribute("entity", new UserEntity());
			String msg = serv.SaveorUpdateUser(entity);
			model.addAttribute("msg", msg);
			
			return "index";
		}

		@GetMapping("/users")
		public String getAllUsers(Model model){
			
			logger.info("users method");
			List<UserEntity> usersList = serv.getAllUsers();
			if(usersList.isEmpty()) {
				model.addAttribute("list", "No records found");
			}
			model.addAttribute("users",usersList);
			return "ViewAllUsers";
		}
		
		
		@GetMapping("/edit/{id}")
		public String editPage(@ModelAttribute(name="id") Integer id , Model model) {
			
			logger.info("edit user with id method");
			UserEntity entity = serv.FindUserrById(id);
			
			model.addAttribute("entity",entity);
			model.addAttribute("updated","User updated");
			return "index";
		}
		
		@GetMapping("/delete/{id}")
		public String deleteUser(@ModelAttribute(name="id") Integer id, Model model) {
			
			logger.info("delete with id method");
			serv.DeleteUser(id);
			model.addAttribute("msg", "User got deleted");
			
			return "forward:/users";
		}
		
		@GetMapping("/getStatus/{id}/{SW}")
		public String changeStatus(@ModelAttribute(name="id") Integer id , @ModelAttribute(name="SW") String SW ,  Model model) {
			
			logger.info("get status method");
			String new_SW = "";
			if(SW.equals("Y")) {
				new_SW = "N";
				model.addAttribute("updateMSG" ,"User De-Activated");
			}
			else {
				new_SW = "Y";
				model.addAttribute("updateMSG" ,"User Activated");
			}
			serv.UpdateUser(id, new_SW);
			
			return "forward:/users";
			
		}
		
}
