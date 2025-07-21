package retrofit2.adapter.rxjava;

import defpackage.b46;
import defpackage.e62;
import defpackage.eb7;
import defpackage.gb8;
import defpackage.jc5;
import defpackage.ps2;
import defpackage.wa8;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class RxJavaCallAdapterFactory extends CallAdapter.Factory {
    private final eb7 scheduler;

    static final class CallOnSubscribe<T> implements jc5.a {
        private final Call<T> originalCall;

        CallOnSubscribe(Call<T> call) {
            this.originalCall = call;
        }

        @Override // defpackage.w3
        public void call(wa8 wa8Var) {
            RequestArbiter requestArbiter = new RequestArbiter(this.originalCall.clone(), wa8Var);
            wa8Var.add(requestArbiter);
            wa8Var.setProducer(requestArbiter);
        }
    }

    static final class RequestArbiter<T> extends AtomicBoolean implements gb8, b46 {
        private final Call<T> call;
        private final wa8 subscriber;

        RequestArbiter(Call<T> call, wa8 wa8Var) {
            this.call = call;
            this.subscriber = wa8Var;
        }

        @Override // defpackage.gb8
        public boolean isUnsubscribed() {
            return this.call.isCanceled();
        }

        @Override // defpackage.b46
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n < 0: " + j);
            }
            if (j != 0 && compareAndSet(false, true)) {
                try {
                    Response<T> execute = this.call.execute();
                    if (!this.subscriber.isUnsubscribed()) {
                        this.subscriber.onNext(execute);
                    }
                    if (this.subscriber.isUnsubscribed()) {
                        return;
                    }
                    this.subscriber.onCompleted();
                } catch (Throwable th) {
                    e62.d(th);
                    if (this.subscriber.isUnsubscribed()) {
                        return;
                    }
                    this.subscriber.onError(th);
                }
            }
        }

        @Override // defpackage.gb8
        public void unsubscribe() {
            this.call.cancel();
        }
    }

    static final class ResponseCallAdapter implements CallAdapter {
        private final Type responseType;
        private final eb7 scheduler;

        ResponseCallAdapter(Type type2, eb7 eb7Var) {
            this.responseType = type2;
            this.scheduler = eb7Var;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public <R> jc5<Response<R>> adapt(Call<R> call) {
            jc5<Response<R>> b = jc5.b(new CallOnSubscribe(call));
            eb7 eb7Var = this.scheduler;
            return eb7Var != null ? b.p(eb7Var) : b;
        }
    }

    static final class ResultCallAdapter implements CallAdapter {
        private final Type responseType;
        private final eb7 scheduler;

        ResultCallAdapter(Type type2, eb7 eb7Var) {
            this.responseType = type2;
            this.scheduler = eb7Var;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public <R> jc5<Result<R>> adapt(Call<R> call) {
            jc5<Result<R>> l = jc5.b(new CallOnSubscribe(call)).h(new ps2() { // from class: retrofit2.adapter.rxjava.RxJavaCallAdapterFactory.ResultCallAdapter.2
                @Override // defpackage.ps2
                public Result<R> call(Response<R> response) {
                    return Result.response(response);
                }
            }).l(new ps2() { // from class: retrofit2.adapter.rxjava.RxJavaCallAdapterFactory.ResultCallAdapter.1
                @Override // defpackage.ps2
                public Result<R> call(Throwable th) {
                    return Result.error(th);
                }
            });
            eb7 eb7Var = this.scheduler;
            return eb7Var != null ? l.p(eb7Var) : l;
        }
    }

    static final class SimpleCallAdapter implements CallAdapter {
        private final Type responseType;
        private final eb7 scheduler;

        SimpleCallAdapter(Type type2, eb7 eb7Var) {
            this.responseType = type2;
            this.scheduler = eb7Var;
        }

        @Override // retrofit2.CallAdapter
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.CallAdapter
        public <R> jc5<R> adapt(Call<R> call) {
            jc5<R> g = jc5.b(new CallOnSubscribe(call)).g(OperatorMapResponseToBodyOrError.instance());
            eb7 eb7Var = this.scheduler;
            return eb7Var != null ? g.p(eb7Var) : g;
        }
    }

    private RxJavaCallAdapterFactory(eb7 eb7Var) {
        this.scheduler = eb7Var;
    }

    public static RxJavaCallAdapterFactory create() {
        return new RxJavaCallAdapterFactory(null);
    }

    public static RxJavaCallAdapterFactory createWithScheduler(eb7 eb7Var) {
        if (eb7Var != null) {
            return new RxJavaCallAdapterFactory(eb7Var);
        }
        throw new NullPointerException("scheduler == null");
    }

    private CallAdapter getCallAdapter(Type type2, eb7 eb7Var) {
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type2);
        Class<?> rawType = CallAdapter.Factory.getRawType(parameterUpperBound);
        if (rawType == Response.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                return new ResponseCallAdapter(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound), eb7Var);
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        if (rawType != Result.class) {
            return new SimpleCallAdapter(parameterUpperBound, eb7Var);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new ResultCallAdapter(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound), eb7Var);
        }
        throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter get(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        Class<?> rawType = CallAdapter.Factory.getRawType(type2);
        String canonicalName = rawType.getCanonicalName();
        boolean equals = "vs7".equals(canonicalName);
        boolean equals2 = "dq0".equals(canonicalName);
        if (rawType != jc5.class && !equals && !equals2) {
            return null;
        }
        if (equals2 || (type2 instanceof ParameterizedType)) {
            if (equals2) {
                return CompletableHelper.createCallAdapter(this.scheduler);
            }
            CallAdapter callAdapter = getCallAdapter(type2, this.scheduler);
            return equals ? SingleHelper.makeSingle(callAdapter) : callAdapter;
        }
        String str = equals ? "Single" : "Observable";
        throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
    }
}
