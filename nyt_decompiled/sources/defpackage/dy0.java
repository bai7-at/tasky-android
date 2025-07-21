package defpackage;

import java.io.IOException;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes.dex */
final class dy0 implements Callback, ss2 {
    private final Call a;
    private final CancellableContinuation b;

    public dy0(Call call, CancellableContinuation cancellableContinuation) {
        this.a = call;
        this.b = cancellableContinuation;
    }

    public void b(Throwable th) {
        try {
            this.a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return ww8.a;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (call.isCanceled()) {
            return;
        }
        CancellableContinuation cancellableContinuation = this.b;
        Result.a aVar = Result.a;
        cancellableContinuation.resumeWith(Result.b(f.a(iOException)));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.b.resumeWith(Result.b(response));
    }
}
