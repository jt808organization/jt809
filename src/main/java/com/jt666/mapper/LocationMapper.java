package com.jt666.mapper;

import com.jt666.pojo.LocationBean;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LocationMapper {
    List<LocationBean> selectLocationByID(String simNumber);
}
