package defpackage;

import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class iff extends hbb {
    private final /* synthetic */ v8f a;

    iff(v8f v8fVar) {
        this.a = v8fVar;
    }

    @Override // defpackage.hbb, defpackage.yuf
    public final void U3(Status status) {
        this.a.setResult((v8f) status);
    }
}
