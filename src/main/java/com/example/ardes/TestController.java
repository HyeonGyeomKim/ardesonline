package com.example.ardes;

import com.example.ardes.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class TestController {

    final TestMapper testMapper;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(Model model){
        Map<String, Object> testMap = testMapper.getTest();
        model.addAttribute("hello",testMap.get("monster_name").toString());
        return "/hello";
    }
}
