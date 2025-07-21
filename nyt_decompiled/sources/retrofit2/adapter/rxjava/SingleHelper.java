package retrofit2.adapter.rxjava;

import defpackage.jc5;
import defpackage.vs7;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* loaded from: classes5.dex */
final class SingleHelper {
    SingleHelper() {
    }

    static CallAdapter makeSingle(final CallAdapter callAdapter) {
        return new CallAdapter() { // from class: retrofit2.adapter.rxjava.SingleHelper.1
            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return CallAdapter.this.responseType();
            }

            @Override // retrofit2.CallAdapter
            public <R> vs7 adapt(Call<R> call) {
                return ((jc5) CallAdapter.this.adapt(call)).s();
            }
        };
    }
}
