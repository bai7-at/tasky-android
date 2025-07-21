package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class vfc extends ldc implements via {
    private final Map b;
    private final Context c;
    private final v0e d;

    public vfc(Context context, Set set, v0e v0eVar) {
        super(set);
        this.b = new WeakHashMap(1);
        this.c = context;
        this.d = v0eVar;
    }

    public final synchronized void M0(View view) {
        try {
            wia wiaVar = (wia) this.b.get(view);
            if (wiaVar == null) {
                wia wiaVar2 = new wia(this.c, view);
                wiaVar2.e(this);
                this.b.put(view, wiaVar2);
                wiaVar = wiaVar2;
            }
            if (this.d.Y) {
                if (((Boolean) pla.c().a(mpa.o1)).booleanValue()) {
                    wiaVar.i(((Long) pla.c().a(mpa.n1)).longValue());
                    return;
                }
            }
            wiaVar.h();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void N0(View view) {
        if (this.b.containsKey(view)) {
            ((wia) this.b.get(view)).g(this);
            this.b.remove(view);
        }
    }

    @Override // defpackage.via
    public final synchronized void R(final uia uiaVar) {
        G0(new kdc() { // from class: ufc
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((via) obj).R(uia.this);
            }
        });
    }
}
