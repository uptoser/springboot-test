package me.ibeyond.springboottest.test2.model;

import io.swagger.annotations.ApiModelProperty;

public class Test {
    @ApiModelProperty(value = "ID")
    private String id;
    @ApiModelProperty(value = "名称" ,name = "name" )
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Test{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
