package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AllAccessValuePropData {
    private final String a;
    private final String b;
    private final String c;

    public AllAccessValuePropData(String str, String str2, String str3) {
        zq3.h(str, "title");
        zq3.h(str2, "subtitle");
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

    public /* synthetic */ AllAccessValuePropData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "R.drawable.ic_main" : str3);
    }
}
