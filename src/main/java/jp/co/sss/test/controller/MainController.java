package jp.co.sss.test.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sss.test.bean.TestBean;
import jp.co.sss.test.entity.Test;
import jp.co.sss.test.form.TestForm;
import jp.co.sss.test.repository.TestRepository;

@Controller
public class MainController {
    @Autowired
    TestRepository repository;

    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/test")
    public String test(){
        return "/test";
    }

    @RequestMapping("/form")
    public String form(){
        return "/form";
    }
    @PostMapping("/submit")
    public String submit(TestForm form, Model model){
        Test test = new Test();
        BeanUtils.copyProperties(form, test);
        test=repository.save(test);
        TestBean testBean = new TestBean();
        BeanUtils.copyProperties(test, testBean);
        model.addAttribute("item", testBean);
        return "/test";
    }
}
