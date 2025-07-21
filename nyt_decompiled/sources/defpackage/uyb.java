package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public class uyb {
    private final s0c a;
    private final View b;
    private final w0e c;
    private final wlb d;

    public uyb(View view, wlb wlbVar, s0c s0cVar, w0e w0eVar) {
        this.b = view;
        this.d = wlbVar;
        this.a = s0cVar;
        this.c = w0eVar;
    }

    public static final tfc f(final Context context, final zzcei zzceiVar, final v0e v0eVar, final s1e s1eVar) {
        return new tfc(new r8c() { // from class: syb
            @Override // defpackage.r8c
            public final void zzr() {
                dyf.u().n(context, zzceiVar.zza, v0eVar.D.toString(), s1eVar.f);
            }
        }, pgb.f);
    }

    public static final Set g(h0c h0cVar) {
        return Collections.singleton(new tfc(h0cVar, pgb.f));
    }

    public static final tfc h(f0c f0cVar) {
        return new tfc(f0cVar, pgb.e);
    }

    public final View a() {
        return this.b;
    }

    public final wlb b() {
        return this.d;
    }

    public final s0c c() {
        return this.a;
    }

    public p8c d(Set set) {
        return new p8c(set);
    }

    public final w0e e() {
        return this.c;
    }
}
