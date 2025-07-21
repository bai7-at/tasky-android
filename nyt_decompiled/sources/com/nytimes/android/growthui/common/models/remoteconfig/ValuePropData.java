package com.nytimes.android.growthui.common.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class ValuePropData {
    private final String a;
    private final String b;
    private final String c;

    public ValuePropData(String str, String str2, String str3) {
        zq3.h(str, "title");
        zq3.h(str2, "text");
        zq3.h(str3, "icon");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public /* synthetic */ ValuePropData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
