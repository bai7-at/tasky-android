package defpackage;

import android.app.Application;
import com.nytimes.android.NYTApplication;

/* loaded from: classes2.dex */
public abstract class p83 extends Application implements ix2 {
    private boolean a = false;
    private final cn b = new cn(new a());

    class a implements wr0 {
        a() {
        }

        @Override // defpackage.wr0
        public Object get() {
            return t61.a().a(new dn(p83.this)).b();
        }
    }

    public final cn b() {
        return this.b;
    }

    protected void c() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((rz4) generatedComponent()).f((NYTApplication) nx8.a(this));
    }

    @Override // defpackage.hx2
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        c();
        super.onCreate();
    }
}
