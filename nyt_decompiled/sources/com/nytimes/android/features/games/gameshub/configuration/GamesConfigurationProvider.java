package com.nytimes.android.features.games.gameshub.configuration;

import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ju0;
import defpackage.z58;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class GamesConfigurationProvider {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final z58 a;
    private final ju0 b;
    private final MutableStateFlow c;
    private final StateFlow d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {
        private final boolean a;
        private final String b;
        private final boolean c;
        private final NytGamesConfiguration d;

        public b(boolean z, String str, boolean z2, NytGamesConfiguration nytGamesConfiguration) {
            zq3.h(str, "userEntitlementDescription");
            this.a = z;
            this.b = str;
            this.c = z2;
            this.d = nytGamesConfiguration;
        }

        public final b a(boolean z, String str, boolean z2, NytGamesConfiguration nytGamesConfiguration) {
            zq3.h(str, "userEntitlementDescription");
            return new b(z, str, z2, nytGamesConfiguration);
        }

        public final NytGamesConfiguration b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final boolean e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && zq3.c(this.b, bVar.b) && this.c == bVar.c && zq3.c(this.d, bVar.d);
        }

        public int hashCode() {
            int hashCode = ((((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31;
            NytGamesConfiguration nytGamesConfiguration = this.d;
            return hashCode + (nytGamesConfiguration == null ? 0 : nytGamesConfiguration.hashCode());
        }

        public String toString() {
            return "GamesConfigurationState(isUserGamesSubscribed=" + this.a + ", userEntitlementDescription=" + this.b + ", isAnonUser=" + this.c + ", gameConfiguration=" + this.d + ")";
        }
    }

    public GamesConfigurationProvider(z58 z58Var, ju0 ju0Var) {
        zq3.h(z58Var, "subauth");
        zq3.h(ju0Var, "configurationRepository");
        this.a = z58Var;
        this.b = ju0Var;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new b(false, "", false, null));
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final Object c(boolean z, by0 by0Var) {
        if (z) {
            return "";
        }
        List i = this.a.h().i();
        return ((i.contains("MOW") || i.contains("MM")) && i.contains("CKG")) ? "NEWS AND COOKING SUBSCRIBER" : (i.contains("MOW") || i.contains("MM")) ? "NEWS SUBSCRIBER" : "NOT SUBSCRIBED";
    }

    private final Object d(by0 by0Var) {
        return cc0.a(this.a.O());
    }

    private final Object e(by0 by0Var) {
        return cc0.a(this.a.q());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$fetchGamesConfig$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$fetchGamesConfig$1 r0 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$fetchGamesConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$fetchGamesConfig$1 r0 = new com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$fetchGamesConfig$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            boolean r7 = r0.Z$0
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider r0 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider) r0
            kotlin.f.b(r8)
            goto L8c
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            boolean r7 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider r2 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider) r2
            kotlin.f.b(r8)
            goto L78
        L4b:
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider r7 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider) r7
            kotlin.f.b(r8)
            goto L61
        L53:
            kotlin.f.b(r8)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r0.L$0 = r7
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r2 = r7.c(r8, r0)
            if (r2 != r1) goto L74
            return r1
        L74:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L78:
            java.lang.String r8 = (java.lang.String) r8
            r0.L$0 = r2
            r0.L$1 = r8
            r0.Z$0 = r7
            r0.label = r3
            java.lang.Object r0 = r2.e(r0)
            if (r0 != r1) goto L89
            return r1
        L89:
            r1 = r8
            r8 = r0
            r0 = r2
        L8c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r5
            ju0 r2 = r0.b
            com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration r2 = r2.a(r7)
            kotlinx.coroutines.flow.MutableStateFlow r0 = r0.c
        L9b:
            java.lang.Object r3 = r0.getValue()
            r4 = r3
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$b r4 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider.b) r4
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$b r4 = r4.a(r7, r1, r8, r2)
            boolean r3 = r0.compareAndSet(r3, r4)
            if (r3 == 0) goto L9b
            ww8 r7 = defpackage.ww8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider.a(by0):java.lang.Object");
    }

    public final StateFlow b() {
        return this.d;
    }
}
