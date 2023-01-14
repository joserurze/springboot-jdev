package curso.api.rest.controller;

import org.hibernate.mapping.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//arquitetura rest
@RequestMapping(value = "/usuario")
public class IndexController {

    //Serviço Restful
    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity init(@RequestParam(value = "nome",required = true,defaultValue = "nome não informado")
                                   String nome,@RequestParam(value = "salario" ) Long salario){
        System.out.println("Parametro sendo recebido "+nome);
        return new ResponseEntity("olá Usuario Rest Spring Boot seu nome é: "
                + nome+" e o seu salario é: "+salario, HttpStatus.OK);
       }
}
