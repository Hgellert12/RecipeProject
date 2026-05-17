# RecipeLens

RecipeLens is a Spring Boot REST API for managing recipes, users, and ingredient scans. Users can create and browse recipes, mark recipes as favorites, search by name or category, and upload ingredient images to receive recipe recommendations based on detected ingredients.

## Features

- Create, view, update, and delete recipes
- Search recipes by name, category, favorite status, or author
- Create and list users
- Upload ingredient images for scanning
- Detect ingredients from uploaded images
- Recommend recipes based on detected ingredients
- API documentation support with springdoc OpenAPI

## Tech Stack

- Java
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Maven
- Lombok
- Google Cloud Vision
- Springdoc OpenAPI

## Getting Started

### Prerequisites

Make sure you have the following installed:

- Java 26 or later
- Maven, or use the included Maven wrapper

### Installation

Clone the repository:

```bash
git clone https://github.com/Hgellert12/RecipeLens.git
cd RecipeLens
```
## Image Scanning Requirements

The image scanning feature depends on external Google Cloud Vision prerequisites and will not run out of the box.

To use image-based ingredient detection, you must have:

- A Google Cloud project
- Google Cloud Vision API enabled
- Valid Google Cloud service account credentials
- The credentials configured in your local environment

Without these prerequisites, the rest of the API can still run, but endpoints related to image scanning and ingredient detection may fail.
