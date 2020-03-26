package com.founder.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private  String code;
    private  String message;
    private  T data;
    private  String ww;
    public  CommonResult(String code,String message){

        this(code,message,null,null);
    }

}
