package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbze;

/* loaded from: classes3.dex */
final class a2d implements cac {
    private final Context a;
    private final ceb b;

    a2d(Context context, ceb cebVar) {
        this.a = context;
        this.b = cebVar;
    }

    @Override // defpackage.cac
    public final void F(zzbze zzbzeVar) {
    }

    @Override // defpackage.cac
    public final void y0(g1e g1eVar) {
        if (TextUtils.isEmpty(g1eVar.b.b.d)) {
            return;
        }
        this.b.m(this.a, g1eVar.a.a.d);
        this.b.i(this.a, g1eVar.b.b.d);
    }
}
