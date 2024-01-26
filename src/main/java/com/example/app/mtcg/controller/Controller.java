package com.example.app.mtcg.controller;

import com.example.server.http.Request;
import com.example.server.http.Response;

public interface Controller {

    boolean supports(String route);

    Response handle(Request request);
}
