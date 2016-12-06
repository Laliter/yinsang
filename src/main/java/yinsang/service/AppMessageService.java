package yinsang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yinsang.bean.AppMessage;
import yinsang.mapper.AppMessageMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppMessageService {

    @Autowired
    private AppMessageMapper mapper;

    public List<AppMessage> getAllMessage(){
        List<AppMessage> list = new ArrayList<AppMessage>();
        list = mapper.selectAll();
        return list;
    }

    public List<AppMessage> getMessageById(String id) {
        return mapper.getMessById(id);
    }
}