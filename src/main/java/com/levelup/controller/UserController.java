package com.levelup.controller;

import com.levelup.dto.UserDto;
import com.levelup.model.User;
import com.levelup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Class {@link com.levelup.controller.UserController}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginUser(@RequestBody UserDto userDto) {
        if (userDto == null) {
            return "user1";
        }
        

        return "all_product";
    }


    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String showLoginForm() {
        return "user1";
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String createUser(@RequestBody UserDto userDto, Model model) {
        if (userDto == null) {
            return "user1";
        }
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPass(userDto.getPass());
        userService.createUser(user);
        model.addAttribute("email", user.getEmail());
        model.addAttribute("pass", user.getPass());
        return "one_product";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deleteUser(@PathVariable long id) {
        userService.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity findUser(@PathVariable long id) {
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(user, HttpStatus.OK);
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllUsers() {
        List<User> users = userService.getAllUsers();
        if (CollectionUtils.isEmpty(users)) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(users, HttpStatus.OK);
    }


}
