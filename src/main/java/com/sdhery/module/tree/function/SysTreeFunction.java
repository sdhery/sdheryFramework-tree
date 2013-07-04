package com.sdhery.module.tree.function;

import com.sdhery.module.helper.ServiceManager;
import com.sdhery.module.tree.domain.SysTree;

/**
 * Created with IntelliJ IDEA.
 * User: sdhery
 * Date: 13-7-4
 * Time: 下午4:00
 * To change this template use File | Settings | File Templates.
 */
public class SysTreeFunction {
    public static SysTree getSysTreeBySysTreeId(int sysTreeId){
        return ServiceManager.sysTreeService.getById(sysTreeId);
    }
}
