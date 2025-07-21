package com.nytimes.android.features.home.ui.today;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.lifecycle.Lifecycle;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.HybridWebViewLayoutKt;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScopeKt;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.m;
import com.nytimes.android.performancetrackerclientphoenix.event.base.HybridType;
import com.nytimes.android.readerhybrid.HybridWebView;
import com.nytimes.android.utils.composeutils.ActionUtilsKt;
import defpackage.b27;
import defpackage.cc7;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.kb3;
import defpackage.py1;
import defpackage.qs2;
import defpackage.s5;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ww8;
import defpackage.z12;
import defpackage.zq3;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class ExampleWebviewsKt {
    public static final void a(final String str, final qs2 qs2Var, final boolean z, final qs2 qs2Var2, final ss2 ss2Var, final fe4 fe4Var, Composer composer, final int i) {
        int i2;
        Object obj;
        Composer composer2;
        zq3.h(str, "url");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(qs2Var2, "onScrollTopWebView");
        zq3.h(ss2Var, "onProgressChanged");
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(-1105684521);
        if ((i & 14) == 0) {
            i2 = (h.S(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.a(z) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.C(qs2Var2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.C(ss2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= h.S(fe4Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) == 74898 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-1105684521, i3, -1, "com.nytimes.android.features.home.ui.today.HybridUrlWebView (ExampleWebviews.kt:190)");
            }
            h.z(1396128245);
            ComponentActivity d = s5.d(h, 0);
            h.z(363804603);
            Object A = h.A();
            if (A == Composer.a.a()) {
                try {
                    zq3.e(d);
                    obj = z12.a(d, b27.class);
                } catch (Exception unused) {
                    obj = null;
                }
                A = obj;
                h.q(A);
            }
            h.R();
            h.R();
            b27 b27Var = (b27) A;
            if (b27Var == null) {
                if (b.G()) {
                    b.R();
                }
                cc7 k = h.k();
                if (k != null) {
                    k.a(new gt2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$HybridUrlWebView$entryPoint$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            ExampleWebviewsKt.a(str, qs2Var, z, qs2Var2, ss2Var, fe4Var, composer3, gt6.a(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            m.l lVar = new m.l(new m.c(str, false, true, false, false), null, b27Var.getClock().c(), false);
            int i4 = i3 >> 6;
            composer2 = h;
            py1.d(Boolean.valueOf(z), new ExampleWebviewsKt$HybridUrlWebView$1(qs2Var, z, fe4Var, HybridWebViewLayoutKt.n(lVar, lVar.e(), ss2Var, new ss2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$HybridUrlWebView$webView$1
                public final void invoke(boolean z2) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke(((Boolean) obj2).booleanValue());
                    return ww8.a;
                }
            }, new ss2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$HybridUrlWebView$webView$2
                public final void invoke(String str2) {
                    zq3.h(str2, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((String) obj2);
                    return ww8.a;
                }
            }, new qs2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$HybridUrlWebView$webView$3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m412invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m412invoke();
                    return ww8.a;
                }
            }, new ss2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$HybridUrlWebView$webView$4
                public final void b(com.nytimes.android.fragment.b bVar) {
                    zq3.h(bVar, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    b((com.nytimes.android.fragment.b) obj2);
                    return ww8.a;
                }
            }, true, true, true, null, h, (i4 & 896) | 920349696, 0, 1024), qs2Var2, null), composer2, (i4 & 14) | 64);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$HybridUrlWebView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    ExampleWebviewsKt.a(str, qs2Var, z, qs2Var2, ss2Var, fe4Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-798377658);
        if ((i & 14) == 0) {
            i2 = (h.C(qs2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-798377658, i2, -1, "com.nytimes.android.features.home.ui.today.OnResume (ExampleWebviews.kt:231)");
            }
            h.z(170079336);
            boolean z = (i2 & 14) == 4;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$OnResume$1$1
                    {
                        super(1);
                    }

                    public final void b(Lifecycle.Event event) {
                        zq3.h(event, "event");
                        if (event == Lifecycle.Event.ON_RESUME) {
                            qs2.this.mo865invoke();
                        }
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((Lifecycle.Event) obj);
                        return ww8.a;
                    }
                };
                h.q(A);
            }
            h.R();
            ActionUtilsKt.a(null, (ss2) A, h, 0, 1);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$OnResume$2
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
                    ExampleWebviewsKt.b(qs2.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void c(final boolean z, final qs2 qs2Var, final fe4 fe4Var, final String str, final qs2 qs2Var2, final ss2 ss2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        zq3.h(qs2Var, "onScrollTopWebView");
        zq3.h(fe4Var, "mainTabState");
        zq3.h(str, AssetConstants.HTML);
        zq3.h(qs2Var2, "isCurrentPage");
        zq3.h(ss2Var, "onPullToRefreshEnabled");
        Composer h = composer.h(-791501145);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.S(fe4Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.S(str) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.C(qs2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= h.C(ss2Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) == 74898 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-791501145, i3, -1, "com.nytimes.android.features.home.ui.today.TodayHybridWebView (ExampleWebviews.kt:138)");
            }
            h.z(1396128245);
            ComponentActivity d = s5.d(h, 0);
            h.z(363804603);
            Object A = h.A();
            if (A == Composer.a.a()) {
                try {
                    zq3.e(d);
                    A = z12.a(d, b27.class);
                } catch (Exception unused) {
                    A = null;
                }
                h.q(A);
            }
            h.R();
            h.R();
            final b27 b27Var = (b27) A;
            if (b27Var == null) {
                if (b.G()) {
                    b.R();
                }
                cc7 k = h.k();
                if (k != null) {
                    k.a(new gt2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$entryPoint$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            ExampleWebviewsKt.c(z, qs2Var, fe4Var, str, qs2Var2, ss2Var, composer3, gt6.a(i | 1));
                        }
                    });
                    return;
                }
                return;
            }
            final ET2SimpleScope e = ET2CoroutineScopeKt.e(null, new ExampleWebviewsKt$TodayHybridWebView$et2Scope$1(null), h, 64, 1);
            HybridWebView n = HybridWebViewLayoutKt.n(new m.k(str, null, 2, null), HybridType.Today, new ss2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$webView$1
                public final void invoke(boolean z2) {
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return ww8.a;
                }
            }, ss2Var, new ss2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$webView$2
                public final void invoke(String str2) {
                    zq3.h(str2, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }
            }, new qs2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$webView$3
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m414invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m414invoke();
                    return ww8.a;
                }
            }, new ss2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$webView$4
                public final void b(com.nytimes.android.fragment.b bVar) {
                    zq3.h(bVar, "it");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((com.nytimes.android.fragment.b) obj);
                    return ww8.a;
                }
            }, true, false, true, null, h, ((i3 >> 6) & 7168) | 819683760, 0, 1280);
            composer2 = h;
            py1.d(Boolean.valueOf(z), new ExampleWebviewsKt$TodayHybridWebView$1(qs2Var2, z, fe4Var, n, qs2Var, null), composer2, (i3 & 14) | 64);
            py1.d(ww8.a, new ExampleWebviewsKt$TodayHybridWebView$2(b27Var, n, fe4Var, qs2Var2, null), composer2, 70);
            py1.d(str, new ExampleWebviewsKt$TodayHybridWebView$3(b27Var, null), composer2, ((i3 >> 9) & 14) | 64);
            b(new qs2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m413invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m413invoke() {
                    tx1 c;
                    PageContext i4;
                    kb3 q0 = b27.this.q0();
                    ET2SimpleScope eT2SimpleScope = e;
                    String g = (eT2SimpleScope == null || (c = eT2SimpleScope.c()) == null || (i4 = c.i()) == null) ? null : i4.g();
                    if (g == null) {
                        g = "";
                    }
                    q0.c(g);
                }
            }, composer2, 0);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.features.home.ui.today.ExampleWebviewsKt$TodayHybridWebView$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    ExampleWebviewsKt.c(z, qs2Var, fe4Var, str, qs2Var2, ss2Var, composer3, gt6.a(i | 1));
                }
            });
        }
    }
}
