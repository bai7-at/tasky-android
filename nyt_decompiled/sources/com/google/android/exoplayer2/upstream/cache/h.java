package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.upstream.cache.Cache;
import defpackage.a84;
import defpackage.lg0;
import defpackage.mw0;
import defpackage.ow0;
import defpackage.sa1;
import defpackage.ur;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public final class h implements Cache {
    private static final HashSet l = new HashSet();
    private final File a;
    private final b b;
    private final f c;
    private final d d;
    private final HashMap e;
    private final Random f;
    private final boolean g;
    private long h;
    private long i;
    private boolean j;
    private Cache.CacheException k;

    class a extends Thread {
        final /* synthetic */ ConditionVariable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (h.this) {
                this.a.open();
                h.this.p();
                h.this.b.e();
            }
        }
    }

    public h(File file, b bVar) {
        this(file, bVar, null, null, false, true);
    }

    private void k(i iVar) {
        this.c.m(iVar.a).a(iVar);
        this.i += iVar.c;
        t(iVar);
    }

    private static void m(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        a84.d("SimpleCache", str);
        throw new Cache.CacheException(str);
    }

    private static long n(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + ".uid");
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    private i o(String str, long j, long j2) {
        i d;
        e g = this.c.g(str);
        if (g == null) {
            return i.g(str, j, j2);
        }
        while (true) {
            d = g.d(j, j2);
            if (!d.d || d.e.length() == d.c) {
                break;
            }
            y();
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (!this.a.exists()) {
            try {
                m(this.a);
            } catch (Cache.CacheException e) {
                this.k = e;
                return;
            }
        }
        File[] listFiles = this.a.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + this.a;
            a84.d("SimpleCache", str);
            this.k = new Cache.CacheException(str);
            return;
        }
        long r = r(listFiles);
        this.h = r;
        if (r == -1) {
            try {
                this.h = n(this.a);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + this.a;
                a84.e("SimpleCache", str2, e2);
                this.k = new Cache.CacheException(str2, e2);
                return;
            }
        }
        try {
            this.c.n(this.h);
            d dVar = this.d;
            if (dVar != null) {
                dVar.d(this.h);
                Map a2 = this.d.a();
                q(this.a, true, listFiles, a2);
                this.d.f(a2.keySet());
            } else {
                q(this.a, true, listFiles, null);
            }
            this.c.r();
            try {
                this.c.s();
            } catch (IOException e3) {
                a84.e("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + this.a;
            a84.e("SimpleCache", str3, e4);
            this.k = new Cache.CacheException(str3, e4);
        }
    }

    private void q(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                q(file2, false, file2.listFiles(), map);
            } else if (!z || (!f.o(name) && !name.endsWith(".uid"))) {
                c cVar = map != null ? (c) map.remove(name) : null;
                if (cVar != null) {
                    j2 = cVar.a;
                    j = cVar.b;
                } else {
                    j = -9223372036854775807L;
                    j2 = -1;
                }
                i e = i.e(file2, j2, j, this.c);
                if (e != null) {
                    k(e);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long r(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return w(name);
                } catch (NumberFormatException unused) {
                    a84.d("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean s(File file) {
        boolean add;
        synchronized (h.class) {
            add = l.add(file.getAbsoluteFile());
        }
        return add;
    }

    private void t(i iVar) {
        ArrayList arrayList = (ArrayList) this.e.get(iVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.a) arrayList.get(size)).f(this, iVar);
            }
        }
        this.b.f(this, iVar);
    }

    private void u(lg0 lg0Var) {
        ArrayList arrayList = (ArrayList) this.e.get(lg0Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.a) arrayList.get(size)).c(this, lg0Var);
            }
        }
        this.b.c(this, lg0Var);
    }

    private void v(i iVar, lg0 lg0Var) {
        ArrayList arrayList = (ArrayList) this.e.get(iVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Cache.a) arrayList.get(size)).a(this, iVar, lg0Var);
            }
        }
        this.b.a(this, iVar, lg0Var);
    }

    private static long w(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void x(lg0 lg0Var) {
        e g = this.c.g(lg0Var.a);
        if (g == null || !g.j(lg0Var)) {
            return;
        }
        this.i -= lg0Var.c;
        if (this.d != null) {
            String name = lg0Var.e.getName();
            try {
                this.d.e(name);
            } catch (IOException unused) {
                a84.j("SimpleCache", "Failed to remove file index entry for: " + name);
            }
        }
        this.c.p(g.b);
        u(lg0Var);
    }

    private void y() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.c.h().iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((e) it2.next()).e().iterator();
            while (it3.hasNext()) {
                lg0 lg0Var = (lg0) it3.next();
                if (lg0Var.e.length() != lg0Var.c) {
                    arrayList.add(lg0Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            x((lg0) arrayList.get(i));
        }
    }

    private i z(String str, i iVar) {
        boolean z;
        if (!this.g) {
            return iVar;
        }
        String name = ((File) ur.e(iVar.e)).getName();
        long j = iVar.c;
        long currentTimeMillis = System.currentTimeMillis();
        d dVar = this.d;
        if (dVar != null) {
            try {
                dVar.g(name, j, currentTimeMillis);
            } catch (IOException unused) {
                a84.j("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        i k = this.c.g(str).k(iVar, currentTimeMillis, z);
        v(iVar, k);
        return k;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File a(String str, long j, long j2) {
        e g;
        File file;
        try {
            ur.g(!this.j);
            l();
            g = this.c.g(str);
            ur.e(g);
            ur.g(g.g(j, j2));
            if (!this.a.exists()) {
                m(this.a);
                y();
            }
            this.b.d(this, str, j, j2);
            file = new File(this.a, Integer.toString(this.f.nextInt(10)));
            if (!file.exists()) {
                m(file);
            }
        } catch (Throwable th) {
            throw th;
        }
        return i.j(file, g.a, j, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized mw0 b(String str) {
        ur.g(!this.j);
        return this.c.j(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void c(lg0 lg0Var) {
        ur.g(!this.j);
        e eVar = (e) ur.e(this.c.g(lg0Var.a));
        eVar.l(lg0Var.b);
        this.c.p(eVar.b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized lg0 d(String str, long j, long j2) {
        ur.g(!this.j);
        l();
        i o = o(str, j, j2);
        if (o.d) {
            return z(str, o);
        }
        if (this.c.m(str).i(j, o.c)) {
            return o;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void e(lg0 lg0Var) {
        ur.g(!this.j);
        x(lg0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized lg0 f(String str, long j, long j2) {
        lg0 d;
        ur.g(!this.j);
        l();
        while (true) {
            d = d(str, j, j2);
            if (d == null) {
                wait();
            }
        }
        return d;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void g(File file, long j) {
        ur.g(!this.j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            i iVar = (i) ur.e(i.f(file, j, this.c));
            e eVar = (e) ur.e(this.c.g(iVar.a));
            ur.g(eVar.g(iVar.b, iVar.c));
            long d = mw0.d(eVar.c());
            if (d != -1) {
                ur.g(iVar.b + iVar.c <= d);
            }
            if (this.d != null) {
                try {
                    this.d.g(file.getName(), iVar.c, iVar.f);
                } catch (IOException e) {
                    throw new Cache.CacheException(e);
                }
            }
            k(iVar);
            try {
                this.c.s();
                notifyAll();
            } catch (IOException e2) {
                throw new Cache.CacheException(e2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void h(String str, ow0 ow0Var) {
        ur.g(!this.j);
        l();
        this.c.e(str, ow0Var);
        try {
            this.c.s();
        } catch (IOException e) {
            throw new Cache.CacheException(e);
        }
    }

    public synchronized void l() {
        Cache.CacheException cacheException = this.k;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    public h(File file, b bVar, sa1 sa1Var, byte[] bArr, boolean z, boolean z2) {
        this(file, bVar, new f(sa1Var, file, bArr, z, z2), (sa1Var == null || z2) ? null : new d(sa1Var));
    }

    h(File file, b bVar, f fVar, d dVar) {
        if (s(file)) {
            this.a = file;
            this.b = bVar;
            this.c = fVar;
            this.d = dVar;
            this.e = new HashMap();
            this.f = new Random();
            this.g = bVar.b();
            this.h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }
}
