package gestion_hoteldb;

import gestion_hoteldb.Activite;
import gestion_hoteldb.Chambre;
import gestion_hoteldb.Service;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-13T22:39:44")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> typeCli;
    public static volatile SingularAttribute<Client, String> compteCli;
    public static volatile CollectionAttribute<Client, Activite> activiteCollection;
    public static volatile SingularAttribute<Client, String> idClient;
    public static volatile SingularAttribute<Client, Chambre> idChbre;
    public static volatile SingularAttribute<Client, String> nomCli;
    public static volatile SingularAttribute<Client, String> paysOrg;
    public static volatile SingularAttribute<Client, String> prenomCli;
    public static volatile CollectionAttribute<Client, Chambre> chambreCollection;
    public static volatile SingularAttribute<Client, String> adresseCli;
    public static volatile CollectionAttribute<Client, Service> serviceCollection;

}