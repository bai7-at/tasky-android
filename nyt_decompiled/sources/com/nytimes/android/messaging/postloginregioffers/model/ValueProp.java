package com.nytimes.android.messaging.postloginregioffers.model;

import androidx.annotation.Keep;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
@Keep
/* loaded from: classes4.dex */
public final class ValueProp {
    public static final int $stable = 0;
    private final String header;
    private final String iconName;
    private final String subheader;

    public ValueProp(@bt3(name = "icon_name") String str, String str2, String str3) {
        zq3.h(str, "iconName");
        zq3.h(str2, "header");
        zq3.h(str3, "subheader");
        this.iconName = str;
        this.header = str2;
        this.subheader = str3;
    }

    public static /* synthetic */ ValueProp copy$default(ValueProp valueProp, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = valueProp.iconName;
        }
        if ((i & 2) != 0) {
            str2 = valueProp.header;
        }
        if ((i & 4) != 0) {
            str3 = valueProp.subheader;
        }
        return valueProp.copy(str, str2, str3);
    }

    public final String component1() {
        return this.iconName;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.subheader;
    }

    public final ValueProp copy(@bt3(name = "icon_name") String str, String str2, String str3) {
        zq3.h(str, "iconName");
        zq3.h(str2, "header");
        zq3.h(str3, "subheader");
        return new ValueProp(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueProp)) {
            return false;
        }
        ValueProp valueProp = (ValueProp) obj;
        return zq3.c(this.iconName, valueProp.iconName) && zq3.c(this.header, valueProp.header) && zq3.c(this.subheader, valueProp.subheader);
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public final String getSubheader() {
        return this.subheader;
    }

    public int hashCode() {
        return (((this.iconName.hashCode() * 31) + this.header.hashCode()) * 31) + this.subheader.hashCode();
    }

    public String toString() {
        return "ValueProp(iconName=" + this.iconName + ", header=" + this.header + ", subheader=" + this.subheader + ")";
    }
}
