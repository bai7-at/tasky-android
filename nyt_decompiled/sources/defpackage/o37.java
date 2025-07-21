package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.n;
import com.google.android.gms.cloudmessaging.zzd;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class o37 {
    private static int h;
    private static PendingIntent i;
    private static final Executor j = new Executor() { // from class: z7g
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final Context b;
    private final zxf c;
    private final ScheduledExecutorService d;
    private Messenger f;
    private zzd g;
    private final hs7 a = new hs7();
    private Messenger e = new Messenger(new rq9(this, Looper.getMainLooper()));

    public o37(Context context) {
        this.b = context;
        this.c = new zxf(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ og8 b(Bundle bundle) {
        return j(bundle) ? vg8.e(null) : vg8.e(bundle);
    }

    static /* bridge */ /* synthetic */ void d(o37 o37Var, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new ibb());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        o37Var.g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        o37Var.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        o37Var.i(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (o37Var.a) {
                        for (int i2 = 0; i2 < o37Var.a.size(); i2++) {
                            try {
                                o37Var.i((String) o37Var.a.i(i2), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                o37Var.i(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final og8 f(Bundle bundle) {
        final String g = g();
        final qg8 qg8Var = new qg8();
        synchronized (this.a) {
            this.a.put(g, qg8Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        h(this.b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g).length() + 5);
        sb.append("|ID|");
        sb.append(g);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.d.schedule(new Runnable() { // from class: q5g
                @Override // java.lang.Runnable
                public final void run() {
                    if (qg8.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            qg8Var.a().c(j, new me5() { // from class: c2g
                @Override // defpackage.me5
                public final void onComplete(og8 og8Var) {
                    o37.this.e(g, schedule, og8Var);
                }
            });
            return qg8Var.a();
        }
        if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.d.schedule(new Runnable() { // from class: q5g
            @Override // java.lang.Runnable
            public final void run() {
                if (qg8.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        qg8Var.a().c(j, new me5() { // from class: c2g
            @Override // defpackage.me5
            public final void onComplete(og8 og8Var) {
                o37.this.e(g, schedule2, og8Var);
            }
        });
        return qg8Var.a();
    }

    private static synchronized String g() {
        String num;
        synchronized (o37.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (o37.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = up9.a(context, 0, intent2, up9.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                qg8 qg8Var = (qg8) this.a.remove(str);
                if (qg8Var != null) {
                    qg8Var.c(bundle);
                } else {
                    String valueOf = String.valueOf(str);
                    Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public og8 a(final Bundle bundle) {
        return this.c.a() < 12000000 ? this.c.b() != 0 ? f(bundle).k(j, new cy0() { // from class: wyf
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                return o37.this.c(bundle, og8Var);
            }
        }) : vg8.d(new IOException("MISSING_INSTANCEID_SERVICE")) : n.b(this.b).d(1, bundle).i(j, new cy0() { // from class: r0g
            @Override // defpackage.cy0
            public final Object then(og8 og8Var) {
                if (og8Var.q()) {
                    return (Bundle) og8Var.m();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(og8Var.l());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                    Log.d("Rpc", sb.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", og8Var.l());
            }
        });
    }

    public final /* synthetic */ og8 c(Bundle bundle, og8 og8Var) {
        return (og8Var.q() && j((Bundle) og8Var.m())) ? f(bundle).s(j, new bc8() { // from class: m3g
            @Override // defpackage.bc8
            public final og8 then(Object obj) {
                return o37.b((Bundle) obj);
            }
        }) : og8Var;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, og8 og8Var) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
