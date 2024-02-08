package com.example.app.mtcg.controller;

import com.example.server.http.HttpContentType;
import com.example.server.http.HttpStatus;
import com.example.server.http.Request;
import com.example.server.http.Response;

public class UserController extends Controller {

    @Override
    public boolean supports(String route) {
        return route.startsWith("/users");
    }

    @Override
    public Response handle(Request request) {
        /*
        Response response = new Response();
        response.setStatus(HttpStatus.OK);
        response.setContentType(HttpContentType.TEXT_PLAIN);
        response.setBody("user controller");
        return response;
        */
        //Dono about that part

        if ( request.getRoute().equals("/user")){
            switch (request.getMethod()){
                case "GET": return listUsers(request);
                case "Post": return createUser(request);

            }

        }

        return status(HttpStatus.BAD_REQUEST);
    };

    public Response listUsers(Request request){
        return status(HttpStatus.BAD_REQUEST);
    };
    public Response createUser(Request request){
        return status(HttpStatus.BAD_REQUEST);
    };
}
