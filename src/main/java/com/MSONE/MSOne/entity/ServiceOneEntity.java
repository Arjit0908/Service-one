package com.MSONE.MSOne.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "serviceAuditing")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServiceOneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String serviceName="microservice-2";

    //extra fields
    private String requestTime;
    private String responseTime;
    private int StatusCode;
    private String timeTaken;
    private String requestURI;
    private String requestMethod;
    private String requestHeaderName;
    private String contentType;
    private String requestID;
    private String hostName;
    private String response;
    private String errorTrace;
}
