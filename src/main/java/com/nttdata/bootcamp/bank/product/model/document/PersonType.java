/**
 * Resumen.
 * Objeto                   : PersonType.java
 * Descripción              : Clase de tipo document para obtener o establecer los datos de cada atributo.
 * Fecha de Creación        : 19/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Mario Vásquez.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 */
package com.nttdata.bootcamp.bank.product.model.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Clase de tipo document para obtener o establecer los datos de cada atributo.
 */
@Data
@AllArgsConstructor
@Document(collection="person_type")
public class PersonType {
    @Id
    private String id;
    private String name;
    private String description;
    private String state;
    private String codePersonType;
}
