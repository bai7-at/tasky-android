package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzem extends zzgl {
    private final String TXXX;

    zzem(String str) {
        if (str == null) {
            throw new NullPointerException("Null TXXX");
        }
        this.TXXX = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgl
    String TXXX() {
        return this.TXXX;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgl) {
            return this.TXXX.equals(((zzgl) obj).TXXX());
        }
        return false;
    }

    public int hashCode() {
        return this.TXXX.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TimedMetadataWithKeys{TXXX=" + this.TXXX + "}";
    }
}
