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
import javax.persistence.ManyToOne;
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
@Table(name = "client")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c")
    , @NamedQuery(name = "Client.findByIdClient", query = "SELECT c FROM Client c WHERE c.idClient = :idClient")
    , @NamedQuery(name = "Client.findByNomCli", query = "SELECT c FROM Client c WHERE c.nomCli = :nomCli")
    , @NamedQuery(name = "Client.findByPrenomCli", query = "SELECT c FROM Client c WHERE c.prenomCli = :prenomCli")
    , @NamedQuery(name = "Client.findByAdresseCli", query = "SELECT c FROM Client c WHERE c.adresseCli = :adresseCli")
    , @NamedQuery(name = "Client.findByTypeCli", query = "SELECT c FROM Client c WHERE c.typeCli = :typeCli")
    , @NamedQuery(name = "Client.findByPaysOrg", query = "SELECT c FROM Client c WHERE c.paysOrg = :paysOrg")
    , @NamedQuery(name = "Client.findByCompteCli", query = "SELECT c FROM Client c WHERE c.compteCli = :compteCli")})
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IdClient")
    private String idClient;
    @Column(name = "NomCli")
    private String nomCli;
    @Column(name = "PrenomCli")
    private String prenomCli;
    @Column(name = "AdresseCli")
    private String adresseCli;
    @Column(name = "TypeCli")
    private String typeCli;
    @Column(name = "PaysOrg")
    private String paysOrg;
    @Column(name = "CompteCli")
    private String compteCli;
    @ManyToMany(mappedBy = "clientCollection")
    private Collection<Chambre> chambreCollection;
    @JoinTable(name = "offrir", joinColumns = {
        @JoinColumn(name = "IdClient", referencedColumnName = "IdClient")}, inverseJoinColumns = {
        @JoinColumn(name = "IdServ", referencedColumnName = "IdServ")})
    @ManyToMany
    private Collection<Service> serviceCollection;
    @JoinTable(name = "souscrire", joinColumns = {
        @JoinColumn(name = "Idclient", referencedColumnName = "IdClient")}, inverseJoinColumns = {
        @JoinColumn(name = "NomAct", referencedColumnName = "NomAct")})
    @ManyToMany
    private Collection<Activite> activiteCollection;
    @JoinColumn(name = "IdChbre", referencedColumnName = "IdChbre")
    @ManyToOne
    private Chambre idChbre;

    public Client() {
    }

    public Client(String idClient) {
        this.idClient = idClient;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getNomCli() {
        return nomCli;
    }

    public void setNomCli(String nomCli) {
        this.nomCli = nomCli;
    }

    public String getPrenomCli() {
        return prenomCli;
    }

    public void setPrenomCli(String prenomCli) {
        this.prenomCli = prenomCli;
    }

    public String getAdresseCli() {
        return adresseCli;
    }

    public void setAdresseCli(String adresseCli) {
        this.adresseCli = adresseCli;
    }

    public String getTypeCli() {
        return typeCli;
    }

    public void setTypeCli(String typeCli) {
        this.typeCli = typeCli;
    }

    public String getPaysOrg() {
        return paysOrg;
    }

    public void setPaysOrg(String paysOrg) {
        this.paysOrg = paysOrg;
    }

    public String getCompteCli() {
        return compteCli;
    }

    public void setCompteCli(String compteCli) {
        this.compteCli = compteCli;
    }

    @XmlTransient
    public Collection<Chambre> getChambreCollection() {
        return chambreCollection;
    }

    public void setChambreCollection(Collection<Chambre> chambreCollection) {
        this.chambreCollection = chambreCollection;
    }

    @XmlTransient
    public Collection<Service> getServiceCollection() {
        return serviceCollection;
    }

    public void setServiceCollection(Collection<Service> serviceCollection) {
        this.serviceCollection = serviceCollection;
    }

    @XmlTransient
    public Collection<Activite> getActiviteCollection() {
        return activiteCollection;
    }

    public void setActiviteCollection(Collection<Activite> activiteCollection) {
        this.activiteCollection = activiteCollection;
    }

    public Chambre getIdChbre() {
        return idChbre;
    }

    public void setIdChbre(Chambre idChbre) {
        this.idChbre = idChbre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClient != null ? idClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.idClient == null && other.idClient != null) || (this.idClient != null && !this.idClient.equals(other.idClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestion_hoteldb.Client[ idClient=" + idClient + " ]";
    }
    
}
