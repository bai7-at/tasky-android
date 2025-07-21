package defpackage;

import com.google.android.gms.internal.pal.d;

/* loaded from: classes3.dex */
public abstract class lt9 implements xx9 {
    @Override // defpackage.xx9
    public final /* bridge */ /* synthetic */ xx9 G0(zx9 zx9Var) {
        if (a().getClass().isInstance(zx9Var)) {
            return b((d) zx9Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract lt9 b(d dVar);
}
