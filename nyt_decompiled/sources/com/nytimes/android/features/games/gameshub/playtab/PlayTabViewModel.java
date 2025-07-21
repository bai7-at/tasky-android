package com.nytimes.android.features.games.gameshub.playtab;

import android.content.Context;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.ads.games.GameHubAdUseCase;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import com.nytimes.android.features.games.gameshub.configuration.models.CardType;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.b65;
import defpackage.by0;
import defpackage.d8;
import defpackage.ev5;
import defpackage.uy3;
import defpackage.wt2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class PlayTabViewModel extends q {
    public static final a Companion = new a(null);
    public static final int l = 8;
    private final GameHubAdUseCase a;
    private final uy3 b;
    private final ET2SimpleScope c;
    private final ev5 d;
    private final com.nytimes.android.features.games.gameshub.playtab.usecase.a e;
    private final NetworkStatus f;
    private final HashSet g;
    private final MutableStateFlow h;
    private final StateFlow i;
    private final MutableStateFlow j;
    private final StateFlow k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        private final boolean a;
        private final boolean b;
        private final String c;
        private final NytGamesConfiguration d;
        private final d8 e;
        private final List f;

        public b(boolean z, boolean z2, String str, NytGamesConfiguration nytGamesConfiguration, d8 d8Var, List list) {
            zq3.h(str, "userEntitlement");
            zq3.h(d8Var, "bottomAdView");
            zq3.h(list, "gameDetails");
            this.a = z;
            this.b = z2;
            this.c = str;
            this.d = nytGamesConfiguration;
            this.e = d8Var;
            this.f = list;
        }

        public static /* synthetic */ b b(b bVar, boolean z, boolean z2, String str, NytGamesConfiguration nytGamesConfiguration, d8 d8Var, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                z = bVar.a;
            }
            if ((i & 2) != 0) {
                z2 = bVar.b;
            }
            boolean z3 = z2;
            if ((i & 4) != 0) {
                str = bVar.c;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                nytGamesConfiguration = bVar.d;
            }
            NytGamesConfiguration nytGamesConfiguration2 = nytGamesConfiguration;
            if ((i & 16) != 0) {
                d8Var = bVar.e;
            }
            d8 d8Var2 = d8Var;
            if ((i & 32) != 0) {
                list = bVar.f;
            }
            return bVar.a(z, z3, str2, nytGamesConfiguration2, d8Var2, list);
        }

        public final b a(boolean z, boolean z2, String str, NytGamesConfiguration nytGamesConfiguration, d8 d8Var, List list) {
            zq3.h(str, "userEntitlement");
            zq3.h(d8Var, "bottomAdView");
            zq3.h(list, "gameDetails");
            return new b(z, z2, str, nytGamesConfiguration, d8Var, list);
        }

        public final d8 c() {
            return this.e;
        }

        public final NytGamesConfiguration d() {
            return this.d;
        }

        public final List e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e) && zq3.c(this.f, bVar.f);
        }

        public final String f() {
            return this.c;
        }

        public final boolean g() {
            return this.a;
        }

        public final boolean h() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = ((((Boolean.hashCode(this.a) * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31;
            NytGamesConfiguration nytGamesConfiguration = this.d;
            return ((((hashCode + (nytGamesConfiguration == null ? 0 : nytGamesConfiguration.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "PlayTabViewState(isDebugMenuOpen=" + this.a + ", isUserSubscribed=" + this.b + ", userEntitlement=" + this.c + ", config=" + this.d + ", bottomAdView=" + this.e + ", gameDetails=" + this.f + ")";
        }
    }

    public PlayTabViewModel(GameHubAdUseCase gameHubAdUseCase, uy3 uy3Var, ET2SimpleScope eT2SimpleScope, ev5 ev5Var, com.nytimes.android.features.games.gameshub.playtab.usecase.a aVar, NetworkStatus networkStatus) {
        zq3.h(gameHubAdUseCase, "gameHubAdUseCase");
        zq3.h(uy3Var, "launchProductLandingHelper");
        zq3.h(eT2SimpleScope, "et2Scope");
        zq3.h(ev5Var, "playTabEventTracker");
        zq3.h(aVar, "playTabProgressUseCase");
        zq3.h(networkStatus, "networkStatus");
        this.a = gameHubAdUseCase;
        this.b = uy3Var;
        this.c = eT2SimpleScope;
        this.d = ev5Var;
        this.e = aVar;
        this.f = networkStatus;
        this.g = new HashSet();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new b(false, false, "", null, d8.b.b, i.l()));
        this.h = MutableStateFlow;
        this.i = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.j = MutableStateFlow2;
        this.k = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q() {
        this.j.setValue(Boolean.valueOf(this.f.g()));
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void m() {
        this.g.clear();
    }

    public final void n() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PlayTabViewModel$collectGameDetails$1(this, null), 3, null);
    }

    public final void o(Context context) {
        zq3.h(context, "context");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PlayTabViewModel$fetchBottomAd$1(this, context, null), 3, null);
    }

    public final StateFlow p() {
        return this.i;
    }

    public final StateFlow r() {
        return this.k;
    }

    public final Object s(by0 by0Var) {
        Object b2 = this.e.b(by0Var);
        return b2 == kotlin.coroutines.intrinsics.a.h() ? b2 : ww8.a;
    }

    public final Job t(wt2 wt2Var, CardType cardType) {
        Job launch$default;
        zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
        zq3.h(cardType, TransferTable.COLUMN_TYPE);
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PlayTabViewModel$sendImpressionEvent$1(this, wt2Var, cardType, null), 3, null);
        return launch$default;
    }

    public final Job u(wt2 wt2Var, CardType cardType) {
        Job launch$default;
        zq3.h(wt2Var, AssetConstants.DAILY_FIVE_GAME);
        zq3.h(cardType, TransferTable.COLUMN_TYPE);
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PlayTabViewModel$sendInteractionEvent$1(this, wt2Var, cardType, null), 3, null);
        return launch$default;
    }

    public final Job v(b65 b65Var) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new PlayTabViewModel$sendPageEvent$1(this, b65Var, null), 3, null);
        return launch$default;
    }

    public final void w(boolean z) {
        Object value;
        MutableStateFlow mutableStateFlow = this.h;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, b.b((b) value, z, false, null, null, null, null, 62, null)));
    }

    public final void x() {
        this.b.e(false);
    }
}
