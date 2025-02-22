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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kristian Laban
 */
@Entity
@Table(name = "activite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activite.findAll", query = "SELECT a FROM Activite a")
    , @NamedQuery(name = "Activite.findByNomAct", query = "SELECT a FROM Activite a WHERE a.nomAct = :nomAct")
    , @NamedQuery(name = "Activite.findByTypeAct", query = "SELECT a FROM Activite a WHERE a.typeAct = :typeAct")
    , @NamedQuery(name = "Activite.findByProgAct", query = "SELECT a FROM Activite a WHERE a.progAct = :progAct")
    , @NamedQuery(name = "Activite.findByLieuAct", query = "SELECT a FROM Activite a WHERE a.lieuAct = :lieuAct")})
public class Activite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NomAct")
    private String nomAct;
    @Column(name = "TypeAct")
    private String typeAct;
    @Column(name = "ProgAct")
    private String progAct;
    @Column(name = "LieuAct")
    private String lieuAct;
    @ManyToMany(mappedBy = "activiteCollection")
    private Collection<Client> clientCollection;

    public Activite() {
    }

    public Activite(String nomAct) {
        this.nomAct = nomAct;
    }

    public String getNomAct() {
        return nomAct;
    }

    public void setNomAct(String nomAct) {
        this.nomAct = nomAct;
    }

    public String getTypeAct() {
        return typeAct;
    }

    public void setTypeAct(String typeAct) {
        this.typeAct = typeAct;
    }

    public String getProgAct() {
        return progAct;
    }

    public void setProgAct(String progAct) {
        this.progAct = progAct;
    }

    public String getLieuAct() {
        return lieuAct;
    }

    public void setLieuAct(String lieuAct) {
        this.lieuAct = lieuAct;
    }

    @XmlTransient
    public Collection<Client> getClientCollection() {
        return clientCollection;
    }

    public void setClientCollection(Collection<Client> clientCollection) {
        this.clientCollection = clientCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomAct != null ? nomAct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activite)) {
            return false;
        }
        Activite other = (Activite) object;
        if ((this.nomAct == null && other.nomAct != null) || (this.nomAct != null && !this.nomAct.equals(other.nomAct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestion_hoteldb.Activite[ nomAct=" + nomAct + " ]";
    }
    
}
