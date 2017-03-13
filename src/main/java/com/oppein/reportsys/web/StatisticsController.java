package com.oppein.reportsys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author chenjianqi
 * @date 2017/3/10
 * 功能描述：
 */
@Controller
@RequestMapping(value = "/service")
public class StatisticsController {
    @ResponseBody
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public HashMap depstat(){
        HashMap result = new HashMap();

        List<Integer> baomingkehu = new ArrayList<>();
        List<Integer> youxiaokehu = new ArrayList<>();
        List<Integer> liangchikehu = new ArrayList<>();
        List<Integer> chengjiaokehu = new ArrayList<>();
        List<Integer> liangchizhaunhualv = new ArrayList<>();
        List<Integer> chengxiaozhuanhualv = new ArrayList<>();
        for (int i = 0;i<10;i++){
            baomingkehu.add(i);
            youxiaokehu.add(i+1);
            liangchikehu.add(i+2);
            chengjiaokehu.add(i+3);
            liangchizhaunhualv.add(i+4);
            chengxiaozhuanhualv.add(i+5);
        }
        HashMap h2 = new HashMap();
        result.put("baomingkehu", baomingkehu);
        result.put("youxiaokehu", youxiaokehu);
        result.put("liangchikehu", liangchikehu);
        result.put("chengjiaokehu", chengjiaokehu);
        result.put("liangchizhaunhualv", liangchizhaunhualv);
        result.put("chengxiaozhuanhualv", chengxiaozhuanhualv);
        return result;
    }
    @ResponseBody
    @RequestMapping(value = "/index1",method = RequestMethod.GET)
    public String depstat2(){

        String json="{\"age\":30,\"name\":\"Michael\",\"baby\":[\"Lucy\",\"Lily\"]}";
        return json;
    }

}
