package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class ListTagsOfResourceResult implements Serializable {
    private String nextToken;
    private List<Tag> tags;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsOfResourceResult)) {
            return false;
        }
        ListTagsOfResourceResult listTagsOfResourceResult = (ListTagsOfResourceResult) obj;
        if ((listTagsOfResourceResult.getTags() == null) ^ (getTags() == null)) {
            return false;
        }
        if (listTagsOfResourceResult.getTags() != null && !listTagsOfResourceResult.getTags().equals(getTags())) {
            return false;
        }
        if ((listTagsOfResourceResult.getNextToken() == null) ^ (getNextToken() == null)) {
            return false;
        }
        return listTagsOfResourceResult.getNextToken() == null || listTagsOfResourceResult.getNextToken().equals(getNextToken());
    }

    public String getNextToken() {
        return this.nextToken;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return (((getTags() == null ? 0 : getTags().hashCode()) + 31) * 31) + (getNextToken() != null ? getNextToken().hashCode() : 0);
    }

    public void setNextToken(String str) {
        this.nextToken = str;
    }

    public void setTags(Collection<Tag> collection) {
        if (collection == null) {
            this.tags = null;
        } else {
            this.tags = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTags() != null) {
            sb.append("Tags: " + getTags() + ",");
        }
        if (getNextToken() != null) {
            sb.append("NextToken: " + getNextToken());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListTagsOfResourceResult withNextToken(String str) {
        this.nextToken = str;
        return this;
    }

    public ListTagsOfResourceResult withTags(Tag... tagArr) {
        if (getTags() == null) {
            this.tags = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.tags.add(tag);
        }
        return this;
    }

    public ListTagsOfResourceResult withTags(Collection<Tag> collection) {
        setTags(collection);
        return this;
    }
}
