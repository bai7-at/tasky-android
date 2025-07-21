package com.airbnb.android.showkase.models;

import defpackage.hr7;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.zq3;

/* loaded from: classes.dex */
public abstract class ShowkaseBrowserScreenMetadataKt {
    public static final void a(sy4 sy4Var) {
        zq3.h(sy4Var, "<this>");
        d(sy4Var, new ss2() { // from class: com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt$clear$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final hr7 invoke(hr7 hr7Var) {
                zq3.h(hr7Var, "$this$update");
                return hr7Var.a(null, null, null, null, false, null);
            }
        });
    }

    public static final void b(sy4 sy4Var) {
        zq3.h(sy4Var, "<this>");
        d(sy4Var, new ss2() { // from class: com.airbnb.android.showkase.models.ShowkaseBrowserScreenMetadataKt$clearActiveSearch$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final hr7 invoke(hr7 hr7Var) {
                zq3.h(hr7Var, "$this$update");
                return hr7.b(hr7Var, null, null, null, null, false, null, 15, null);
            }
        });
    }

    public static final boolean c(String str) {
        return zq3.c(str, ShowkaseCurrentScreen.COMPONENTS_IN_A_GROUP.name()) || zq3.c(str, ShowkaseCurrentScreen.COLORS_IN_A_GROUP.name()) || zq3.c(str, ShowkaseCurrentScreen.TYPOGRAPHY_IN_A_GROUP.name());
    }

    public static final void d(sy4 sy4Var, ss2 ss2Var) {
        zq3.h(sy4Var, "<this>");
        zq3.h(ss2Var, "block");
        sy4Var.setValue(ss2Var.invoke(sy4Var.y()));
    }
}
