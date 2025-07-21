package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class FollowStatus {
    private final String a;
    private final boolean b;

    public FollowStatus(String str, boolean z) {
        zq3.h(str, "uri");
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowStatus)) {
            return false;
        }
        FollowStatus followStatus = (FollowStatus) obj;
        return zq3.c(this.a, followStatus.a) && this.b == followStatus.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "FollowStatus(uri=" + this.a + ", following=" + this.b + ")";
    }
}
