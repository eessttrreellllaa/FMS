package com.fms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fms.pojo.film;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IFilmMapper extends BaseMapper<film> {}
