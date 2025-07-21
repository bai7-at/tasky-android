package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class ule implements Comparable {
    private final byte[] a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ule uleVar = (ule) obj;
        int length = this.a.length;
        int length2 = uleVar.a.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = uleVar.a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ule) {
            return Arrays.equals(this.a, ((ule) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return lze.a(this.a);
    }
}
