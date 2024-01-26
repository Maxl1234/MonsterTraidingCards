package com.example.server;

import com.example.server.http.Request;
import com.example.server.http.Response;

public interface ServerApplication {

    Response handle(Request request);
}
