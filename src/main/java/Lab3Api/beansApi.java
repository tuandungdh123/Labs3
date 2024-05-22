package Lab3Api;


import beans.Schoolinformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java5-b4/bean")

public class beansApi {
    @Autowired
    Schoolinformation schoolinformation;
    @GetMapping("/getSchoolInformation")
    public ResponseEntity<?> doGetgetSchoolInformation(){

//        Schoolinformation schoolinformation = new Schoolinformation();
//        schoolinformation.setFullname("FPT Polytechnic");
//        schoolinformation.setLocation("TP.HCM");
        return ResponseEntity.ok(schoolinformation);
    }
}
