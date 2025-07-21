package defpackage;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* loaded from: classes4.dex */
public class e17 implements Callback {
    protected static final b c = new a();
    private final tm9 a;
    private final b b;

    static final class a implements b {
        a() {
        }

        @Override // e17.b
        public Object extract(Object obj) {
            return obj;
        }
    }

    public interface b {
        Object extract(Object obj);
    }

    public e17(tm9 tm9Var, b bVar) {
        this.a = tm9Var;
        this.b = bVar;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable th) {
        tm9 tm9Var = this.a;
        if (tm9Var != null) {
            tm9Var.onError(b17.c(th));
        }
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, Response response) {
        if (this.a != null) {
            if (response.isSuccessful()) {
                this.a.onSuccess(this.b.extract(response.body()));
            } else {
                this.a.onError(b17.b(response));
            }
        }
    }

    public e17(tm9 tm9Var) {
        this(tm9Var, c);
    }
}
