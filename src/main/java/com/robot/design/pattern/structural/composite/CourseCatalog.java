package com.robot.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent {

    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    private List<CatalogComponent> catalogComponentList =  new ArrayList<>();

    public String getName(CatalogComponent catalogComponent){
        return this.name;
    }

    public void add(CatalogComponent catalogComponent){
        catalogComponentList.add(catalogComponent);
    }

    public void print(){
        System.out.println(name);

        for (CatalogComponent catalogComponent : catalogComponentList) {
                for(int  i = 0; i < this.level; i++){
                    System.out.print("  ");
                }
            catalogComponent.print();
        }

    }
}
