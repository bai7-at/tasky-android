package kotlin;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static c04 a(qs2 qs2Var) {
        zq3.h(qs2Var, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new SynchronizedLazyImpl(qs2Var, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static c04 b(LazyThreadSafetyMode lazyThreadSafetyMode, qs2 qs2Var) {
        zq3.h(lazyThreadSafetyMode, "mode");
        zq3.h(qs2Var, "initializer");
        int i = a.a[lazyThreadSafetyMode.ordinal()];
        int i2 = 2;
        if (i == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new SynchronizedLazyImpl(qs2Var, defaultConstructorMarker, i2, defaultConstructorMarker);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(qs2Var);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(qs2Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
