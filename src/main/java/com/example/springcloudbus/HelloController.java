package com.example.springcloudbus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wyx
 * @Date: 2019-05-04 14:12
 * @Description:
 */
@RestController
public class HelloController {

    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    public void send() {
        sender.send();
    }


}
