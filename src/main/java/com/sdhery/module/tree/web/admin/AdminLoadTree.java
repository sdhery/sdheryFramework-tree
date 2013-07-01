package com.sdhery.module.tree.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-1
 * Time: 下午5:19
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AdminLoadTree {
    @RequestMapping(value = "/admin/loadMainLeftTree")
    public String loadMainLeftTree(){
        return "";
    }
}
