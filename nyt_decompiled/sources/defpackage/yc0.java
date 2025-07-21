package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class yc0 {
    public static final a b = new a(null);
    private final long a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ yc0 b(a aVar, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = fd5.b.c();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = fd5.b.a();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = rl8.a.a();
            }
            return aVar.a(list, j3, j4, i);
        }

        public static /* synthetic */ yc0 d(a aVar, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = rl8.a.a();
            }
            return aVar.c(list, f, f2, i);
        }

        public final yc0 a(List list, long j, long j2, int i) {
            return new y44(list, null, j, j2, i, null);
        }

        public final yc0 c(List list, float f, float f2, int i) {
            return a(list, hd5.a(0.0f, f), hd5.a(0.0f, f2), i);
        }

        private a() {
        }
    }

    public /* synthetic */ yc0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long j, ao5 ao5Var, float f);

    private yc0() {
        this.a = zt7.b.a();
    }
}
