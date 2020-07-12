package com.pypay.sofa.aid;

import com.pypay.sofa.aid.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author PyPay
 */
@Controller
@RequestMapping(value = "/hello")
public class HwController {

    private DataMapper dataMapper;

    @Autowired(required = false)
    public void setDataMapper(DataMapper dataMapper) {
        this.dataMapper = dataMapper;
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser( ){

        return dataMapper.testQuery(1);
    }

}
