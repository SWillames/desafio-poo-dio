package sw.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> contentSubscribed = new LinkedHashSet<>();
    private Set<Content> contentCompleted = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){};

    public void toProgress() {

    }

    public void calculateTotalXp() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentSubscribed() {
        return contentSubscribed;
    }

    public void setContentSubscribed(Set<Content> contentSubscribed) {
        this.contentSubscribed = contentSubscribed;
    }

    public Set<Content> getContentCompleted() {
        return contentCompleted;
    }

    public void setContentCompleted(Set<Content> contentCompleted) {
        this.contentCompleted = contentCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentSubscribed, dev.contentSubscribed) && Objects.equals(contentCompleted, dev.contentCompleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentSubscribed, contentCompleted);
    }
}
