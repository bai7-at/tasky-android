package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class kha extends cia {
    private static volatile Long i;
    private static final Object j = new Object();

    public kha(jga jgaVar, String str, String str2, u0 u0Var, int i2, int i3) {
        super(jgaVar, "J3qHQsXE9gxUWY3EQze3pD9LpRQkp3i0z4IBb3xvxMfPfsFZNBOU+l2pHi8zC3DO", "W1peSRrFFzj+W6DyflucA6CQWTsphM4X4AkhjKjRy/o=", u0Var, i2, 22);
    }

    @Override // defpackage.cia
    protected final void a() {
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = (Long) this.f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.e) {
            this.e.y0(i.longValue());
        }
    }
}
