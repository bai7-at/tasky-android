package defpackage;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes4.dex */
class ic0 implements Iterator {
    private File[] b;
    private File c;
    private final Stack d;
    private int a = 0;
    private boolean e = false;

    ic0(File file) {
        this.b = new File[0];
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            this.b = (File[]) Arrays.copyOf(listFiles, listFiles.length);
        }
        this.d = new Stack();
    }

    protected File b() {
        while (true) {
            int i = this.a;
            File[] fileArr = this.b;
            if (i >= fileArr.length) {
                while (!this.d.empty()) {
                    this.b = ((File) this.d.remove(0)).listFiles();
                    this.a = 0;
                    File b = b();
                    if (b != null) {
                        return b;
                    }
                }
                this.e = true;
                return null;
            }
            if (!fileArr[i].isDirectory()) {
                File[] fileArr2 = this.b;
                int i2 = this.a;
                File file = fileArr2[i2];
                this.a = i2 + 1;
                return file;
            }
            this.d.push(this.b[this.a]);
            this.a++;
        }
    }

    protected File c() {
        if (this.c == null) {
            this.c = b();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return (this.e || c() == null) ? false : true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.e) {
            throw new NoSuchElementException();
        }
        File c = c();
        if (c == null) {
            throw new NoSuchElementException();
        }
        this.c = null;
        return c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
