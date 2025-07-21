package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import defpackage.be3;

/* loaded from: classes.dex */
public abstract class i51 implements ServiceConnection {
    private Context a;

    class a extends g51 {
        a(be3 be3Var, ComponentName componentName, Context context) {
            super(be3Var, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, g51 g51Var);

    void b(Context context) {
        this.a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(be3.a.O(iBinder), componentName, this.a));
    }
}
