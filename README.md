 Railway Ticket Reservation System

This is a 10-mark prototype implementation of a **Railway Customer Management Software** developed in Java, containerized using Docker, and deployed on the Render free cloud platform.

 Developed in Java (JDK 17)
 Core functionality includes:
  - Reserve tickets for multiple customers
  - Make payments
  - Assign clerk
  - Set train details (ID, model)
Output shown in console logs (CLI style)

Folder structure:
└── src
    └── main
        └── java
            └── adda.vit.regno22mic0090.mic0084.mic0119.railwayticketreservation
                └── *.java

 Dockerfile used to containerize the Java application
Dockerfile:

FROM openjdk:17
WORKDIR /app
COPY src/main/java/ ./src
RUN javac src/adda/vit/regno22mic0090/mic0084/mic0119/railwayticketreservation/*.java
CMD ["java", "src.adda.vit.regno22mic0090.mic0084.mic0119.railwayticketreservation.Main"]
------------------------------------


 Platform: Render (https://render.com)

Steps:
1. Push code and Dockerfile to GitHub
2. Sign in at [https://render.com](https://render.com)
3. Click "New + Web Service"
4. Select GitHub repo and branch
5. Set Environment = Docker
6. Set root directory = /
7. Click "Create Web Service"
8. Build logs will show compilation and execution
9. Output will be visible in logs (console-style output)

🔗 Live URL: https://railwayticketreservation.onrender.com  
(Note: Console app – no web page UI. View logs tab for output.)

Keerthana,Soundarya,Aarthi reserved a seat.  
Keerthana,Soundarya,Aarthi made a payment of 350.0  
Clerk Kumar received payment: 350.0  
Train ID: T123, Model: Superfast  
Database [DB1] Response: Success | Data: Ticket booked for Keerthana,Soundarya,Aarthi


🛠️ Troubleshooting Tips:

• Problem: Page keeps loading  
  ➤ Reason: CLI app, not HTML-based – check logs tab

• Problem: Docker build fails  
  ➤ Fix: Verify Java file paths and class names

• Problem: Logs not updating  
  ➤ Fix: Click “Manual Deploy” to redeploy

• Problem: App is slow to respond  
  ➤ Fix: Free plans spin down on inactivity – wait 30–50 seconds


👥 Team Members:

- Keerthana Kumar (22MIC0090)  
- Soundarya S  
- Aarthi S

