package domain;

/**
 *
 * @author Griss
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
 
    private int eventId;
    private String eventType;   // Deposit, Withdraw, SINPE Transfer
    private String eventDate;
    private Account accountInfo;

    // Constructor
    public Log(int eventId, String eventType, Account accountInfo) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.accountInfo = accountInfo;
        // Guardamos la fecha actual automáticamente
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.eventDate = LocalDateTime.now().format(formatter);
    }

    // Getters
    public int getEventId() {
        return eventId;
    }

    public String getEventType() {
        return eventType;
    }

    public String getEventDate() {
        return eventDate;
    }

    public Account getAccountInfo() {
        return accountInfo;
    }

    // Setters
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setAccountInfo(Account accountInfo) {
        this.accountInfo = accountInfo;
    }

    // toString
    @Override
    public String toString() {
        return "Log [Id=" + eventId +
                ", Type=" + eventType +
                ", Date=" + eventDate +
                ", Account=" + accountInfo.toString() + "]";
    }
}


