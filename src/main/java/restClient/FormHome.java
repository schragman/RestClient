package restClient;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

@SessionScoped
@Named
public class FormHome {
	Client client = ClientBuilder.newClient();
}
