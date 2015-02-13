package ch.erni.example

class User {

    static hasMany = [items: Item]

    static mappedBy = [items: 'createdBy']

    private Long id;
    private String firstName;
    private String lastName;

    Long getId() {
        return id
    }

    void setId(Long id) {
        this.id = id
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    String getCode() {
        String result = "";
        if (getLastName() != null && getLastName().length() > 1) {
            result = StringUtils.deAccent(getLastName().substring(0, 2));
        }

        if (getFirstName() != null && getFirstName().length() > 1) {
            result += StringUtils.deAccent(getFirstName().substring(0, 2));
        }

        return result.toLowerCase();
    }
}
