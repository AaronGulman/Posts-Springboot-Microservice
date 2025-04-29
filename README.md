# Forum Post Spring Boot Microservice

This is a **microservice** responsible for managing forum posts and comments. 
It is a **part of a larger full-stack application**, which includes other services like user authentication,real time chat, frontend UI, and potentially more.

Built with **Spring Boot**, this service uses **JPA/Hibernate** for persistence and exposes a simple REST API to support forum functionality.

---

## Features

- Add new forum posts with optional media (image, video, etc.)
- Retrieve all forum posts
- Automatically stores creation timestamps
- CORS-enabled for frontend integration (e.g., with React)
- Future support for comments

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- H2 / PostgreSQL / MySQL (configurable)
- Jackson (for JSON serialization)
- RESTful APIs

---

## Part of a Larger System

The `forum-service` is one component in a modular, microservice-based application architecture. 

It works alongside several other services to form a complete ecosystem:
- `auth-service (Node.js)`: Handles user registration, login, and JWT-based authentication.
- `forum-service (Spring Boot)`: Manages forum posts and comments.
- `gateway-service (Spring Cloud Gateway)`: Acts as the API gateway, handling routing, load balancing, and service discovery.
- `chat-service (Go)`: Provides real-time chat functionality between users.
- `log-service (FastAPI)`: Collects and aggregates logs from services like auth-service using Winston/Morgan.
- `frontend-app (React)`: The main client-side interface where users interact with the app.
- `nginx`: Serves as a reverse proxy, handling HTTPS termination, static asset delivery, and traffic routing between frontend and backend services.

**Future additions:** Services for moderation, notifications, analytics, and more.
🛠️ This design supports independent scaling, service isolation, and clean DevOps practices.

---

## Endpoints

### Posts

| Method | Endpoint       | Description           |
|--------|----------------|-----------------------|
| POST   | `/posts/add`   | Add a new post        |
| GET    | `/posts`       | Get all posts         |

#### Sample JSON for POST `/posts/add`

```json
{
  "authorName": "John Doe",
  "message": "Hello, world!",
  "mediaUrl": "http://example.com/image.jpg",
  "mediaType": "image"
}
