package daniloramirezcr.FullContact;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by danilo on 20/12/2016.
 */
public class GoogleResult {
    public String title, url, description; // This are the variables that are going to be used for each Google Result

    public String getDomainName() {
        URI uri = null;
        try{
            uri = new URI( this.url );
            String domain = uri.getHost();
            return domain.startsWith("www.") ? domain.substring(4) : domain;
        }catch (Exception e){
            return "";
        }


    }
}
