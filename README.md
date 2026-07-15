# Java Multi-Client Chat Application

## Overview

This project is a Java Socket Programming application that enables multiple clients to communicate with each other through a central server. Each connected client runs in a separate thread, allowing multiple users to chat simultaneously.

## Features

- Multi-client communication
- Socket Programming
- Multithreading using Runnable
- Broadcast messages to all connected clients
- Username support
- Join and leave notifications
- Console-based chat application

## Technologies Used

- Java
- Socket Programming
- Multithreading
- Eclipse IDE

## Project Structure

```
SocketChatApplication
│
├── src
│   └── com.socketchat
│       ├── Server.java
│       ├── Client.java
│       └── ClientHandler.java
│
├── README.md
```

## How to Run

### Start the Server

Run

```
Server.java
```

### Start Clients

Open two or more console windows and run

```
Client.java
```

Enter different usernames.

Example:

```
Naveen
Ravi
```

Now both users can exchange messages.

## Example Output

```
Naveen joined the chat.
Ravi joined the chat.

Naveen:
Hello Ravi

Ravi:
Hi Naveen
```

## Author

Naveen Pogiri
