package ap.databaseperformanceanalysis.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Author extends RealmObject {

    //Needs to be public to iBoxDB
    @PrimaryKey
    public String key;//Needs to be a string to firebase
    public String name;
    public String biography;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
