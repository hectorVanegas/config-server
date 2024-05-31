package com.co.dosman.common.service.implementation;

import com.co.dosman.common.service.CommonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public class CommonServiceImpl<E, R extends CrudRepository<E, Long>> implements CommonService<E> {
    @Autowired
	private R commonRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<E> findAll() {
        return commonRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<E> findById(Long id) {
        return commonRepository.findById(id);
    }

    @Override
    @Transactional
    public E save(E entity) {
        return commonRepository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        commonRepository.deleteById(id);
    }
}
