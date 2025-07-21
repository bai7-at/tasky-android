package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ug8 implements Iterable {
    private final ArrayList a = new ArrayList();
    private final Context b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private ug8(Context context) {
        this.b = context;
    }

    public static ug8 j(Context context) {
        return new ug8(context);
    }

    public ug8 a(Intent intent) {
        this.a.add(intent);
        return this;
    }

    public ug8 c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.b.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ug8 e(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = q25.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.b.getPackageManager());
            }
            f(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public ug8 f(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent b = q25.b(this.b, componentName);
            while (b != null) {
                this.a.add(size, b);
                b = q25.b(this.b, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public ug8 g(Class cls) {
        return f(new ComponentName(this.b, (Class<?>) cls));
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.a.iterator();
    }

    public Intent k(int i) {
        return (Intent) this.a.get(i);
    }

    public int n() {
        return this.a.size();
    }

    public PendingIntent o(int i, int i2) {
        return p(i, i2, null);
    }

    public PendingIntent p(int i, int i2, Bundle bundle) {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.b, i, intentArr, i2, bundle);
    }

    public void q() {
        t(null);
    }

    public void t(Bundle bundle) {
        if (this.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (mx0.l(this.b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
    }
}
