package federicocogoni.u5_w2_d2.controllers;


import federicocogoni.u5_w2_d2.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BlogController {

    @Autowired
    private BlogService bs;
}
