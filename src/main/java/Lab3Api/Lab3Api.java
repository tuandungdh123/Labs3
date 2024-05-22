package Lab3Api;

import Entity.KhachHang;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Lab3Api {
    @GetMapping("/getKhachHangInformation")
    public ResponseEntity<?> doGetUserInformation(KhachHang user){
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Call api succes");
        result.put("status", true);
        result.put("data", user);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/getKhachHangInformation")
    public ResponseEntity<?> doPostUserInformation(@RequestBody KhachHang user){
        Map<String, Object> result = new HashMap<>();
        result.put("message", "Call api succes");
        result.put("status", true);
        result.put("data", user);
        return ResponseEntity.ok(result);
    }
}
