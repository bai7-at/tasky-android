package defpackage;

import android.os.StrictMode;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class vr1 implements Closeable {
    private final File a;
    private final File b;
    private final File c;
    private final File d;
    private final int e;
    private long f;
    private final int g;
    private Writer i;
    private int k;
    private long h = 0;
    private final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    private long l = 0;
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable n = new a();

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (vr1.this) {
                try {
                    if (vr1.this.i == null) {
                        return null;
                    }
                    vr1.this.W0();
                    if (vr1.this.f0()) {
                        vr1.this.G0();
                        vr1.this.k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;

        /* synthetic */ c(vr1 vr1Var, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            vr1.this.C(this, false);
        }

        public void b() {
            if (this.c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            vr1.this.C(this, true);
            this.c = true;
        }

        public File f(int i) {
            File k;
            synchronized (vr1.this) {
                try {
                    if (this.a.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    k = this.a.k(i);
                    if (!vr1.this.a.exists()) {
                        vr1.this.a.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k;
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[vr1.this.g];
        }
    }

    private final class d {
        private final String a;
        private final long[] b;
        File[] c;
        File[] d;
        private boolean e;
        private c f;
        private long g;

        /* synthetic */ d(vr1 vr1Var, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length != vr1.this.g) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private d(String str) {
            this.a = str;
            this.b = new long[vr1.this.g];
            this.c = new File[vr1.this.g];
            this.d = new File[vr1.this.g];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < vr1.this.g; i++) {
                sb.append(i);
                this.c[i] = new File(vr1.this.a, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(vr1.this.a, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class e {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;

        /* synthetic */ e(vr1 vr1Var, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.d[i];
        }

        private e(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    private vr1(File file, int i, int i2, long j) {
        this.a = file;
        this.e = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.g = i2;
        this.f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void C(c cVar, boolean z) {
        d dVar = cVar.a;
        if (dVar.f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.e) {
            for (int i = 0; i < this.g; i++) {
                if (!cVar.b[i]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.k(i).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.g; i2++) {
            File k = dVar.k(i2);
            if (!z) {
                L(k);
            } else if (k.exists()) {
                File j = dVar.j(i2);
                k.renameTo(j);
                long j2 = dVar.b[i2];
                long length = j.length();
                dVar.b[i2] = length;
                this.h = (this.h - j2) + length;
            }
        }
        this.k++;
        dVar.f = null;
        if (dVar.e || z) {
            dVar.e = true;
            this.i.append((CharSequence) "CLEAN");
            this.i.append(' ');
            this.i.append((CharSequence) dVar.a);
            this.i.append((CharSequence) dVar.l());
            this.i.append('\n');
            if (z) {
                long j3 = this.l;
                this.l = 1 + j3;
                dVar.g = j3;
            }
        } else {
            this.j.remove(dVar.a);
            this.i.append((CharSequence) "REMOVE");
            this.i.append(' ');
            this.i.append((CharSequence) dVar.a);
            this.i.append('\n');
        }
        c0(this.i);
        if (this.h > this.f || f0()) {
            this.m.submit(this.n);
        }
    }

    private void F0(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        d dVar = (d) this.j.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.j.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.e = true;
            dVar.f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void G0() {
        try {
            Writer writer = this.i;
            if (writer != null) {
                s(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), d29.a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.j.values()) {
                    if (dVar.f != null) {
                        bufferedWriter.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                    }
                }
                s(bufferedWriter);
                if (this.b.exists()) {
                    K0(this.b, this.d, true);
                }
                K0(this.c, this.b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), d29.a));
            } catch (Throwable th) {
                s(bufferedWriter);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void K0(File file, File file2, boolean z) {
        if (z) {
            L(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private static void L(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        while (this.h > this.f) {
            H0((String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey());
        }
    }

    private synchronized c X(String str, long j) {
        r();
        d dVar = (d) this.j.get(str);
        a aVar = null;
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.j.put(str, dVar);
        } else if (dVar.f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f = cVar;
        this.i.append((CharSequence) "DIRTY");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        c0(this.i);
        return cVar;
    }

    private static void c0(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public static vr1 m0(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                K0(file2, file3, false);
            }
        }
        vr1 vr1Var = new vr1(file, i, i2, j);
        if (vr1Var.b.exists()) {
            try {
                vr1Var.w0();
                vr1Var.t0();
                return vr1Var;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                vr1Var.G();
            }
        }
        file.mkdirs();
        vr1 vr1Var2 = new vr1(file, i, i2, j);
        vr1Var2.G0();
        return vr1Var2;
    }

    private void r() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private static void s(Writer writer) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private void t0() {
        L(this.c);
        Iterator it2 = this.j.values().iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            int i = 0;
            if (dVar.f == null) {
                while (i < this.g) {
                    this.h += dVar.b[i];
                    i++;
                }
            } else {
                dVar.f = null;
                while (i < this.g) {
                    L(dVar.j(i));
                    L(dVar.k(i));
                    i++;
                }
                it2.remove();
            }
        }
    }

    private void w0() {
        w38 w38Var = new w38(new FileInputStream(this.b), d29.a);
        try {
            String h = w38Var.h();
            String h2 = w38Var.h();
            String h3 = w38Var.h();
            String h4 = w38Var.h();
            String h5 = w38Var.h();
            if (!"libcore.io.DiskLruCache".equals(h) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(h2) || !Integer.toString(this.e).equals(h3) || !Integer.toString(this.g).equals(h4) || !"".equals(h5)) {
                throw new IOException("unexpected journal header: [" + h + ", " + h2 + ", " + h4 + ", " + h5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    F0(w38Var.h());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (w38Var.d()) {
                        G0();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), d29.a));
                    }
                    d29.a(w38Var);
                    return;
                }
            }
        } catch (Throwable th) {
            d29.a(w38Var);
            throw th;
        }
    }

    public void G() {
        close();
        d29.b(this.a);
    }

    public synchronized boolean H0(String str) {
        try {
            r();
            d dVar = (d) this.j.get(str);
            if (dVar != null && dVar.f == null) {
                for (int i = 0; i < this.g; i++) {
                    File j = dVar.j(i);
                    if (j.exists() && !j.delete()) {
                        throw new IOException("failed to delete " + j);
                    }
                    this.h -= dVar.b[i];
                    dVar.b[i] = 0;
                }
                this.k++;
                this.i.append((CharSequence) "REMOVE");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                this.j.remove(str);
                if (f0()) {
                    this.m.submit(this.n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public c P(String str) {
        return X(str, -1L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it2 = new ArrayList(this.j.values()).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (dVar.f != null) {
                    dVar.f.a();
                }
            }
            W0();
            s(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized e e0(String str) {
        r();
        d dVar = (d) this.j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (f0()) {
            this.m.submit(this.n);
        }
        return new e(this, str, dVar.g, dVar.c, dVar.b, null);
    }
}
