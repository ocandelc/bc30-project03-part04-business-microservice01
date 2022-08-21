/**
 * Resumen.
 * Objeto                   : ProductSubTypeServiceInte.java
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
import com.nttdata.bootcamp.bank.product.model.document.ProductSubType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * Clase de interface de servicio para utilizar los métodos de CRUD.
 */
public interface ProductSubTypeServiceInte
{

    Mono<ProductSubType> create(final ProductSubType product);

    Flux<ProductSubType> readAll();

    Mono<ProductSubType> findByCodeId(String codeProduct);

    Mono<ProductSubType> updateById(final String id, final ProductSubType product);

    Mono<Void> deleteById(final String id);
}