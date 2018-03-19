package start.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;


/**
 * A Blog.
 */
@Entity
@Table(name = "blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "title", length = 20, nullable = false)
    private String title;

    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "summary", length = 200, nullable = false)
    private String summary;

    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "content", length = 1000, nullable = false)
    private String content;

    @NotNull
    @Column(name = "create_at", nullable = false)
    @JsonIgnore
    private Instant create_at=Instant.now();

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnore
    private User written_by;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Blog title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public Blog summary(String summary) {
        this.summary = summary;
        return this;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public Blog content(String content) {
        this.content = content;
        return this;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Instant getCreate_at() {
        return create_at;
    }

    public Blog create_at(Instant create_at) {
        this.create_at = create_at;
        return this;
    }

    public void setCreate_at(Instant create_at) {
        this.create_at = create_at;
    }

    public User getWritten_by() {
        return written_by;
    }

    public Blog written_by(User user) {
        this.written_by = user;
        return this;
    }

    public void setWritten_by(User user) {
        this.written_by = user;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Blog blog = (Blog) o;
        if (blog.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), blog.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Blog{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", summary='" + getSummary() + "'" +
            ", content='" + getContent() + "'" +
            ", create_at='" + getCreate_at() + "'" +
            "}";
    }
}
