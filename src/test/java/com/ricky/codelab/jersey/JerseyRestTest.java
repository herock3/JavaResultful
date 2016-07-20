package com.ricky.codelab.jersey;

import com.ricky.codelab.jersey.domain.User;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyInvocation;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Ricky on 2016/7/20.
 */
public class JerseyRestTest {

    @Test
    public void testGET(){

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(JacksonFeature.class);

        Client client = ClientBuilder.newClient(clientConfig);

        WebTarget webTarget = client
                .target("http://localhost:8080/user/2");

        Invocation.Builder request = webTarget.request(MediaType.APPLICATION_JSON);

        Response response = request.get();
        Assert.assertTrue(response.getStatus() == 200);

        User user = response.readEntity(User.class);
    }
}
