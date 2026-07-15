# Java Multi-Client Chat Application

## About the Project

This is a simple Java chat application developed using Socket Programming and Multithreading. The main aim of this project is to allow multiple clients to connect to a server and communicate with each other in real time through the console.

I developed this project to understand how client-server communication works in Java and how multiple users can be handled using threads.

## Features

- Multiple clients can connect to the server.
- Each client joins the chat with a username.
- Messages are shared with all connected clients.
- Join and leave notifications are displayed.
- Supports multiple clients at the same time using multithreading.

## Technologies Used

- Java
- Socket Programming
- Multithreading
- Eclipse IDE
- Git and GitHub

## Project Files

- **Server.java** – Starts the server and waits for client connections.
- **Client.java** – Connects to the server and allows users to send and receive messages.
- **ClientHandler.java** – Handles communication with each connected client and broadcasts messages.

## How to Run

1. Run `Server.java`.
2. Run `Client.java`.
3. Enter your username.
4. Run another `Client.java` and enter a different username.
5. Start chatting.

## Example

```
Enter your name:
Naveen

Connected to Chat Server!

Naveen: Hello Ravi

Ravi: Hi Naveen
```

## What I Learned

While working on this project, I learned:

- Java Socket Programming
- Client-Server communication
- Multithreading using Runnable
- Broadcasting messages
- Using Git and GitHub for version control

## Future Improvements

If I continue this project, I would like to add:

- Private messaging
- GUI using JavaFX or Swing
- File sharing
- Chat history
- User authentication

## Author

**Naveen Pogiri**

MCA Graduate

Interested in Java Backend Development
