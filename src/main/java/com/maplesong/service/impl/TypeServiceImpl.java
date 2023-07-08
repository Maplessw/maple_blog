package com.maplesong.service.impl;

import com.maplesong.dao.TypeDao;
import com.maplesong.domain.Type;
import com.maplesong.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: maple
 * @description:
 * @author: Maple
 * @create: 2023-04-02 15:21
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDao typeDao;

    @Override
    @Transactional
    public int saveType(Type type) {
        return typeDao.saveType(type);
    }

    @Override
    @Transactional
    public Type getType(Long id) {
        return typeDao.getType(id);
    }

    @Override
    @Transactional
    public List<Type> getAllType() {
        return typeDao.getAllType();
    }

    @Override
    @Transactional
    public Type getTypeByName(String name) {
        return typeDao.getTypeByName(name);
    }

    @Override
    @Transactional
    public int updateType(Type type) {
        return typeDao.updateType(type);
    }

    @Override
    @Transactional
    public void deleteType(Long id) {
        typeDao.deleteType(id);
    }

    @Transactional
    @Override
    public List<Type> getAllTypeAndBlog() {
        return typeDao.getAllTypeAndBlog();
    }
}
