package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import defpackage.aaf;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class y9f extends r9f {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        public static final Unsafe a() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            c = unsafe.objectFieldOffset(aaf.class.getDeclaredField(QueryKeys.TIME_ON_VIEW_IN_MINUTES));
            b = unsafe.objectFieldOffset(aaf.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(aaf.class.getDeclaredField(Tag.A));
            e = unsafe.objectFieldOffset(z9f.class.getDeclaredField(Tag.A));
            f = unsafe.objectFieldOffset(z9f.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        } catch (RuntimeException e4) {
            throw e4;
        }
    }

    /* synthetic */ y9f(aaf.a aVar) {
        super(null);
    }

    @Override // defpackage.r9f
    final u9f a(aaf aafVar, u9f u9fVar) {
        u9f u9fVar2;
        do {
            u9fVar2 = aafVar.b;
            if (u9fVar == u9fVar2) {
                break;
            }
        } while (!eaf.a(a, aafVar, b, u9fVar2, u9fVar));
        return u9fVar2;
    }

    @Override // defpackage.r9f
    final z9f b(aaf aafVar, z9f z9fVar) {
        z9f z9fVar2;
        do {
            z9fVar2 = aafVar.c;
            if (z9fVar == z9fVar2) {
                return z9fVar2;
            }
        } while (!f(aafVar, z9fVar2, z9fVar));
        return z9fVar2;
    }

    @Override // defpackage.r9f
    final void c(z9f z9fVar, z9f z9fVar2) {
        a.putObject(z9fVar, f, z9fVar2);
    }

    @Override // defpackage.r9f
    final void d(z9f z9fVar, Thread thread) {
        a.putObject(z9fVar, e, thread);
    }

    @Override // defpackage.r9f
    final boolean e(aaf aafVar, Object obj, Object obj2) {
        return eaf.a(a, aafVar, d, obj, obj2);
    }

    @Override // defpackage.r9f
    final boolean f(aaf aafVar, z9f z9fVar, z9f z9fVar2) {
        return eaf.a(a, aafVar, c, z9fVar, z9fVar2);
    }
}
