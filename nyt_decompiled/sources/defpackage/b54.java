package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class b54 implements ak7 {
    private final BufferedReader a;

    public static final class a implements Iterator, yu3 {
        private String a;
        private boolean b;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.a;
            this.a = null;
            zq3.e(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a == null && !this.b) {
                String readLine = b54.this.a.readLine();
                this.a = readLine;
                if (readLine == null) {
                    this.b = true;
                }
            }
            return this.a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b54(BufferedReader bufferedReader) {
        zq3.h(bufferedReader, "reader");
        this.a = bufferedReader;
    }

    @Override // defpackage.ak7
    public Iterator iterator() {
        return new a();
    }
}
