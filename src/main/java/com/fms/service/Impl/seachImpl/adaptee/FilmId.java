package com.fms.service.Impl.seachImpl.adaptee;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fms.dao.IFilmMapper;
import com.fms.pojo.film;

public class FilmId {
    public Page<film> searchById(film f, IFilmMapper iFilmMapper, Long currentPage, Long size) {
        QueryWrapper<film> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("id", f.getId());
        Page<film> filmPage = new Page<>(currentPage, size);
        return iFilmMapper.selectPage(filmPage, queryWrapper);
    }
}
