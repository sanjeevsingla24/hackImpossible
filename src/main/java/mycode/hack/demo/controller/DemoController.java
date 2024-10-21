package mycode.hack.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Operation(summary = "Get demo message", description = "Returns a demo message with a 200 OK response")
    @GetMapping
    public ResponseEntity<String> getDemo() {
        return ResponseEntity.ok("Hello from DemoController!");
    }
}
