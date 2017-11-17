package com.test.demo.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Ryan on 2017/11/16/0016.
 */
public class Room {
    private Integer roomId;
    @NotEmpty
    @Size(min = 3, max = 20, message = "The size of room name should between 3 and 20")
    private String roomName;
    private String comment;
    private List<Integer> arr;

    public List<Integer> getArr() {
        return arr;
    }

    public void setArr(List<Integer> arr) {
        this.arr = arr;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
