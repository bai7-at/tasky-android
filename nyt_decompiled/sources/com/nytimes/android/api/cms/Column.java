package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Column {

    @SerializedName("display_name")
    private final String displayName;

    @SerializedName("show_picture")
    private final boolean isShowPicture;
    private final String name;

    public Column() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ Column copy$default(Column column, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = column.displayName;
        }
        if ((i & 2) != 0) {
            z = column.isShowPicture;
        }
        if ((i & 4) != 0) {
            str2 = column.name;
        }
        return column.copy(str, z, str2);
    }

    public final String component1() {
        return this.displayName;
    }

    public final boolean component2() {
        return this.isShowPicture;
    }

    public final String component3() {
        return this.name;
    }

    public final Column copy(String str, boolean z, String str2) {
        return new Column(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Column)) {
            return false;
        }
        Column column = (Column) obj;
        return zq3.c(this.displayName, column.displayName) && this.isShowPicture == column.isShowPicture && zq3.c(this.name, column.name);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.displayName;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isShowPicture)) * 31;
        String str2 = this.name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isShowPicture() {
        return this.isShowPicture;
    }

    public String toString() {
        return "Column(displayName=" + this.displayName + ", isShowPicture=" + this.isShowPicture + ", name=" + this.name + ")";
    }

    public Column(String str, boolean z, String str2) {
        this.displayName = str;
        this.isShowPicture = z;
        this.name = str2;
    }

    public /* synthetic */ Column(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }
}
