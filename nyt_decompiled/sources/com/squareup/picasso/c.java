package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.r;
import defpackage.cg0;
import defpackage.px7;
import defpackage.sd0;
import defpackage.wd5;
import defpackage.wq8;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
class c implements Runnable {
    final int a = B.incrementAndGet();
    final Picasso b;
    final g c;
    final cg0 d;
    final t e;
    final String f;
    final p g;
    final int h;
    int i;
    final r j;
    com.squareup.picasso.a k;
    List l;
    Bitmap m;
    Future n;
    Picasso.LoadedFrom r;
    Exception s;
    int t;
    int u;
    Picasso.Priority w;
    private static final Object x = new Object();
    private static final ThreadLocal y = new a();
    private static final AtomicInteger B = new AtomicInteger();
    private static final r H = new b();

    static class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    static class b extends r {
        b() {
        }

        @Override // com.squareup.picasso.r
        public boolean c(p pVar) {
            return true;
        }

        @Override // com.squareup.picasso.r
        public r.a f(p pVar, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + pVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    static class RunnableC0472c implements Runnable {
        final /* synthetic */ wq8 a;
        final /* synthetic */ RuntimeException b;

        RunnableC0472c(wq8 wq8Var, RuntimeException runtimeException) {
            this.a = wq8Var;
            this.b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.a.a() + " crashed with exception.", this.b);
        }
    }

    static class d implements Runnable {
        final /* synthetic */ StringBuilder a;

        d(StringBuilder sb) {
            this.a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.a.toString());
        }
    }

    static class e implements Runnable {
        final /* synthetic */ wq8 a;

        e(wq8 wq8Var) {
            this.a = wq8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.a.a() + " returned input Bitmap but recycled it.");
        }
    }

    static class f implements Runnable {
        final /* synthetic */ wq8 a;

        f(wq8 wq8Var) {
            this.a = wq8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.a.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    c(Picasso picasso, g gVar, cg0 cg0Var, t tVar, com.squareup.picasso.a aVar, r rVar) {
        this.b = picasso;
        this.c = gVar;
        this.d = cg0Var;
        this.e = tVar;
        this.k = aVar;
        this.f = aVar.d();
        this.g = aVar.i();
        this.w = aVar.h();
        this.h = aVar.e();
        this.i = aVar.f();
        this.j = rVar;
        this.u = rVar.e();
    }

    static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            wq8 wq8Var = (wq8) list.get(i);
            try {
                Bitmap b2 = wq8Var.b(bitmap);
                if (b2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(wq8Var.a());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        sb.append(((wq8) it2.next()).a());
                        sb.append('\n');
                    }
                    Picasso.o.post(new d(sb));
                    return null;
                }
                if (b2 == bitmap && bitmap.isRecycled()) {
                    Picasso.o.post(new e(wq8Var));
                    return null;
                }
                if (b2 != bitmap && !bitmap.isRecycled()) {
                    Picasso.o.post(new f(wq8Var));
                    return null;
                }
                i++;
                bitmap = b2;
            } catch (RuntimeException e2) {
                Picasso.o.post(new RunnableC0472c(wq8Var, e2));
                return null;
            }
        }
        return bitmap;
    }

    private Picasso.Priority d() {
        Picasso.Priority priority = Picasso.Priority.LOW;
        List list = this.l;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.k;
        if (aVar == null && !z) {
            return priority;
        }
        if (aVar != null) {
            priority = aVar.h();
        }
        if (z) {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                Picasso.Priority h = ((com.squareup.picasso.a) this.l.get(i)).h();
                if (h.ordinal() > priority.ordinal()) {
                    priority = h;
                }
            }
        }
        return priority;
    }

    static Bitmap e(px7 px7Var, p pVar) {
        sd0 d2 = wd5.d(px7Var);
        boolean s = w.s(d2);
        boolean z = pVar.r;
        BitmapFactory.Options d3 = r.d(pVar);
        boolean g = r.g(d3);
        if (s) {
            byte[] B0 = d2.B0();
            if (g) {
                BitmapFactory.decodeByteArray(B0, 0, B0.length, d3);
                r.b(pVar.h, pVar.i, d3, pVar);
            }
            return BitmapFactory.decodeByteArray(B0, 0, B0.length, d3);
        }
        InputStream t1 = d2.t1();
        if (g) {
            l lVar = new l(t1);
            lVar.a(false);
            long d4 = lVar.d(1024);
            BitmapFactory.decodeStream(lVar, null, d3);
            r.b(pVar.h, pVar.i, d3, pVar);
            lVar.b(d4);
            lVar.a(true);
            t1 = lVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(t1, null, d3);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static c g(Picasso picasso, g gVar, cg0 cg0Var, t tVar, com.squareup.picasso.a aVar) {
        p i = aVar.i();
        List h = picasso.h();
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) h.get(i2);
            if (rVar.c(i)) {
                return new c(picasso, gVar, cg0Var, tVar, aVar, rVar);
            }
        }
        return new c(picasso, gVar, cg0Var, tVar, aVar, H);
    }

    static int l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    private static boolean v(boolean z, int i, int i2, int i3, int i4) {
        return !z || (i3 != 0 && i > i3) || (i4 != 0 && i2 > i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.graphics.Bitmap y(com.squareup.picasso.p r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.y(com.squareup.picasso.p, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(p pVar) {
        String a2 = pVar.a();
        StringBuilder sb = (StringBuilder) y.get();
        sb.ensureCapacity(a2.length() + 8);
        sb.replace(8, sb.length(), a2);
        Thread.currentThread().setName(sb.toString());
    }

    void b(com.squareup.picasso.a aVar) {
        boolean z = this.b.m;
        p pVar = aVar.b;
        if (this.k == null) {
            this.k = aVar;
            if (z) {
                List list = this.l;
                if (list == null || list.isEmpty()) {
                    w.u("Hunter", "joined", pVar.d(), "to empty hunter");
                    return;
                } else {
                    w.u("Hunter", "joined", pVar.d(), w.l(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.l == null) {
            this.l = new ArrayList(3);
        }
        this.l.add(aVar);
        if (z) {
            w.u("Hunter", "joined", pVar.d(), w.l(this, "to "));
        }
        Picasso.Priority h = aVar.h();
        if (h.ordinal() > this.w.ordinal()) {
            this.w = h;
        }
    }

    boolean c() {
        Future future;
        if (this.k != null) {
            return false;
        }
        List list = this.l;
        return (list == null || list.isEmpty()) && (future = this.n) != null && future.cancel(false);
    }

    void f(com.squareup.picasso.a aVar) {
        boolean remove;
        if (this.k == aVar) {
            this.k = null;
            remove = true;
        } else {
            List list = this.l;
            remove = list != null ? list.remove(aVar) : false;
        }
        if (remove && aVar.h() == this.w) {
            this.w = d();
        }
        if (this.b.m) {
            w.u("Hunter", "removed", aVar.b.d(), w.l(this, "from "));
        }
    }

    com.squareup.picasso.a h() {
        return this.k;
    }

    List i() {
        return this.l;
    }

    p j() {
        return this.g;
    }

    Exception k() {
        return this.s;
    }

    String n() {
        return this.f;
    }

    Picasso.LoadedFrom o() {
        return this.r;
    }

    int p() {
        return this.h;
    }

    Picasso q() {
        return this.b;
    }

    Picasso.Priority r() {
        return this.w;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.g);
                        if (this.b.m) {
                            w.t("Hunter", "executing", w.k(this));
                        }
                        Bitmap t = t();
                        this.m = t;
                        if (t == null) {
                            this.c.e(this);
                        } else {
                            this.c.d(this);
                        }
                    } catch (IOException e2) {
                        this.s = e2;
                        this.c.g(this);
                    }
                } catch (NetworkRequestHandler.ResponseException e3) {
                    if (!NetworkPolicy.isOfflineOnly(e3.networkPolicy) || e3.code != 504) {
                        this.s = e3;
                    }
                    this.c.e(this);
                }
            } catch (Exception e4) {
                this.s = e4;
                this.c.e(this);
            } catch (OutOfMemoryError e5) {
                StringWriter stringWriter = new StringWriter();
                this.e.a().a(new PrintWriter(stringWriter));
                this.s = new RuntimeException(stringWriter.toString(), e5);
                this.c.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    Bitmap s() {
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.graphics.Bitmap t() {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.t():android.graphics.Bitmap");
    }

    boolean u() {
        Future future = this.n;
        return future != null && future.isCancelled();
    }

    boolean w(boolean z, NetworkInfo networkInfo) {
        int i = this.u;
        if (i <= 0) {
            return false;
        }
        this.u = i - 1;
        return this.j.h(z, networkInfo);
    }

    boolean x() {
        return this.j.i();
    }
}
