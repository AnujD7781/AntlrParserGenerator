/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parser.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author anujdeshmukh
 */
public class ParserHelper {
    
    JavaLexer lexer;// = new JavaLexer(c);
        ArrayList<ParserModel> arrHelper = new ArrayList();
        private int chars = 0;
        private int keywordCtUnique=0;
    	//int keywordCt=0;
    	private int spcialCharCt = 0;
        private String strFilePath;
        // create the buffer of tokens between the lexer and parser
        CommonTokenStream tokens;// = new CommonTokenStream(lexer);
        JavaParser parser;// = new JavaParser(tokens);
        public void initWithFileName (String str) throws IOException {
        CharStream c = new ANTLRFileStream(str);
        
strFilePath = str;
        // create the lexer attached to stdin
         lexer = new JavaLexer(c);
        // create the buffer of tokens between the lexer and parser
         tokens = new CommonTokenStream(lexer);
         parser = new JavaParser(tokens);
    	parser.compilationUnit();
        parser.compilationUnit();
        FileReader fReader;
        fReader = new FileReader(str);
        BufferedReader reader = new BufferedReader(fReader);
        String cursor; // 
        String content = "";
        
        while((cursor = reader.readLine()) != null){
          
            content += cursor;

        }
        
    	Set<String> keywords = new HashSet<String>();
        Set<String> specialCharacters = new HashSet<String>();
    	parser.compilationUnit();
    	
    	
        
        
    	for(String str1 : lexer.arrSpecialCharacter) {
    		 if( specialCharacters.add( str1)) {
    			 spcialCharCt++;
     	    }
    	}
    	
    	for(String str2 : lexer.arrKeywords) {
   		 if( keywords.add( str2)) {
   			keywordCtUnique++;
    	    }
   	}
        chars = content.length();
    	System.out.println("_---------------------------------------------------------------");
        
        
        
        Set<String> ConstArr = new HashSet<String>();
       for(String strConst : parser.arrConst) {
   		 if( ConstArr.add(strConst)) {
       		 //System.out.println("keyword is " + token.getText());
   			 //spcialCharCt++;
    	    }
   	}
        
        chars = content.length();
    	System.out.println("_---------------------------------------------------------------");
        
        
        
        ParserModel modelPackageName = new ParserModel();
        //PackageName
        modelPackageName.setParserElement("PackageName");
        modelPackageName.setParserContentAndCount(parser.strPackageName);
        arrHelper.add(modelPackageName);
        
        ParserModel modelClassName = new ParserModel();
        modelClassName.setParserElement("ClassName");
        modelClassName.setParserContentAndCount(parser.strClassName);
        arrHelper.add(modelClassName);
        
        ParserModel modelUniqueUID = new ParserModel();
        modelUniqueUID.setParserElement("Total UID Count");
        modelUniqueUID.setParserContentAndCount(String.valueOf(parser.UIDTTTT));
        arrHelper.add(modelUniqueUID);
        
        ParserModel modelUID = new ParserModel();
        modelUID.setParserElement("Unique UID Count");
        modelUID.setParserContentAndCount(String.valueOf(parser.uniqueUIDCount));
        arrHelper.add(modelUID);
        
        ParserModel modelSpecialCharCount = new ParserModel();
        modelSpecialCharCount.setParserElement("Special Character Count");
        modelSpecialCharCount.setParserContentAndCount(String.valueOf(lexer.arrSpecialCharacter.size()));
        arrHelper.add(modelSpecialCharCount);
        
        ParserModel modelUniqueSpecialChar = new ParserModel();
        modelUniqueSpecialChar.setParserElement("Unique Special Character Count");
        modelUniqueSpecialChar.setParserContentAndCount(String.valueOf(spcialCharCt).concat(" -> ").concat(specialCharacters.toString()));
        arrHelper.add(modelUniqueSpecialChar);
        
        ParserModel modelConstCount = new ParserModel();
        modelConstCount.setParserElement("Constant Counts");
        modelConstCount.setParserContentAndCount(String.valueOf(parser.constCount));
        arrHelper.add(modelConstCount);
              
        ParserModel modelUniqueConstCount = new ParserModel();
        modelUniqueConstCount.setParserElement("Unique Constant Counts");
        modelUniqueConstCount.setParserContentAndCount(String.valueOf(ConstArr.size()).concat(" -> ").
                concat(ConstArr.toString()));
        arrHelper.add(modelUniqueConstCount);
        
        ParserModel modelKeywordCount = new ParserModel();
        int count = lexer.arrKeywords.size() + parser.arrKeyword.size();
        modelKeywordCount.setParserElement("Keyword count and Content");
        ArrayList <String> strArray = new ArrayList();
        
            strArray.addAll(lexer.arrKeywords);
            strArray.addAll(parser.arrKeyword);
        
        modelKeywordCount.setParserContentAndCount(String.valueOf(String.valueOf(strArray.size()).concat(" -> ").concat(String.valueOf(strArray.toString()))));
        arrHelper.add(modelKeywordCount);
        
        for(String str2 : strArray) {
   		 if( keywords.add( str2)) {
   			keywordCtUnique++;
    	    }
   	}
        ParserModel modelKeywordUnique = new ParserModel();
        modelKeywordUnique.setParserElement("Keyword Unique Count and Content");
        modelKeywordUnique.setParserContentAndCount(String.valueOf(keywordCtUnique).concat(" -> ").concat(String.valueOf(keywords.toString()    )));
        arrHelper.add(modelKeywordUnique);
        
        ParserModel modelCommentCount1 = new ParserModel();
        //modelWhiteSpace.setParserElement("WhiteSpace Char Count");
        modelCommentCount1.setParserElement("Comment to total characters ");
        modelCommentCount1.setParserContentAndCount(String.valueOf(lexer.lineCommentCount));
        arrHelper.add(modelCommentCount1);
        
        ParserModel modelCommentCount = new ParserModel();
        //modelWhiteSpace.setParserElement("WhiteSpace Char Count");
        float whiteSpacePerc1 = (float) (lexer.lineCommentCount)/chars * 100;
        modelCommentCount.setParserElement("Comment to total characters percentage");
        modelCommentCount.setParserContentAndCount(String.valueOf(whiteSpacePerc1).concat("%"));
        arrHelper.add(modelCommentCount);
        
        /*ParserModel modelTotalChar = new ParserModel();
        modelTotalChar.setParserElement("Total Char Count");
        modelTotalChar.setParserContentAndCount(String.valueOf(chars));
        arrHelper.add(modelTotalChar);*/
        ParserModel modelWhiteSpace1 = new ParserModel();
        modelWhiteSpace1.setParserElement("WhiteSpace total count");
        modelWhiteSpace1.setParserContentAndCount(String.valueOf(lexer.whiteSpaceCount));
        arrHelper.add(modelWhiteSpace1);
        System.out.println("---------------------------- " + arrHelper.size());
        ParserModel modelWhiteSpace = new ParserModel();
        modelWhiteSpace.setParserElement("WhiteSpace to total characters percentages");
        float whiteSpacePerc = (float)(lexer.whiteSpaceCount)/chars * 100;
        modelWhiteSpace.setParserContentAndCount(String.valueOf(whiteSpacePerc).concat("%"));
        arrHelper.add(modelWhiteSpace);
        System.out.println("---------------------------- " + arrHelper.size());
        
    	System.out.println("Package name is " + parser.strPackageName);
    	System.out.println("Class name is " + parser.strClassName);
    	System.out.println("unique uid count is " + parser.uniqueUIDCount);
    	System.out.println("uid count is " + parser.uidCount);
        System.out.println("spacial Character Count is " + lexer.specialCharCount);
        System.out.println("Unique Special Character " + spcialCharCt);
        
    	System.out.println("Constant Count " + parser.constCount);
    	System.out.println("keywordCt is " + lexer.arrKeywords.size());
    	System.out.println("Unique keywordCt is " +keywordCtUnique);
    	System.out.println("Keywords are :"+lexer.arrKeywords);
    	System.out.println("Line Comment :"+ lexer.lineCommentCount);
    	System.out.println("Character count :"+ chars);
                
    }
    public ArrayList<ParserModel> getDataForPackage() {
        return arrHelper;
    } 
    public String getPackageName() {
        return parser.strPackageName;
    }
    public String getFilePath() {
        return strFilePath;
    }
    public String getClassName() {
        return parser.strClassName;
    }
    public int getClassCount() {
        return parser.classCount;
    }
    public int getUIDCount() {
        return parser.uidCount;
    }
    public int getConstCount() {
        return parser.constCount;
    }
    public int getKeywordCount() {
        return parser.keyWordCount;
    }
    public int getSpacialCharCount() {
        return lexer.specialCharCount;
    }
    public int getWhiteSpaceCount() {
        return lexer.whiteSpaceCount;
    }
    public int getCommentCharCount() {
        return lexer.lineCommentCount;
    }  
    public int getTotalCharCount() {
        return chars;
    }  
    public int getUniqueUIDCount() {
        return parser.uniqueUIDCount;
    }
    public int getUniqueConstCount() {
        return parser.constCount;
    }
    public int getUniqueKeywordCount() {
        return keywordCtUnique;
    }
    public int getUniqueSpacialCharCount() {
        return spcialCharCt;
    } 
    
}
