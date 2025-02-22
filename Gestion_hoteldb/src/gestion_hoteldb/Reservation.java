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
@Table(name = "reservation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r")
    , @NamedQuery(name = "Reservation.findByIdReserv", query = "SELECT r FROM Reservation r WHERE r.idReserv = :idReserv")
    , @NamedQuery(name = "Reservation.findByDateDebutReserv", query = "SELECT r FROM Reservation r WHERE r.dateDebutReserv = :dateDebutReserv")
    , @NamedQuery(name = "Reservation.findByDateFinReserv", query = "SELECT r FROM Reservation r WHERE r.dateFinReserv = :dateFinReserv")})
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdReserv")
    private String idReserv;
    @Basic(optional = false)
    @Column(name = "DateDebutReserv")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebutReserv;
    @Basic(optional = false)
    @Column(name = "DateFinReserv")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFinReserv;

    public Reservation() {
    }

    public Reservation(String idReserv) {
        this.idReserv = idReserv;
    }

    public Reservation(String idReserv, Date dateDebutReserv, Date dateFinReserv) {
        this.idReserv = idReserv;
        this.dateDebutReserv = dateDebutReserv;
        this.dateFinReserv = dateFinReserv;
    }

    public String getIdReserv() {
        return idReserv;
    }

    public void setIdReserv(String idReserv) {
        this.idReserv = idReserv;
    }

    public Date getDateDebutReserv() {
        return dateDebutReserv;
    }

    public void setDateDebutReserv(Date dateDebutReserv) {
        this.dateDebutReserv = dateDebutReserv;
    }

    public Date getDateFinReserv() {
        return dateFinReserv;
    }

    public void setDateFinReserv(Date dateFinReserv) {
        this.dateFinReserv = dateFinReserv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserv != null ? idReserv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.idReserv == null && other.idReserv != null) || (this.idReserv != null && !this.idReserv.equals(other.idReserv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestion_hoteldb.Reservation[ idReserv=" + idReserv + " ]";
    }
    
}
