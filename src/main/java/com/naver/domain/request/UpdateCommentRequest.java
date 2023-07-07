package com.naver.domain.request;

public class UpdateCommentRequest {
    private String userId;
    private String commentId;
    private String passWord;
    private String comment;

    public UpdateCommentRequest(String userId, String commentId, String passWord, String comment) {
        this.userId = userId;
        this.commentId = commentId;
        this.passWord = passWord;
        this.comment = comment;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
