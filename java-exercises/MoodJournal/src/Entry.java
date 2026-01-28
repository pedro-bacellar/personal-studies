import java.time.LocalDateTime;

public class Entry {

    String mood;
    String textContent;
    LocalDateTime timestamp;

    Entry(String mood, String textContent){
        this.mood = mood;
        this.textContent = textContent;
        this.timestamp = LocalDateTime.now();
    }

    Entry(LocalDateTime timestamp, String mood, String textContent) {
        this.timestamp = timestamp;
        this.mood = mood;
        this.textContent = textContent;
    }


    public String toFileFormat(){
        return timestamp + "|" + mood + "|" + textContent + "\n";
    }
}
