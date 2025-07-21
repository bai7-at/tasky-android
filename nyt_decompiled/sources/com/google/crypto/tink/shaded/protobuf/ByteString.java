package com.google.crypto.tink.shaded.protobuf;

import defpackage.pf0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {
    public static final ByteString a = new LiteralByteString(u.c);
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

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString
        protected int J() {
            return this.bytesOffset;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public byte c(int i) {
            ByteString.e(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        protected void n(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, J() + i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        byte o(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.LiteralByteString, com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        Object writeReplace() {
            return ByteString.E(y());
        }
    }

    static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }
    }

    private static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected final String B(Charset charset) {
            return new String(this.bytes, J(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        final void H(pf0 pf0Var) {
            pf0Var.a(this.bytes, J(), size());
        }

        final boolean I(ByteString byteString, int i, int i2) {
            if (i2 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > byteString.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + byteString.size());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.x(i, i3).equals(x(0, i2));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = this.bytes;
            byte[] bArr2 = literalByteString.bytes;
            int J = J() + i2;
            int J2 = J();
            int J3 = literalByteString.J() + i;
            while (J2 < J) {
                if (bArr[J2] != bArr2[J3]) {
                    return false;
                }
                J2++;
                J3++;
            }
            return true;
        }

        protected int J() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public byte c(int i) {
            return this.bytes[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
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
            int w = w();
            int w2 = literalByteString.w();
            if (w == 0 || w2 == 0 || w == w2) {
                return I(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected void n(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, i, bArr, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        byte o(int i) {
            return this.bytes[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final boolean p() {
            int J = J();
            return Utf8.n(this.bytes, J, size() + J);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final com.google.crypto.tink.shaded.protobuf.g u() {
            return com.google.crypto.tink.shaded.protobuf.g.h(this.bytes, J(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        protected final int v(int i, int i2, int i3) {
            return u.i(i, this.bytes, J() + i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString
        public final ByteString x(int i, int i2) {
            int f = ByteString.f(i, i2, size());
            return f == 0 ? ByteString.a : new BoundedByteString(this.bytes, J() + i, f);
        }
    }

    class a extends c {
        private int a = 0;
        private final int b;

        a() {
            this.b = ByteString.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.f
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

    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(ByteString byteString, ByteString byteString2) {
            f it2 = byteString.iterator();
            f it3 = byteString2.iterator();
            while (it2.hasNext() && it3.hasNext()) {
                int compare = Integer.compare(ByteString.z(it2.a()), ByteString.z(it3.a()));
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

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.e
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

    static final class g {
        private final CodedOutputStream a;
        private final byte[] b;

        /* synthetic */ g(int i, a aVar) {
            this(i);
        }

        public ByteString a() {
            this.a.c();
            return new LiteralByteString(this.b);
        }

        public CodedOutputStream b() {
            return this.a;
        }

        private g(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = CodedOutputStream.U(bArr);
        }
    }

    private static final class h implements e {
        private h() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteString.e
        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        b = com.google.crypto.tink.shaded.protobuf.d.c() ? new h(aVar) : new d(aVar);
        c = new b();
    }

    ByteString() {
    }

    private String D() {
        if (size() <= 50) {
            return v0.a(this);
        }
        return v0.a(x(0, 47)) + "...";
    }

    static ByteString E(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    static ByteString F(byte[] bArr, int i, int i2) {
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
        return new LiteralByteString(str.getBytes(u.a));
    }

    static g t(int i) {
        return new g(i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int z(byte b2) {
        return b2 & 255;
    }

    public final String A(Charset charset) {
        return size() == 0 ? "" : B(charset);
    }

    protected abstract String B(Charset charset);

    public final String C() {
        return A(u.a);
    }

    abstract void H(pf0 pf0Var);

    public abstract byte c(int i);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = v(size, 0, size);
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

    @Override // java.lang.Iterable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public f iterator() {
        return new a();
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), D());
    }

    public abstract com.google.crypto.tink.shaded.protobuf.g u();

    protected abstract int v(int i, int i2, int i3);

    protected final int w() {
        return this.hash;
    }

    public abstract ByteString x(int i, int i2);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return u.c;
        }
        byte[] bArr = new byte[size];
        n(bArr, 0, 0, size);
        return bArr;
    }
}
