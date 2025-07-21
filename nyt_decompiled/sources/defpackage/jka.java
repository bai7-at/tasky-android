package defpackage;

/* loaded from: classes3.dex */
public final class jka {
    final long a;
    final String b;
    final int c;

    jka(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof jka)) {
            jka jkaVar = (jka) obj;
            if (jkaVar.a == this.a && jkaVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.a;
    }
}
