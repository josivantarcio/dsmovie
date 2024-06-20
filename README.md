
# Online Video Rental

This is an online video rental project with a full-stack application, combining backend and frontend development. The backend is built with Java and Spring Boot, while the frontend is developed with React. The project supports basic operations like adding, updating, deleting, and listing videos available for rent.

## Technologies Used

### Backend:
- **Java 11**: Programming language for backend development.
- **Spring Boot 2.5**: Framework for simplifying backend configuration and development.
- **Maven**: Build automation tool and dependency management.
- **H2 Database**: In-memory database for development and testing.
- **SQL**: Used for database interactions.

### Frontend:
- **React**: JavaScript library for building user interfaces.
- **Yarn**: Package manager for frontend dependencies.

## Requirements

- **JDK 11** or higher
- **Maven 3.6** or higher
- **Node.js** and **Yarn**

## Project Setup

### Backend

1. **Clone the repository**:
    ```bash
    git clone https://github.com/josivantarcio/dsmovie.git
    cd dsmovie/backend
    ```

2. **Build the project using Maven**:
    ```bash
    mvn clean install
    ```

3. **Run the backend application**:
    ```bash
    mvn spring-boot:run
    ```

The backend application will be available at `http://localhost:8080`.

### Frontend

1. **Navigate to the frontend directory**:
    ```bash
    cd ../frontend
    ```

2. **Install dependencies using Yarn**:
    ```bash
    yarn install
    ```

3. **Run the frontend application**:
    ```bash
    yarn start
    ```

The frontend application will be available at `http://localhost:3000`.

## API Documentation

Below are the available endpoints in the backend API. You can use Postman or any other API testing tool to test these endpoints.

### Endpoints

#### Add Video

- **URL**: `/api/videos`
- **Method**: `POST`
- **Request Body**:
    ```json
    {
        "title": "Video Title",
        "description": "Video Description",
        "releaseYear": 2022,
        "genre": "Action"
    }
    ```
- **Response**:
    ```json
    {
        "id": 1,
        "title": "Video Title",
        "description": "Video Description",
        "releaseYear": 2022,
        "genre": "Action"
    }
    ```

#### List Videos

- **URL**: `/api/videos`
- **Method**: `GET`
- **Response**:
    ```json
    [
        {
            "id": 1,
            "title": "Video Title",
            "description": "Video Description",
            "releaseYear": 2022,
            "genre": "Action"
        },
        ...
    ]
    ```

#### Get Video by ID

- **URL**: `/api/videos/{id}`
- **Method**: `GET`
- **Response**:
    ```json
    {
        "id": 1,
        "title": "Video Title",
        "description": "Video Description",
        "releaseYear": 2022,
        "genre": "Action"
    }
    ```

#### Update Video

- **URL**: `/api/videos/{id}`
- **Method**: `PUT`
- **Request Body**:
    ```json
    {
        "title": "Updated Video Title",
        "description": "Updated Video Description",
        "releaseYear": 2023,
        "genre": "Comedy"
    }
    ```
- **Response**:
    ```json
    {
        "id": 1,
        "title": "Updated Video Title",
        "description": "Updated Video Description",
        "releaseYear": 2023,
        "genre": "Comedy"
    }
    ```

#### Delete Video

- **URL**: `/api/videos/{id}`
- **Method**: `DELETE`
- **Response**: `204 No Content`

## H2 Database

The project uses the H2 in-memory database for development and testing purposes. You can access the H2 console to view the stored data.

- **URL**: `http://localhost:8080/h2-console`
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **User**: `sa`
- **Password**: (leave blank)

## License

This project is licensed under the terms of the MIT license. See the [LICENSE](LICENSE) file for details.

## Contribution

Contributions are welcome! Feel free to open issues and pull requests.
