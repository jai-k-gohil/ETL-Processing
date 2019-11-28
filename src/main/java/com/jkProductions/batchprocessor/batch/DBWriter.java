package com.jkProductions.batchprocessor.batch;

import com.jkProductions.batchprocessor.model.User;
import com.jkProductions.batchprocessor.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by
 * @author jaikishorgohil
 */
@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> list) throws Exception {
        System.out.println("Data saved for users:" + list);
        userRepository.saveAll(list);
    }
}
