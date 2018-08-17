package demo;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-17T13:12:12")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, BigInteger> balance;
    public static volatile SingularAttribute<Account, String> name;
    public static volatile SingularAttribute<Account, Integer> id;

}