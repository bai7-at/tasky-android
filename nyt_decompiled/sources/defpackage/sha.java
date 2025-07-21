package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.u0;
import java.util.List;

/* loaded from: classes3.dex */
public final class sha extends cia {
    private List i;
    private final Context j;

    public sha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, Context context) {
        super(jgaVar, "0gWjYXznHW/Eye6gdpKNKYjX/XLpx1vdgxUIuTN4hh6FwE+EupqjErYFsUwwKenZ", "tk45mDotIpTZidmNYxxiIBsjVftw/e0h3Unlwpf2Me4=", u0Var, i, 31);
        this.i = null;
        this.j = context;
    }

    @Override // defpackage.cia
    protected final void a() {
        this.e.K(-1L);
        this.e.G(-1L);
        Context context = this.j;
        if (context == null) {
            context = this.b.b();
        }
        if (this.i == null) {
            this.i = (List) this.f.invoke(null, context);
        }
        List list = this.i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.e) {
            this.e.K(((Long) this.i.get(0)).longValue());
            this.e.G(((Long) this.i.get(1)).longValue());
        }
    }
}
