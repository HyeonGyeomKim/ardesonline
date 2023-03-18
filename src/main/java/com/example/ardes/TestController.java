package com.example.ardes;

import com.example.ardes.mapper.GetTokenMapper;
import com.example.ardes.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class TestController {

    final GetTokenMapper GTM;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String userName(Model model, @RequestParam("token") String token) {
        Map<String, Object> testMap = GTM.getUserByToken(token);
        model.addAttribute("userName", testMap.get("user_name").toString());
        return "/index";
    }
}
