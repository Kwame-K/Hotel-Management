package gestion_hoteldb;

import gestion_hoteldb.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-13T22:39:44")
@StaticMetamodel(Activite.class)
public class Activite_ { 

    public static volatile SingularAttribute<Activite, String> nomAct;
    public static volatile SingularAttribute<Activite, String> progAct;
    public static volatile SingularAttribute<Activite, String> lieuAct;
    public static volatile CollectionAttribute<Activite, Client> clientCollection;
    public static volatile SingularAttribute<Activite, String> typeAct;

}