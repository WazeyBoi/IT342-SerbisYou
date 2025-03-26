package edu.cit.serbisyo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.cit.serbisyo.entity.UserAuthEntity;
import edu.cit.serbisyo.service.UserAuthService;

@RestController
@RequestMapping(method=RequestMethod.GET, path="/api/userauth")
public class UserAuthController {

    @Autowired
    UserAuthService userv;

     @GetMapping("/print")
    public String print() {
        return "Wow, it works!";
    }
    
    // CREATE
    @PostMapping("/postUserAuth")
    public UserAuthEntity postUserAuth(@RequestBody UserAuthEntity userauth) {
        return userv.postUserAuth(userauth);
    }
    
      // READ
    @GetMapping("/getAllUserAuths")
    public List<UserAuthEntity> getAllUserAuths() {
        return userv.getAllUserAuth();
    }

    // UPDATE
    @PutMapping("/putUserAuthDetails")
    public UserAuthEntity putUserAuthDetails(@RequestParam int userId, @RequestBody UserAuthEntity newUserAuthDetails) {
        return userv. putUserAuthDetails(userId, newUserAuthDetails);
    }

    // DELETE
    @DeleteMapping("/deleteUserAuthDetails/{userId}")
    public String deleteUserAuthDetails(@PathVariable int userId) {
        return userv.deleteUserAuthDetails(userId);
    }
}
