package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Author {

    @SerializedName("title_case_name")
    private final String authorName;

    /* JADX WARN: Multi-variable type inference failed */
    public Author() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Author copy$default(Author author, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = author.authorName;
        }
        return author.copy(str);
    }

    public final String component1() {
        return this.authorName;
    }

    public final Author copy(String str) {
        return new Author(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Author) && zq3.c(this.authorName, ((Author) obj).authorName);
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public int hashCode() {
        String str = this.authorName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "Author(authorName=" + this.authorName + ")";
    }

    public Author(String str) {
        this.authorName = str;
    }

    public /* synthetic */ Author(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
