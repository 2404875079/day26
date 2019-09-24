package com.demo;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Test {
    @org.junit.Test
    public void Test1() {
        String json = "{name:'小明',age:12}";
        Json j = JSON.parseObject(json, Json.class);
        System.out.println(j);
    }

    @org.junit.Test
    public void Test2() {
        String json = "{name:'小刚',age:23,Score:{chineseScore:56,mathScore:75}}";
        Json json1 = JSON.parseObject(json, Json.class);
        System.out.println(json1);
    }
    @org.junit.Test
    public void Test3(){
        String s = "[{chineseScore:56,mathScore:75},{chineseScore:96,mathScore:36}]";
        List<Score> scores = JSON.parseArray(s, Score.class);
        for (Score sc:scores) {
            System.out.println(sc);
        }
    }
}