package dio.me.persistence.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import static dio.me.persistence.entity.BoardColumnsKindEnum.CANCEL;
import static dio.me.persistence.entity.BoardColumnsKindEnum.INITIAL;

public class BoardEntity {

    private Long id;
    private String name;
    private List<BoardColumnsEntity> boardColumns = new ArrayList<>();

    public BoardEntity() {

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

    public List<BoardColumnsEntity> getBoardColumns() {
        return boardColumns;
    }

    public void setBoardColumns(List<BoardColumnsEntity> boardColumns) {
        this.boardColumns = boardColumns;
    }

    private BoardColumnsEntity getFilteredColumn(Predicate<BoardColumnsEntity> filter) {
        return boardColumns.stream()
                .filter(filter)
                .findFirst().orElseThrow();

    }
    public BoardColumnsEntity getInitialColumn(){
        return getFilteredColumn(bc -> bc.getKind().equals(INITIAL));
    }

    public BoardColumnsEntity getCancelColumn(){
        return getFilteredColumn(bc -> bc.getKind().equals(CANCEL));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardEntity that = (BoardEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "BoardEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}