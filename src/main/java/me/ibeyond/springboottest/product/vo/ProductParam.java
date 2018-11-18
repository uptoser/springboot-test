package me.ibeyond.springboottest.product.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "商品参数:ProductParam")
public class ProductParam {
    @ApiModelProperty(value = "商品名称" ,name = "name" )
    private String name;
    @ApiModelProperty(value = "商品价格" ,name = "price" )
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;

    }

    @Override
    public String toString() {
        return "Product{" +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
