package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.util.ConfigUtil;

@Controller
public class UploadFileController{

    private Logger logger = Logger.getLogger(UploadFileController.class);
    
    @RequestMapping("uploadFile/{file_type}") 
    public void uploadFile(@PathVariable("file_type") String file_type, 
    		HttpServletRequest request, Writer writer) throws IOException{

    	//上传文件的保存路径
        String savePath = request.getSession().getServletContext().getRealPath("/" + ConfigUtil.UPLOAD_DIR + file_type);
        File folder = new File(savePath);
        if( !folder.exists() ) 
        	folder.mkdirs();
        logger.info(savePath); 
        
        
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Iterator<String> fileNames = multipartRequest.getFileNames();       		    
        while(fileNames.hasNext()){
        	//获取文件
        	MultipartFile multipartFile = multipartRequest.getFile(fileNames.next());
        	
	        //获取文件名
	        String uploadifyFileName = multipartFile.getOriginalFilename();
	        
	        //获取文件后缀
	        String newSuffix = ""; 
	        if( ( uploadifyFileName != null) && ( uploadifyFileName.length() > 0 ) )  
	        {  
	            int dot = uploadifyFileName.lastIndexOf(".");  
	            if( dot >= 0 )   
	                 newSuffix = uploadifyFileName.substring(dot);   
	        }  
	        
	        //生成文件名
	        String file_name = UUID.randomUUID().toString() + newSuffix;
	        String file_url = savePath + "\\" + file_name;
	        logger.info(file_url);
	        
	        //上传文件
	        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file_url));
	
	        bos.write(multipartFile.getBytes());  
	        bos.close();  
	
	        String relativePath = ConfigUtil.UPLOAD_DIR + file_type + "/" + file_name;
		    writer.write(relativePath);
        }
 
    }  
      
}
