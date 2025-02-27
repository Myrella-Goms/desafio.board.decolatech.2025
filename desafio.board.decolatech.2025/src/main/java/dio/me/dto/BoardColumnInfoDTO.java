package dio.me.dto;

import dio.me.persistence.entity.BoardColumnsKindEnum;

public class BoardColumnInfoDTO {
    private Long id;
    private int order;
    private BoardColumnsKindEnum kind;

    public BoardColumnInfoDTO() {
    }

    public BoardColumnInfoDTO(Long id, int order, BoardColumnsKindEnum kind) {
        this.id = id;
        this.order = order;
        this.kind = kind;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public BoardColumnsKindEnum getKind() {
        return kind;
    }

    public void setKind(BoardColumnsKindEnum kind) {
        this.kind = kind;
    }
}
