package web.model;


import org.springframework.stereotype.Component;

@Component
public class Car {
    private long id;
    private String model;
    private int series;

    public Car() {
    }

    public Car(long id, String model, int serial) {
        this.model = model;
        this.series = serial;
        this.id = id;
    }

    public long getId() {
        return  this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
