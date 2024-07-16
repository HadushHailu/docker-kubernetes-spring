package core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/search")
public class searchController {
    @Autowired
    private EngineUtils engineUtils;

    @GetMapping(value="/text/{search_key}")
    public ResponseEntity<?> searchText(@PathVariable String search_key){
        engineUtils.scrapingTheWeb(75);
        engineUtils.rankSearchResults(25);
        return new ResponseEntity<>("Your results", HttpStatus.OK);
    }

    @GetMapping(value="/photo/{search_key}")
    public ResponseEntity<?> searchPhoto(@PathVariable String search_key){
        engineUtils.scrapingTheWeb(400);
        engineUtils.rankSearchResults(100);
        return new ResponseEntity<>("Your results",HttpStatus.OK);
    }

}
