package defpackage;

import defpackage.nk5;
import type.adapter.PersonalizationAppType_ResponseAdapter;
import type.adapter.PersonalizationDeviceType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class yq1 {
    public static final yq1 a = new yq1();

    private yq1() {
    }

    public final void a(lu3 lu3Var, uq1 uq1Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(uq1Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("programID");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, uq1Var.j());
        lu3Var.name("dataIDs");
        j8.a(h8Var).toJson(lu3Var, w41Var, uq1Var.e());
        lu3Var.name("fetchCount");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(uq1Var.h()));
        if (uq1Var.d() instanceof nk5.c) {
            lu3Var.name("appType");
            j8.e(j8.b(PersonalizationAppType_ResponseAdapter.INSTANCE)).toJson(lu3Var, w41Var, (nk5.c) uq1Var.d());
        }
        if (uq1Var.f() instanceof nk5.c) {
            lu3Var.name("deviceType");
            j8.e(j8.b(PersonalizationDeviceType_ResponseAdapter.INSTANCE)).toJson(lu3Var, w41Var, (nk5.c) uq1Var.f());
        }
        lu3Var.name("prop");
        h8Var.toJson(lu3Var, w41Var, uq1Var.k());
        lu3Var.name("edn");
        h8Var.toJson(lu3Var, w41Var, uq1Var.g());
        lu3Var.name("plat");
        h8Var.toJson(lu3Var, w41Var, uq1Var.i());
        lu3Var.name("ver");
        h8Var.toJson(lu3Var, w41Var, uq1Var.l());
    }
}
