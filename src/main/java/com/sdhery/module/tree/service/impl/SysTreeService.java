package com.sdhery.module.tree.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.tree.dao.ISysTreeDao;
import com.sdhery.module.tree.domain.SysTree;
import com.sdhery.module.tree.service.ISysTreeService;

/**
* @Title:实现业务操作类
* @Description: 系统树
* @author sdhery
* @Date:2013-06-22 14:58:20
*/
public class SysTreeService extends BaseService<SysTree, Integer> implements ISysTreeService {
    ISysTreeDao sysTreeDao;

    public void setSysTreeDao(ISysTreeDao sysTreeDao) {
        this.sysTreeDao = sysTreeDao;
    }

    protected EntityDao<SysTree, Integer> getEntityDao() {
        return sysTreeDao;
    }
}