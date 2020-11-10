package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")

public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String model;

    @Column
    private long series;

    @OneToOne
    private User user;

    public Car() { }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public long getSeries() { return series; }
    public void setSeries(int series) { this.series = series; }

    public User getUser() {
        return user;
    }
}
