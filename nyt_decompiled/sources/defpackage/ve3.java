package defpackage;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class ve3 {
    protected final boolean a;

    static final class a extends ve3 {
        @Override // defpackage.ve3
        protected long d() {
            return ThreadLocalRandom.current().nextLong(0L, Long.MAX_VALUE) + 1;
        }

        private a(boolean z) {
            super(z);
        }
    }

    static final class b extends ve3 {
        private final SecureRandom b;

        b(boolean z) {
            this(z, e());
        }

        private static d e() {
            return new d() { // from class: we3
                @Override // ve3.d
                public final Object get() {
                    return SecureRandom.getInstanceStrong();
                }
            };
        }

        @Override // defpackage.ve3
        protected long d() {
            long nextLong = this.b.nextLong();
            while (true) {
                long j = nextLong & Long.MAX_VALUE;
                if (j != 0) {
                    return j;
                }
                nextLong = this.b.nextLong();
            }
        }

        b(boolean z, d dVar) {
            super(z);
            try {
                this.b = (SecureRandom) dVar.get();
            } catch (Throwable th) {
                throw new ExceptionInInitializerError(th);
            }
        }
    }

    static final class c extends ve3 {
        private final AtomicLong b;

        @Override // defpackage.ve3
        public a61 c() {
            return r51.d(d());
        }

        @Override // defpackage.ve3
        protected long d() {
            return this.b.incrementAndGet();
        }

        private c(boolean z) {
            super(z);
            this.b = new AtomicLong(0L);
        }
    }

    interface d {
        Object get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ve3 a(String str, boolean z) {
        Object[] objArr;
        String upperCase = str.toUpperCase(Locale.US);
        upperCase.hashCode();
        objArr = 0;
        switch (upperCase) {
            case "RANDOM":
                return new a(z);
            case "SEQUENTIAL":
                return new c(z);
            case "SECURE_RANDOM":
                return new b(z);
            default:
                return null;
        }
    }

    protected long b() {
        return (System.currentTimeMillis() / 1000) << 32;
    }

    public a61 c() {
        return this.a ? q51.c(b(), d()) : r51.d(d());
    }

    protected abstract long d();

    private ve3(boolean z) {
        this.a = z;
    }
}
