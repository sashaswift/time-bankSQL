package com.example.timebanksql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.timebanksql.conService.SearchInformation;
import com.example.timebanksql.conService.ServiceInformation;

import java.util.List;

//用来访问数据库
public interface ServiceMapper extends BaseMapper<ServiceInformation> {
List<ServiceInformation> getByName(String name);

List<ServiceInformation>  getByID(String id);
List<ServiceInformation> getBySearch(SearchInformation searchInformation);

void deleteById(String id);
List<ServiceInformation> getAllService();
}
