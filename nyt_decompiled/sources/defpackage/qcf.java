package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class qcf implements Comparable {
    private final byte[] a;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qcf qcfVar = (qcf) obj;
        int length = this.a.length;
        int length2 = qcfVar.a.length;
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
            byte b2 = qcfVar.a[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qcf) {
            return Arrays.equals(this.a, ((qcf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return p6g.a(this.a);
    }
}
