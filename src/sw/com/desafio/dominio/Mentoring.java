package sw.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoring  extends Content{

    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return XP_STANDARD + 20;
    }


    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

}
