package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class ParsedHtmlText {

    @SerializedName("clean_text")
    private final String cleanText;

    @SerializedName("parsed_tags")
    private final List<Tag> tags;

    public ParsedHtmlText(List<Tag> list, String str) {
        this.tags = list;
        this.cleanText = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ParsedHtmlText copy$default(ParsedHtmlText parsedHtmlText, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = parsedHtmlText.tags;
        }
        if ((i & 2) != 0) {
            str = parsedHtmlText.cleanText;
        }
        return parsedHtmlText.copy(list, str);
    }

    public final List<Tag> component1() {
        return this.tags;
    }

    public final String component2() {
        return this.cleanText;
    }

    public final ParsedHtmlText copy(List<Tag> list, String str) {
        return new ParsedHtmlText(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsedHtmlText)) {
            return false;
        }
        ParsedHtmlText parsedHtmlText = (ParsedHtmlText) obj;
        return zq3.c(this.tags, parsedHtmlText.tags) && zq3.c(this.cleanText, parsedHtmlText.cleanText);
    }

    public final String getCleanText() {
        return this.cleanText;
    }

    public final String getNonNullableCleanText() {
        String str = this.cleanText;
        return str == null ? "" : str;
    }

    public final List<Tag> getNonNullableTags() {
        List<Tag> list = this.tags;
        return list == null ? i.l() : list;
    }

    public final List<Tag> getTags() {
        return this.tags;
    }

    public int hashCode() {
        List<Tag> list = this.tags;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.cleanText;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ParsedHtmlText(tags=" + this.tags + ", cleanText=" + this.cleanText + ")";
    }

    public /* synthetic */ ParsedHtmlText(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, str);
    }
}
