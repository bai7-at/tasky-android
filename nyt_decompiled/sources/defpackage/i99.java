package defpackage;

import android.view.View;
import com.chartbeat.androidsdk.QueryKeys;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* loaded from: classes3.dex */
final class i99 extends Observable {
    private final View a;

    private static final class a extends MainThreadDisposable implements View.OnClickListener {
        private final View a;
        private final Observer b;

        public a(View view, Observer observer) {
            zq3.i(view, "view");
            zq3.i(observer, "observer");
            this.a = view;
            this.b = observer;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            zq3.i(view, QueryKeys.INTERNAL_REFERRER);
            if (isDisposed()) {
                return;
            }
            this.b.onNext(ww8.a);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        protected void onDispose() {
            this.a.setOnClickListener(null);
        }
    }

    public i99(View view) {
        zq3.i(view, "view");
        this.a = view;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer observer) {
        zq3.i(observer, "observer");
        if (d16.a(observer)) {
            a aVar = new a(this.a, observer);
            observer.onSubscribe(aVar);
            this.a.setOnClickListener(aVar);
        }
    }
}
