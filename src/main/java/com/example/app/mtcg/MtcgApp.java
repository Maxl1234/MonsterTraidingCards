package com.example.app.mtcg;


import com.example.server.http.HttpContentType;
import com.example.server.http.HttpStatus;
import com.example.server.http.Response;
import com.example.server.ServerApplication;
import com.example.server.http.Request;

import java.util.List;
public class MtcgApp implements ServerApplication{




    @Override
    public Response handle(Request request) {

        Response response = new Response();
        response.setStatus(HttpStatus.NOT_FOUND);
        response.setContentType(HttpContentType.APPLICATION_JSON);
        response.setBody("Route not found!");
        return response;
    }
}
