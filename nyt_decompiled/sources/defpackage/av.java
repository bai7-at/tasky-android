package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class av {
    private final File a;
    private final File b;

    private static final class a extends OutputStream {
        private final FileOutputStream a;
        private boolean b = false;

        public a(File file) {
            this.a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            flush();
            try {
                this.a.getFD().sync();
            } catch (IOException e) {
                a84.k("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.a.write(bArr, i, i2);
        }
    }

    public av(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
    }

    public void a() {
        this.a.delete();
        this.b.delete();
    }

    public void b(OutputStream outputStream) {
        outputStream.close();
        this.b.delete();
    }

    public boolean c() {
        return this.a.exists() || this.b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.a);
    }

    public OutputStream f() {
        if (this.a.exists()) {
            if (this.b.exists()) {
                this.a.delete();
            } else if (!this.a.renameTo(this.b)) {
                a84.j("AtomicFile", "Couldn't rename file " + this.a + " to backup file " + this.b);
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException e) {
            File parentFile = this.a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.a, e);
            }
            try {
                return new a(this.a);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + this.a, e2);
            }
        }
    }
}
