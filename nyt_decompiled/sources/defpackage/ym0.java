package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import io.embrace.android.embracesdk.ViewSwazzledHooks;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ym0 {
    public static final ym0 a = new ym0();

    public static final class a implements View.OnClickListener {
        private EventBinding a;
        private WeakReference b;
        private WeakReference c;
        private View.OnClickListener d;
        private boolean e;

        public a(EventBinding eventBinding, View view, View view2) {
            zq3.h(eventBinding, "mapping");
            zq3.h(view, "rootView");
            zq3.h(view2, "hostView");
            this.a = eventBinding;
            this.b = new WeakReference(view2);
            this.c = new WeakReference(view);
            this.d = ba9.g(view2);
            this.e = true;
        }

        public final boolean a() {
            return this.e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            if (c11.d(this)) {
                return;
            }
            try {
                zq3.h(view, "view");
                View.OnClickListener onClickListener = this.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.c.get();
                View view3 = (View) this.b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                ym0 ym0Var = ym0.a;
                ym0.d(this.a, view2, view3);
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }
    }

    public static final class b implements AdapterView.OnItemClickListener {
        private EventBinding a;
        private WeakReference b;
        private WeakReference c;
        private AdapterView.OnItemClickListener d;
        private boolean e;

        public b(EventBinding eventBinding, View view, AdapterView adapterView) {
            zq3.h(eventBinding, "mapping");
            zq3.h(view, "rootView");
            zq3.h(adapterView, "hostView");
            this.a = eventBinding;
            this.b = new WeakReference(adapterView);
            this.c = new WeakReference(view);
            this.d = adapterView.getOnItemClickListener();
            this.e = true;
        }

        public final boolean a() {
            return this.e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            zq3.h(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            View view2 = (View) this.c.get();
            AdapterView adapterView2 = (AdapterView) this.b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            ym0 ym0Var = ym0.a;
            ym0.d(this.a, view2, adapterView2);
        }
    }

    private ym0() {
    }

    public static final a b(EventBinding eventBinding, View view, View view2) {
        if (c11.d(ym0.class)) {
            return null;
        }
        try {
            zq3.h(eventBinding, "mapping");
            zq3.h(view, "rootView");
            zq3.h(view2, "hostView");
            return new a(eventBinding, view, view2);
        } catch (Throwable th) {
            c11.b(th, ym0.class);
            return null;
        }
    }

    public static final b c(EventBinding eventBinding, View view, AdapterView adapterView) {
        if (c11.d(ym0.class)) {
            return null;
        }
        try {
            zq3.h(eventBinding, "mapping");
            zq3.h(view, "rootView");
            zq3.h(adapterView, "hostView");
            return new b(eventBinding, view, adapterView);
        } catch (Throwable th) {
            c11.b(th, ym0.class);
            return null;
        }
    }

    public static final void d(EventBinding eventBinding, View view, View view2) {
        if (c11.d(ym0.class)) {
            return;
        }
        try {
            zq3.h(eventBinding, "mapping");
            zq3.h(view, "rootView");
            zq3.h(view2, "hostView");
            final String b2 = eventBinding.b();
            final Bundle b3 = dn0.f.b(eventBinding, view, view2);
            a.f(b3);
            w92.t().execute(new Runnable() { // from class: xm0
                @Override // java.lang.Runnable
                public final void run() {
                    ym0.e(b2, b3);
                }
            });
        } catch (Throwable th) {
            c11.b(th, ym0.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String str, Bundle bundle) {
        if (c11.d(ym0.class)) {
            return;
        }
        try {
            zq3.h(str, "$eventName");
            zq3.h(bundle, "$parameters");
            AppEventsLogger.b.g(w92.l()).c(str, bundle);
        } catch (Throwable th) {
            c11.b(th, ym0.class);
        }
    }

    public final void f(Bundle bundle) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(bundle, "parameters");
            String string = bundle.getString("_valueToSum");
            if (string != null) {
                bundle.putDouble("_valueToSum", sl.g(string));
            }
            bundle.putString("_is_fb_codeless", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
