package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.jp5;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.internal.ZipFilesKt;

/* loaded from: classes5.dex */
public final class xm9 extends we2 {
    private static final a i = new a(null);
    private static final jp5 j = jp5.a.e(jp5.b, "/", false, 1, null);
    private final jp5 e;
    private final we2 f;
    private final Map g;
    private final String h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public xm9(jp5 jp5Var, we2 we2Var, Map map, String str) {
        zq3.h(jp5Var, "zipPath");
        zq3.h(we2Var, "fileSystem");
        zq3.h(map, "entries");
        this.e = jp5Var;
        this.f = we2Var;
        this.g = map;
        this.h = str;
    }

    private final jp5 r(jp5 jp5Var) {
        return j.k(jp5Var, true);
    }

    private final List s(jp5 jp5Var, boolean z) {
        wm9 wm9Var = (wm9) this.g.get(r(jp5Var));
        if (wm9Var != null) {
            return i.X0(wm9Var.c());
        }
        if (!z) {
            return null;
        }
        throw new IOException("not a directory: " + jp5Var);
    }

    @Override // defpackage.we2
    public yt7 b(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.we2
    public void c(jp5 jp5Var, jp5 jp5Var2) {
        zq3.h(jp5Var, "source");
        zq3.h(jp5Var2, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.we2
    public void g(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.we2
    public void i(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.we2
    public List k(jp5 jp5Var) {
        zq3.h(jp5Var, "dir");
        List s = s(jp5Var, true);
        zq3.e(s);
        return s;
    }

    @Override // defpackage.we2
    public ne2 m(jp5 jp5Var) {
        Throwable th;
        Throwable th2;
        zq3.h(jp5Var, "path");
        wm9 wm9Var = (wm9) this.g.get(r(jp5Var));
        if (wm9Var == null) {
            return null;
        }
        if (wm9Var.i() != -1) {
            fe2 n = this.f.n(this.e);
            try {
                sd0 d = wd5.d(n.C(wm9Var.i()));
                try {
                    wm9Var = ZipFilesKt.j(d, wm9Var);
                    if (d != null) {
                        try {
                            d.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    th2 = null;
                } catch (Throwable th4) {
                    if (d != null) {
                        try {
                            d.close();
                        } catch (Throwable th5) {
                            g62.a(th4, th5);
                        }
                    }
                    th2 = th4;
                    wm9Var = null;
                }
            } catch (Throwable th6) {
                if (n != null) {
                    try {
                        n.close();
                    } catch (Throwable th7) {
                        g62.a(th6, th7);
                    }
                }
                th = th6;
                wm9Var = null;
            }
            if (th2 != null) {
                throw th2;
            }
            if (n != null) {
                try {
                    n.close();
                } catch (Throwable th8) {
                    th = th8;
                }
            }
            th = null;
            if (th != null) {
                throw th;
            }
        }
        return new ne2(!wm9Var.k(), wm9Var.k(), null, wm9Var.k() ? null : Long.valueOf(wm9Var.j()), wm9Var.f(), wm9Var.h(), wm9Var.g(), null, 128, null);
    }

    @Override // defpackage.we2
    public fe2 n(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.we2
    public yt7 p(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.we2
    public px7 q(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        wm9 wm9Var = (wm9) this.g.get(r(jp5Var));
        if (wm9Var == null) {
            throw new FileNotFoundException("no such file: " + jp5Var);
        }
        fe2 n = this.f.n(this.e);
        sd0 th = null;
        try {
            sd0 d = wd5.d(n.C(wm9Var.i()));
            if (n != null) {
                try {
                    n.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = d;
        } catch (Throwable th3) {
            th = th3;
            if (n != null) {
                try {
                    n.close();
                } catch (Throwable th4) {
                    g62.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        ZipFilesKt.m(th);
        return wm9Var.e() == 0 ? new sj2(th, wm9Var.j(), true) : new sj2(new qj3(new sj2(th, wm9Var.d(), true), new Inflater(true)), wm9Var.j(), false);
    }
}
