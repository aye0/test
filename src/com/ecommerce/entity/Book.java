//新建子类，继承父类Product

package com.ecommerce.entity;

public class Book extends Product {
    private String author;

    public void setAuthor(String authorshili){
        this.author=authorshili;
    }

    public String getAuthor( ){
        return author;
    }

}

//这块要试一下author加到构造方法该怎么写，怎么用