package kang.demo.demo.controller;

import kang.demo.demo.util.ResponseResult;
import kang.demo.demo.vo.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;

@Controller
public class FileController {

    @PostMapping("/file")
    @ResponseBody
    public Object returnFile(@RequestParam(value = "file",required = false)  MultipartFile file){
        String OriginalFilename=file.getOriginalFilename();
        // 为了防止重名覆盖，获取系统时间戳+原始文件的后缀名
        String fileName=System.currentTimeMillis()+"."+OriginalFilename.substring(OriginalFilename.lastIndexOf(".")+1);
        // 设置保存地址（这里是转义字符）
        //1.后台保存位置
        String path = "C:\\images\\";
        File dest=new File(path+fileName);
        String imgUrl = "/file/"+fileName;

        // 判断文件是否存在
        if(!dest.getParentFile().exists()){
            // 不存在就创建一个
            dest.getParentFile().mkdirs();
        }
        try {
            // 后台上传
            file.transferTo(dest);
            return new ResponseResult(200,"图片成功上传",fileName,imgUrl);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseResult.fail();
        }

    }
}
