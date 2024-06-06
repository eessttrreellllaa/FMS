package com.fms.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fms.dao.IFilmMapper;
import com.fms.pojo.film;
import com.fms.pojo.search;
import com.fms.service.FilmService;
import com.fms.service.SearchService;
import com.fms.util.SearchConfigUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class FilmServiceImpl extends ServiceImpl<IFilmMapper, film> implements FilmService {

    @Resource
    public IFilmMapper iFilmMapper;

    private SearchService searchService;

    @Override
    public Page<film> queryPageFilm(Long currentPage, Long size) {
        Page<film> filmPage = new Page<>(currentPage, size);
        QueryWrapper<film> queryWrapper = new QueryWrapper<>();
        return iFilmMapper.selectPage(filmPage, queryWrapper);
    }

    @Override
    public Page<film> queryFilm(search<film> filmsearch, Long currentPage, Long size) {
        film f = filmsearch.getT();
        String searchType = filmsearch.getSearchType();
        searchService = (SearchService) SearchConfigUtil.getBean(searchType);

        return searchService.search(f, iFilmMapper, currentPage, size);
    }
}
