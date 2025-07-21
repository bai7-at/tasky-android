package defpackage;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;

/* loaded from: classes4.dex */
public class m4 implements hx2 {
    private volatile Object a;
    private final Object b = new Object();
    protected final Activity c;
    private final hx2 d;

    public interface a {
        l4 a();
    }

    public m4(Activity activity) {
        this.c = activity;
        this.d = new o5((ComponentActivity) activity);
    }

    protected Object a() {
        String str;
        if (this.c.getApplication() instanceof hx2) {
            return ((a) a22.a(this.d, a.class)).a().a(this.c).build();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.c.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final w97 b() {
        return ((o5) this.d).c();
    }

    @Override // defpackage.hx2
    public Object generatedComponent() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = a();
                    }
                } finally {
                }
            }
        }
        return this.a;
    }
}
