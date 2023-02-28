package id.kawahedukasi.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/peserta")
@Produces(MediaType.TEXT_PLAIN)
public class PesertaController {

    @Path("/{name}")
    @GET
    public String inputPathParameter(@PathParam("name") String name){
        return "Peserta Dengan Nama input path param: " + name;
    }

    @GET
    public String inputQueryParameter(@QueryParam("name") String name){
        return "Peserta Dengan Nama input query param: " + name;
    }
}
