package yinsang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yinsang.bean.AppMessage;
import yinsang.service.AppMessageService;

import java.util.List;

@RestController
@RequestMapping("/appmessage")
public class AppMessageController {

    @Autowired
    private AppMessageService service;


    @RequestMapping("/getAll")
    public List<AppMessage> getAllMessage(){

        List<AppMessage> list = service.getAllMessage();
        int num = list.size();
        if(null!=list && num>3){
            for (int i = 0; i < num-3; i++) {
                list.remove(0);
            }
        }
        return list;
    }

    @RequestMapping("/getByID")
    public List<AppMessage> getMessageById(@RequestParam("id") String id){
        List<AppMessage> list = service.getMessageById(id);
        int num = list.size();
        if(null!=list && num>5){
            for (int i = 0; i < num-5; i++) {
                list.remove(0);
            }
        }
        return list;
    }
}