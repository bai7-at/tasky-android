package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class hob implements v3f {
    private final dob a;

    public hob(dob dobVar) {
        this.a = dobVar;
    }

    public final WeakReference a() {
        WeakReference f = this.a.f();
        d4f.b(f);
        return f;
    }

    @Override // defpackage.l4f
    public final /* synthetic */ Object zzb() {
        WeakReference f = this.a.f();
        d4f.b(f);
        return f;
    }
}
