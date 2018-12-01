package com.example.demorahul;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class AddService {

    public Result add(Integer a, Integer b) {
        Result result = new Result();
        result.setA(a);
        result.setB(b);
        result.setResult(a+b);

        return result;
    }
}
