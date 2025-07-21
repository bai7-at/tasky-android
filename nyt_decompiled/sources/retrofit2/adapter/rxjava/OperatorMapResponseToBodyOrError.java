package retrofit2.adapter.rxjava;

import defpackage.jc5;
import defpackage.wa8;
import retrofit2.Response;

/* loaded from: classes5.dex */
final class OperatorMapResponseToBodyOrError<T> implements jc5.b {
    private static final OperatorMapResponseToBodyOrError<Object> INSTANCE = new OperatorMapResponseToBodyOrError<>();

    OperatorMapResponseToBodyOrError() {
    }

    static <R> OperatorMapResponseToBodyOrError<R> instance() {
        return (OperatorMapResponseToBodyOrError<R>) INSTANCE;
    }

    @Override // defpackage.ps2
    public wa8 call(final wa8 wa8Var) {
        return new wa8(wa8Var) { // from class: retrofit2.adapter.rxjava.OperatorMapResponseToBodyOrError.1
            @Override // defpackage.uc5
            public void onCompleted() {
                wa8Var.onCompleted();
            }

            @Override // defpackage.uc5
            public void onError(Throwable th) {
                wa8Var.onError(th);
            }

            @Override // defpackage.uc5
            public void onNext(Response<T> response) {
                if (response.isSuccessful()) {
                    wa8Var.onNext(response.body());
                } else {
                    wa8Var.onError(new HttpException(response));
                }
            }
        };
    }
}
