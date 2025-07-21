package androidx.emoji2.text;

import defpackage.vs4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
abstract class k {

    private static class a implements c {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.k.c
        public void a(int i) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.emoji2.text.k.c
        public int b() {
            return this.a.getInt();
        }

        @Override // androidx.emoji2.text.k.c
        public long c() {
            return k.c(this.a.getInt());
        }

        @Override // androidx.emoji2.text.k.c
        public long getPosition() {
            return this.a.position();
        }

        @Override // androidx.emoji2.text.k.c
        public int readUnsignedShort() {
            return k.d(this.a.getShort());
        }
    }

    private static class b {
        private final long a;
        private final long b;

        b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        long a() {
            return this.a;
        }
    }

    private interface c {
        void a(int i);

        int b();

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) {
        long j;
        cVar.a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i = 0;
        while (true) {
            if (i >= readUnsignedShort) {
                j = -1;
                break;
            }
            int b2 = cVar.b();
            cVar.a(4);
            j = cVar.c();
            cVar.a(4);
            if (1835365473 == b2) {
                break;
            }
            i++;
        }
        if (j != -1) {
            cVar.a((int) (j - cVar.getPosition()));
            cVar.a(12);
            long c2 = cVar.c();
            for (int i2 = 0; i2 < c2; i2++) {
                int b3 = cVar.b();
                long c3 = cVar.c();
                long c4 = cVar.c();
                if (1164798569 == b3 || 1701669481 == b3) {
                    return new b(c3 + j, c4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static vs4 b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return vs4.h(duplicate);
    }

    static long c(int i) {
        return i & 4294967295L;
    }

    static int d(short s) {
        return s & 65535;
    }
}
