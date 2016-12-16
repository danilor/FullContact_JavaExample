/**
 * Created by danilo on 14/12/2016.
 */
import daniloramirezcr.FullContact.FullContact;
import daniloramirezcr.FullContact.FullContact_Data;
import daniloramirezcr.util.Config;
import daniloramirezcr.util.Console;


public class Main {

    public static void main( String[] args ){
        finder f = new finder();
        f.setVisible(true);
    }

    public static void main2( String[] args ){


        Console.l("Welcome to the FullContact Magic Search System");
        String e = Console.readString("Please insert the email you want to search for: ");
        Config c = new Config();
        String key = c.read("fullcontact_key");
        FullContact fc = new FullContact();
        fc.setApiKey( key );
        /*if(fc.lookByEmailAndSaveHTML( e )){
            Console.l( "Process finished" );
        }else{
            Console.e( "Cannot find any information on the email or the API has reach its limit." );
        }*/
        Console.l("Please wait while we harvest the information...");
        fc.lookByEmail( e );
        FullContact_Data person = fc.getLastData();

        /*
        * Its time to show all the person information.
        * */
        Console.l("FullName: " + person.fullName);
        Console.l("Family Name: " + person.familyName);
        Console.l("Given Name: " + person.givenName);
        Console.l("Request ID: " + person.requestId);
        Console.l("Location General: " + person.location_general);
        Console.l("Country Name: " + person.country_name);
        Console.l("Country Cod: " + person.country_code);
        Console.l("Continent: " + person.continent);

        if( person.photos.size() > 0 ){
            Console.l( "Photos found." );
            for( int i = 0 ; i < person.photos.size() ; i++ ){
                Console.l( " - " +  person.photos.get(i).typeName + " :: " + person.photos.get(i).url );
            }
        }
        if( person.social.size() > 0 ){
            Console.l( "Social Profiles found." );
            for( int i = 0 ; i < person.social.size() ; i++ ){
                Console.l( " - " + person.social.get(i).typeName + " :: " + person.social.get(i).url );
            }
        }
        if( person.websites.size() > 0 ){
            Console.l( "Websites found." );
            for( int i = 0 ; i < person.websites.size() ; i++ ){
                Console.l( " - " + person.websites.get(i).url );
            }
        }
    }
}
