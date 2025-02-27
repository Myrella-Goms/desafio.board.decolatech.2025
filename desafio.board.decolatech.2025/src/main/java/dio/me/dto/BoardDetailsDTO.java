package dio.me.dto;

import java.util.List;

public class BoardDetailsDTO {
    private Long id;
    private String name;
    private List<BoardColumnsDTO> columns;

    public BoardDetailsDTO() {}

    public BoardDetailsDTO(Long id, String name, List<BoardColumnsDTO> columns) {
        this.id = id;
        this.name = name;
        this.columns = columns;
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

    public List<BoardColumnsDTO> getColumns() {
        return columns;
    }

    public void setColumns(List<BoardColumnsDTO> columns) {
        this.columns = columns;
    }
}
