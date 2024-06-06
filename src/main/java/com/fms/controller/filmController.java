package com.fms.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fms.pojo.film;
import com.fms.service.FilmService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/film")
public class filmController {

    @Resource
    private FilmService filmService;

    /**
     * 分页获取全部的电影
     */
    @GetMapping("/allFilms/{page}/{size}")
    public Page<film> getAllFilms(@PathVariable(value = "page") Long page, @PathVariable(value = "size") Long size) {
        return filmService.queryPageFilm(page, size);
    }
}
