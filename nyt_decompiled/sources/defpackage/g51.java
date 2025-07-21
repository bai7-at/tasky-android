package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.ae3;

/* loaded from: classes.dex */
public abstract class g51 {
    private final be3 a;
    private final ComponentName b;
    private final Context c;

    class a extends ae3.a {
        private Handler a = new Handler(Looper.getMainLooper());
        final /* synthetic */ f51 b;

        /* renamed from: g51$a$a, reason: collision with other inner class name */
        class RunnableC0485a implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ Bundle b;

            RunnableC0485a(int i, Bundle bundle) {
                this.a = i;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.e(this.a, this.b);
            }
        }

        class b implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ Bundle b;

            b(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.a(this.a, this.b);
            }
        }

        class c implements Runnable {
            final /* synthetic */ Bundle a;

            c(Bundle bundle) {
                this.a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.d(this.a);
            }
        }

        class d implements Runnable {
            final /* synthetic */ String a;
            final /* synthetic */ Bundle b;

            d(String str, Bundle bundle) {
                this.a = str;
                this.b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.f(this.a, this.b);
            }
        }

        class e implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ Uri b;
            final /* synthetic */ boolean c;
            final /* synthetic */ Bundle d;

            e(int i, Uri uri, boolean z, Bundle bundle) {
                this.a = i;
                this.b = uri;
                this.c = z;
                this.d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.g(this.a, this.b, this.c, this.d);
            }
        }

        class f implements Runnable {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ Bundle c;

            f(int i, int i2, Bundle bundle) {
                this.a = i;
                this.b = i2;
                this.c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.c(this.a, this.b, this.c);
            }
        }

        a(f51 f51Var) {
            this.b = f51Var;
        }

        @Override // defpackage.ae3
        public void E5(int i, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new RunnableC0485a(i, bundle));
        }

        @Override // defpackage.ae3
        public void a6(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new d(str, bundle));
        }

        @Override // defpackage.ae3
        public void b6(Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new c(bundle));
        }

        @Override // defpackage.ae3
        public void f6(int i, Uri uri, boolean z, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new e(i, uri, z, bundle));
        }

        @Override // defpackage.ae3
        public void l5(int i, int i2, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new f(i, i2, bundle));
        }

        @Override // defpackage.ae3
        public Bundle q1(String str, Bundle bundle) {
            f51 f51Var = this.b;
            if (f51Var == null) {
                return null;
            }
            return f51Var.b(str, bundle);
        }

        @Override // defpackage.ae3
        public void y2(String str, Bundle bundle) {
            if (this.b == null) {
                return;
            }
            this.a.post(new b(str, bundle));
        }
    }

    g51(be3 be3Var, ComponentName componentName, Context context) {
        this.a = be3Var;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, i51 i51Var) {
        i51Var.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, i51Var, 33);
    }

    private ae3.a b(f51 f51Var) {
        return new a(f51Var);
    }

    private j51 d(f51 f51Var, PendingIntent pendingIntent) {
        boolean r1;
        ae3.a b = b(f51Var);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                r1 = this.a.N1(b, bundle);
            } else {
                r1 = this.a.r1(b);
            }
            if (r1) {
                return new j51(this.a, b, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public j51 c(f51 f51Var) {
        return d(f51Var, null);
    }

    public boolean e(long j) {
        try {
            return this.a.W4(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
