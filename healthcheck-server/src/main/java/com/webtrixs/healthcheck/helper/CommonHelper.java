package com.webtrixs.healthcheck.helper;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;
 
 
 @Component
public class CommonHelper {
	
	private ResourceLoader resourceLoader;


	@Autowired
	public CommonHelper(ResourceLoader resourceLoader){
		this.resourceLoader = resourceLoader;
	}
 
 
public   String readRequestFileAsStr(String filePath) throws IOException{
	Resource resource =  resourceLoader.getResource("classpath:"+filePath)   ;  
	InputStream is = resource.getInputStream();
	//File file = ResourceUtils.getFile("classpath:"+filePath);
	
	
	/*  InputStream is = null;
      try {
                      is = new FileInputStream(file);
      } catch (FileNotFoundException e) {
                      // TODO Auto-generated catch block
                      e.printStackTrace();
      }*/
     String json = null;
      try {
    	  json = IOUtils.toString(is,StandardCharsets.UTF_8);
      } catch (IOException e) {
                      // TODO Auto-generated catch block
                      e.printStackTrace();
      }finally {
    	  if(is != null){
    		  is.close();  
    		  
    	  }
    	           
    	 // IOUtils.closeQuietly(is);
      }
      
                return json;
}
 
 
public   byte[] readRequestFileAsByte(String filePath) throws Exception {
               
                InputStream is = null;
                try {
                	Resource resource =  resourceLoader.getResource("classpath:"+filePath)   ;  
                	 is = resource.getInputStream();
                } catch (FileNotFoundException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }
                byte[] bytes = null;
                try {
                                bytes = IOUtils.toByteArray(is);
                } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }finally {
                	 if(is != null){
               		  is.close();  
               		  
               	  }
                }
                return bytes;
}
 
 
public   InputStream readRequestFileAsInputStream(String filePath) throws Exception {
                File file = null;
                
                InputStream is = null;
                try {
                	Resource resource =  resourceLoader.getResource("classpath:"+filePath)   ;  
                	 is = resource.getInputStream();
                } catch (FileNotFoundException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }finally {
               	 if(is != null){
              		  is.close();  
              		  
              	  }
               }
               
                return is;
}
 
 
}