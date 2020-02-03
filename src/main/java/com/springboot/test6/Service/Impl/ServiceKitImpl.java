package com.springboot.test6.Service.Impl;

import com.springboot.test6.Dao.testMapper;
import com.springboot.test6.Service.ServiceKit;
import com.springboot.test6.pojo.TestTable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ServiceKitImpl implements ServiceKit {

    @Resource
    private testMapper testmapper;

    @Override
    public List<TestTable> SelectAll() {
        return testmapper.SelectAll();
    }
}
