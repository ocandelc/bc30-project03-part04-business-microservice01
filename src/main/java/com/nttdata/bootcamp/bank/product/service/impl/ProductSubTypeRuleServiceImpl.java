/**
 * Resumen.
 * Objeto                   : ProductSubTypeRuleServiceImpl.java
 * Descripción              : Clase de implementación de servicio para utilizar los métodos de CRUD.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 */
package com.nttdata.bootcamp.bank.product.service.impl;

import com.nttdata.bootcamp.bank.product.model.dao.inte.ProductSubTypeRuleDaoInte;
import com.nttdata.bootcamp.bank.product.model.document.ProductSubTypeRule;
import com.nttdata.bootcamp.bank.product.service.inte.ProductSubTypeRuleServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * Clase de implementación de servicio para utilizar los métodos de CRUD.
 */
@Service
public class ProductSubTypeRuleServiceImpl implements ProductSubTypeRuleServiceInte
{
    private static final Logger log = LoggerFactory.getLogger(ProductSubTypeRuleServiceInte.class);

    @Autowired
    private ProductSubTypeRuleDaoInte productDaoInte;

    @Override
    public Mono<ProductSubTypeRule> create(final ProductSubTypeRule product) {

        return productDaoInte.save(product)
                .doFirst(() -> log.info("Begin create Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish create Product"));
    }

    @Override
    public Flux<ProductSubTypeRule> readAll() {

        return productDaoInte.findAll()
                .doFirst(() -> log.info("Begin readAll Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish readAll Product"));
    }

    @Override
    public Mono<ProductSubTypeRule> findByCodeId(String codeProduct) {
        return productDaoInte.findById(codeProduct)
                .doFirst(() -> log.info("Begin findByCodeProduct Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish findByCodeProduct Product"));
    }

    @Override
    public Mono<ProductSubTypeRule> updateById(final String id, final ProductSubTypeRule product) {

        return productDaoInte.save(product)
                .doFirst(() -> log.info("Begin updateById Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish updateById Product"));
    }

    @Override
    public Mono<Void> deleteById(final String id) {

        return productDaoInte.deleteById(id)
                .doFirst(() -> log.info("Begin deleteById Product"))
                .doOnNext(a -> log.info(a.toString()))
                .doAfterTerminate(() -> log.info("Finish deleteById Product"));
    }

}