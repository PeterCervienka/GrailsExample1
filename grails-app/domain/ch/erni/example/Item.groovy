package ch.erni.example

class Item {

    static mapping = {
        updated defaultValue: null
        updatedBy defaultValue: null
    }

    static constraints = {
        updated(nullable: true)
        updatedBy(nullable: true)
    }

    static belongsTo = [createdBy:User]

    private Long id;

    private String name;
    private String text;
    private String description;

    private Date created;
    private Date updated;

    private User createdBy;
    private User updatedBy;

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getText() {
        return text
    }

    void setText(String text) {
        this.text = text
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    Date getCreated() {
        return created
    }

    void setCreated(Date created) {
        this.created = created
    }

    Date getUpdated() {
        return updated
    }

    void setUpdated(Date updated) {
        this.updated = updated
    }

    User getCreatedBy() {
        return createdBy
    }

    void setCreatedBy(User createdBy) {
        this.createdBy = createdBy
    }

    User getUpdatedBy() {
        return updatedBy
    }

    void setUpdatedBy(User updatedBy) {
        this.updatedBy = updatedBy
    }
}
