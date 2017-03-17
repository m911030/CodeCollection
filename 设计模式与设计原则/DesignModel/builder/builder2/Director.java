package DesignMode.DesignModel.builder.builder2;

/**
 * Created by han on 2017/3/2.
 */
public class Director {
    private Builder builder = new ConcreteProduct();
    //构建不同的产品
    public  Product getAProduct(){
        builder.setPart();
        /**
         * 设置不同的零件 产生不同的产品
         */
        return builder.buildProduct();
    }
}
