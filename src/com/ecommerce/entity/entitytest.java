package com.ecommerce.entity;

public class entitytest {
    public static void main(String[] args){
        Product book1=new Book();
        /*
        重要概念：这里可以创建Book类引用，Book book1=new Book() 而不是Product类引用，后面使用book子类独有方法就不用强制转换了
        在order包里用了多态，是创建的Product引用，原因是对多种商品，要父类引用可以指向子类对象
        多态的优势是后续的方法只用关心父类引用即可，若新增了商品对象种类，无需修改方法。劣势是父类对象无法使用子类的方法
        */
        book1.setName("书名");
        book1.setPrice(88.5);
        ((Book)book1).setAuthor("张三");
         // 强制转换为Book类型，调用特有的setAuthor()
        System.out.println("书籍名称：" + book1.getName());       // 输出：Java编程思想
        System.out.println("书籍作者：" + ((Book) book1).getAuthor()); // 输出：Bruce Eckel
    }
}
