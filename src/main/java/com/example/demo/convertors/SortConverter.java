package com.example.demo.convertors;

import com.demo.api.rest.models.RestSort;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class SortConverter implements Converter<String, RestSort> {

    private final ObjectMapper jsonMapper = new ObjectMapper();

    public RestSort convert(String source) {
        try {
            return jsonMapper.readValue(source, RestSort.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}