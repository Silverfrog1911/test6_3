package com.springboot.test6.Controller;

import com.google.gson.Gson;
import com.springboot.test6.Service.Impl.ServiceKitImpl;
import com.springboot.test6.pojo.TestTable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class mainController {

    @Resource
    private ServiceKitImpl serviceKit;
    //private testMapper testmapper;

    @RequestMapping("/page1")
    @ResponseBody
    public String page1(){
        String msg="HelloWorld";



        Gson gson = new Gson();
        return gson.toJson(msg);
        //return "Test";
    }

    @RequestMapping("/page2")
    public String page2(){

        List<TestTable> list=serviceKit.SelectAll();

        for (TestTable t:list){
            System.out.println(t.getName()+"++++"+t.getId()+"++++"+t.getAddress());
        }

        return "Test";
    }

    @RequestMapping("/page3")
    public String Show(){
        return "Test3";
    }

    @RequestMapping("/rd")
    @ResponseBody
    //Model model
    public String back(){

        List<TestTable> list=serviceKit.SelectAll();
//
//        for (TestTable t:list){
//            System.out.println(t.getName()+"++++"+t.getId()+"++++"+t.getAddress());
//        }

        //model.addAttribute("Test2",list);
        Gson json = new Gson();
        return json.toJson(list);
        //return list;
    }


}
