📄 Job Management Application
A full-stack web application that allows users to create, manage, and publish job openings. This project uses a modern tech stack with Spring Boot for the backend and HTML/CSS/JavaScript for the frontend. Job listings are persisted in a MySQL database, and displayed dynamically on the UI.

🚀 Features
Create new job openings with:
Job Title
Location
Job Type
Salary Range
Application Deadline
Description
Company Name
Display submitted job details as interactive job cards.
Frontend and backend communication handled using Spring Boot and @CrossOrigin for CORS support.
Responsive and interactive user interface.


🛠 Tech Stack
Layer	Technologies
Frontend	    :    HTML, CSS, JavaScript
Backend	      :    Java, Spring Boot, Spring Data JPA
Database	    :    MySQL
Integration	  :    pring Boot REST APIs with @CrossOrigin to handle cross-origin requests between frontend and backend


🔧 How It Works
1.Frontend:
    User clicks the Create Job button.
    A popup form appears to enter all job-related information.
    On clicking the Publish button, the job details are sent to the backend using fetch() or XMLHttpRequest.

2.Backend:
  Spring Boot controller receives the data through a REST endpoint.
  CORS is enabled using the @CrossOrigin annotation.
  The received job data is saved to the MySQL database using Spring Data JPA.

3.UI Update:
  Once the backend responds successfully, the new job card is dynamically added to the frontend DOM, showcasing the job information.


Project Structure

job-management-app/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/job/
│   │   │   │   ├── controller/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   └── JobManagementApplication.java
│   │   │   └── resources/
│   │   │       └── application.properties
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
└── README.md



⚙️ API Example
POST /jobs

{
  "jobTitle": "Frontend Developer",
  "location": "Bengaluru",
  "jobType": "Full Time",
  "salary": "10 LPA",
  "applicationDeadline": "2025-05-15",
  "description": "Work on UI/UX development using modern frontend tools.",
  "companyName": "TechNova"
}


💡 Future Improvements
    Add validations on frontend and backend
    Add edit/delete functionality for job listings
    Add pagination and search filters
    Connect with authentication module for admin control


🙌 Acknowledgements
    Developed as part of a learning project for mastering Spring Boot and full stack development
    Thanks to open-source communities for documentation and support


