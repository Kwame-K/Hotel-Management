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
@Table(name = "service")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Service.findAll", query = "SELECT s FROM Service s")
    , @NamedQuery(name = "Service.findByIdServ", query = "SELECT s FROM Service s WHERE s.idServ = :idServ")
    , @NamedQuery(name = "Service.findByNomServ", query = "SELECT s FROM Service s WHERE s.nomServ = :nomServ")
    , @NamedQuery(name = "Service.findByLieuServ", query = "SELECT s FROM Service s WHERE s.lieuServ = :lieuServ")
    , @NamedQuery(name = "Service.findByCaractServ", query = "SELECT s FROM Service s WHERE s.caractServ = :caractServ")
    , @NamedQuery(name = "Service.findByTypeServ", query = "SELECT s FROM Service s WHERE s.typeServ = :typeServ")})
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdServ")
    private String idServ;
    @Column(name = "NomServ")
    private String nomServ;
    @Column(name = "LieuServ")
    private String lieuServ;
    @Column(name = "CaractServ")
    private String caractServ;
    @Column(name = "TypeServ")
    private String typeServ;
    @ManyToMany(mappedBy = "serviceCollection")
    private Collection<Client> clientCollection;

    public Service() {
    }

    public Service(String idServ) {
        this.idServ = idServ;
    }

    public String getIdServ() {
        return idServ;
    }

    public void setIdServ(String idServ) {
        this.idServ = idServ;
    }

    public String getNomServ() {
        return nomServ;
    }

    public void setNomServ(String nomServ) {
        this.nomServ = nomServ;
    }

    public String getLieuServ() {
        return lieuServ;
    }

    public void setLieuServ(String lieuServ) {
        this.lieuServ = lieuServ;
    }

    public String getCaractServ() {
        return caractServ;
    }

    public void setCaractServ(String caractServ) {
        this.caractServ = caractServ;
    }

    public String getTypeServ() {
        return typeServ;
    }

    public void setTypeServ(String typeServ) {
        this.typeServ = typeServ;
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
        hash += (idServ != null ? idServ.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Service)) {
            return false;
        }
        Service other = (Service) object;
        if ((this.idServ == null && other.idServ != null) || (this.idServ != null && !this.idServ.equals(other.idServ))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestion_hoteldb.Service[ idServ=" + idServ + " ]";
    }
    
}
