package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class wr1 implements Closeable {
    static final Pattern r = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream s = new b();
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
    final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable n = new a();

    class a implements Callable {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (wr1.this) {
                try {
                    if (wr1.this.i == null) {
                        return null;
                    }
                    wr1.this.W0();
                    if (wr1.this.f0()) {
                        wr1.this.G0();
                        wr1.this.k = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;
        private boolean d;

        private class a extends FilterOutputStream {
            /* synthetic */ a(c cVar, OutputStream outputStream, a aVar) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            private a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }
        }

        /* synthetic */ c(wr1 wr1Var, d dVar, a aVar) {
            this(dVar);
        }

        public void a() {
            wr1.this.C(this, false);
        }

        public void e() {
            if (this.c) {
                wr1.this.C(this, false);
                wr1.this.H0(this.a.a);
            } else {
                wr1.this.C(this, true);
            }
            this.d = true;
        }

        public OutputStream f(int i) {
            FileOutputStream fileOutputStream;
            a aVar;
            synchronized (wr1.this) {
                try {
                    if (this.a.d != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.a.c) {
                        this.b[i] = true;
                    }
                    File k = this.a.k(i);
                    try {
                        fileOutputStream = new FileOutputStream(k);
                    } catch (FileNotFoundException unused) {
                        wr1.this.a.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(k);
                        } catch (FileNotFoundException unused2) {
                            return wr1.s;
                        }
                    }
                    aVar = new a(this, fileOutputStream, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.c ? null : new boolean[wr1.this.g];
        }
    }

    private final class d {
        private final String a;
        private final long[] b;
        private boolean c;
        private c d;
        private long e;

        /* synthetic */ d(wr1 wr1Var, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) {
            if (strArr.length != wr1.this.g) {
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
            return new File(wr1.this.a, this.a + InstructionFileId.DOT + i);
        }

        public File k(int i) {
            return new File(wr1.this.a, this.a + InstructionFileId.DOT + i + ".tmp");
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
            this.b = new long[wr1.this.g];
        }
    }

    public final class e implements Closeable {
        private final String a;
        private final long b;
        private final InputStream[] c;
        private final long[] d;

        /* synthetic */ e(wr1 wr1Var, String str, long j, InputStream[] inputStreamArr, long[] jArr, a aVar) {
            this(str, j, inputStreamArr, jArr);
        }

        public InputStream a(int i) {
            return this.c[i];
        }

        public long b(int i) {
            return this.d[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.c) {
                a29.a(inputStream);
            }
        }

        private e(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.c = inputStreamArr;
            this.d = jArr;
        }
    }

    private wr1(File file, int i, int i2, long j) {
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
        if (dVar.d != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.c) {
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
        dVar.d = null;
        if (dVar.c || z) {
            dVar.c = true;
            this.i.write("CLEAN " + dVar.a + dVar.l() + '\n');
            if (z) {
                long j3 = this.l;
                this.l = 1 + j3;
                dVar.e = j3;
            }
        } else {
            this.j.remove(dVar.a);
            this.i.write("REMOVE " + dVar.a + '\n');
        }
        this.i.flush();
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
            dVar.c = true;
            dVar.d = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.d = new c(this, dVar, aVar);
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
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), a29.a));
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
                    if (dVar.d != null) {
                        bufferedWriter.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.b.exists()) {
                    K0(this.b, this.d, true);
                }
                K0(this.c, this.b, false);
                this.d.delete();
                this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), a29.a));
            } catch (Throwable th) {
                bufferedWriter.close();
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
        s();
        X0(str);
        d dVar = (d) this.j.get(str);
        a aVar = null;
        if (j != -1 && (dVar == null || dVar.e != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.j.put(str, dVar);
        } else if (dVar.d != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.d = cVar;
        this.i.write("DIRTY " + str + '\n');
        this.i.flush();
        return cVar;
    }

    private void X0(String str) {
        if (r.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public static wr1 m0(File file, int i, int i2, long j) {
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
        wr1 wr1Var = new wr1(file, i, i2, j);
        if (wr1Var.b.exists()) {
            try {
                wr1Var.w0();
                wr1Var.t0();
                wr1Var.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(wr1Var.b, true), a29.a));
                return wr1Var;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                wr1Var.G();
            }
        }
        file.mkdirs();
        wr1 wr1Var2 = new wr1(file, i, i2, j);
        wr1Var2.G0();
        return wr1Var2;
    }

    private void s() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void t0() {
        L(this.c);
        Iterator it2 = this.j.values().iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            int i = 0;
            if (dVar.d == null) {
                while (i < this.g) {
                    this.h += dVar.b[i];
                    i++;
                }
            } else {
                dVar.d = null;
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
        v38 v38Var = new v38(new FileInputStream(this.b), a29.a);
        try {
            String d2 = v38Var.d();
            String d3 = v38Var.d();
            String d4 = v38Var.d();
            String d5 = v38Var.d();
            String d6 = v38Var.d();
            if (!"libcore.io.DiskLruCache".equals(d2) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(d3) || !Integer.toString(this.e).equals(d4) || !Integer.toString(this.g).equals(d5) || !"".equals(d6)) {
                throw new IOException("unexpected journal header: [" + d2 + ", " + d3 + ", " + d5 + ", " + d6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    F0(v38Var.d());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    a29.a(v38Var);
                    return;
                }
            }
        } catch (Throwable th) {
            a29.a(v38Var);
            throw th;
        }
    }

    public void G() {
        close();
        a29.b(this.a);
    }

    public synchronized boolean H0(String str) {
        try {
            s();
            X0(str);
            d dVar = (d) this.j.get(str);
            if (dVar != null && dVar.d == null) {
                for (int i = 0; i < this.g; i++) {
                    File j = dVar.j(i);
                    if (j.exists() && !j.delete()) {
                        throw new IOException("failed to delete " + j);
                    }
                    this.h -= dVar.b[i];
                    dVar.b[i] = 0;
                }
                this.k++;
                this.i.append((CharSequence) ("REMOVE " + str + '\n'));
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

    public synchronized e c0(String str) {
        InputStream inputStream;
        s();
        X0(str);
        d dVar = (d) this.j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.g];
        for (int i = 0; i < this.g; i++) {
            try {
                inputStreamArr[i] = new FileInputStream(dVar.j(i));
            } catch (FileNotFoundException unused) {
                for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                    a29.a(inputStream);
                }
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) ("READ " + str + '\n'));
        if (f0()) {
            this.m.submit(this.n);
        }
        return new e(this, str, dVar.e, inputStreamArr, dVar.b, null);
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
                if (dVar.d != null) {
                    dVar.d.a();
                }
            }
            W0();
            this.i.close();
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File e0() {
        return this.a;
    }
}
