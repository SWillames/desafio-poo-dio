package sw.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate dateInicial = LocalDate.now();
    private final LocalDate dateFinal = dateInicial.plusDays(45);
    private Set<Dev> devEnrolled = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateInicial() {
        return dateInicial;
    }

    public LocalDate getDateFinal() {
        return dateFinal;
    }

    public Set<Dev> getDevEnrolled() {
        return devEnrolled;
    }

    public void setDevEnrolled(Set<Dev> devEnrolled) {
        this.devEnrolled = devEnrolled;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(dateInicial, bootcamp.dateInicial) && Objects.equals(dateFinal, bootcamp.dateFinal) && Objects.equals(devEnrolled, bootcamp.devEnrolled) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, dateInicial, dateFinal, devEnrolled, contents);
    }
}
