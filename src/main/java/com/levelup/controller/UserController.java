package com.levelup.controller;

import com.levelup.dto.UserDto;
import com.levelup.model.User;
import com.levelup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createUser(@RequestBody UserDto userDto) {
        if (userDto == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPass(userDto.getPass());
        userService.createUser(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deleteUser(@PathVariable long id) {
        User user = userService.findById(id);
        if (user == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
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
