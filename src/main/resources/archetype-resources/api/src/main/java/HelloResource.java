#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {

    private final GreetingService service;

    @Inject
    public HelloResource(GreetingService service) {
        this.service = service;
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hi() {
        return Response.ok()
                .entity(service.hello())
                .build();
    }
}
