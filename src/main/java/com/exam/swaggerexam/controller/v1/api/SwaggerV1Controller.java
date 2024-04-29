package com.exam.swaggerexam.controller.v1.api;

import com.exam.swaggerexam.dto.ImageDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
public class SwaggerV1Controller {
    @PostMapping("/postTest")
    public ResponseEntity<?> postTest(@RequestBody ImageDto imageDto) {
        System.out.println(imageDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getTest")
    public String getTest() {
        return "getTest";
    }

    @PutMapping("/putTest")
    public ResponseEntity<?> putTest(@RequestBody ImageDto imageDto) {
        System.out.println(imageDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteTest")
    public ResponseEntity<?> deleteTest(@RequestBody ImageDto imageDto) {
        System.out.println(imageDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
