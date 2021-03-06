package com.exaltpawarikanda.mssbrewery.controller;

import com.exaltpawarikanda.mssbrewery.model.BeerDto;
import com.exaltpawarikanda.mssbrewery.service.api.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 7/25/21
 */
@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId) ,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@Valid @RequestBody BeerDto beerDto){
       BeerDto savedBeer = beerService.createBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        //TODO add hostname to url
        headers.add("Location","/api/v1/beer/" + savedBeer.getId().toString());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId,@Valid @RequestBody BeerDto beerDto){

        beerService.updateBeer(beerId,beerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteById(beerId);

    }

}
