package entities;

import lombok.extern.slf4j.Slf4j;

import java.sql.Timestamp;

@Slf4j
public class ArticleBlog {

    private Long id;
    private Timestamp date;
    private String page;
    private String title;
    private String articletexte;
    private String pathImage;
    private String commentImage;

    public ArticleBlog() {
    }

    public Long getId() {
        return id;
    }

    /**
     * Mutator for the id. Id is an identifier for articleBlog object.
     *
     * @param id Long type ( Object not a primitive )
     * @throws RuntimeException     if id is empty.
     * @throws NullPointerException if id is null.
     */
    public void setId(Long id) throws RuntimeException, NullPointerException {

        if (id == null) {
            log.debug("The id Value for type long is " + id);
            throw new NullPointerException("The id Value for type long is " + id);
        }

        if (id <= 0) {
            log.debug("The id Value is : " + id);
            throw new RuntimeException("The id Value is : " + id);
        }

        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    /**
     * Mutator for the creation date of the articletexte.
     *
     * @param date type object to date
     * @throws NullPointerException if date is null.
     */
    public void setDate(Timestamp date) throws NullPointerException {

        if (date == null) {
            log.debug("The Value of date Article is " + date);
            throw new NullPointerException("The date Article Value is " + date);
        }
        this.date = date;
    }

    public String getPage() {
        return page;
    }

    /**
     * Mutator for page articletexte .
     *
     * @param page String type
     * @throws RuntimeException     if page is empty.
     * @throws NullPointerException if date is null.
     */
    public void setPage(String page) throws RuntimeException, NullPointerException {

        if (page == null) {
            log.debug("The Value of page Article is " + page);
            throw new NullPointerException("The Value of page Article is " + page);
        }

        if (page.trim().isEmpty()) {
            log.debug("The Value of page Article is Empty ");
            throw new RuntimeException("The Value of page Article is Empty ");
        }

        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    /**
     * Mutator for title articletexte .
     *
     * @param title
     * @throws RuntimeException     if title is empty.
     * @throws NullPointerException if title is null.
     */
    public void setTitle(String title) throws RuntimeException, NullPointerException {

        if (title == null) {
            log.debug("The Value of title Article is " + title);
            throw new NullPointerException("The title Article Value is " + title);
        }

        if (title.trim().isEmpty()) {
            log.debug("The Value of title Article is Empty ");
            throw new RuntimeException("The Value of title Article is Empty ");
        }

        this.title = title;
    }

    public String getArticletexte() {
        return articletexte;
    }

    public void setArticletexte(String articletexte) throws RuntimeException, NullPointerException {

        if (articletexte == null) {
            log.debug("The Value of Article is " + articletexte);
            throw new NullPointerException("The title Article Value is " + articletexte);
        }

        if (articletexte.trim().isEmpty()) {
            log.debug("The Value of Article is Empty ");
            throw new RuntimeException("The Value of Article is Empty ");
        }
        this.articletexte = articletexte;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) throws RuntimeException, NullPointerException {

        if (pathImage == null) {
            log.debug("The Value of path Image Article is " + pathImage);
            throw new NullPointerException("The Value of path Image Article is " + pathImage);
        }

        if (pathImage.trim().isEmpty()) {
            log.debug("The Value of path Image Article is Empty ");
            throw new RuntimeException("The Value of path Image Article is Empty ");
        }


        this.pathImage = pathImage;
    }

    public String getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(String commentImage) throws RuntimeException, NullPointerException {

        if (commentImage == null) {
            log.debug("The Value of comment Image Article is " + commentImage);
            throw new NullPointerException("The Value of comment Image Article is " + commentImage);
        }

        if (commentImage.trim().isEmpty()) {
            log.debug("The Value of comment Image Article is Empty ");
            throw new RuntimeException("The Value of comment Image Article is Empty ");
        }

        this.commentImage = commentImage;
    }

    @Override
    public String toString() {
        return "ArticleBlog{" +
                "id=" + id +
                ", date=" + date +
                ", page='" + page + '\'' +
                ", title='" + title + '\'' +
                ", articletexte='" + articletexte + '\'' +
                ", pathImage='" + pathImage + '\'' +
                ", commentImage='" + commentImage + '\'' +
                '}';
    }
}
