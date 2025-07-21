package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.e;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.android.features.home.ui.today.ExampleWebviewsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class RefreshableHybridWebViewKt {
    public static final void a(final String str, final qs2 qs2Var, final boolean z, final qs2 qs2Var2, final fe4 fe4Var, final qs2 qs2Var3, Composer composer, final int i) {
        int i2;
        final sy4 sy4Var;
        Composer composer2;
        zq3.h(str, "url");
        zq3.h(qs2Var, "isCurrentPage");
        zq3.h(qs2Var2, "onScrollTopWebView");
        zq3.h(fe4Var, "mainTabState");
        zq3.h(qs2Var3, "onProgressFinished");
        Composer h = composer.h(-468824268);
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
            i2 |= h.S(fe4Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 458752) == 0) {
            i2 |= h.C(qs2Var3) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) == 74898 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-468824268, i3, -1, "RefreshableHybridWebView (RefreshableHybridWebView.kt:27)");
            }
            h.z(773894976);
            h.z(-492369756);
            Object A = h.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
                h.q(eVar);
                A = eVar;
            }
            h.R();
            CoroutineScope a = ((e) A).a();
            h.R();
            h.z(1066954620);
            Object A2 = h.A();
            if (A2 == aVar.a()) {
                A2 = b0.e(Boolean.FALSE, null, 2, null);
                h.q(A2);
            }
            sy4 sy4Var2 = (sy4) A2;
            h.R();
            PullRefreshState a2 = PullRefreshStateKt.a(b(sy4Var2), new RefreshableHybridWebViewKt$RefreshableHybridWebView$state$1(a, sy4Var2), 0.0f, 0.0f, h, 0, 12);
            Modifier.a aVar2 = Modifier.a;
            Modifier d = PullRefreshKt.d(aVar2, a2, false, 2, null);
            h.z(733328855);
            Alignment.a aVar3 = Alignment.a;
            rg4 g = BoxKt.g(aVar3.o(), false, h, 0);
            h.z(-1323940314);
            int a3 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a4 = companion.a();
            it2 c = LayoutKt.c(d);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a4);
            } else {
                h.p();
            }
            Composer a5 = Updater.a(h);
            Updater.c(a5, g, companion.e());
            Updater.c(a5, o, companion.g());
            gt2 b = companion.b();
            if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
                a5.q(Integer.valueOf(a3));
                a5.v(Integer.valueOf(a3), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            h.z(1955565477);
            boolean z2 = (i3 & 458752) == 131072;
            Object A3 = h.A();
            if (z2 || A3 == aVar.a()) {
                sy4Var = sy4Var2;
                A3 = new ss2() { // from class: RefreshableHybridWebViewKt$RefreshableHybridWebView$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Boolean) obj).booleanValue());
                        return ww8.a;
                    }

                    public final void invoke(boolean z3) {
                        if (z3) {
                            return;
                        }
                        RefreshableHybridWebViewKt.c(sy4Var, false);
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A3);
            } else {
                sy4Var = sy4Var2;
            }
            h.R();
            ExampleWebviewsKt.a(str, qs2Var, z, qs2Var2, (ss2) A3, fe4Var, h, (i3 & 8190) | (fe4.h << 15) | ((i3 << 3) & 458752));
            composer2 = h;
            PullRefreshIndicatorKt.d(b(sy4Var), a2, boxScopeInstance.c(aVar2, aVar3.m()), 0L, 0L, false, composer2, PullRefreshState.j << 3, 56);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: RefreshableHybridWebViewKt$RefreshableHybridWebView$2
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
                    RefreshableHybridWebViewKt.a(str, qs2Var, z, qs2Var2, fe4Var, qs2Var3, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    private static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job d(CoroutineScope coroutineScope, sy4 sy4Var) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RefreshableHybridWebViewKt$RefreshableHybridWebView$refresh$1(sy4Var, null), 3, null);
        return launch$default;
    }
}
