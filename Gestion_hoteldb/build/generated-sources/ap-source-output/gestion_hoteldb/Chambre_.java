package gestion_hoteldb;

import gestion_hoteldb.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-13T22:39:44")
@StaticMetamodel(Chambre.class)
public class Chambre_ { 

    public static volatile SingularAttribute<Chambre, String> caracterChbre;
    public static volatile SingularAttribute<Chambre, String> typeChbre;
    public static volatile SingularAttribute<Chambre, String> idChbre;
    public static volatile SingularAttribute<Chambre, Float> tarifChbre;
    public static volatile CollectionAttribute<Chambre, Client> clientCollection1;
    public static volatile SingularAttribute<Chambre, String> etatChbre;
    public static volatile CollectionAttribute<Chambre, Client> clientCollection;

}