package com.fms.service.Impl.seachImpl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fms.dao.IFilmMapper;
import com.fms.pojo.film;
import com.fms.service.Impl.seachImpl.adaptee.FilmId;
import com.fms.service.SearchService;

public class FilmIdSearch extends SearchService {

    private FilmId filmId;

    public FilmIdSearch() {
        filmId = new FilmId();
    }

    @Override
    public Page<film> search(film f, IFilmMapper iFilmMapper, Long currentPage, Long size) {
       return filmId.searchById(f, iFilmMapper, currentPage, size);
    }
}
