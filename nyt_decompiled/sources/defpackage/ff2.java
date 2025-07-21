package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ff2 implements ak7 {
    private final File a;
    private final FileWalkDirection b;
    private final ss2 c;
    private final ss2 d;
    private final gt2 e;
    private final int f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            zq3.h(file, "rootDir");
        }
    }

    private final class b extends f1 {
        private final ArrayDeque c;

        private final class a extends a {
            private boolean b;
            private File[] c;
            private int d;
            private boolean e;
            final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                zq3.h(file, "rootDir");
                this.f = bVar;
            }

            @Override // ff2.c
            public File b() {
                if (!this.e && this.c == null) {
                    ss2 ss2Var = ff2.this.c;
                    if (ss2Var != null && !((Boolean) ss2Var.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        gt2 gt2Var = ff2.this.e;
                        if (gt2Var != null) {
                            gt2Var.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    zq3.e(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.c;
                        zq3.e(fileArr2);
                        int i2 = this.d;
                        this.d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return a();
                }
                ss2 ss2Var2 = ff2.this.d;
                if (ss2Var2 != null) {
                    ss2Var2.invoke(a());
                }
                return null;
            }
        }

        /* renamed from: ff2$b$b, reason: collision with other inner class name */
        private final class C0484b extends c {
            private boolean b;
            final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0484b(b bVar, File file) {
                super(file);
                zq3.h(file, "rootFile");
                this.c = bVar;
            }

            @Override // ff2.c
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        private final class c extends a {
            private boolean b;
            private File[] c;
            private int d;
            final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                zq3.h(file, "rootDir");
                this.e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // ff2.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.b
                    r1 = 0
                    if (r0 != 0) goto L28
                    ff2$b r0 = r10.e
                    ff2 r0 = defpackage.ff2.this
                    ss2 r0 = defpackage.ff2.d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.b = r0
                    java.io.File r10 = r10.a()
                    return r10
                L28:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L47
                    int r2 = r10.d
                    defpackage.zq3.e(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    ff2$b r0 = r10.e
                    ff2 r0 = defpackage.ff2.this
                    ss2 r0 = defpackage.ff2.f(r0)
                    if (r0 == 0) goto L46
                    java.io.File r10 = r10.a()
                    r0.invoke(r10)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.c
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.c = r0
                    if (r0 != 0) goto L77
                    ff2$b r0 = r10.e
                    ff2 r0 = defpackage.ff2.this
                    gt2 r0 = defpackage.ff2.e(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L81
                    defpackage.zq3.e(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    ff2$b r0 = r10.e
                    ff2 r0 = defpackage.ff2.this
                    ss2 r0 = defpackage.ff2.f(r0)
                    if (r0 == 0) goto L92
                    java.io.File r10 = r10.a()
                    r0.invoke(r10)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.c
                    defpackage.zq3.e(r0)
                    int r1 = r10.d
                    int r2 = r1 + 1
                    r10.d = r2
                    r10 = r0[r1]
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ff2.b.c.b():java.io.File");
            }
        }

        public /* synthetic */ class d {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.c = arrayDeque;
            if (ff2.this.a.isDirectory()) {
                arrayDeque.push(h(ff2.this.a));
            } else if (ff2.this.a.isFile()) {
                arrayDeque.push(new C0484b(this, ff2.this.a));
            } else {
                d();
            }
        }

        private final a h(File file) {
            int i = d.a[ff2.this.b.ordinal()];
            if (i == 1) {
                return new c(this, file);
            }
            if (i == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File i() {
            File b;
            while (true) {
                c cVar = (c) this.c.peek();
                if (cVar == null) {
                    return null;
                }
                b = cVar.b();
                if (b == null) {
                    this.c.pop();
                } else {
                    if (zq3.c(b, cVar.a()) || !b.isDirectory() || this.c.size() >= ff2.this.f) {
                        break;
                    }
                    this.c.push(h(b));
                }
            }
            return b;
        }

        @Override // defpackage.f1
        protected void c() {
            File i = i();
            if (i != null) {
                f(i);
            } else {
                d();
            }
        }
    }

    private static abstract class c {
        private final File a;

        public c(File file) {
            zq3.h(file, "root");
            this.a = file;
        }

        public final File a() {
            return this.a;
        }

        public abstract File b();
    }

    private ff2(File file, FileWalkDirection fileWalkDirection, ss2 ss2Var, ss2 ss2Var2, gt2 gt2Var, int i) {
        this.a = file;
        this.b = fileWalkDirection;
        this.c = ss2Var;
        this.d = ss2Var2;
        this.e = gt2Var;
        this.f = i;
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        return new b();
    }

    /* synthetic */ ff2(File file, FileWalkDirection fileWalkDirection, ss2 ss2Var, ss2 ss2Var2, gt2 gt2Var, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, ss2Var, ss2Var2, gt2Var, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ff2(File file, FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        zq3.h(file, "start");
        zq3.h(fileWalkDirection, "direction");
    }
}
