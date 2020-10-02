package apiEngine.model.response;

import lombok.Data;

import java.util.List;

@Data
public class UserAccount {
    public String userId;
    public String username;
    public List<Book> books;
}
