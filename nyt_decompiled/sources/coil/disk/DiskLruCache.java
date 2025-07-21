package coil.disk;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import defpackage.g62;
import defpackage.i;
import defpackage.jp2;
import defpackage.jp5;
import defpackage.pa2;
import defpackage.qd0;
import defpackage.ss2;
import defpackage.wd5;
import defpackage.we2;
import defpackage.ww8;
import defpackage.yt7;
import defpackage.zq3;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes.dex */
public final class DiskLruCache implements Closeable, Flushable {
    public static final a w = new a(null);
    private static final Regex x = new Regex("[a-z0-9_-]{1,120}");
    private final jp5 a;
    private final long b;
    private final int c;
    private final int d;
    private final jp5 e;
    private final jp5 f;
    private final jp5 g;
    private final LinkedHashMap h;
    private final CoroutineScope i;
    private long j;
    private int k;
    private qd0 l;
    private boolean m;
    private boolean n;
    private boolean r;
    private boolean s;
    private boolean t;
    private final e u;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b {
        private final c a;
        private boolean b;
        private final boolean[] c;

        public b(c cVar) {
            this.a = cVar;
            this.c = new boolean[DiskLruCache.this.d];
        }

        private final void d(boolean z) {
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (zq3.c(this.a.b(), this)) {
                        diskLruCache.c0(this, z);
                    }
                    this.b = true;
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d m0;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                b();
                m0 = diskLruCache.m0(this.a.d());
            }
            return m0;
        }

        public final void e() {
            if (zq3.c(this.a.b(), this)) {
                this.a.m(true);
            }
        }

        public final jp5 f(int i) {
            jp5 jp5Var;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                Object obj = this.a.c().get(i);
                i.a(diskLruCache.u, (jp5) obj);
                jp5Var = (jp5) obj;
            }
            return jp5Var;
        }

        public final c g() {
            return this.a;
        }

        public final boolean[] h() {
            return this.c;
        }
    }

    public final class c {
        private final String a;
        private final long[] b;
        private final ArrayList c;
        private final ArrayList d;
        private boolean e;
        private boolean f;
        private b g;
        private int h;

        public c(String str) {
            this.a = str;
            this.b = new long[DiskLruCache.this.d];
            this.c = new ArrayList(DiskLruCache.this.d);
            this.d = new ArrayList(DiskLruCache.this.d);
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int i = DiskLruCache.this.d;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c.add(DiskLruCache.this.a.l(sb.toString()));
                sb.append(".tmp");
                this.d.add(DiskLruCache.this.a.l(sb.toString()));
                sb.setLength(length);
            }
        }

        public final ArrayList a() {
            return this.c;
        }

        public final b b() {
            return this.g;
        }

        public final ArrayList c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final long[] e() {
            return this.b;
        }

        public final int f() {
            return this.h;
        }

        public final boolean g() {
            return this.e;
        }

        public final boolean h() {
            return this.f;
        }

        public final void i(b bVar) {
            this.g = bVar;
        }

        public final void j(List list) {
            if (list.size() != DiskLruCache.this.d) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.b[i] = Long.parseLong((String) list.get(i));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i) {
            this.h = i;
        }

        public final void l(boolean z) {
            this.e = z;
        }

        public final void m(boolean z) {
            this.f = z;
        }

        public final d n() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList arrayList = this.c;
            DiskLruCache diskLruCache = DiskLruCache.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!diskLruCache.u.j((jp5) arrayList.get(i))) {
                    try {
                        diskLruCache.X0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.h++;
            return DiskLruCache.this.new d(this);
        }

        public final void o(qd0 qd0Var) {
            for (long j : this.b) {
                qd0Var.D0(32).p0(j);
            }
        }
    }

    public final class d implements Closeable {
        private final c a;
        private boolean b;

        public d(c cVar) {
            this.a = cVar;
        }

        public final b a() {
            b f0;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                close();
                f0 = diskLruCache.f0(this.a.d());
            }
            return f0;
        }

        public final jp5 b(int i) {
            if (this.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (jp5) this.a.a().get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                try {
                    this.a.k(r1.f() - 1);
                    if (this.a.f() == 0 && this.a.h()) {
                        diskLruCache.X0(this.a);
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e extends jp2 {
        e(we2 we2Var) {
            super(we2Var);
        }

        @Override // defpackage.jp2, defpackage.we2
        public yt7 p(jp5 jp5Var, boolean z) {
            jp5 i = jp5Var.i();
            if (i != null) {
                d(i);
            }
            return super.p(jp5Var, z);
        }
    }

    public DiskLruCache(we2 we2Var, jp5 jp5Var, CoroutineDispatcher coroutineDispatcher, long j, int i, int i2) {
        this.a = jp5Var;
        this.b = j;
        this.c = i;
        this.d = i2;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.e = jp5Var.l("journal");
        this.f = jp5Var.l("journal.tmp");
        this.g = jp5Var.l("journal.bkp");
        this.h = new LinkedHashMap(0, 0.75f, true);
        this.i = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher.limitedParallelism(1)));
        this.u = new e(we2Var);
    }

    private final void F0() {
        BuildersKt__Builders_commonKt.launch$default(this.i, null, null, new DiskLruCache$launchCleanup$1(this, null), 3, null);
    }

    private final qd0 G0() {
        return wd5.c(new pa2(this.u.a(this.e), new ss2() { // from class: coil.disk.DiskLruCache$newJournalWriter$faultHidingSink$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IOException) obj);
                return ww8.a;
            }

            public final void invoke(IOException iOException) {
                DiskLruCache.this.m = true;
            }
        }));
    }

    private final void H0() {
        Iterator it2 = this.h.values().iterator();
        long j = 0;
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            int i = 0;
            if (cVar.b() == null) {
                int i2 = this.d;
                while (i < i2) {
                    j += cVar.e()[i];
                    i++;
                }
            } else {
                cVar.i(null);
                int i3 = this.d;
                while (i < i3) {
                    this.u.h((jp5) cVar.a().get(i));
                    this.u.h((jp5) cVar.c().get(i));
                    i++;
                }
                it2.remove();
            }
        }
        this.j = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void K0() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            coil.disk.DiskLruCache$e r1 = r11.u
            jp5 r2 = r11.e
            px7 r1 = r1.q(r2)
            sd0 r1 = defpackage.wd5.d(r1)
            r2 = 0
            java.lang.String r3 = r1.g0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r1.g0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = r1.g0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r1.g0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r1.g0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = defpackage.zq3.c(r8, r3)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L7a
            java.lang.String r8 = "1"
            boolean r8 = defpackage.zq3.c(r8, r4)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L7a
            int r8 = r11.c     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = defpackage.zq3.c(r8, r5)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L7a
            int r8 = r11.d     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = defpackage.zq3.c(r8, r6)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L7a
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L5c
            if (r8 > 0) goto L7a
            r0 = 0
        L52:
            java.lang.String r3 = r1.g0()     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            r11.W0(r3)     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            int r0 = r0 + 1
            goto L52
        L5c:
            r11 = move-exception
            goto Lae
        L5e:
            java.util.LinkedHashMap r3 = r11.h     // Catch: java.lang.Throwable -> L5c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 - r3
            r11.k = r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r1.C0()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L71
            r11.v1()     // Catch: java.lang.Throwable -> L5c
            goto L77
        L71:
            qd0 r0 = r11.G0()     // Catch: java.lang.Throwable -> L5c
            r11.l = r0     // Catch: java.lang.Throwable -> L5c
        L77:
            ww8 r11 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L5c
            goto Lb1
        L7a:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r8.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = "unexpected journal header: ["
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c
            r8.append(r3)     // Catch: java.lang.Throwable -> L5c
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            r8.append(r4)     // Catch: java.lang.Throwable -> L5c
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            r8.append(r5)     // Catch: java.lang.Throwable -> L5c
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            r8.append(r6)     // Catch: java.lang.Throwable -> L5c
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            r8.append(r7)     // Catch: java.lang.Throwable -> L5c
            r0 = 93
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            throw r11     // Catch: java.lang.Throwable -> L5c
        Lae:
            r10 = r2
            r2 = r11
            r11 = r10
        Lb1:
            if (r1 == 0) goto Lbf
            r1.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbf
        Lb7:
            r0 = move-exception
            if (r2 != 0) goto Lbc
            r2 = r0
            goto Lbf
        Lbc:
            defpackage.g62.a(r2, r0)
        Lbf:
            if (r2 != 0) goto Lc5
            defpackage.zq3.e(r11)
            return
        Lc5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.disk.DiskLruCache.K0():void");
    }

    private final void W0(String str) {
        String substring;
        int a0 = h.a0(str, ' ', 0, false, 6, null);
        if (a0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = a0 + 1;
        int a02 = h.a0(str, ' ', i, false, 4, null);
        if (a02 == -1) {
            substring = str.substring(i);
            zq3.g(substring, "this as java.lang.String).substring(startIndex)");
            if (a0 == 6 && h.K(str, "REMOVE", false, 2, null)) {
                this.h.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, a02);
            zq3.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new c(substring);
            linkedHashMap.put(substring, obj);
        }
        c cVar = (c) obj;
        if (a02 != -1 && a0 == 5 && h.K(str, "CLEAN", false, 2, null)) {
            String substring2 = str.substring(a02 + 1);
            zq3.g(substring2, "this as java.lang.String).substring(startIndex)");
            List E0 = h.E0(substring2, new char[]{' '}, false, 0, 6, null);
            cVar.l(true);
            cVar.i(null);
            cVar.j(E0);
            return;
        }
        if (a02 == -1 && a0 == 5 && h.K(str, "DIRTY", false, 2, null)) {
            cVar.i(new b(cVar));
            return;
        }
        if (a02 == -1 && a0 == 4 && h.K(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final void X() {
        if (this.r) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X0(c cVar) {
        qd0 qd0Var;
        if (cVar.f() > 0 && (qd0Var = this.l) != null) {
            qd0Var.V("DIRTY");
            qd0Var.D0(32);
            qd0Var.V(cVar.d());
            qd0Var.D0(10);
            qd0Var.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            this.u.h((jp5) cVar.a().get(i2));
            this.j -= cVar.e()[i2];
            cVar.e()[i2] = 0;
        }
        this.k++;
        qd0 qd0Var2 = this.l;
        if (qd0Var2 != null) {
            qd0Var2.V("REMOVE");
            qd0Var2.D0(32);
            qd0Var2.V(cVar.d());
            qd0Var2.D0(10);
        }
        this.h.remove(cVar.d());
        if (w0()) {
            F0();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void c0(b bVar, boolean z) {
        c g = bVar.g();
        if (!zq3.c(g.b(), bVar)) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 0;
        if (!z || g.h()) {
            int i2 = this.d;
            while (i < i2) {
                this.u.h((jp5) g.c().get(i));
                i++;
            }
        } else {
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                if (bVar.h()[i4] && !this.u.j((jp5) g.c().get(i4))) {
                    bVar.a();
                    return;
                }
            }
            int i5 = this.d;
            while (i < i5) {
                jp5 jp5Var = (jp5) g.c().get(i);
                jp5 jp5Var2 = (jp5) g.a().get(i);
                if (this.u.j(jp5Var)) {
                    this.u.c(jp5Var, jp5Var2);
                } else {
                    i.a(this.u, (jp5) g.a().get(i));
                }
                long j = g.e()[i];
                Long c2 = this.u.l(jp5Var2).c();
                long longValue = c2 != null ? c2.longValue() : 0L;
                g.e()[i] = longValue;
                this.j = (this.j - j) + longValue;
                i++;
            }
        }
        g.i(null);
        if (g.h()) {
            X0(g);
            return;
        }
        this.k++;
        qd0 qd0Var = this.l;
        zq3.e(qd0Var);
        if (!z && !g.g()) {
            this.h.remove(g.d());
            qd0Var.V("REMOVE");
            qd0Var.D0(32);
            qd0Var.V(g.d());
            qd0Var.D0(10);
            qd0Var.flush();
            if (this.j <= this.b || w0()) {
                F0();
            }
        }
        g.l(true);
        qd0Var.V("CLEAN");
        qd0Var.D0(32);
        qd0Var.V(g.d());
        g.o(qd0Var);
        qd0Var.D0(10);
        qd0Var.flush();
        if (this.j <= this.b) {
        }
        F0();
    }

    private final void e0() {
        close();
        i.b(this.u, this.a);
    }

    private final boolean e1() {
        for (c cVar : this.h.values()) {
            if (!cVar.h()) {
                X0(cVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1() {
        while (this.j > this.b) {
            if (!e1()) {
                return;
            }
        }
        this.s = false;
    }

    private final void u1(String str) {
        if (x.d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void v1() {
        ww8 ww8Var;
        try {
            qd0 qd0Var = this.l;
            if (qd0Var != null) {
                qd0Var.close();
            }
            qd0 c2 = wd5.c(this.u.p(this.f, false));
            Throwable th = null;
            try {
                c2.V("libcore.io.DiskLruCache").D0(10);
                c2.V(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).D0(10);
                c2.p0(this.c).D0(10);
                c2.p0(this.d).D0(10);
                c2.D0(10);
                for (c cVar : this.h.values()) {
                    if (cVar.b() != null) {
                        c2.V("DIRTY");
                        c2.D0(32);
                        c2.V(cVar.d());
                        c2.D0(10);
                    } else {
                        c2.V("CLEAN");
                        c2.D0(32);
                        c2.V(cVar.d());
                        cVar.o(c2);
                        c2.D0(10);
                    }
                }
                ww8Var = ww8.a;
            } catch (Throwable th2) {
                ww8Var = null;
                th = th2;
            }
            if (c2 != null) {
                try {
                    c2.close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    } else {
                        g62.a(th, th3);
                    }
                }
            }
            if (th != null) {
                throw th;
            }
            zq3.e(ww8Var);
            if (this.u.j(this.e)) {
                this.u.c(this.e, this.g);
                this.u.c(this.f, this.e);
                this.u.h(this.g);
            } else {
                this.u.c(this.f, this.e);
            }
            this.l = G0();
            this.k = 0;
            this.m = false;
            this.t = false;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w0() {
        return this.k >= 2000;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.n && !this.r) {
                Object[] array = this.h.values().toArray(new c[0]);
                zq3.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (c cVar : (c[]) array) {
                    b b2 = cVar.b();
                    if (b2 != null) {
                        b2.e();
                    }
                }
                h1();
                CoroutineScopeKt.cancel$default(this.i, null, 1, null);
                qd0 qd0Var = this.l;
                zq3.e(qd0Var);
                qd0Var.close();
                this.l = null;
                this.r = true;
                return;
            }
            this.r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized b f0(String str) {
        X();
        u1(str);
        t0();
        c cVar = (c) this.h.get(str);
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.s && !this.t) {
            qd0 qd0Var = this.l;
            zq3.e(qd0Var);
            qd0Var.V("DIRTY");
            qd0Var.D0(32);
            qd0Var.V(str);
            qd0Var.D0(10);
            qd0Var.flush();
            if (this.m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.h.put(str, cVar);
            }
            b bVar = new b(cVar);
            cVar.i(bVar);
            return bVar;
        }
        F0();
        return null;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.n) {
            X();
            h1();
            qd0 qd0Var = this.l;
            zq3.e(qd0Var);
            qd0Var.flush();
        }
    }

    public final synchronized d m0(String str) {
        d n;
        X();
        u1(str);
        t0();
        c cVar = (c) this.h.get(str);
        if (cVar != null && (n = cVar.n()) != null) {
            this.k++;
            qd0 qd0Var = this.l;
            zq3.e(qd0Var);
            qd0Var.V("READ");
            qd0Var.D0(32);
            qd0Var.V(str);
            qd0Var.D0(10);
            if (w0()) {
                F0();
            }
            return n;
        }
        return null;
    }

    public final synchronized void t0() {
        try {
            if (this.n) {
                return;
            }
            this.u.h(this.f);
            if (this.u.j(this.g)) {
                if (this.u.j(this.e)) {
                    this.u.h(this.g);
                } else {
                    this.u.c(this.g, this.e);
                }
            }
            if (this.u.j(this.e)) {
                try {
                    K0();
                    H0();
                    this.n = true;
                    return;
                } catch (IOException unused) {
                    try {
                        e0();
                        this.r = false;
                    } catch (Throwable th) {
                        this.r = false;
                        throw th;
                    }
                }
            }
            v1();
            this.n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
