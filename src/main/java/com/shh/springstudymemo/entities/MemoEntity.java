package com.shh.springstudymemo.entities;

import java.util.Date;
import java.util.Objects;

public class MemoEntity {
    private int index;
    private String writer;
    private String content;
    private Date writtenAt;
    private boolean isDeleted;

    // getter,setter 역할 객체 내부 속성에 직접 접근하지 않아 객체의 정보 은닉을 가능하게 해주어 보안을 강화할 수 있고, 코드의 안전성과 유지보수성을 높일 수 있다는 장점이 있다. 또한 옳지않은 값을 넣으려고 할때 이를 미연에 방지할 수 있다
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getWrittenAt() {
        return writtenAt;
    }

    public void setWrittenAt(Date writtenAt) {
        this.writtenAt = writtenAt;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    // 기본 키(Primary Key)를 의미하는 멤버 변수에 대해 equals() 및 hashCode() 메서드를 반드시 재정의 하기 위한 것으로
    // 방법은 alt + ins 에서 equals() and hashCode() 에서 기존 DB에 있는 Primary key 만 체크하여 새로 설정 해주면된다 현제는 index 로 지정
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemoEntity that = (MemoEntity) o;
        return index == that.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }
}
