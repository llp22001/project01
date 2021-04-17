package com.atguigu.bean;

import javafx.scene.control.SpinnerValueFactory;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Joost-Li
 * @date 2021/4/17-13:31
 **/
/*
* 常用模板：
* 模板一：psvm    main方法
* */
public class TempleteTest {
//    模板六：prsf  可生成 private static final
    private static final Customer cust = new Customer();
//    變形：psf
    public static final int num=10;
//    變形psfi
    public static final int count=20;
//    變形：psfs
    public static final String SEX="";
//模板一main方法    psvm
    public static void main(String[] args) {
        int num=10;
//    模板二：輸出 sout
        System.out.println();
//     變形：soutp/soutm/soutv/xxx/out
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TempleteTest.main");
        System.out.println("args = " + args);
        System.out.println(num);
//        模板三：fori
        String[] arr = new String[]{"TOM","LiLei","HanMeiMei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
//         變形：iter,增強for循環
        for (String s : arr) {
            System.out.println("s = " + s);

        }
//        模板四：list
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        for (Object o : list) {
            
        }
//        變形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
//        變形：list.forr 倒序遍歷
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
    public   void method(){
//      模板五ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(456);
        if (list == null) {
            
        }
//        變形：inn
        if (list != null) {
            
        }
//      變形：xxx.nn /xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
