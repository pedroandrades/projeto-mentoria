package dbserver.projetomentoria.model;

import java.time.LocalDateTime;

public class Cars {
    private Long id;
    private String name;
    private String description;
    private String brand;
    private boolean available;
    private LocalDateTime createdAt;
    private Long categoriesId;
    private Categories categories;

    public Cars(Long id, String name, String description, String brand, boolean available, LocalDateTime createdAt, Long categoriesId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.available = available;
        this.createdAt = createdAt;
        this.categoriesId = categoriesId;
    }

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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoriesId() {
        return categoriesId;
    }

    public void setCategoriesId(Long categoriesId) {
        this.categoriesId = categoriesId;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
}
