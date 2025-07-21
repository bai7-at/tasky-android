package defpackage;

import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class au0 {
    public static final Charset e = Charset.forName(Constants.DEFAULT_ENCODING);
    static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    private final Set a = new HashSet();
    private final Executor b;
    private final a c;
    private final a d;

    public au0(Executor executor, a aVar, a aVar2) {
        this.b = executor;
        this.c = aVar;
        this.d = aVar2;
    }

    private void c(final String str, final b bVar) {
        if (bVar == null) {
            return;
        }
        synchronized (this.a) {
            try {
                for (final BiConsumer biConsumer : this.a) {
                    this.b.execute(new Runnable() { // from class: zt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            BiConsumer.this.accept(str, bVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static b d(a aVar) {
        return aVar.f();
    }

    private static String e(a aVar, String str) {
        b d = d(aVar);
        if (d == null) {
            return null;
        }
        try {
            return d.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void h(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void b(BiConsumer biConsumer) {
        synchronized (this.a) {
            this.a.add(biConsumer);
        }
    }

    public jj2 f(String str) {
        String e2 = e(this.c, str);
        if (e2 != null) {
            c(str, d(this.c));
            return new kj2(e2, 2);
        }
        String e3 = e(this.d, str);
        if (e3 != null) {
            return new kj2(e3, 1);
        }
        h(str, "FirebaseRemoteConfigValue");
        return new kj2("", 0);
    }
}
