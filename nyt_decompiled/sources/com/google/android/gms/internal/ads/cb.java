package com.google.android.gms.internal.ads;

import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.api.cms.Tag;
import defpackage.vje;
import defpackage.wje;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class cb extends ua {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
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
            c = unsafe.objectFieldOffset(eb.class.getDeclaredField(QueryKeys.TIME_ON_VIEW_IN_MINUTES));
            b = unsafe.objectFieldOffset(eb.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(eb.class.getDeclaredField(Tag.A));
            e = unsafe.objectFieldOffset(db.class.getDeclaredField(Tag.A));
            f = unsafe.objectFieldOffset(db.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* synthetic */ cb(wje wjeVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final wa a(eb ebVar, wa waVar) {
        wa waVar2;
        do {
            waVar2 = ebVar.b;
            if (waVar == waVar2) {
                break;
            }
        } while (!e(ebVar, waVar2, waVar));
        return waVar2;
    }

    @Override // com.google.android.gms.internal.ads.ua
    final db b(eb ebVar, db dbVar) {
        db dbVar2;
        do {
            dbVar2 = ebVar.c;
            if (dbVar == dbVar2) {
                break;
            }
        } while (!g(ebVar, dbVar2, dbVar));
        return dbVar2;
    }

    @Override // com.google.android.gms.internal.ads.ua
    final void c(db dbVar, db dbVar2) {
        a.putObject(dbVar, f, dbVar2);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final void d(db dbVar, Thread thread) {
        a.putObject(dbVar, e, thread);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean e(eb ebVar, wa waVar, wa waVar2) {
        return vje.a(a, ebVar, b, waVar, waVar2);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean f(eb ebVar, Object obj, Object obj2) {
        return vje.a(a, ebVar, d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ua
    final boolean g(eb ebVar, db dbVar, db dbVar2) {
        return vje.a(a, ebVar, c, dbVar, dbVar2);
    }
}
