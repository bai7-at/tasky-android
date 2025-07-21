package defpackage;

import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.utils.retrofitutils.a;
import retrofit2.Response;

/* loaded from: classes4.dex */
public abstract class x45 {
    public static final FetchResult a(qs2 qs2Var) {
        zq3.h(qs2Var, "execute");
        try {
            Response response = (Response) qs2Var.mo865invoke();
            Object body = response.body();
            return (!response.isSuccessful() || body == null) ? a.b(FetchResult.Companion, response) : new FetchResult.b.C0251b(body);
        } catch (Throwable th) {
            return new FetchResult.b.a(th);
        }
    }
}
