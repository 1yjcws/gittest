package com.demo;

public class Resoult {
    private int code;
    private String string;
    private Object data;

    public Resoult(int code, String string, Object data) {
        this.code = code;
        this.string = string;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Resoult susses(String mgs, Object data){
        return new Resoult(1,mgs,data);
    }
    public Resoult(){

    }
    public static  Resoult susses(String mgs){
        return  new Resoult(1,mgs,null);
    }
    public  static  Resoult error(String mgs){
        return new Resoult(0,mgs,null);
    }
}
