package com.mmall.common;

import com.google.common.collect.Sets;
import com.sun.org.apache.bcel.internal.generic.PUSH;

import java.util.Set;

/**
 * Created by KevinHuang on 2019/3/5.
 */
public class Const {
    public static final String CURRENT_USER = "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc","price_asc");
    }

    public interface Cart{
        int CHECKED =1;//选中状态
        int UN_CHECKED=0;//未选中
        String Limit_Num_FAIL = "Limit_Num_FAIL";
        String Limit_Num_SUCCESS = "Limit_Num_SUCCESS";
    }

    public interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1; //管理员
    }

    public enum ProductStatusEnum {
        ON_SALE(1,"在售");
        private int code;
        private String value;

        ProductStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }
    }

    public enum OrderStatusEnum{
        CANCELED(0,"已取消"),
        NO_PAY(10,"未支付"),
        PAID(20,"已付款"),
        SHIPPED(40,"已发货"),
        ORDER_SUCCESS(50,"订单完成"),
        ORDER_CLOSE(60,"订单关闭");

        private String value;
        private int code;

        OrderStatusEnum(int code,String value){
            this.code=code;
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }

    public interface AlipayCallback {
        String TRADE_STATUS_WAIT_BUYER_PAY="WAIT_BUYER_PAY";
        String TRADE_STATUS_TRADE_SUCCESS="TRADE_SUCCESS";
        String TRADE_STATUS_TRADE_FINISHED="TRADE_FINISHED";
        String TRADE_STATUS_TRADE_CLOSED="TRADE_CLOSED";

        String RESPONSE_SUCCESS="success";
        String RESPONSE_FAILED="failed";
    }

    public enum PayPlatformEnum{
        ALIPAY(1,"支付宝");


        PayPlatformEnum(int code,String value){
            this.code=code;
            this.value=value;
        }

        private String value;
        private int code;

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }

}
