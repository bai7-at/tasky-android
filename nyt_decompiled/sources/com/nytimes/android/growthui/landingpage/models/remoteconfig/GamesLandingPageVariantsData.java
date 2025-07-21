package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class GamesLandingPageVariantsData {
    private final GamesLandingPageData a;
    private final Map b;

    public GamesLandingPageVariantsData(GamesLandingPageData gamesLandingPageData, Map map) {
        zq3.h(gamesLandingPageData, "config");
        this.a = gamesLandingPageData;
        this.b = map;
    }

    public final GamesLandingPageData a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesLandingPageVariantsData)) {
            return false;
        }
        GamesLandingPageVariantsData gamesLandingPageVariantsData = (GamesLandingPageVariantsData) obj;
        return zq3.c(this.a, gamesLandingPageVariantsData.a) && zq3.c(this.b, gamesLandingPageVariantsData.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "GamesLandingPageVariantsData(config=" + this.a + ", variants=" + this.b + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ GamesLandingPageVariantsData(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData r32, java.util.Map r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r31 = this;
            r0 = r34 & 1
            if (r0 == 0) goto L38
            com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData r0 = new com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData
            r1 = r0
            r29 = 134217727(0x7ffffff, float:3.8518597E-34)
            r30 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L3a
        L38:
            r0 = r32
        L3a:
            r1 = r34 & 2
            if (r1 == 0) goto L42
            r1 = 0
            r2 = r31
            goto L46
        L42:
            r2 = r31
            r1 = r33
        L46:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageVariantsData.<init>(com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
