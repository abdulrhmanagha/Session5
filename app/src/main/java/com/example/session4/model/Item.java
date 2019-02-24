package com.example.session4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("owner")
    @Expose
    Owner owner;

    @SerializedName("is_accepted")
    @Expose
    Boolean is_accepted;

    @SerializedName("score")
    @Expose
    Integer score;

    @SerializedName("last_activity_date")
    @Expose
    Integer last_activity_date;

    @SerializedName("creation_date")
    @Expose
    Integer creation_date;

    @SerializedName("answer_id")
    @Expose
    Integer answer_id;

    @SerializedName("question_id")
    @Expose
    Integer question_id;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getIs_accepted() {
        return is_accepted;
    }

    public void setIs_accepted(Boolean is_accepted) {
        this.is_accepted = is_accepted;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLast_activity_date() {
        return last_activity_date;
    }

    public void setLast_activity_date(Integer last_activity_date) {
        this.last_activity_date = last_activity_date;
    }

    public Integer getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Integer creation_date) {
        this.creation_date = creation_date;
    }

    public Integer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }
}
