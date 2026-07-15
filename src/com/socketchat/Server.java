package com.socketchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {

            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("================================");
            System.out.println(" Chat Server Started");
            System.out.println(" Listening on Port : 5000");
            System.out.println(" Waiting for clients...");
            System.out.println("================================");

            while (true) {

                Socket socket = serverSocket.accept();

                System.out.println("New client connected: "
                        + socket.getInetAddress());

                ClientHandler handler = new ClientHandler(socket);

                Thread thread = new Thread(handler);

                thread.start();
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}