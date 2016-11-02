/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;

/**
 *
 * @author Acer 4738
 */
public class FileExtension extends File{

    public FileExtension(String filePath) {
        super(filePath);
    }
    public FileExtension(File file) {
        super(file.getPath());
    }
    
    public static String getExtension(File f){
        String fileName=f.getName();
        int dotIndex=fileName.lastIndexOf(".");
        String ext="";
        if(dotIndex>=0)
            ext=fileName.substring(dotIndex);
        return ext.toLowerCase();     
    }
    
    public static boolean checkExtension(File f, String... ext){
        for(String temp:ext){            
            if(getExtension(f).toLowerCase().equals(temp)){                
                return true;
            }                
        }
        return false;
    }
}
