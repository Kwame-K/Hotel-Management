/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_hoteldb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kristian Laban
 */
@Entity
@Table(name = "facturation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturation.findAll", query = "SELECT f FROM Facturation f")
    , @NamedQuery(name = "Facturation.findByIdFacture", query = "SELECT f FROM Facturation f WHERE f.idFacture = :idFacture")
    , @NamedQuery(name = "Facturation.findByDateDebutSej", query = "SELECT f FROM Facturation f WHERE f.dateDebutSej = :dateDebutSej")
    , @NamedQuery(name = "Facturation.findByDateFinSej", query = "SELECT f FROM Facturation f WHERE f.dateFinSej = :dateFinSej")})
public class Facturation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdFacture")
    private String idFacture;
    @Basic(optional = false)
    @Column(name = "DateDebutSej")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebutSej;
    @Basic(optional = false)
    @Column(name = "DateFinSej")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFinSej;

    public Facturation() {
    }

    public Facturation(String idFacture) {
        this.idFacture = idFacture;
    }

    public Facturation(String idFacture, Date dateDebutSej, Date dateFinSej) {
        this.idFacture = idFacture;
        this.dateDebutSej = dateDebutSej;
        this.dateFinSej = dateFinSej;
    }

    public String getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(String idFacture) {
        this.idFacture = idFacture;
    }

    public Date getDateDebutSej() {
        return dateDebutSej;
    }

    public void setDateDebutSej(Date dateDebutSej) {
        this.dateDebutSej = dateDebutSej;
    }

    public Date getDateFinSej() {
        return dateFinSej;
    }

    public void setDateFinSej(Date dateFinSej) {
        this.dateFinSej = dateFinSej;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacture != null ? idFacture.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturation)) {
            return false;
        }
        Facturation other = (Facturation) object;
        if ((this.idFacture == null && other.idFacture != null) || (this.idFacture != null && !this.idFacture.equals(other.idFacture))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestion_hoteldb.Facturation[ idFacture=" + idFacture + " ]";
    }
    
}
