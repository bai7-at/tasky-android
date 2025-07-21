package com.nytimes.android.features.games.gameshub.playtab.usecase;

import defpackage.by0;
import defpackage.oi7;
import defpackage.ui9;
import defpackage.zq3;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.nytimes.android.features.games.gameshub.playtab.usecase.a$a, reason: collision with other inner class name */
    public static final class C0278a {
        public static String a(a aVar, boolean z, int i, Enum r3) {
            zq3.h(r3, "enum");
            return "";
        }

        public static ui9 b(a aVar) {
            return ui9.Companion.c();
        }

        public static void c(a aVar, oi7 oi7Var) {
            zq3.h(oi7Var, "items");
        }
    }

    Object a(CoroutineScope coroutineScope, by0 by0Var);

    Object b(by0 by0Var);

    String c(boolean z, int i, Enum r3);

    ui9 d();

    void e(oi7 oi7Var);
}
