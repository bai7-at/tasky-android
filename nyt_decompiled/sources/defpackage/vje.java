package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vje {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!hzf.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
