FROM java:8

COPY . /usr/local/kompanion/
WORKDIR /usr/local/kompanion

EXPOSE 9090

ENTRYPOINT ./gradlew run