/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author EduardoZetina
 */
public class ProductLine {
    
    private String strLine;
    private String strFile;
    private String strFileTyp;
    
    public ProductLine(String strLine, String strFile, String strFileTyp){
        this.strLine = strLine;
        this.strFile = strFile;
        this.strFileTyp = strFileTyp;
        
    }
    
    public String getstrLine(){
        return strLine;
    }
    
    public void setstrLine(){
        this.strLine = strLine;
    }
    
    public String getstrFile(){
        return strFile;
    }
    
    public void setstrFile(){
        this.strFile = strFile;
    }
        
    
    public String getstrFileTyp(){
        return strFileTyp;
    }
    
    public void setstrFileTyp(){
        this.strFileTyp = strFileTyp;
    }

}

