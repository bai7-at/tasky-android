package com.nytimes.android.growthui.postauth.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class PostAuthConfigsData {
    private final PostAuthData a;
    private final Map b;

    public PostAuthConfigsData(PostAuthData postAuthData, Map map) {
        zq3.h(postAuthData, "config");
        this.a = postAuthData;
        this.b = map;
    }

    public final PostAuthData a() {
        return this.a;
    }

    public final Map b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostAuthConfigsData)) {
            return false;
        }
        PostAuthConfigsData postAuthConfigsData = (PostAuthConfigsData) obj;
        return zq3.c(this.a, postAuthConfigsData.a) && zq3.c(this.b, postAuthConfigsData.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "PostAuthConfigsData(config=" + this.a + ", variants=" + this.b + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ PostAuthConfigsData(com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthData r25, java.util.Map r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r24 = this;
            r0 = r27 & 1
            if (r0 == 0) goto L2a
            com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthData r0 = new com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthData
            r1 = r0
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r23 = 0
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
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L2c
        L2a:
            r0 = r25
        L2c:
            r1 = r27 & 2
            if (r1 == 0) goto L34
            r1 = 0
            r2 = r24
            goto L38
        L34:
            r2 = r24
            r1 = r26
        L38:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigsData.<init>(com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthData, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
