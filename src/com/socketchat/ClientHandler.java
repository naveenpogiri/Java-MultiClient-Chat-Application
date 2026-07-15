package com.socketchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable {

    private static ArrayList<ClientHandler> clients = new ArrayList<>();

    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
    private String username;
    public ClientHandler(Socket socket) throws IOException {

        this.socket = socket;

        reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        writer = new PrintWriter(socket.getOutputStream(), true);
        writer.println("Enter your name:");

        username = reader.readLine();
        
        broadcast("*** " + username + " joined the chat ***");

        System.out.println(username + " joined the chat.");

        clients.add(this);
    }

    @Override
    public void run() {

        try {

            String message;

            while ((message = reader.readLine()) != null) {

                System.out.println("Client: " + message);

                broadcast( username + ": "+ message);
                
                System.out.println(username + ": " + message);

                if (message.equalsIgnoreCase("exit")) {

                    clients.remove(this);

                    broadcast("*** " + username + " left the chat ***");

                    System.out.println(username + " left the chat.");

                    socket.close();

                    break;
                }

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    private void broadcast(String message) {

        for (ClientHandler client : clients) {

            if (client != this) {

                client.writer.println(message);

            }

        }

    }
}