package com.jt666.serviceimpl;


import com.jt666.mapper.LocationMapper;
import com.jt666.pojo.LocationBean;
import com.jt666.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImpl implements LocationService {
  @Autowired
  LocationMapper locationMapper;
/**
 *功能描述:查询位置信息
 * 创建人: 陈烙
 * 时间:2019/4/3 11:14
 * @param [simNumber]
 * @return java.util.List<com.jt666.pojo.LocationBean>
 */

    @Override
    public List<LocationBean> selectLocationByID(String simNumber) {
        return locationMapper.selectLocationByID(simNumber);
    }
}
