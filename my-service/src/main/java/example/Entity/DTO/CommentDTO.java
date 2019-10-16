package example.Entity.DTO;

import example.Entity.Comment;

public class CommentDTO {
    private String id;
    private String comment;
    private String createdAt;
    private String updatedAt;
    private String status;
    private Object memberDTO;

    public CommentDTO() {
    }

    public CommentDTO(Comment comment, Object memberDTO) {
        this.id = String.valueOf(comment.getId());
        this.comment = comment.getComment();
        this.memberDTO = memberDTO;
    }
}
