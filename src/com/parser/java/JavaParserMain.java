package com.parser.java;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;





public class JavaParserMain  {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JavaParserMain.init();
	}
	
	
	public static void init() throws Exception {
        // Read the source

        CharStream c = new ANTLRFileStream("/Users/anujdeshmukh/Desktop/trial.java");
        FileReader fReader;
        fReader = new FileReader("/Users/anujdeshmukh/Desktop/trial.java");
        BufferedReader reader = new BufferedReader(fReader);
        String cursor; // 
        String content = "";
        int lines = 0;
        int words = 0;
        int chars = 0;
        while((cursor = reader.readLine()) != null){
            // count lines
            lines += 1;
            content += cursor;

        }
        chars = content.length();
        // create the lexer attached to stdin
        JavaLexer lexer = new JavaLexer(c);

        // create the buffer of tokens between the lexer and parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        
    	Set<String> titles = new HashSet<String>();
    	parser.compilationUnit();
    	
    	
    	int keywordCtUnique=0;
    	//int keywordCt=0;
    	int spcialCharCt = 0;
    	
    	
    	titles.removeAll(titles);
    	for(String str : lexer.arrSpecialCharacter) {
    		 if( titles.add( str)) {
        		 //System.out.println("keyword is " + token.getText());
    			 spcialCharCt++;
     	    }
    	}
    	titles.removeAll(titles); 
    	for(String str : lexer.arrKeywords) {
   		 if( titles.add( str)) {
       		 //System.out.println("keyword is " + token.getText());
   			keywordCtUnique++;
    	    }
   	}
    	System.out.println("_---------------------------------------------------------------");
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
    	System.out.println("Comment count :"+chars);
    	
	}
	
	
	
}
