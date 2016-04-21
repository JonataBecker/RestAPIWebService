package api;

import br.com.becker.restapi.FindImplementarionException;
import br.com.becker.restapi.FindImplementation;
import br.com.becker.restapi.RestAPIConnectionFactory;

/**
 *
 * @author jonata-pc
 */
public class Teste {

    public static void main(String[] args) throws FindImplementarionException {
        FindImplementation.get(RestAPIConnectionFactory.class);
    }

}
