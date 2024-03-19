package com.example.timebanksql.vo;

public class Result<T> {
    public int code;
    public String msg;
    public T data;

    public static <T> Result success(){
        Result r=new Result("suc",0,null);

        return r;
    }//可直接返回成功，在更新，增加和删改时
    public static <T> Result success(T data){
        Result r=new Result("suc",0,data);
        return r;
    }

    private Result(String msg,int code,T data){
        this.msg=msg;
        this.data=data;
        this.code=code;
    }
}
