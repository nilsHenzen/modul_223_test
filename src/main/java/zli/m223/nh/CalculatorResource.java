package zli.m223.nh;

import org.jboss.logging.annotations.Param;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/calculator")
public class CalculatorResource {

    @GET
    @Path("/add/{number1}/{number2}")
    public int addNumbers(@PathParam("number1") int number1, @PathParam("number2")int number2) {
        int sum = number1 + number2;
        return sum;
    }
}