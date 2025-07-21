package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
public abstract class wu5 implements ServiceConnection {
    private final Context a;
    private final Handler b;
    private b c;
    private boolean d;
    private Messenger e;
    private final int f;
    private final int g;
    private final String h;
    private final int i;
    private final String j;

    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (c11.d(this)) {
                return;
            }
            try {
                zq3.h(message, "message");
                wu5.this.d(message);
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public wu5(Context context, int i, int i2, int i3, String str, String str2) {
        zq3.h(context, "context");
        zq3.h(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = i3;
        this.j = str2;
        this.b = new a();
    }

    private final void a(Bundle bundle) {
        if (this.d) {
            this.d = false;
            b bVar = this.c;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    private final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        String str = this.j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        e(bundle);
        Message obtain = Message.obtain((Handler) null, this.f);
        obtain.arg1 = this.i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.b);
        try {
            Messenger messenger = this.e;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void b() {
        this.d = false;
    }

    protected final Context c() {
        return this.a;
    }

    protected final void d(Message message) {
        zq3.h(message, "message");
        if (message.what == this.g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                a(null);
            } else {
                a(data);
            }
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    protected abstract void e(Bundle bundle);

    public final void g(b bVar) {
        this.c = bVar;
    }

    public final boolean h() {
        synchronized (this) {
            boolean z = false;
            if (this.d) {
                return false;
            }
            c25 c25Var = c25.a;
            if (c25.w(this.i) == -1) {
                return false;
            }
            Intent m = c25.m(c());
            if (m != null) {
                z = true;
                this.d = true;
                c().bindService(m, this, 1);
            }
            return z;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(iBinder, "service");
        this.e = new Messenger(iBinder);
        f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        zq3.h(componentName, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.e = null;
        try {
            this.a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
