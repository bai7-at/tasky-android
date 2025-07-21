package com.nytimes.android.subauth.credentialmanager.models;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class MetaData {
    private final String a;
    private final String b;

    public MetaData(String str, String str2) {
        zq3.h(str, "contract");
        zq3.h(str2, "version");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaData)) {
            return false;
        }
        MetaData metaData = (MetaData) obj;
        return zq3.c(this.a, metaData.a) && zq3.c(this.b, metaData.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MetaData(contract=" + this.a + ", version=" + this.b + ")";
    }
}
