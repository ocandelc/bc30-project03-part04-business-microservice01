/**
 * Resumen.
 * Objeto                   : CurrencyTypeServiceInte.java
 * Descripción              : Clase de interface de servicio para utilizar los métodos de CRUD.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 */
package com.nttdata.bootcamp.bank.product.service.inte;

import com.nttdata.bootcamp.bank.product.model.document.CurrencyType;
import com.nttdata.bootcamp.bank.product.model.document.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * Clase de interface de servicio para utilizar los métodos de CRUD.
 */
public interface CurrencyTypeServiceInte
{

    Mono<CurrencyType> create(final CurrencyType product);

    Flux<CurrencyType> readAll();

    Mono<CurrencyType> findByCodeId(String codeProduct);

    Mono<CurrencyType> updateById(final String id, final CurrencyType product);

    Mono<Void> deleteById(final String id);
}