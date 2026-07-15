package com.socketchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter writer = new PrintWriter(
                    socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            Thread receiveThread = new Thread(() -> {

                try {

                    String message;

                    while ((message = reader.readLine()) != null) {

                        System.out.println(message);

                    }

                }catch (IOException e) {

                    System.out.println("Disconnected from server.");

                }
            });

            receiveThread.start();
           
            String prompt = reader.readLine();
            System.out.println(prompt);

            String name = scanner.nextLine();
            writer.println(name);
            
            System.out.println("Connected to Chat Server!");

            while (true) {

                System.out.print("You: ");

                String message = scanner.nextLine();

                writer.println(message);

                if (message.equalsIgnoreCase("exit")) {

                    break;

                }

            }

            socket.close();
            System.out.println("Chat closed.");
            scanner.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}