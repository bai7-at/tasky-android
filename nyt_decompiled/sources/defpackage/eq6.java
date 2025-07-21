package defpackage;

import coil.disk.DiskLruCache;
import defpackage.qr1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import okio.ByteString;

/* loaded from: classes.dex */
public final class eq6 implements qr1 {
    public static final a e = new a(null);
    private final long a;
    private final jp5 b;
    private final we2 c;
    private final DiskLruCache d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements qr1.b {
        private final DiskLruCache.b a;

        public b(DiskLruCache.b bVar) {
            this.a = bVar;
        }

        @Override // qr1.b
        public void abort() {
            this.a.a();
        }

        @Override // qr1.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            DiskLruCache.d c = this.a.c();
            if (c != null) {
                return new c(c);
            }
            return null;
        }

        @Override // qr1.b
        public jp5 getData() {
            return this.a.f(1);
        }

        @Override // qr1.b
        public jp5 getMetadata() {
            return this.a.f(0);
        }
    }

    private static final class c implements qr1.c {
        private final DiskLruCache.d a;

        public c(DiskLruCache.d dVar) {
            this.a = dVar;
        }

        @Override // qr1.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b Y0() {
            DiskLruCache.b a = this.a.a();
            if (a != null) {
                return new b(a);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // qr1.c
        public jp5 getData() {
            return this.a.b(1);
        }

        @Override // qr1.c
        public jp5 getMetadata() {
            return this.a.b(0);
        }
    }

    public eq6(long j, jp5 jp5Var, we2 we2Var, CoroutineDispatcher coroutineDispatcher) {
        this.a = j;
        this.b = jp5Var;
        this.c = we2Var;
        this.d = new DiskLruCache(a(), c(), coroutineDispatcher, d(), 1, 2);
    }

    private final String e(String str) {
        return ByteString.c.d(str).D().n();
    }

    @Override // defpackage.qr1
    public we2 a() {
        return this.c;
    }

    @Override // defpackage.qr1
    public qr1.b b(String str) {
        DiskLruCache.b f0 = this.d.f0(e(str));
        if (f0 != null) {
            return new b(f0);
        }
        return null;
    }

    public jp5 c() {
        return this.b;
    }

    public long d() {
        return this.a;
    }

    @Override // defpackage.qr1
    public qr1.c get(String str) {
        DiskLruCache.d m0 = this.d.m0(e(str));
        if (m0 != null) {
            return new c(m0);
        }
        return null;
    }
}
