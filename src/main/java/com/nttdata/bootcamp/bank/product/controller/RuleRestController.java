/**
 * Resumen.
 * Objeto                   : RuleRestController.java
 * Descripción              : Clase de controller para invocar los métodos con rest api.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 */
package com.nttdata.bootcamp.bank.product.controller;

import com.nttdata.bootcamp.bank.product.model.document.Rule;
import com.nttdata.bootcamp.bank.product.service.impl.RuleServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * Clase de controller para invocar los métodos con rest api.
 */
@RestController
@RequestMapping("/api/rulecontroller")
public class RuleRestController
{
    private static final Logger log = LoggerFactory.getLogger(RuleRestController.class);

    @Autowired
    private RuleServiceImpl CurrencyTypeServiceInte;

    @PostMapping("create")
    public Mono<Rule> create(@RequestBody final Rule product) {
        log.debug("Begin RestController create Product");
        return CurrencyTypeServiceInte.create(product);
    }

    @GetMapping
    public Flux<Rule> readAll() {
        log.debug("Begin RestController readAll Product");
        return CurrencyTypeServiceInte.readAll();
    }

    @GetMapping("findByid/{id}")
    public Mono<Rule> findByCodeProduct(@PathVariable String codeProduct) {
        log.debug("Begin RestController findByCodeProduct Product");
        return CurrencyTypeServiceInte.findById(codeProduct);
    }

    @PutMapping("update/{id}")
    public Mono<Rule> updateById(@RequestBody final Rule product, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Product");
        return CurrencyTypeServiceInte.updateById(id, product);
    }

    @DeleteMapping("delete/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Product");
        return CurrencyTypeServiceInte.deleteById(id);
    }

}