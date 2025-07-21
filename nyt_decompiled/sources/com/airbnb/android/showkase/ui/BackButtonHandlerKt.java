package com.airbnb.android.showkase.ui;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.fe5;
import defpackage.gt2;
import defpackage.m76;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.o76;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes.dex */
public abstract class BackButtonHandlerKt {
    private static final m76 a = CompositionLocalKt.e(new qs2() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$LocalBackPressedDispatcher$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final fe5 mo865invoke() {
            return null;
        }
    });

    public static final void a(final qs2 qs2Var, Composer composer, final int i) {
        final int i2;
        zq3.h(qs2Var, "onBackPressed");
        Composer h = composer.h(-1799539737);
        if ((i & 14) == 0) {
            i2 = (h.S(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1799539737, i2, -1, "com.airbnb.android.showkase.ui.BackButtonHandler (BackButtonHandler.kt:49)");
            }
            Context context = (Context) h.m(AndroidCompositionLocals_androidKt.g());
            while ((context instanceof ContextWrapper) && !(context instanceof fe5)) {
                context = ((ContextWrapper) context).getBaseContext();
                zq3.g(context, "context.baseContext");
            }
            m76 m76Var = a;
            zq3.f(context, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
            CompositionLocalKt.b(new o76[]{m76Var.c((ComponentActivity) context)}, zr0.b(h, -955225945, true, new gt2() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$BackButtonHandler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 11) == 2 && composer2.i()) {
                        composer2.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-955225945, i3, -1, "com.airbnb.android.showkase.ui.BackButtonHandler.<anonymous> (BackButtonHandler.kt:66)");
                    }
                    final qs2 qs2Var2 = qs2.this;
                    composer2.z(1157296644);
                    boolean S = composer2.S(qs2Var2);
                    Object A = composer2.A();
                    if (S || A == Composer.a.a()) {
                        A = new qs2() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$BackButtonHandler$1$1$1
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m139invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m139invoke() {
                                qs2.this.mo865invoke();
                            }
                        };
                        composer2.q(A);
                    }
                    composer2.R();
                    BackButtonHandlerKt.b(false, (qs2) A, composer2, 0, 1);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, 56);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k == null) {
            return;
        }
        k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$BackButtonHandler$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i3) {
                BackButtonHandlerKt.a(qs2.this, composer2, i | 1);
            }
        });
    }

    public static final void b(final boolean z, final qs2 qs2Var, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(qs2Var, "onBackPressed");
        Composer h = composer.h(-876255588);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                z = true;
            }
            if (b.G()) {
                b.S(-876255588, i3, -1, "com.airbnb.android.showkase.ui.handler (BackButtonHandler.kt:29)");
            }
            fe5 fe5Var = (fe5) h.m(a);
            if (fe5Var == null) {
                if (b.G()) {
                    b.R();
                }
                cc7 k = h.k();
                if (k == null) {
                    return;
                }
                k.a(new gt2() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$dispatcher$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        BackButtonHandlerKt.b(z, qs2Var, composer2, i | 1, i2);
                    }
                });
                return;
            }
            final OnBackPressedDispatcher onBackPressedDispatcher = fe5Var.getOnBackPressedDispatcher();
            zq3.g(onBackPressedDispatcher, "enabled: Boolean = true,…).onBackPressedDispatcher");
            h.z(-492369756);
            Object A = h.A();
            if (A == Composer.a.a()) {
                A = new a(z);
                h.q(A);
            }
            h.R();
            final a aVar = (a) A;
            py1.a(onBackPressedDispatcher, new ss2() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$1

                public static final class a implements ms1 {
                    final /* synthetic */ com.airbnb.android.showkase.ui.a a;

                    public a(com.airbnb.android.showkase.ui.a aVar) {
                        this.a = aVar;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.remove();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    zq3.h(ns1Var, "$this$DisposableEffect");
                    OnBackPressedDispatcher.this.i(aVar);
                    return new a(aVar);
                }
            }, h, 8);
            py1.d(Boolean.valueOf(z), new BackButtonHandlerKt$handler$2(aVar, z, null), h, (i3 & 14) | 64);
            py1.d(qs2Var, new BackButtonHandlerKt$handler$3(aVar, qs2Var, null), h, ((i3 >> 3) & 14) | 64);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = h.k();
        if (k2 == null) {
            return;
        }
        k2.a(new gt2() { // from class: com.airbnb.android.showkase.ui.BackButtonHandlerKt$handler$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer2, int i5) {
                BackButtonHandlerKt.b(z, qs2Var, composer2, i | 1, i2);
            }
        });
    }
}
