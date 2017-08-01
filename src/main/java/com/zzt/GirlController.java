package com.zzt;

import com.zzt.DAO.Girl;
import com.zzt.DAO.GirlRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zzt on 2017/4/6.
 */
@RestController
public class GirlController {

    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){


       return girlRepository.findAll();
    //return null;
    }
}
