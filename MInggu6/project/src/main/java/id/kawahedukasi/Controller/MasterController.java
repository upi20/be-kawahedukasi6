package id.kawahedukasi.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/master")
@Produces(MediaType.TEXT_PLAIN)
public class MasterController {

    @Path("/city")
    @GET
    public String city(){
        return "Bandung, jakarta, surabaya";
    }

    @Path("/province")
    @GET
    public String province(){
        return "Jawa Barat, DKI Jakarta, Jawa Tengah";
    }

    @Path("/district")
    @GET
    public String district(){
        return "Lengkong, Cikopo";
    }
}
