package org.example.t250331_gpt.domain;

public class Lunch {
    private int id;
    private String name;
    private String category;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() { // ✅ 반드시 있어야 함
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() { // ✅
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() { // ✅
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
