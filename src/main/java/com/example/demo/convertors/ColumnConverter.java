package com.example.demo.convertors;

import com.demo.api.rest.models.RestColumn;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class ColumnConverter implements Converter<String, RestColumn> {

    private final ObjectMapper jsonMapper = new ObjectMapper();

    public RestColumn convert(String source) {
        try {
            return jsonMapper.readValue(source, RestColumn.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}