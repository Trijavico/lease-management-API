# Rental Manager API Gateway

This repository contains the source code for the API Gateway of the Rental Manager project, a property rental management application. The API Gateway acts as a single entry point for all incoming requests, routing them to the corresponding services and handling user authentication and authorization.

## Description

The API Gateway is developed in Java using the Spring Boot framework and is responsible for orchestrating the different functionalities of the system, including:

- **Authentication and Authorization**: Handles user registration, authentication, and management, including password reset.
- **Property Management**: Allows property owners to publish, edit, and delete rental properties.
- **Favorites and Contracts**: Users can mark properties as favorites and manage rental contracts.
- **Dashboard**: Provides an overview of relevant metrics and statistics for property owners.
- **Image Storage**: Handles the upload and storage of property images using Firebase Storage.

## Requirements

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- A Firebase account with a configured project

## Setup

1. Clone this repository to your local machine.
2. Configure the Firebase credentials in the `src/main/resources/serviceAccountKey.json` file.
3. Configure any other required environment variables (if applicable).

