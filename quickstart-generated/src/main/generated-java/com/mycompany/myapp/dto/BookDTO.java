/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-angular:src/main/java/dto/EntityDTO.java.e.vm
 */
package com.mycompany.myapp.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Simple DTO for Book.
 */
public class BookDTO {
    public Integer id;
    public String title;
    public String summary;
    public String extractFileName;
    public String extractContentType;
    public Long extractSize;
    public LocalDate publicationDate;
    public Boolean bestSeller;
    public BigDecimal price;
    public AuthorDTO author;
    public AuthorDTO coAuthor;

    @JsonIgnore
    public boolean isIdSet() {
        return id != null;
    }
}