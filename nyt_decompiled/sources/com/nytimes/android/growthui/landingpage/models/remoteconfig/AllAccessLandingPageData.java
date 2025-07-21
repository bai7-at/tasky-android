package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AllAccessLandingPageData {
    private final String a;
    private final AllAccessPackageData b;
    private final List c;
    private final List d;

    public AllAccessLandingPageData(@bt3(name = "policy_messages") String str, @bt3(name = "all_access_package") AllAccessPackageData allAccessPackageData, @bt3(name = "urgency_messages") List<AllAccessUrgencyMessageData> list, List<String> list2) {
        zq3.h(str, "policyMessages");
        zq3.h(allAccessPackageData, "allAccessPackage");
        zq3.h(list2, "icons");
        this.a = str;
        this.b = allAccessPackageData;
        this.c = list;
        this.d = list2;
    }

    public final AllAccessPackageData a() {
        return this.b;
    }

    public final List b() {
        return this.d;
    }

    public final String c() {
        return this.a;
    }

    public final AllAccessLandingPageData copy(@bt3(name = "policy_messages") String str, @bt3(name = "all_access_package") AllAccessPackageData allAccessPackageData, @bt3(name = "urgency_messages") List<AllAccessUrgencyMessageData> list, List<String> list2) {
        zq3.h(str, "policyMessages");
        zq3.h(allAccessPackageData, "allAccessPackage");
        zq3.h(list2, "icons");
        return new AllAccessLandingPageData(str, allAccessPackageData, list, list2);
    }

    public final List d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllAccessLandingPageData)) {
            return false;
        }
        AllAccessLandingPageData allAccessLandingPageData = (AllAccessLandingPageData) obj;
        return zq3.c(this.a, allAccessLandingPageData.a) && zq3.c(this.b, allAccessLandingPageData.b) && zq3.c(this.c, allAccessLandingPageData.c) && zq3.c(this.d, allAccessLandingPageData.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        List list = this.c;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AllAccessLandingPageData(policyMessages=" + this.a + ", allAccessPackage=" + this.b + ", urgencyMessages=" + this.c + ", icons=" + this.d + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ AllAccessLandingPageData(java.lang.String r17, com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData r18, java.util.List r19, java.util.List r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r16 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            goto L9
        L7:
            r0 = r17
        L9:
            r1 = r21 & 2
            if (r1 == 0) goto L22
            com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData r1 = new com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData
            r14 = 2047(0x7ff, float:2.868E-42)
            r15 = 0
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
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L24
        L22:
            r1 = r18
        L24:
            r2 = r21 & 4
            if (r2 == 0) goto L2d
            java.util.List r2 = kotlin.collections.i.l()
            goto L2f
        L2d:
            r2 = r19
        L2f:
            r3 = r21 & 8
            if (r3 == 0) goto L3a
            java.util.List r3 = kotlin.collections.i.l()
            r4 = r16
            goto L3e
        L3a:
            r4 = r16
            r3 = r20
        L3e:
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessLandingPageData.<init>(java.lang.String, com.nytimes.android.growthui.landingpage.models.remoteconfig.AllAccessPackageData, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
