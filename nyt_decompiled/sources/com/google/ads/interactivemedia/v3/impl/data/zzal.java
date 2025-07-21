package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes2.dex */
final class zzal extends zzbp {
    private final int major;
    private final int micro;
    private final int minor;

    zzal(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.micro = i3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbp) {
            zzbp zzbpVar = (zzbp) obj;
            if (this.major == zzbpVar.major() && this.minor == zzbpVar.minor() && this.micro == zzbpVar.micro()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.micro ^ ((((this.major ^ 1000003) * 1000003) ^ this.minor) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int major() {
        return this.major;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int micro() {
        return this.micro;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbp
    public int minor() {
        return this.minor;
    }

    public String toString() {
        return "SecureSignalsVersionData{major=" + this.major + ", minor=" + this.minor + ", micro=" + this.micro + "}";
    }
}
