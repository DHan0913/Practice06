package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	@Override
    public void execute(String str){
            
       if("앱".equals(str)){
            playApp();
       }else if ("음악".equals(str)){
    	   playMusic();
       } else {   
    	   super.execute(str);   
       }
                
       
  }
        
    //메소드작성
	protected void playApp(){
    System.out.println("앱실행");
	}


    //메소드작성
	@Override
	protected void playMusic(){
    System.out.println("다운로드해서 음악재생");
	}
    
}

