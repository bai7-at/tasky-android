package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class wjc implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;
    private final l4f d;

    public wjc(l4f l4fVar, l4f l4fVar2, l4f l4fVar3, l4f l4fVar4) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
        this.d = l4fVar4;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        ria riaVar = (ria) this.a.zzb();
        Executor executor = (Executor) this.b.zzb();
        Context context = (Context) this.c.zzb();
        return new qxb(executor, new zwb(context, riaVar), (Clock) this.d.zzb());
    }
}
