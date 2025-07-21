package com.nytimes.android.share.sheet;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HexCodes {
    private final String a;
    private final String b;

    public HexCodes(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HexCodes)) {
            return false;
        }
        HexCodes hexCodes = (HexCodes) obj;
        return zq3.c(this.a, hexCodes.a) && zq3.c(this.b, hexCodes.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "HexCodes(backgroundTop=" + this.a + ", backgroundBottom=" + this.b + ")";
    }
}
