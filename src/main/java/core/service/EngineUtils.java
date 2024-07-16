package core.service;

import org.springframework.stereotype.Component;

@Component
public class EngineUtils {
    public void scrapingTheWeb(int time){
        try{
            Thread.sleep(time);
        }catch(Exception e){

        }
    }

    public void rankSearchResults(int time){
        try{
            Thread.sleep(time);
        }catch(Exception e){

        }
    }
}
