package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class jp5 implements Comparable {
    public static final a b = new a(null);
    public static final String c;
    private final ByteString a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ jp5 d(a aVar, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.a(file, z);
        }

        public static /* synthetic */ jp5 e(a aVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.b(str, z);
        }

        public static /* synthetic */ jp5 f(a aVar, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.c(path, z);
        }

        public final jp5 a(File file, boolean z) {
            zq3.h(file, "<this>");
            String file2 = file.toString();
            zq3.g(file2, "toString(...)");
            return b(file2, z);
        }

        public final jp5 b(String str, boolean z) {
            zq3.h(str, "<this>");
            return m.k(str, z);
        }

        public final jp5 c(Path path, boolean z) {
            zq3.h(path, "<this>");
            return b(path.toString(), z);
        }

        private a() {
        }
    }

    static {
        String str = File.separator;
        zq3.g(str, "separator");
        c = str;
    }

    public jp5(ByteString byteString) {
        zq3.h(byteString, "bytes");
        this.a = byteString;
    }

    public static /* synthetic */ jp5 n(jp5 jp5Var, jp5 jp5Var2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jp5Var.k(jp5Var2, z);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(jp5 jp5Var) {
        zq3.h(jp5Var, "other");
        return b().compareTo(jp5Var.b());
    }

    public final ByteString b() {
        return this.a;
    }

    public final jp5 c() {
        int o;
        o = m.o(this);
        if (o == -1) {
            return null;
        }
        return new jp5(b().G(0, o));
    }

    public final List d() {
        int o;
        ArrayList arrayList = new ArrayList();
        o = m.o(this);
        if (o == -1) {
            o = 0;
        } else if (o < b().E() && b().g(o) == 92) {
            o++;
        }
        int E = b().E();
        int i = o;
        while (o < E) {
            if (b().g(o) == 47 || b().g(o) == 92) {
                arrayList.add(b().G(i, o));
                i = o + 1;
            }
            o++;
        }
        if (i < b().E()) {
            arrayList.add(b().G(i, b().E()));
        }
        return arrayList;
    }

    public final boolean e() {
        int o;
        o = m.o(this);
        return o != -1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jp5) && zq3.c(((jp5) obj).b(), b());
    }

    public final String f() {
        return g().K();
    }

    public final ByteString g() {
        int l;
        l = m.l(this);
        return l != -1 ? ByteString.H(b(), l + 1, 0, 2, null) : (q() == null || b().E() != 2) ? b() : ByteString.d;
    }

    public int hashCode() {
        return b().hashCode();
    }

    public final jp5 i() {
        ByteString byteString;
        ByteString byteString2;
        ByteString byteString3;
        boolean n;
        int l;
        jp5 jp5Var;
        ByteString byteString4;
        ByteString byteString5;
        ByteString b2 = b();
        byteString = m.d;
        if (zq3.c(b2, byteString)) {
            return null;
        }
        ByteString b3 = b();
        byteString2 = m.a;
        if (zq3.c(b3, byteString2)) {
            return null;
        }
        ByteString b4 = b();
        byteString3 = m.b;
        if (zq3.c(b4, byteString3)) {
            return null;
        }
        n = m.n(this);
        if (n) {
            return null;
        }
        l = m.l(this);
        if (l != 2 || q() == null) {
            if (l == 1) {
                ByteString b5 = b();
                byteString5 = m.b;
                if (b5.F(byteString5)) {
                    return null;
                }
            }
            if (l != -1 || q() == null) {
                if (l == -1) {
                    byteString4 = m.d;
                    return new jp5(byteString4);
                }
                if (l != 0) {
                    return new jp5(ByteString.H(b(), 0, l, 1, null));
                }
                jp5Var = new jp5(ByteString.H(b(), 0, 1, 1, null));
            } else {
                if (b().E() == 2) {
                    return null;
                }
                jp5Var = new jp5(ByteString.H(b(), 0, 2, 1, null));
            }
        } else {
            if (b().E() == 3) {
                return null;
            }
            jp5Var = new jp5(ByteString.H(b(), 0, 3, 1, null));
        }
        return jp5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r9 = defpackage.m.m(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jp5 j(defpackage.jp5 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "other"
            defpackage.zq3.h(r9, r0)
            jp5 r0 = r8.c()
            jp5 r1 = r9.c()
            boolean r0 = defpackage.zq3.c(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.d()
            java.util.List r2 = r9.d()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = r4
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = defpackage.zq3.c(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            okio.ByteString r3 = r8.b()
            int r3 = r3.E()
            okio.ByteString r6 = r9.b()
            int r6 = r6.E()
            if (r3 != r6) goto L5d
            jp5$a r8 = defpackage.jp5.b
            java.lang.String r9 = "."
            r0 = 0
            r1 = 1
            jp5 r8 = jp5.a.e(r8, r9, r4, r1, r0)
            goto Lb4
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            okio.ByteString r6 = defpackage.m.c()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lb5
            ad0 r1 = new ad0
            r1.<init>()
            okio.ByteString r9 = defpackage.m.f(r9)
            if (r9 != 0) goto L87
            okio.ByteString r9 = defpackage.m.f(r8)
            if (r9 != 0) goto L87
            java.lang.String r8 = defpackage.jp5.c
            okio.ByteString r9 = defpackage.m.i(r8)
        L87:
            int r8 = r2.size()
            r2 = r5
        L8c:
            if (r2 >= r8) goto L9b
            okio.ByteString r3 = defpackage.m.c()
            r1.m1(r3)
            r1.m1(r9)
            int r2 = r2 + 1
            goto L8c
        L9b:
            int r8 = r0.size()
        L9f:
            if (r5 >= r8) goto Lb0
            java.lang.Object r2 = r0.get(r5)
            okio.ByteString r2 = (okio.ByteString) r2
            r1.m1(r2)
            r1.m1(r9)
            int r5 = r5 + 1
            goto L9f
        Lb0:
            jp5 r8 = defpackage.m.q(r1, r4)
        Lb4:
            return r8
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        Ld6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.append(r2)
            r0.append(r8)
            r0.append(r1)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp5.j(jp5):jp5");
    }

    public final jp5 k(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "child");
        return m.j(this, jp5Var, z);
    }

    public final jp5 l(String str) {
        zq3.h(str, "child");
        return m.j(this, m.q(new ad0().V(str), false), false);
    }

    public final File o() {
        return new File(toString());
    }

    public final Path p() {
        Path path = Paths.get(toString(), new String[0]);
        zq3.g(path, "get(...)");
        return path;
    }

    public final Character q() {
        ByteString byteString;
        ByteString b2 = b();
        byteString = m.a;
        if (ByteString.q(b2, byteString, 0, 2, null) != -1 || b().E() < 2 || b().g(1) != 58) {
            return null;
        }
        char g = (char) b().g(0);
        if (('a' > g || g >= '{') && ('A' > g || g >= '[')) {
            return null;
        }
        return Character.valueOf(g);
    }

    public String toString() {
        return b().K();
    }
}
