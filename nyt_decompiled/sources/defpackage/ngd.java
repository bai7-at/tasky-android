package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class ngd extends h0e {
    private static volatile Long i;
    private static final Object j = new Object();

    public ngd(ksc kscVar, String str, String str2, h3 h3Var, int i2, int i3) {
        super(kscVar, "N0mA2OgFUnHXhnZTWHrO10/LZw/fChWm76LMkbZzvR9G3lxQkMoE65IWMn9zBWSu", "uxIInGM9FQ+1gujg5A7z9IJxIqStl6tvqqzSbuEi494=", h3Var, i2, 22);
    }

    @Override // defpackage.h0e
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
            this.e.B0(i.longValue());
        }
    }
}
