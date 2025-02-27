package dio.me.persistence.entity;

public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private BoardColumnsEntity boardColumn = new BoardColumnsEntity();

    public CardEntity(Long id, String title, String description, BoardColumnsEntity boardColumn) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.boardColumn = boardColumn;
    }

    public CardEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public BoardColumnsEntity getBoardColumn() {
        return boardColumn;
    }

    public void setBoardColumn(BoardColumnsEntity boardColumn) {
        this.boardColumn = boardColumn;
    }
}
