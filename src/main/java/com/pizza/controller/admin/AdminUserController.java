package com.pizza.controller.admin;

import com.pizza.entity.Role;
import com.pizza.entity.User;
import com.pizza.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin/users")
public class AdminUserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/adminHome", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String adminHome() {
        return "admin/adminHome";
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String getUsers(Model model) {
        List<User> userList = userService.getUsers();
        model.addAttribute("userList", userList);
        return "admin/users";
    }

    @RequestMapping(value = "/saveAsExecutor/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void saveAsExecutorRest(@PathVariable("id") int userId) {
        Role executorRole = userService.getExecutorRole();
        User executor = userService.findById(userId);
        executor.setRole(executorRole);
        userService.saveUser(executor);
    }

    @RequestMapping(value = "/saveAsAdmin/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void saveAsAdminRest(@PathVariable("id") int userId) {
        Role adminRole = userService.getAdminRole();
        User admin = userService.findById(userId);
        admin.setRole(adminRole);
        userService.saveUser(admin);
    }

    @RequestMapping(value = "/saveAsCustomer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public void saveAsCustomerRest(@PathVariable("id") int userId) {
        Role customerRole = userService.getCustomerRole();
        User customer = userService.findById(userId);
        customer.setRole(customerRole);
        userService.saveUser(customer);
    }

    @RequestMapping(value = "/checkUser", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public boolean checkUser(@ModelAttribute("userLogin") String userLogin) {
        User user = userService.findByLogin(userLogin);
        if (user == null) return false;
        return true;
    }


}
