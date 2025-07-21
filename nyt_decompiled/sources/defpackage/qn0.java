package defpackage;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class qn0 {
    public static final a b = new a(null);
    private final ColorFilter a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ qn0 b(a aVar, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = b90.a.z();
            }
            return aVar.a(j, i);
        }

        public final qn0 a(long j, int i) {
            return new c90(j, i, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public qn0(ColorFilter colorFilter) {
        this.a = colorFilter;
    }

    public final ColorFilter a() {
        return this.a;
    }
}
