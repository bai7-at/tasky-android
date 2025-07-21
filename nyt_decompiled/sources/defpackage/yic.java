package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public final class yic implements v3f {
    private final l4f a;

    public yic(l4f l4fVar) {
        this.a = l4fVar;
    }

    @Override // defpackage.l4f
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = ((vic) this.a).a().e() != null ? Collections.singleton("banner") : Collections.emptySet();
        d4f.b(singleton);
        return singleton;
    }
}
