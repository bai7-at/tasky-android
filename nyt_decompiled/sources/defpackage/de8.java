package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.RealImageLoader;
import defpackage.n45;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class de8 implements ComponentCallbacks2, n45.a {
    public static final a f = new a(null);
    private final Context a;
    private final WeakReference b;
    private final n45 c;
    private volatile boolean d;
    private final AtomicBoolean e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public de8(RealImageLoader realImageLoader, Context context, boolean z) {
        n45 n02Var;
        this.a = context;
        this.b = new WeakReference(realImageLoader);
        if (z) {
            realImageLoader.h();
            n02Var = o45.a(context, this, null);
        } else {
            n02Var = new n02();
        }
        this.c = n02Var;
        this.d = n02Var.a();
        this.e = new AtomicBoolean(false);
    }

    @Override // n45.a
    public void a(boolean z) {
        ww8 ww8Var;
        RealImageLoader realImageLoader = (RealImageLoader) this.b.get();
        if (realImageLoader != null) {
            realImageLoader.h();
            this.d = z;
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            d();
        }
    }

    public final boolean b() {
        return this.d;
    }

    public final void c() {
        this.a.registerComponentCallbacks(this);
    }

    public final void d() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.a.unregisterComponentCallbacks(this);
        this.c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (((RealImageLoader) this.b.get()) == null) {
            d();
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        ww8 ww8Var;
        RealImageLoader realImageLoader = (RealImageLoader) this.b.get();
        if (realImageLoader != null) {
            realImageLoader.h();
            realImageLoader.l(i);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            d();
        }
    }
}
