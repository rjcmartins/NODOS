
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela CLIENTE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CLIENTE\"")
@XmlRootElement
@CronappSecurity
@CronappSwagger
@JsonFilter("app.entity.Cliente")
@CronappTable(role=CronappTableRole.CLASS)
public class Cliente implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Attribute 02")
    @Column(name = "attribute02", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String attribute02;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Attribute 03")
    @Column(name = "attribute03", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String attribute03;


    /**
    * Construtor
    * @generated
    */
    public Cliente(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Cliente setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Cliente setName(java.lang.String name) {
        this.name = name;
        return this;
    }
    /**
    * Obtém attribute02
    * return attribute02
    * @generated
    */
    public java.lang.String getAttribute02() {
        return this.attribute02;
    }

    /**
    * Define attribute02
    * @param attribute02 attribute02
    * @generated
    */
    public Cliente setAttribute02(java.lang.String attribute02) {
        this.attribute02 = attribute02;
        return this;
    }
    /**
    * Obtém attribute03
    * return attribute03
    * @generated
    */
    public java.lang.String getAttribute03() {
        return this.attribute03;
    }

    /**
    * Define attribute03
    * @param attribute03 attribute03
    * @generated
    */
    public Cliente setAttribute03(java.lang.String attribute03) {
        this.attribute03 = attribute03;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Cliente object = (Cliente)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}