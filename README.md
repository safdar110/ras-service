# Build and Docker Push
```
./mvnw -DskipTests package
docker build -t khawarhere/raservice .
docker push khawarhere/raservice
```

# Docker Pull and Run
```
docker pull khawarhere/raservice
docker run -p 8080:8080 --rm raservice
```

git remote set-url origin git@github.com:appiskeydev/raservice.git