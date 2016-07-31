package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by elroessn on 31.07.2016.
 */
@Entity
public class Person extends Model{
    @Id
    public String id;

    public String name;

}
