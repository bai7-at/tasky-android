package defpackage;

import android.content.Intent;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/* loaded from: classes4.dex */
public abstract class zn3 {
    private final CompositeDisposable a = new CompositeDisposable();

    protected final void a(Disposable disposable) {
        zq3.h(disposable, "disposable");
        this.a.add(disposable);
    }

    public final void b(Intent intent) {
        zq3.h(intent, "intent");
        String stringExtra = intent.getStringExtra("com.nytimes.android.notification.URI");
        String stringExtra2 = intent.getStringExtra("com.nytimes.android.notification.URL");
        String stringExtra3 = intent.getStringExtra("com.nytimes.android.notification.TITLE");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        if (stringExtra != null) {
            c(stringExtra3, stringExtra);
        } else {
            if (stringExtra2 == null) {
                throw new IllegalStateException("Intent does not contain any extra");
            }
            d(stringExtra3, stringExtra2);
        }
    }

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2);
}
