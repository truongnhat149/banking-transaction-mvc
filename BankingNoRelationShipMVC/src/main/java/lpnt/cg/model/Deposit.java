package lpnt.cg.model;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.LocalDateTime;

@Entity
@Table( name = "deposits")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idOwner;

    @Min(value = 1001, message = "Deposit not min 1000")
    @Max(value = 10000000000L, message = "Deposit not max 10000000000L")
    private long amount;

    private boolean isDelete = false;

    private LocalDateTime dateTime = LocalDateTime.now();

    public Deposit() {}

    public Deposit(Long idOwner) {
        this.idOwner = idOwner;
    }

    public Deposit(Long idOwner, long amount) {
        this.idOwner = idOwner;
        this.amount = amount;
    }

    public Deposit(Long id, Long idOwner,
                   @Min(value = 1001, message = "Deposit not min 1000")
                   @Max(value = 10000000000L, message = "Deposit not max 10000000000L")long amount, boolean isDelete, LocalDateTime dateTime) {
        this.id = id;
        this.idOwner = idOwner;
        this.amount = amount;
        this.isDelete = isDelete;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Long idOwner) {
        this.idOwner = idOwner;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
