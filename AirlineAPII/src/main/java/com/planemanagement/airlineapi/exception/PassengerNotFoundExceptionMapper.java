/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.planemanagement.airlineapi.exception;

/**
 *
 * @author milenagalhardo
 */


import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import java.util.Collections;

@Provider
public class PassengerNotFoundExceptionMapper implements ExceptionMapper<PassengerNotFoundException> {
    @Override
    public Response toResponse(PassengerNotFoundException ex) {
        return Response.status(Response.Status.NOT_FOUND)
                       .entity(Collections.singletonMap("error", ex.getMessage()))
                       .build();
    }
}

