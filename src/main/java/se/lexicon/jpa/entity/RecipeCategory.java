package se.lexicon.jpa.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class RecipeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;
    @Column(nullable = false, length = 255)
    private String category;

    public RecipeCategory() {
    }


    public RecipeCategory(String category) {
        this.category = category;
    }

    public RecipeCategory(int categoryId, String category) {
        this.categoryId = categoryId;
        this.category = category;
    }

    public RecipeCategory(String category, List<Recipe> recipes) {
        this.category = category;
    }

    public RecipeCategory(int recipe_categoryId, String category, List<Recipe> recipes) {
        this.categoryId = recipe_categoryId;
        this.category = category;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return categoryId == that.categoryId && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, category);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "categoryId=" + categoryId +
                ", category='" + category + '\'' +
                '}';
    }
}
