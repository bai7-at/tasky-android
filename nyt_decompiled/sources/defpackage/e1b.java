package defpackage;

import com.google.android.gms.internal.icing.f;

/* loaded from: classes3.dex */
public abstract class e1b implements e3d {
    protected abstract e1b b(f fVar);

    @Override // defpackage.e3d
    public final /* bridge */ /* synthetic */ e3d f0(i4d i4dVar) {
        if (zzm().getClass().isInstance(i4dVar)) {
            return b((f) i4dVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
