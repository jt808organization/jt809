package com.jt666.service;

import com.jt666.pojo.LocationBean;

import java.util.List;

public interface LocationService {
    /**
     * @return
     * @author cl
     */
    List<LocationBean> selectLocationByID(String simNumber);

}
