package com.sangeng.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class PathUtils {
    public static String generateFilePath(String fileName) {
        //根据日期生成路径  2022/1/15/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
        String datePath = sdf.format(new Date());

        //UUID作为文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");

        //获取文件后缀
        int index = fileName.lastIndexOf(".");
        // test.jpg -> .jpg
        String fileType = fileName.substring(index);
        return new StringBuffer().append(datePath).append(uuid).append(fileType).toString();
    }
}
