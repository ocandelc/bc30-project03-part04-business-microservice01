/**
 * Resumen.
 * Objeto                   : ProductPersonRestController.java
 * Descripción              : Clase de controller para invocar los métodos con rest api.
 * Fecha de Creación        : 21/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Mario Vásquez.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 */
package com.nttdata.bootcamp.bank.product.controller;

import com.nttdata.bootcamp.bank.product.model.document.ProductPerson;
import com.nttdata.bootcamp.bank.product.service.impl.ProductPersonServiceImpl;
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
@RequestMapping("/api/productPerson")
public class ProductPersonRestController {
    private static final Logger log = LoggerFactory.getLogger(ProductPersonRestController.class);

    @Autowired
    private ProductPersonServiceImpl productPersonServiceInte;

    @PostMapping("create")
    public Mono<ProductPerson> create(@RequestBody final ProductPerson productPerson) {
        log.debug("Begin RestController create ProductPerson");
        return productPersonServiceInte.create(productPerson);
    }

    @GetMapping
    public Flux<ProductPerson> readAll() {
        log.debug("Begin RestController readAll ProductPerson");
        return productPersonServiceInte.readAll();
    }

    @GetMapping("findByid/{id}")
    public Mono<ProductPerson> findByCodeProductPerson(@PathVariable String codeProductPerson) {
        log.debug("Begin RestController findByCodeProductPerson ProductPerson");
        return productPersonServiceInte.findByCodeId(codeProductPerson);
    }

    @PutMapping("update/{id}")
    public Mono<ProductPerson> updateById(@RequestBody final ProductPerson productPerson, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById ProductPerson");
        return productPersonServiceInte.updateById(id, productPerson);
    }

    @DeleteMapping("delete/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById ProductPerson");
        return productPersonServiceInte.deleteById(id);
    }
}
