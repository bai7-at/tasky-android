package defpackage;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class jc0 implements Iterator, yu3 {
    private int a;
    private File[] b;
    private File c;
    private final Stack d;
    private boolean e;

    public jc0(File file) {
        zq3.h(file, "root");
        this.b = new File[0];
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            Object[] copyOf = Arrays.copyOf(listFiles, listFiles.length);
            zq3.g(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.b = (File[]) copyOf;
        }
        this.d = new Stack();
    }

    private final File c() {
        while (true) {
            int i = this.a;
            File[] fileArr = this.b;
            if (i >= fileArr.length) {
                while (!this.d.empty()) {
                    File[] listFiles = ((File) this.d.remove(0)).listFiles();
                    zq3.g(listFiles, "directory.listFiles()");
                    this.b = listFiles;
                    this.a = 0;
                    File c = c();
                    if (c != null) {
                        return c;
                    }
                }
                this.e = true;
                return null;
            }
            File file = fileArr[i];
            if (file != null && file.isDirectory()) {
                this.d.push(this.b[this.a]);
                this.a++;
            }
        }
        File[] fileArr2 = this.b;
        int i2 = this.a;
        File file2 = fileArr2[i2];
        this.a = i2 + 1;
        return file2;
    }

    private final File d() {
        if (this.c == null) {
            this.c = c();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return (this.e || d() == null) ? false : true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.e) {
            throw new NoSuchElementException();
        }
        File d = d();
        if (d == null) {
            throw new NoSuchElementException();
        }
        this.c = null;
        return d;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
