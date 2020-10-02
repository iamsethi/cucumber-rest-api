package apiEngine.model.requests;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AddBooksRequest {

    public String userId;
    public List<ISBN> collectionOfIsbns;

    public AddBooksRequest(String userId, ISBN isbn){
        this.userId = userId;
        collectionOfIsbns = new ArrayList<>();
        collectionOfIsbns.add(isbn);
    }

}
