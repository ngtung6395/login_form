package controller;

import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import service.UserService;

@Controller
public class UserController {
    @GetMapping("/home")
    public ModelAndView modelAndView(){
        ModelAndView mav = new ModelAndView("/home");
        mav.addObject("login", new Login());
        return mav;
    }

    @PostMapping("/login")
    public ModelAndView modelAndView(Login login){
        User user =UserService.checkLogin(login);
        ModelAndView mav;
        if(user == null){
            mav = new ModelAndView("/error");
        }else {
            mav = new ModelAndView("/checklogin");
            mav.addObject("user",user);
        }
        return mav;
    }
}
