package com.comments.client;

import com.comments.dto.SeriesDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(name = "TVSERIES-SERVICE")
public interface SeriesClient {

    @GetMapping("/tvseries")
    List<SeriesDTO> getAll();

    @GetMapping("/tvseries")
    SeriesDTO get(@RequestParam(value = "seriesId") int id);

}