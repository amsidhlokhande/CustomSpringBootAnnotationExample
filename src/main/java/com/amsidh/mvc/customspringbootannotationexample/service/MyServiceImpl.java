package com.amsidh.mvc.customspringbootannotationexample.service;

import com.amsidh.mvc.customspringbootannotationexample.annotation.Workflow;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Workflow(editable = true, instructions = "Sales Expense Claim Form", name = "Expense Claim")
public class MyServiceImpl implements MyService {
    @Override
    public void show(String message) {
        log.info(message);
    }
}
