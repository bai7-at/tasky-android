package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cpc {
    public static final cpc e = new cpc(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public cpc(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = khe.h(i3) ? khe.A(i3, i2) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpc)) {
            return false;
        }
        cpc cpcVar = (cpc) obj;
        return this.a == cpcVar.a && this.b == cpcVar.b && this.c == cpcVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + "]";
    }
}
