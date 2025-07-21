package com.google.android.gms.internal.icing;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class j1 {
    final Unsafe a;

    j1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract void a(Object obj, long j, byte b);

    public abstract boolean b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z);

    public abstract float d(Object obj, long j);

    public abstract void e(Object obj, long j, float f);

    public abstract double f(Object obj, long j);

    public abstract void g(Object obj, long j, double d);

    public final long h(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public final int i(Class cls) {
        return this.a.arrayBaseOffset(cls);
    }

    public final int j(Class cls) {
        return this.a.arrayIndexScale(cls);
    }

    public final int k(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final void l(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final long m(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void n(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }

    public final Object o(Object obj, long j) {
        return this.a.getObject(obj, j);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.a.putObject(obj, j, obj2);
    }
}
