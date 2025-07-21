package defpackage;

import com.google.common.primitives.Ints;
import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class sp0 {
    private static final sp0 a = new a();
    private static final sp0 b = new b(-1);
    private static final sp0 c = new b(1);

    class a extends sp0 {
        a() {
            super(null);
        }

        @Override // defpackage.sp0
        public sp0 d(int i, int i2) {
            return k(Ints.e(i, i2));
        }

        @Override // defpackage.sp0
        public sp0 e(long j, long j2) {
            return k(sb4.a(j, j2));
        }

        @Override // defpackage.sp0
        public sp0 f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // defpackage.sp0
        public sp0 g(boolean z, boolean z2) {
            return k(db0.a(z, z2));
        }

        @Override // defpackage.sp0
        public sp0 h(boolean z, boolean z2) {
            return k(db0.a(z2, z));
        }

        @Override // defpackage.sp0
        public int i() {
            return 0;
        }

        sp0 k(int i) {
            return i < 0 ? sp0.b : i > 0 ? sp0.c : sp0.a;
        }
    }

    private static final class b extends sp0 {
        final int d;

        b(int i) {
            super(null);
            this.d = i;
        }

        @Override // defpackage.sp0
        public sp0 d(int i, int i2) {
            return this;
        }

        @Override // defpackage.sp0
        public sp0 e(long j, long j2) {
            return this;
        }

        @Override // defpackage.sp0
        public sp0 f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // defpackage.sp0
        public sp0 g(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.sp0
        public sp0 h(boolean z, boolean z2) {
            return this;
        }

        @Override // defpackage.sp0
        public int i() {
            return this.d;
        }
    }

    /* synthetic */ sp0(a aVar) {
        this();
    }

    public static sp0 j() {
        return a;
    }

    public abstract sp0 d(int i, int i2);

    public abstract sp0 e(long j, long j2);

    public abstract sp0 f(Object obj, Object obj2, Comparator comparator);

    public abstract sp0 g(boolean z, boolean z2);

    public abstract sp0 h(boolean z, boolean z2);

    public abstract int i();

    private sp0() {
    }
}
