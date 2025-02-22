package gestion_hoteldb;

import gestion_hoteldb.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-13T22:39:44")
@StaticMetamodel(Service.class)
public class Service_ { 

    public static volatile SingularAttribute<Service, String> idServ;
    public static volatile SingularAttribute<Service, String> caractServ;
    public static volatile CollectionAttribute<Service, Client> clientCollection;
    public static volatile SingularAttribute<Service, String> nomServ;
    public static volatile SingularAttribute<Service, String> lieuServ;
    public static volatile SingularAttribute<Service, String> typeServ;

}