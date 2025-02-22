/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_hoteldb;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kristian Laban
 */
@Entity
@Table(name = "chambre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chambre.findAll", query = "SELECT c FROM Chambre c")
    , @NamedQuery(name = "Chambre.findByIdChbre", query = "SELECT c FROM Chambre c WHERE c.idChbre = :idChbre")
    , @NamedQuery(name = "Chambre.findByTypeChbre", query = "SELECT c FROM Chambre c WHERE c.typeChbre = :typeChbre")
    , @NamedQuery(name = "Chambre.findByCaracterChbre", query = "SELECT c FROM Chambre c WHERE c.caracterChbre = :caracterChbre")
    , @NamedQuery(name = "Chambre.findByTarifChbre", query = "SELECT c FROM Chambre c WHERE c.tarifChbre = :tarifChbre")
    , @NamedQuery(name = "Chambre.findByEtatChbre", query = "SELECT c FROM Chambre c WHERE c.etatChbre = :etatChbre")})
public class Chambre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdChbre")
    private String idChbre;
    @Column(name = "TypeChbre")
    private String typeChbre;
    @Column(name = "CaracterChbre")
    private String caracterChbre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TarifChbre")
    private Float tarifChbre;
    @Column(name = "EtatChbre")
    private String etatChbre;
    @JoinTable(name = "occuper", joinColumns = {
        @JoinColumn(name = "IdChbre", referencedColumnName = "IdChbre")}, inverseJoinColumns = {
        @JoinColumn(name = "IdClient", referencedColumnName = "IdClient")})
    @ManyToMany
    private Collection<Client> clientCollection;
    @OneToMany(mappedBy = "idChbre")
    private Collection<Client> clientCollection1;

    public Chambre() {
    }

    public Chambre(String idChbre) {
        this.idChbre = idChbre;
    }

    public String getIdChbre() {
        return idChbre;
    }

    public void setIdChbre(String idChbre) {
        this.idChbre = idChbre;
    }

    public String getTypeChbre() {
        return typeChbre;
    }

    public void setTypeChbre(String typeChbre) {
        this.typeChbre = typeChbre;
    }

    public String getCaracterChbre() {
        return caracterChbre;
    }

    public void setCaracterChbre(String caracterChbre) {
        this.caracterChbre = caracterChbre;
    }

    public Float getTarifChbre() {
        return tarifChbre;
    }

    public void setTarifChbre(Float tarifChbre) {
        this.tarifChbre = tarifChbre;
    }

    public String getEtatChbre() {
        return etatChbre;
    }

    public void setEtatChbre(String etatChbre) {
        this.etatChbre = etatChbre;
    }

    @XmlTransient
    public Collection<Client> getClientCollection() {
        return clientCollection;
    }

    public void setClientCollection(Collection<Client> clientCollection) {
        this.clientCollection = clientCollection;
    }

    @XmlTransient
    public Collection<Client> getClientCollection1() {
        return clientCollection1;
    }

    public void setClientCollection1(Collection<Client> clientCollection1) {
        this.clientCollection1 = clientCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChbre != null ? idChbre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chambre)) {
            return false;
        }
        Chambre other = (Chambre) object;
        if ((this.idChbre == null && other.idChbre != null) || (this.idChbre != null && !this.idChbre.equals(other.idChbre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestion_hoteldb.Chambre[ idChbre=" + idChbre + " ]";
    }
    
}
