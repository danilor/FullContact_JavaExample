package daniloramirezcr.FullContact;

import java.util.*;

/**
 * Created by danilo on 14/12/2016.
 */
public class FullContact_Data {
    // All this attributes should be fullfill from the JSON
    public String requestId, fullName, givenName, familyName,
            normalizedLocation, deducedLocation, country_name, country_code,
            continent,
            location_general;
    public float likelihood, location_likelihood;
    public List<FullContact_Website> websites = new ArrayList<FullContact_Website>();
    public List<FullContact_Photo> photos = new ArrayList<FullContact_Photo>();
    public List<FullContact_SocialProfile> social = new ArrayList<FullContact_SocialProfile>();

    /* Constructor */
    public void FullContact_Data(){

    }

    public FullContact_Data addPhoto(String type, String typeId, String typeName, String url){
        FullContact_Photo aux = new FullContact_Photo();
        aux . type      = type;
        aux . typeId    = typeId;
        aux . typeName  = typeName;
        aux . url       = url;
        this.photos.add( aux );
        return this;
    }

    public FullContact_Data addSocialProfile(String type, String typeId, String typeName, String url){
        FullContact_SocialProfile aux = new FullContact_SocialProfile();
        aux . type      = type;
        aux . typeId    = typeId;
        aux . typeName  = typeName;
        aux . url       = url;
        this.social.add( aux );
        return this;
    }

    public FullContact_Data addWebsite(String url){
        FullContact_Website aux = new FullContact_Website();
        aux . url = url;
        this.websites.add( aux );
        return this;
    }


}
