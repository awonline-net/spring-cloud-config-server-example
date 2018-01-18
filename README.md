Spring Cloud Config Server example

Change the location of configuration file (config/client.properties) in application.properties of the cloud-config project.

Run the Comment service (default at port 8001).
Check the service by calling a GET request: http://localhost:8001/message

Run the Configuration Server service (default at port 9000).
Check the properties by calling a GET request: http://localhost:9000/client/default

Change a property value in client.properties. Commit the change.

Refresh the configuration properties by calling a POST request: http://localhost:8001/refresh

Call again the Comment service: http://localhost:8001/message
