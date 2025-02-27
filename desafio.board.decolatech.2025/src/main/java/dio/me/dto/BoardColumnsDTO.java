package dio.me.dto;

import dio.me.persistence.entity.BoardColumnsKindEnum;

public class BoardColumnsDTO {
    private Long id;
    private String name;
    private BoardColumnsKindEnum kind;
    private int cardsAmount;

    public BoardColumnsDTO() {}

    public BoardColumnsDTO(Long id, String name, BoardColumnsKindEnum kind, int cardsAmount) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.cardsAmount = cardsAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoardColumnsKindEnum getKind() {
        return kind;
    }

    public void setKind(BoardColumnsKindEnum kind) {
        this.kind = kind;
    }

    public int getCardsAmount() {
        return cardsAmount;
    }

    public void setCardsAmount(int cardsAmount) {
        this.cardsAmount = cardsAmount;
    }
}
