package com.robot.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class CatalogComponent {

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取");
    }

    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加");
    }

    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取及格");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}
