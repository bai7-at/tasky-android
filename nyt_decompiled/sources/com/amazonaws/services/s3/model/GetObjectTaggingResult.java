package com.amazonaws.services.s3.model;

import java.util.List;

/* loaded from: classes2.dex */
public class GetObjectTaggingResult {
    private List<Tag> tagSet;
    private String versionId;

    public GetObjectTaggingResult(List<Tag> list) {
        this.tagSet = list;
    }

    public List<Tag> getTagSet() {
        return this.tagSet;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public void setTagSet(List<Tag> list) {
        this.tagSet = list;
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }

    public GetObjectTaggingResult withTagSet(List<Tag> list) {
        setTagSet(list);
        return this;
    }

    public GetObjectTaggingResult withVersionId(String str) {
        setVersionId(str);
        return this;
    }
}
