package defpackage;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.size.Scale;
import defpackage.jr8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class p31 implements jr8 {
    private final sr8 a;
    private final xg3 b;
    private final int c;
    private final boolean d;

    public p31(sr8 sr8Var, xg3 xg3Var, int i, boolean z) {
        this.a = sr8Var;
        this.b = xg3Var;
        this.c = i;
        this.d = z;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // defpackage.jr8
    public void a() {
        Drawable d = this.a.d();
        Drawable a2 = this.b.a();
        Scale J = this.b.b().J();
        int i = this.c;
        xg3 xg3Var = this.b;
        n31 n31Var = new n31(d, a2, J, i, ((xg3Var instanceof cc8) && ((cc8) xg3Var).d()) ? false : true, this.d);
        xg3 xg3Var2 = this.b;
        if (xg3Var2 instanceof cc8) {
            this.a.a(n31Var);
        } else if (xg3Var2 instanceof a32) {
            this.a.c(n31Var);
        }
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public static final class a implements jr8.a {
        private final int c;
        private final boolean d;

        public a(int i, boolean z) {
            this.c = i;
            this.d = z;
            if (i <= 0) {
                throw new IllegalArgumentException("durationMillis must be > 0.");
            }
        }

        @Override // jr8.a
        public jr8 a(sr8 sr8Var, xg3 xg3Var) {
            if ((xg3Var instanceof cc8) && ((cc8) xg3Var).c() != DataSource.MEMORY_CACHE) {
                return new p31(sr8Var, xg3Var, this.c, this.d);
            }
            return jr8.a.b.a(sr8Var, xg3Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.c == aVar.c && this.d == aVar.d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.c * 31) + Boolean.hashCode(this.d);
        }

        public /* synthetic */ a(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 100 : i, (i2 & 2) != 0 ? false : z);
        }
    }
}
