package defpackage;

import android.util.JsonReader;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class w3a implements ake {
    private final Executor a;
    private final d1d b;

    public w3a(Executor executor, d1d d1dVar) {
        this.a = executor;
        this.b = d1dVar;
    }

    @Override // defpackage.ake
    public final /* bridge */ /* synthetic */ j64 zza(Object obj) {
        final zzbze zzbzeVar = (zzbze) obj;
        return zb.n(this.b.b(zzbzeVar), new ake() { // from class: o2a
            @Override // defpackage.ake
            public final j64 zza(Object obj2) {
                k6a k6aVar = new k6a(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    k6aVar.b = kia.b().j(zzbze.this.zza).toString();
                } catch (JSONException unused) {
                    k6aVar.b = "{}";
                }
                return zb.h(k6aVar);
            }
        }, this.a);
    }
}
