package core.service;

import org.springframework.stereotype.Component;


public class EngineUtils {

    public int factorial(int num){
        //System.out.println("factorial" + num);
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public void scrapingTheWeb(int num){
        System.out.println(num);
        int res = factorial(num);
        System.out.println(res);
    }

}
