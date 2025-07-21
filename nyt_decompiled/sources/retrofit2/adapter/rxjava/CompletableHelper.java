package retrofit2.adapter.rxjava;

import defpackage.dq0;
import defpackage.e62;
import defpackage.eb7;
import defpackage.gb8;
import defpackage.lh4;
import defpackage.tb8;
import defpackage.v3;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;

/* loaded from: classes5.dex */
final class CompletableHelper {

    static class CompletableCallAdapter implements CallAdapter {
        private final eb7 scheduler;

        CompletableCallAdapter(eb7 eb7Var) {
            this.scheduler = eb7Var;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return Void.class;
        }

        @Override // retrofit2.CallAdapter
        public dq0 adapt(Call call) {
            dq0 a = dq0.a(new CompletableCallOnSubscribe(call));
            eb7 eb7Var = this.scheduler;
            return eb7Var != null ? a.c(eb7Var) : a;
        }
    }

    private static final class CompletableCallOnSubscribe implements dq0.d {
        private final Call originalCall;

        CompletableCallOnSubscribe(Call call) {
            this.originalCall = call;
        }

        @Override // defpackage.w3
        public /* bridge */ /* synthetic */ void call(Object obj) {
            lh4.a(obj);
            call((dq0.e) null);
        }

        public void call(dq0.e eVar) {
            final Call clone = this.originalCall.clone();
            gb8 a = tb8.a(new v3() { // from class: retrofit2.adapter.rxjava.CompletableHelper.CompletableCallOnSubscribe.1
                @Override // defpackage.v3
                public void call() {
                    clone.cancel();
                }
            });
            eVar.a(a);
            try {
                Response execute = clone.execute();
                if (!a.isUnsubscribed()) {
                    if (execute.isSuccessful()) {
                        eVar.onCompleted();
                    } else {
                        eVar.onError(new HttpException(execute));
                    }
                }
            } catch (Throwable th) {
                e62.d(th);
                if (a.isUnsubscribed()) {
                    return;
                }
                eVar.onError(th);
            }
        }
    }

    CompletableHelper() {
    }

    static CallAdapter createCallAdapter(eb7 eb7Var) {
        return new CompletableCallAdapter(eb7Var);
    }
}
