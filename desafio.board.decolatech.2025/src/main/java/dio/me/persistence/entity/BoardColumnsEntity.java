package dio.me.persistence.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BoardColumnsEntity {

    private Long id;
    private String name;
    private int order;
    private BoardColumnsKindEnum kind;
    private BoardEntity board = new BoardEntity();
    private List<CardEntity> cards = new ArrayList<>();

    public BoardColumnsEntity(Long id, String name, int order, BoardColumnsKindEnum kind, BoardEntity board, List<CardEntity> cards) {
        this.id = id;
        this.name = name;
        this.order = order;
        this.kind = kind;
        this.board = board;
        this.cards = cards;
    }

    public BoardColumnsEntity() {

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

    public BoardEntity getBoard() {
        return board;
    }

    public void setBoard(BoardEntity board) {
        this.board = board;
    }

    public List<CardEntity> getCards() {
        return cards;
    }

    public void setCards(List<CardEntity> cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardColumnsEntity that = (BoardColumnsEntity) o;
        return order == that.order && Objects.equals(id, that.id) && Objects.equals(name, that.name) && kind == that.kind && Objects.equals(board, that.board);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, order, kind, board);
    }

    @Override
    public String toString() {
        return "BoardColumnEntity{" +
                "board=" + board +
                ", kind=" + kind +
                ", order=" + order +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
