package com.fms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fms.dao.IFilmMapper;
import com.fms.pojo.film;

public abstract class SearchService {
    public abstract Page<film> search(film f, IFilmMapper iFilmMapper, Long currentPage, Long size);
}
