package androidx.datastore.preferences.protobuf;

import defpackage.qf0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString a = new LiteralByteString(t.c);
    private static final e b;
    private static final Comparator c;
    private int hash = 0;

    private static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            ByteString.f(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString
        protected int F() {
            return this.bytesOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public byte c(int i) {
            ByteString.e(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        protected void n(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, F() + i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        byte o(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.LiteralByteString, androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        Object writeReplace() {
            return ByteString.B(w());
        }
    }

    static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.q();
        }
    }

    private static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        final void D(qf0 qf0Var) {
            qf0Var.a(this.bytes, F(), size());
        }

        final boolean E(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.v(i, i3).equals(v(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int F = F() + i2;
            int F2 = F();
            int F3 = literalByteString.F() + i;
            while (F2 < F) {
                if (bArr[F2] != bArr2[F3]) {
                    return false;
                }
                F2++;
                F3++;
            }
            return true;
        }

        protected int F() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int u = u();
            int u2 = literalByteString.u();
            if (u == 0 || u2 == 0 || u == u2) {
                return E(literalByteString, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected void n(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        byte o(int i) {
            return this.bytes[i];
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final boolean p() {
            int F = F();
            return Utf8.n(this.bytes, F, size() + F);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final int t(int i, int i2, int i3) {
            return t.i(i, this.bytes, F() + i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        public final ByteString v(int i, int i2) {
            int f = ByteString.f(i, i2, size());
            return f == 0 ? ByteString.a : new BoundedByteString(this.bytes, F() + i, f);
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString
        protected final String z(Charset charset) {
            return new String(this.bytes, F(), size(), charset);
        }
    }

    class a extends c {
        private int a = 0;
        private final int b;

        a() {
            this.b = ByteString.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.f
        public byte a() {
            int i = this.a;
            if (i >= this.b) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            return ByteString.this.o(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < this.b;
        }
    }

    static class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            f q = byteString.q();
            f q2 = byteString2.q();
            while (q.hasNext() && q2.hasNext()) {
                int compare = Integer.compare(ByteString.x(q.a()), ByteString.x(q2.a()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(byteString.size(), byteString2.size());
        }
    }

    static abstract class c implements f {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class d implements e {
        private d() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    private interface e {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public interface f extends Iterator {
        byte a();
    }

    private static final class g implements e {
        private g() {
        }

        @Override // androidx.datastore.preferences.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        b = androidx.datastore.preferences.protobuf.d.c() ? new g(aVar) : new d(aVar);
        c = new b();
    }

    ByteString() {
    }

    static ByteString B(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    static ByteString C(byte[] bArr, int i, int i2) {
        return new BoundedByteString(bArr, i, i2);
    }

    static void e(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    static int f(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }

    public static ByteString g(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static ByteString j(byte[] bArr, int i, int i2) {
        f(i, i + i2, bArr.length);
        return new LiteralByteString(b.a(bArr, i, i2));
    }

    public static ByteString k(String str) {
        return new LiteralByteString(str.getBytes(t.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(byte b2) {
        return b2 & 255;
    }

    public final String A() {
        return y(t.a);
    }

    abstract void D(qf0 qf0Var);

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = t(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    protected abstract void n(byte[] bArr, int i, int i2, int i3);

    abstract byte o(int i);

    public abstract boolean p();

    public f q() {
        return new a();
    }

    public abstract int size();

    protected abstract int t(int i, int i2, int i3);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected final int u() {
        return this.hash;
    }

    public abstract ByteString v(int i, int i2);

    public final byte[] w() {
        int size = size();
        if (size == 0) {
            return t.c;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }

    public final String y(Charset charset) {
        return size() == 0 ? "" : z(charset);
    }

    protected abstract String z(Charset charset);
}
