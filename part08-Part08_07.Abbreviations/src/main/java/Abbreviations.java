
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Abbreviations {
    private HashMap<String, String> abbrev;
    private String abbreviation;
    private String explanation;
    
    public Abbreviations(){
        this.abbrev = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviation = abbreviation;
        this.explanation = explanation;
        
        abbrev.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        boolean hasAbbreviation;
        if (this.abbrev.containsKey(abbreviation)){
            hasAbbreviation = true;
        }else{
            hasAbbreviation = false;
        }
        
        return hasAbbreviation;
    }
    
    public String findExplanationFor(String abbreviation){
        String s = abbrev.get(abbreviation);
        return s;
    }
    
    
    
}
