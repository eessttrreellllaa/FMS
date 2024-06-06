package com.fms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fms.pojo.film;
import com.fms.pojo.search;
import org.springframework.stereotype.Service;

@Service
public interface FilmService extends IService<film> {
    /**
     * 分页查询所有电影
     * @param currentPage 当前页面
     * @param size 每个页面的数据量
     */
    public Page<film> queryPageFilm(Long currentPage, Long size);

    /**
     * 条件分页查询(电影名称，电影ID，导演，类型，演员)
     * @param filmsearch 前端封装对象
     * @param currentPage 当前页面
     * @param size 每个页面的数据量
     */
    public Page<film> queryFilm(search<film> filmsearch, Long currentPage, Long size);
}
