package com.nytimes.android.api.cms;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Tag {
    public static final String A = "a";
    public static final String B = "b";
    public static final String BLOCK_QUOTE = "blockquote";
    public static final Companion Companion = new Companion(null);
    public static final String EM = "em";
    public static final String EMBEDDED_ID = "embedded_id";
    public static final String EMBEDDED_MEDIA = "embeddedmedia";
    public static final String H4 = "h4";
    public static final String HREF = "href";
    public static final String NYTAD = "nytad";
    public static final String P = "p";
    public static final String STRONG = "strong";
    public static final String SUB = "sub";
    public static final String SUP = "sup";

    @SerializedName("tag_attributes")
    private final Map<String, String> attributes;

    @SerializedName("tag_length")
    private int length;

    @SerializedName("tag_name")
    private String name;

    @SerializedName("tag_position")
    private int position;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Tag(String str, int i, int i2, Map<String, String> map) {
        zq3.h(map, "attributes");
        this.name = str;
        this.length = i;
        this.position = i2;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tag copy$default(Tag tag, String str, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tag.name;
        }
        if ((i3 & 2) != 0) {
            i = tag.length;
        }
        if ((i3 & 4) != 0) {
            i2 = tag.position;
        }
        if ((i3 & 8) != 0) {
            map = tag.attributes;
        }
        return tag.copy(str, i, i2, map);
    }

    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.length;
    }

    public final int component3() {
        return this.position;
    }

    public final Map<String, String> component4() {
        return this.attributes;
    }

    public final Tag copy(String str, int i, int i2, Map<String, String> map) {
        zq3.h(map, "attributes");
        return new Tag(str, i, i2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        return zq3.c(this.name, tag.name) && this.length == tag.length && this.position == tag.position && zq3.c(this.attributes, tag.attributes);
    }

    public final String getAttribute(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.attributes.get(str);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final int getLength() {
        return this.length;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPosition() {
        return this.position;
    }

    public int hashCode() {
        String str = this.name;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.length)) * 31) + Integer.hashCode(this.position)) * 31) + this.attributes.hashCode();
    }

    public final void setLength(int i) {
        this.length = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public String toString() {
        return "Tag(name=" + this.name + ", length=" + this.length + ", position=" + this.position + ", attributes=" + this.attributes + ")";
    }

    public /* synthetic */ Tag(String str, int i, int i2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, map);
    }
}
