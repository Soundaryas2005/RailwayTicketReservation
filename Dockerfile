FROM openjdk:17
WORKDIR /app

# Copy the source code folder into the container
COPY src/main/java/ ./src

# Compile the Java files
RUN javac src/adda/vit/regno22mic0090/mic0084/mic0119/railwayticketreservation/*.java

# Run the main class with full package name
CMD ["java", "-cp", "src", "adda.vit.regno22mic0090.mic0084.mic0119.railwayticketreservation.RailwayTicketReservation"]
