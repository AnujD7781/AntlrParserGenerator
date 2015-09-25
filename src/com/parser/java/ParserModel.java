/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parser.java;

/**
 *
 * @author anujdeshmukh
 */
public class ParserModel {
    private String element;
    private String contentAndCount;
    
    public String getparserElement () {
        return element;
    }
    public String getparserContentAndCount () {
        return contentAndCount;
    }
    public void setParserElement (String str) {
        element =  str;
    }
    public void setParserContentAndCount (String str) {
        contentAndCount = str;
    }
}
