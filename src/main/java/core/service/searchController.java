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

    @GetMapping(value="/{num}")
    public ResponseEntity<?> searchText(@PathVariable int num){
        long result = 1;
        for (int i = 1; i <= num; i++) {
            for(int j=0; j<= num; j++){
                result *= i;
            }
        }
        return new ResponseEntity<>("[+] your results are: ********** " + result + " ********", HttpStatus.OK);
    }
}
