package com.nytimes.android.messaging.postloginregioffers.view;

import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.messaging.postloginregioffers.model.PostAuthOfferData;
import com.nytimes.android.messaging.postloginregioffers.model.PostAuthOffersData;
import com.nytimes.android.messaging.postloginregioffers.model.PostRegiLoginOfferConfig;
import com.squareup.moshi.i;
import defpackage.ha2;
import defpackage.jk;
import defpackage.qv6;
import defpackage.z58;
import defpackage.zq3;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class PostRegiLoginOfferViewModel extends q {
    private z58 a;
    private qv6 b;
    private final i c;
    private final n d;
    private final MutableStateFlow e;
    private final StateFlow f;
    private final MutableStateFlow g;
    private final StateFlow h;
    private MutableStateFlow i;
    private StateFlow j;
    private MutableStateFlow k;
    private StateFlow l;
    private MutableStateFlow m;
    private StateFlow n;
    private final MutableStateFlow r;
    private final StateFlow s;
    private final MutableStateFlow t;
    private final StateFlow u;

    public static abstract class a {

        /* renamed from: com.nytimes.android.messaging.postloginregioffers.view.PostRegiLoginOfferViewModel$a$a, reason: collision with other inner class name */
        public static final class C0364a extends a {
            public static final C0364a a = new C0364a();

            private C0364a() {
                super(null);
            }
        }

        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super(null);
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            private c() {
                super(null);
            }
        }

        public static final class d extends a {
            public static final d a = new d();

            private d() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PostRegiLoginOfferViewModel(z58 z58Var, qv6 qv6Var, i iVar, n nVar) {
        zq3.h(z58Var, "subauthClient");
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(iVar, "moshi");
        zq3.h(nVar, "savedStateHandle");
        this.a = z58Var;
        this.b = qv6Var;
        this.c = iVar;
        this.d = nVar;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new HashMap());
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow("<not logged in>");
        this.g = MutableStateFlow2;
        this.h = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.i = MutableStateFlow3;
        this.j = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.k = MutableStateFlow4;
        this.l = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow MutableStateFlow5 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.m = MutableStateFlow5;
        this.n = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.r = MutableStateFlow6;
        this.s = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.t = MutableStateFlow7;
        this.u = FlowKt.asStateFlow(MutableStateFlow7);
        r();
        w();
    }

    private final void r() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PostRegiLoginOfferViewModel$getUserInfo$1(this, null), 3, null);
    }

    private final PostRegiLoginOfferConfig t(String str) {
        PostAuthOffersData postAuthOffersData;
        PostAuthOfferData plo;
        PostRegiLoginOfferConfig allAccess;
        PostAuthOfferData pro;
        PostRegiLoginOfferConfig allAccess2;
        try {
            postAuthOffersData = (PostAuthOffersData) this.c.c(PostAuthOffersData.class).fromJson(this.b.B());
        } catch (Exception e) {
            NYTLogger.h(e);
            postAuthOffersData = null;
        }
        return zq3.c(str, "PRO_AA") ? (postAuthOffersData == null || (pro = postAuthOffersData.getPro()) == null || (allAccess2 = pro.getAllAccess()) == null) ? ha2.a.b() : allAccess2 : zq3.c(str, "PLO_AA") ? (postAuthOffersData == null || (plo = postAuthOffersData.getPlo()) == null || (allAccess = plo.getAllAccess()) == null) ? ha2.a.a() : allAccess : ha2.a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(a aVar) {
        this.r.setValue(aVar);
    }

    private final void w() {
        String str = (String) this.d.d("OFFER_TYPE");
        if (str == null) {
            str = "PRO_AA";
        }
        BuildersKt__Builders_commonKt.launch$default(r.a(this), Dispatchers.getIO(), null, new PostRegiLoginOfferViewModel$setupConfigAndProduct$1(this, t(str), null), 2, null);
    }

    public final StateFlow l() {
        return this.u;
    }

    public final StateFlow m() {
        return this.h;
    }

    public final StateFlow n() {
        return this.l;
    }

    public final StateFlow o() {
        return this.s;
    }

    public final StateFlow p() {
        return this.f;
    }

    public final z58 q() {
        return this.a;
    }

    public final StateFlow s() {
        return this.n;
    }

    public final void u(jk jkVar, boolean z, String str, String str2) {
        zq3.h(jkVar, "activity");
        this.m.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PostRegiLoginOfferViewModel$purchaseSku$1(str, this, jkVar, str2, z, null), 3, null);
    }

    public final void x() {
        this.k.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
    }
}
