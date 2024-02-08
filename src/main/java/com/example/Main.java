package com.example;


import com.example.app.display.DisplayApp;
import com.example.app.mtcg.MtcgApp;
import com.example.app.task.TaskApp;
import com.example.server.Server;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(new MtcgApp());
        server.start();
    }
}

