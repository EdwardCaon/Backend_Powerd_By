package Powered_by.springboot.payload.request;

import lombok.Getter;

@Getter
public class DeleteRequest {
    private String token;
    private String password;

}
