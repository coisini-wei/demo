package hellospring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/userLogin")
    public String userLogin(@RequestParam String userName,
                            @RequestParam String passward,
                            Map<String, Object> msg,
                            HttpSession session) {
        if (!StringUtils.isEmpty(userName) && (passward.equals("123"))) {
            // 登陆成功，防止表单重复提交，采用重定向的方式访问主页
            session.setAttribute("loginUser",userName);
            return "redirect:/main.html";
        } else {
            // 重新登陆
            msg.put("msg", "用户或者密码错误");
            return "login";
        }
    }
}