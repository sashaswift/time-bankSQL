package com.example.timebanksql.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.timebanksql.conService.ServiceInformation;
import com.example.timebanksql.mapper.ServiceMapper;
import com.example.timebanksql.service.IPoiService;
import org.springframework.stereotype.Service;

@Service
public class PoiServiceImpl extends ServiceImpl<ServiceMapper, ServiceInformation> implements IPoiService {
}
