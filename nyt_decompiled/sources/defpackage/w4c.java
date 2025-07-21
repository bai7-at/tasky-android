package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class w4c implements r8c, u7c {
    private final Context a;
    private final v0e b;
    private final p7b c;

    public w4c(Context context, v0e v0eVar, p7b p7bVar) {
        this.a = context;
        this.b = v0eVar;
        this.c = p7bVar;
    }

    @Override // defpackage.u7c
    public final void E(Context context) {
    }

    @Override // defpackage.u7c
    public final void l(Context context) {
    }

    @Override // defpackage.u7c
    public final void t(Context context) {
    }

    @Override // defpackage.r8c
    public final void zzr() {
        q7b q7bVar = this.b.e0;
        if (q7bVar == null || !q7bVar.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.b.e0.b.isEmpty()) {
            return;
        }
        arrayList.add(this.b.e0.b);
    }
}
