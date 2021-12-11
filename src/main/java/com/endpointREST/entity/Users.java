package com.endpointREST.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Miguel Castro
 */
@Data
@Entity
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
