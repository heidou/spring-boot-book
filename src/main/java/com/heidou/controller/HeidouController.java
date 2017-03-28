package com.heidou.controller;

import com.heidou.dao.BookDOMapper;
import com.heidou.model.BookDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author heidou.f
 *         2017/3/25.
 */
@RestController
@RequestMapping("/hd")
public class HeidouController {

    @Autowired
    private BookDOMapper bookDOMapper;

    @RequestMapping(value = "/read", method = { RequestMethod.GET, RequestMethod.POST })
    public String selectByPrimaryKey(ModelMap map, HttpServletRequest request,
                             @RequestParam(value = "id",required = false,defaultValue = "0") Integer myId) {
        BookDO bookDO = new BookDO();

        bookDO.setName("地理");
        bookDO.setPrice(44.12);
        bookDO.setTenantId("2012");
        bookDOMapper.insert(bookDO);

        System.out.println("-----book----- "+bookDO.getName()+bookDO.getPrice());
        return "id ="+myId;
    }
}
