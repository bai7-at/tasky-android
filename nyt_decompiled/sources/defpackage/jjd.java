package defpackage;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class jjd implements v3f {
    private final l4f a;
    private final l4f b;

    public jjd(l4f l4fVar, l4f l4fVar2) {
        this.a = l4fVar;
        this.b = l4fVar2;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new hjd((Clock) this.a.zzb(), ((n6c) this.b).a());
    }
}
