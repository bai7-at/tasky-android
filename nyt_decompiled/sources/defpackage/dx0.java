package defpackage;

import defpackage.nk5;
import type.adapter.SearchSort_ResponseAdapter;

/* loaded from: classes3.dex */
public final class dx0 {
    public static final dx0 a = new dx0();

    private dx0() {
    }

    public final void a(lu3 lu3Var, tw0 tw0Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(tw0Var, "value");
        zq3.h(w41Var, "customScalarAdapters");
        lu3Var.name("query");
        j8.a.toJson(lu3Var, w41Var, tw0Var.f());
        lu3Var.name("sort");
        SearchSort_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, tw0Var.g());
        lu3Var.name("first");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(tw0Var.d()));
        if (tw0Var.e() instanceof nk5.c) {
            lu3Var.name("nextPage");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) tw0Var.e());
        }
    }
}
