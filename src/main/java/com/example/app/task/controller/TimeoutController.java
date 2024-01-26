package com.example.app.task.controller;

import com.example.server.http.Request;
import com.example.server.http.Response;

public class TimeoutController extends Controller {

    @Override
    public boolean supports(String route) {
        return route.startsWith("/timeout");
    }

    @Override
    public Response handle(Request request) {

        boolean wait = true;
        while (wait) {

        }

        return null;
    }
}
