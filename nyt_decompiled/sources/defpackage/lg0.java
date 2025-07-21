package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public abstract class lg0 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public lg0(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(lg0 lg0Var) {
        if (!this.a.equals(lg0Var.a)) {
            return this.a.compareTo(lg0Var.a);
        }
        long j = this.b - lg0Var.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.d;
    }

    public boolean c() {
        return this.c == -1;
    }

    public String toString() {
        return "[" + this.b + ", " + this.c + "]";
    }
}
