package com.nytimes.android.unfear.core.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import defpackage.kt2;
import defpackage.l34;
import defpackage.zq3;

/* loaded from: classes4.dex */
public interface a {
    public static final C0440a Companion = C0440a.a;

    /* renamed from: com.nytimes.android.unfear.core.composable.a$a, reason: collision with other inner class name */
    public static final class C0440a {
        static final /* synthetic */ C0440a a = new C0440a();
        private static final a b = new C0441a();

        /* renamed from: com.nytimes.android.unfear.core.composable.a$a$a, reason: collision with other inner class name */
        public static final class C0441a implements a {
            C0441a() {
            }

            @Override // com.nytimes.android.unfear.core.composable.a
            public void a(l34 l34Var, Modifier modifier, kt2 kt2Var, Composer composer, int i) {
                zq3.h(l34Var, "obj");
                zq3.h(modifier, "modifier");
                zq3.h(kt2Var, "drawer");
                composer.z(-1383024066);
                if (b.G()) {
                    b.S(-1383024066, i, -1, "com.nytimes.android.unfear.core.composable.UnfearInterceptor.Companion.DEFAULT.<no name provided>.Intercept (UnfearInterceptor.kt:77)");
                }
                kt2Var.invoke(l34Var, modifier, composer, Integer.valueOf(i & 1022));
                if (b.G()) {
                    b.R();
                }
                composer.R();
            }
        }

        private C0440a() {
        }

        public final a a() {
            return b;
        }
    }

    void a(l34 l34Var, Modifier modifier, kt2 kt2Var, Composer composer, int i);
}
