package br.com.smoreira.cloundcient1.controller;

import br.com.smoreira.cloundcient1.client.Cliente2FeignClinet;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    @Value("${client.param}")
    private String client2Param;

    @GetMapping("client/")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok(client2Param);
    }
}
