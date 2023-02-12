package com.example.demo.controller;

import com.demo.api.rest.TestApi;
import com.demo.api.rest.models.RestColumn;
import com.demo.api.rest.models.RestGetAll200Response;
import com.demo.api.rest.models.RestSort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TestController implements TestApi {

    @Override
    public ResponseEntity<RestGetAll200Response> getAll(String languageCode, RestSort sort, List<RestColumn> columns, Integer page, Integer pageSize){

        System.out.println("languageCode:- " + languageCode);
        System.out.println("columns:- " + columns);
        System.out.println("page:- " + page);
        System.out.println("pageSize:- " + pageSize);
        System.out.println("sort:- " + sort);

        return ResponseEntity.ok(null);
    }

}
