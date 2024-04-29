package com.exam.swaggerexam.controller.v2.api;

import com.exam.swaggerexam.dto.ImageDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class SwaggerV2Controller {
    @PostMapping("/postTest/{id}")
    public ResponseEntity<?> postTest(@RequestBody ImageDto imageDto) {
        System.out.println(imageDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getTest")
    @Operation(summary = "Test 조회 API", description = "Test를 조회하는 API 입니다.")
    public String getTest(@RequestBody @Validated ImageDto imageDto) {
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
