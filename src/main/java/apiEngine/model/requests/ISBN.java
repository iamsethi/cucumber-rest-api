package apiEngine.model.requests;

import lombok.Data;

@Data
public class ISBN {
    public String isbn;

    public ISBN(String isbn) {
        this.isbn = isbn;
    }
}