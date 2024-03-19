package com.example.timebanksql.controllers;

import com.example.timebanksql.conService.SearchInformation;
import com.example.timebanksql.conService.ServiceInformation;
import com.example.timebanksql.mapper.ServiceMapper;
import com.example.timebanksql.service.IPoiService;
import com.example.timebanksql.vo.Result;
import com.example.timebanksql.vo.ServiceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController //返回rest风格的值
@RequestMapping("/service")//兴趣点,可用来调用类
@Slf4j//可用来在终端打印数据
public class ServiceCotroller {

    @Autowired//自动实例化创建对象
    private IPoiService poiService;

    @Autowired
    private ServiceMapper serviceMapper;

    @GetMapping ("/getallservicebyname")//可用来调用方法
    public Result GetAllServiceByName( String name){
  //用list添加类
        List<ServiceInformation> serviceInformationList=serviceMapper.getByName(name);
        List voList=new ArrayList();

        for(ServiceInformation serviceInformation:serviceInformationList){
            ServiceVo serviceVo=new ServiceVo();
            BeanUtils.copyProperties(serviceInformation,serviceVo);
            voList.add(serviceVo);
        }
        return Result.success(voList);
    }

    @PostMapping ("/getallservicebysearch")//可用来调用方法
    public Result GetAllServiceBySearch(@RequestBody SearchInformation searchInformation){
        //用list添加类

        List<ServiceInformation> serviceInformationList=serviceMapper.getBySearch(searchInformation);
        List voList=new ArrayList();

        for(ServiceInformation serviceInformation:serviceInformationList){
            ServiceVo serviceVo=new ServiceVo();
            BeanUtils.copyProperties(serviceInformation,serviceVo);
            if(serviceInformation.status.equals("未开始")) {
                voList.add(serviceVo);
            }
        }
        return Result.success(voList);
    }

    @GetMapping("/getallservice")
    public Result GetAllService(){
        List<ServiceInformation> serviceInformationList=serviceMapper.getAllService();
        List voList=new ArrayList();

        for(ServiceInformation serviceInformation:serviceInformationList){
            ServiceVo serviceVo=new ServiceVo();
            BeanUtils.copyProperties(serviceInformation,serviceVo);
            if(serviceInformation.status.equals("未开始")) {
                voList.add(serviceVo);
            }
        }
        return Result.success(voList);
    }

    @GetMapping("/getallservicetocheck")
    public Result GetAllServiceToCheck(){
        List<ServiceInformation> serviceInformationList=serviceMapper.getAllService();
        List voList=new ArrayList();

        for(ServiceInformation serviceInformation:serviceInformationList){
            ServiceVo serviceVo=new ServiceVo();
            BeanUtils.copyProperties(serviceInformation,serviceVo);
            if(serviceInformation.status.equals("待审核")) {
                voList.add(serviceVo);
            }
        }
        return Result.success(voList);
    }

    @GetMapping("/getallservicebyid")
    public Result GetAllServicedById( String id){
        List<ServiceInformation> serviceInformationList=serviceMapper.getByID(id);
        List voList=new ArrayList();

        for(ServiceInformation serviceInformation:serviceInformationList){
            ServiceVo serviceVo=new ServiceVo();
            BeanUtils.copyProperties(serviceInformation,serviceVo);
            voList.add(serviceVo);
        }
        return Result.success(voList);
    }//返回类，会自动转换为JSON

    @PostMapping("/insertservice")
    public Result InsertService(@RequestBody ServiceInformation serviceInformation ){
        long times=System.currentTimeMillis();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        long oriId=0-times;
        //String date_string=sdf.format(new Date(times));
        String newId=oriId+" ";
        serviceInformation.setId(newId);
        serviceInformation.setStatus("待审核");
        poiService.save(serviceInformation);
        ServiceVo serviceVo=new ServiceVo();
        BeanUtils.copyProperties(serviceInformation,serviceVo);
         return Result.success(serviceVo);
    }

    @PutMapping("/update")
    public Result Update(@RequestBody ServiceInformation serviceInformation/*,@PathVariable String id*/){
        //serviceInformation.setId(id);
        poiService.updateById(serviceInformation);
        return Result.success();
    }//@PathVariable(即从连接处获得参数，无需加？)

    @DeleteMapping("/deleteservice")
    public Result DeleteService(String id){
        serviceMapper.deleteById(id);
        if(id!=null) {
            return Result.success(1111111);
        }
        else{
            return Result.success("222222");
        }
    }





}
