package br.com.joelton.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class PrimeiroController {

    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
