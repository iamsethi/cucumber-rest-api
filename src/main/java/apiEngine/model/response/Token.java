package apiEngine.model.response;

import lombok.Data;

@Data
public class Token {
    public String token;
    public String expires;
    public String status;
    public String result;
}
