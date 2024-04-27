package com.example.fourfun;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SmileController {
    @Autowired
    SmileService js;
    Date Date_of_Delivery=new Date();
    
    @PostMapping("/smile")
    public ResponseEntity<Smile> adddata(@RequestBody Smile j)
    {
        try 
        {
        Smile obj=js.create(j);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }
    catch(Exception e)
    {
            return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);
            
        }
    }

    @GetMapping("/smile")
    public List<Smile> getAllSmiles() {
        return js.getAllJob();
    }

    @PutMapping("/smile/{sId}")
    public ResponseEntity<Smile> putMethod(@PathVariable("sId") int sId,@RequestBody Smile pd)
    {
        if(js.updateDetails(sId,pd) == true)
        {
            return new ResponseEntity<>(pd,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/smile/{sId}")
    public ResponseEntity<Boolean> delete(@PathVariable("sId") int sId)
    {
        if(js.deleteJob(sId) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

    
}