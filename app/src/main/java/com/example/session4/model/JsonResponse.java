package com.example.session4.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonResponse {

    @SerializedName("items")
    @Expose
    List<Item> items;

    @SerializedName("has_more")
    @Expose
    Boolean has_more;

    @SerializedName("backoff")
    @Expose
    Integer backoff;

    @SerializedName("quota_max")
    @Expose
    Integer quota_max;

    @SerializedName("quota_remaining")
    @Expose
    Integer quota_remaining;

    public JsonResponse(List<Item> items, boolean has_more, Integer backoff, Integer quota_max, Integer quota_remaining) {
        this.items = items;
        this.has_more = has_more;
        this.backoff = backoff;
        this.quota_max = quota_max;
        this.quota_remaining = quota_remaining;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public Integer getBackoff() {
        return backoff;
    }

    public void setBackoff(Integer backoff) {
        this.backoff = backoff;
    }

    public Integer getQuota_max() {
        return quota_max;
    }

    public void setQuota_max(Integer quota_max) {
        this.quota_max = quota_max;
    }

    public Integer getQuota_remaining() {
        return quota_remaining;
    }

    public void setQuota_remaining(Integer quota_remaining) {
        this.quota_remaining = quota_remaining;
    }
}
