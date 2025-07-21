package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SnackbarKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import defpackage.ag4;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.dh8;
import defpackage.eb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gv1;
import defpackage.it2;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.l74;
import defpackage.li8;
import defpackage.m37;
import defpackage.m60;
import defpackage.no7;
import defpackage.ph8;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tv7;
import defpackage.ve0;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class CustomSnackbarKt {
    public static final void a(final tv7 tv7Var, Modifier modifier, boolean z, no7 no7Var, long j, long j2, long j3, float f, Composer composer, final int i, final int i2) {
        no7 no7Var2;
        int i3;
        long j4;
        long j5;
        final long j6;
        zq3.h(tv7Var, "snackbarData");
        Composer h = composer.h(1548861781);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        boolean z2 = (i2 & 4) != 0 ? false : z;
        if ((i2 & 8) != 0) {
            no7Var2 = ag4.a.b(h, ag4.b).c();
            i3 = i & (-7169);
        } else {
            no7Var2 = no7Var;
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            j4 = eb5.Companion.a(h, 6).f();
            i3 &= -57345;
        } else {
            j4 = j;
        }
        if ((i2 & 32) != 0) {
            i3 &= -458753;
            j5 = eb5.Companion.a(h, 6).t();
        } else {
            j5 = j2;
        }
        if ((i2 & 64) != 0) {
            j6 = eb5.Companion.a(h, 6).o();
            i3 &= -3670017;
        } else {
            j6 = j3;
        }
        final float g = (i2 & 128) != 0 ? bu1.g(6) : f;
        if (b.G()) {
            b.S(1548861781, i3, -1, "com.nytimes.android.designsystem.uicompose.composable.CustomSnackbar (CustomSnackbar.kt:35)");
        }
        final String b = tv7Var.b();
        final long j7 = j6;
        SnackbarKt.c(PaddingKt.i(modifier2, bu1.g(12)), b != null ? zr0.b(h, -1012522953, true, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$CustomSnackbar$actionComposable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1012522953, i4, -1, "com.nytimes.android.designsystem.uicompose.composable.CustomSnackbar.<anonymous> (CustomSnackbar.kt:39)");
                }
                ve0 k = a.a.k(0L, j6, 0L, composer2, a.l << 9, 5);
                final tv7 tv7Var2 = tv7Var;
                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$CustomSnackbar$actionComposable$1.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m341invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m341invoke() {
                        tv7.this.c();
                    }
                };
                final String str = b;
                androidx.compose.material.ButtonKt.d(qs2Var, null, false, null, null, null, null, k, null, zr0.b(composer2, -522794342, true, new it2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$CustomSnackbar$actionComposable$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(m37 m37Var, Composer composer3, int i5) {
                        zq3.h(m37Var, "$this$TextButton");
                        if ((i5 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-522794342, i5, -1, "com.nytimes.android.designsystem.uicompose.composable.CustomSnackbar.<anonymous>.<anonymous> (CustomSnackbar.kt:42)");
                        }
                        TextKt.c(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 805306368, 382);
                if (b.G()) {
                    b.R();
                }
            }
        }) : null, z2, no7Var2, j4, j5, g, zr0.b(h, -905926802, true, new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$CustomSnackbar$1
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-905926802, i4, -1, "com.nytimes.android.designsystem.uicompose.composable.CustomSnackbar.<anonymous> (CustomSnackbar.kt:51)");
                }
                String a = tv7.this.a();
                if (zq3.c(a, "__SAVED__")) {
                    composer2.z(930350758);
                    CustomSnackbarKt.b(new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$CustomSnackbar$1.1
                        public final void b(a.C0064a c0064a) {
                            zq3.h(c0064a, "$this$SavedMessage");
                            int n = c0064a.n(new jy7(0L, 0L, o.b.a(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65531, (DefaultConstructorMarker) null));
                            try {
                                c0064a.i("Saved.");
                                ww8 ww8Var = ww8.a;
                                c0064a.k(n);
                                c0064a.i(" View saved articles in your account.");
                            } catch (Throwable th) {
                                c0064a.k(n);
                                throw th;
                            }
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((a.C0064a) obj);
                            return ww8.a;
                        }
                    }, composer2, 6);
                    composer2.R();
                } else if (zq3.c(a, "__UNSAVED__")) {
                    composer2.z(930351056);
                    CustomSnackbarKt.b(new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$CustomSnackbar$1.2
                        public final void b(a.C0064a c0064a) {
                            zq3.h(c0064a, "$this$SavedMessage");
                            c0064a.i("Removed from ");
                            int n = c0064a.n(new jy7(0L, 0L, o.b.a(), (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, (ph8) null, (jo7) null, (f) null, (gv1) null, 65531, (DefaultConstructorMarker) null));
                            try {
                                c0064a.i("Saved for Later");
                                ww8 ww8Var = ww8.a;
                            } finally {
                                c0064a.k(n);
                            }
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((a.C0064a) obj);
                            return ww8.a;
                        }
                    }, composer2, 6);
                    composer2.R();
                } else {
                    composer2.z(930351302);
                    TextKt.c(tv7.this.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    composer2.R();
                }
                if (b.G()) {
                    b.R();
                }
            }
        }), h, (i3 & 896) | 12582912 | (i3 & 7168) | (57344 & i3) | (458752 & i3) | ((i3 >> 3) & 3670016), 0);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final boolean z3 = z2;
            final no7 no7Var3 = no7Var2;
            final long j8 = j4;
            final long j9 = j5;
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$CustomSnackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    CustomSnackbarKt.a(tv7.this, modifier3, z3, no7Var3, j8, j9, j7, g, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final ss2 ss2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer h = composer.h(-1029355422);
        if ((i & 14) == 0) {
            i2 = (h.C(ss2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1029355422, i2, -1, "com.nytimes.android.designsystem.uicompose.composable.SavedMessage (CustomSnackbar.kt:77)");
            }
            Modifier h2 = SizeKt.h(Modifier.a, 0.0f, 1, null);
            a.C0064a c0064a = new a.C0064a(0, 1, null);
            ss2Var.invoke(c0064a);
            composer2 = h;
            TextKt.d(c0064a.o(), h2, 0L, 0L, null, null, null, 0L, null, dh8.h(dh8.b.a()), 0L, 0, false, 0, 0, null, null, eb5.Companion.c(h, 6).P0(), composer2, 48, 0, 130556);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.CustomSnackbarKt$SavedMessage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i3) {
                    CustomSnackbarKt.b(ss2.this, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
