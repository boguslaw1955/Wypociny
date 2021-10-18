package fries.com.pl.komponenty.controller;

import fries.com.pl.komponenty.services.WypocinyServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WypocinyController
{
    @Autowired
    private final WypocinyServices wypocinyServices;

    @GetMapping("komponenty/hello")
    public String hello()
    {
        return "Hello Boguś";
    }
}
