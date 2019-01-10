package org.eisen.rabbitmq;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQApplication {
    public static void main(String[] args) {
        try {
            RabbitMQDemo.put();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
