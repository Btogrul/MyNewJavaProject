package Archive.mentor.archive_inner.Month_3.M21;

public enum InputCategory {
    NUMBER("Number"),
    TEXT("Text"),
    SPECIAL_CHARACTER("Special character");

    final String category;

    InputCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
