package defpackage;

/* loaded from: classes5.dex */
public final class yc5 extends wa8 {
    final uc5 a;

    public yc5(uc5 uc5Var) {
        this.a = uc5Var;
    }

    @Override // defpackage.uc5
    public void onCompleted() {
        this.a.onCompleted();
    }

    @Override // defpackage.uc5
    public void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // defpackage.uc5
    public void onNext(Object obj) {
        this.a.onNext(obj);
    }
}
