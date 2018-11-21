package com.apress.quickpoll.controller

import groovy.util.logging.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@Slf4j
class HomeController {

    @RequestMapping("/")
    ModelAndView home() {
        log.warn('***********************home()')
         return  new ModelAndView("home")
    }
}
