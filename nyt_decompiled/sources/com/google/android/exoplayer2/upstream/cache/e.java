package com.google.android.exoplayer2.upstream.cache;

import defpackage.a84;
import defpackage.lg0;
import defpackage.ow0;
import defpackage.ug1;
import defpackage.ur;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes2.dex */
final class e {
    public final int a;
    public final String b;
    private final TreeSet c;
    private final ArrayList d;
    private ug1 e;

    private static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean a(long j, long j2) {
            long j3 = this.b;
            if (j3 == -1) {
                return j >= this.a;
            }
            if (j2 == -1) {
                return false;
            }
            long j4 = this.a;
            return j4 <= j && j + j2 <= j4 + j3;
        }

        public boolean b(long j, long j2) {
            long j3 = this.a;
            if (j3 > j) {
                return j2 == -1 || j + j2 > j3;
            }
            long j4 = this.b;
            return j4 == -1 || j3 + j4 > j;
        }
    }

    public e(int i, String str) {
        this(i, str, ug1.c);
    }

    public void a(i iVar) {
        this.c.add(iVar);
    }

    public boolean b(ow0 ow0Var) {
        this.e = this.e.f(ow0Var);
        return !r2.equals(r0);
    }

    public ug1 c() {
        return this.e;
    }

    public i d(long j, long j2) {
        i i = i.i(this.b, j);
        i iVar = (i) this.c.floor(i);
        if (iVar != null && iVar.b + iVar.c > j) {
            return iVar;
        }
        i iVar2 = (i) this.c.ceiling(i);
        if (iVar2 != null) {
            long j3 = iVar2.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return i.g(this.b, j, j2);
    }

    public TreeSet e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b.equals(eVar.b) && this.c.equals(eVar.c) && this.e.equals(eVar.e);
    }

    public boolean f() {
        return this.c.isEmpty();
    }

    public boolean g(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            if (((a) this.d.get(i)).a(j, j2)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.d.isEmpty();
    }

    public int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public boolean i(long j, long j2) {
        for (int i = 0; i < this.d.size(); i++) {
            if (((a) this.d.get(i)).b(j, j2)) {
                return false;
            }
        }
        this.d.add(new a(j, j2));
        return true;
    }

    public boolean j(lg0 lg0Var) {
        if (!this.c.remove(lg0Var)) {
            return false;
        }
        File file = lg0Var.e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public i k(i iVar, long j, boolean z) {
        ur.g(this.c.remove(iVar));
        File file = (File) ur.e(iVar.e);
        if (z) {
            File j2 = i.j((File) ur.e(file.getParentFile()), this.a, iVar.b, j);
            if (file.renameTo(j2)) {
                file = j2;
            } else {
                a84.j("CachedContent", "Failed to rename " + file + " to " + j2);
            }
        }
        i d = iVar.d(file, j);
        this.c.add(d);
        return d;
    }

    public void l(long j) {
        for (int i = 0; i < this.d.size(); i++) {
            if (((a) this.d.get(i)).a == j) {
                this.d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public e(int i, String str, ug1 ug1Var) {
        this.a = i;
        this.b = str;
        this.e = ug1Var;
        this.c = new TreeSet();
        this.d = new ArrayList();
    }
}
