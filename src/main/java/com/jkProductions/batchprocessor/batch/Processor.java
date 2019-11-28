package com.jkProductions.batchprocessor.batch;

import org.springframework.batch.item.ItemProcessor;
import com.jkProductions.batchprocessor.model.User;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by
 * @author jaikishorgohil
 */

@Component
public class Processor implements ItemProcessor<User, User> {
    private static final Map<String, String> DEPT_NAMES = new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("001","Technology");
        DEPT_NAMES.put("002","Accounts");
        DEPT_NAMES.put("003","Operations");
    }

    @Override
    public User process(User user) throws Exception{
        //get DEPT code and transform it to respective name
        String deptCode = user.getDept();
        String deptName = DEPT_NAMES.get(deptCode);
        user.setDept(deptName);
        user.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]",deptCode,deptName));
        return user;
    }
}
