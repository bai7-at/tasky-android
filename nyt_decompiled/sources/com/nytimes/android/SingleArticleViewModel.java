package com.nytimes.android;

import android.content.SharedPreferences;
import androidx.compose.runtime.b0;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.PrefsKtxKt;
import com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactory;
import com.nytimes.android.libs.messagingarchitecture.core.MessageStateFactoryKt;
import com.nytimes.android.m;
import defpackage.b05;
import defpackage.by0;
import defpackage.ru;
import defpackage.st;
import defpackage.sy4;
import defpackage.zq3;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.threeten.bp.Instant;

/* loaded from: classes2.dex */
public final class SingleArticleViewModel extends q {
    private final AssetRetriever a;
    private final n b;
    private final b05 c;
    private final MessageStateFactory d;
    private final ru e;
    private final StateFlow f;
    private final MutableStateFlow g;
    private MutableStateFlow h;
    private final StateFlow i;
    private final sy4 j;

    public SingleArticleViewModel(SharedPreferences sharedPreferences, AssetRetriever assetRetriever, n nVar, b05 b05Var, MessageStateFactory messageStateFactory, ru ruVar) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(nVar, "savedStateHandle");
        zq3.h(b05Var, "clock");
        zq3.h(messageStateFactory, "messageStateFactory");
        zq3.h(ruVar, "athleticChecker");
        this.a = assetRetriever;
        this.b = nVar;
        this.c = b05Var;
        this.d = messageStateFactory;
        this.e = ruVar;
        this.f = PrefsKtxKt.b(sharedPreferences, r.a(this), "air_traffic_control_debug_mode", false, null, 12, null);
        this.g = StateFlowKt.MutableStateFlow(t.i());
        DownloadState downloadState = null;
        boolean z = false;
        String str = null;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new a(downloadState, z, str, 7, null));
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        this.j = b0.e(Boolean.TRUE, null, 2, null);
        s();
    }

    private final m.c g(String str) {
        boolean u = u(str);
        Boolean bool = (Boolean) this.b.d("com.nytimes.android.extra.DEEPLINK");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) this.b.d("com.nytimes.android.extra.FORCE_LOAD_IN_APP");
        return new m.c(str, u, booleanValue, bool2 != null ? bool2.booleanValue() : false, true);
    }

    private final boolean n() {
        return zq3.c(this.b.d("ARTICLE_REFERRING_SOURCE"), "BNA notification");
    }

    private final boolean o() {
        return zq3.c(this.b.d("ARTICLE_REFERRING_SOURCE"), "beta_content_preview");
    }

    private final boolean p() {
        Boolean bool = (Boolean) this.b.d("com.nytimes.android.extra.METER_OVERRIDE");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean q(String str) {
        return str != null && zq3.c(str, this.b.d("com.nytimes.android.extra.METER_OVERRIDE_URL"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091 A[Catch: AssetNotFoundException -> 0x009a, TryCatch #1 {AssetNotFoundException -> 0x009a, blocks: (B:14:0x007d, B:16:0x0083, B:18:0x0087, B:21:0x008d, B:23:0x0091, B:26:0x009f, B:28:0x00a3, B:30:0x00ab, B:32:0x00af, B:34:0x00bd, B:36:0x00c1, B:38:0x00ca, B:40:0x00d4, B:41:0x00d8, B:43:0x00f3, B:45:0x00f7, B:47:0x0105, B:49:0x010b), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[Catch: AssetNotFoundException -> 0x009a, TryCatch #1 {AssetNotFoundException -> 0x009a, blocks: (B:14:0x007d, B:16:0x0083, B:18:0x0087, B:21:0x008d, B:23:0x0091, B:26:0x009f, B:28:0x00a3, B:30:0x00ab, B:32:0x00af, B:34:0x00bd, B:36:0x00c1, B:38:0x00ca, B:40:0x00d4, B:41:0x00d8, B:43:0x00f3, B:45:0x00f7, B:47:0x0105, B:49:0x010b), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.by0 r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.SingleArticleViewModel.r(by0):java.lang.Object");
    }

    private final boolean u(String str) {
        return p() || q(str);
    }

    private final Object v(String str, String str2, by0 by0Var) {
        return this.a.o(com.nytimes.android.assetretriever.e.Companion.c(str, str2), (n() || o()) ? Instant.now() : null, new st[0], by0Var);
    }

    public static /* synthetic */ void y(SingleArticleViewModel singleArticleViewModel, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        singleArticleViewModel.x(z, str);
    }

    public final StateFlow getState() {
        return this.i;
    }

    public final MutableStateFlow i() {
        return this.g;
    }

    public final Flow j() {
        return MessageStateFactoryKt.c(this, "MobileNewsArticle", this.g, this.d);
    }

    public final StateFlow k() {
        return this.f;
    }

    public final boolean l() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.nytimes.android.hybrid.HybridEventListener r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.SingleArticleViewModel$handleCollapse$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.SingleArticleViewModel$handleCollapse$1 r0 = (com.nytimes.android.SingleArticleViewModel$handleCollapse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.SingleArticleViewModel$handleCollapse$1 r0 = new com.nytimes.android.SingleArticleViewModel$handleCollapse$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.SingleArticleViewModel r5 = (com.nytimes.android.SingleArticleViewModel) r5
            kotlin.f.b(r7)
            goto L62
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.f.b(r7)
            kotlinx.coroutines.flow.StateFlow r7 = r5.i
            java.lang.Object r7 = r7.getValue()
            com.nytimes.android.SingleArticleViewModel$a r7 = (com.nytimes.android.SingleArticleViewModel.a) r7
            boolean r2 = r7.d()
            if (r2 == 0) goto L74
            java.lang.String r2 = r7.e()
            if (r2 == 0) goto L74
            int r2 = r2.length()
            if (r2 <= 0) goto L74
            java.lang.String r7 = r7.e()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r6.e(r7, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L74
            r6 = 2
            r7 = 0
            y(r5, r3, r7, r6, r7)
            java.lang.Boolean r5 = defpackage.cc0.a(r4)
            return r5
        L74:
            java.lang.Boolean r5 = defpackage.cc0.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.SingleArticleViewModel.m(com.nytimes.android.hybrid.HybridEventListener, by0):java.lang.Object");
    }

    public final void s() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new SingleArticleViewModel$loadData$1(this, null), 3, null);
    }

    public final void t(boolean z) {
        Object value;
        a b;
        MutableStateFlow mutableStateFlow = this.h;
        do {
            value = mutableStateFlow.getValue();
            a aVar = (a) value;
            if (z) {
                b = a.b(aVar, DownloadState.Companion.b(((a) this.i.getValue()).c().a()), false, null, 6, null);
            } else {
                Object a2 = ((a) this.i.getValue()).c().a();
                zq3.e(a2);
                b = a.b(aVar, new DownloadState.e(a2), false, null, 6, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, b));
    }

    public final void w(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void x(boolean z, String str) {
        Object value;
        MutableStateFlow mutableStateFlow = this.h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, a.b((a) value, null, z, str, 1, null)));
    }

    public static final class a {
        private final DownloadState a;
        private final boolean b;
        private final String c;

        public a(DownloadState downloadState, boolean z, String str) {
            zq3.h(downloadState, "downloadState");
            this.a = downloadState;
            this.b = z;
            this.c = str;
        }

        public static /* synthetic */ a b(a aVar, DownloadState downloadState, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                downloadState = aVar.a;
            }
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            if ((i & 4) != 0) {
                str = aVar.c;
            }
            return aVar.a(downloadState, z, str);
        }

        public final a a(DownloadState downloadState, boolean z, String str) {
            zq3.h(downloadState, "downloadState");
            return new a(downloadState, z, str);
        }

        public final DownloadState c() {
            return this.a;
        }

        public final boolean d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ArticleUIState(downloadState=" + this.a + ", expandFullscreen=" + this.b + ", expandedAdDiv=" + this.c + ")";
        }

        public /* synthetic */ a(DownloadState downloadState, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DownloadState.c.b : downloadState, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
        }
    }
}
