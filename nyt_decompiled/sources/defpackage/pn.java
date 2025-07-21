package defpackage;

import android.os.Bundle;
import com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class pn implements ic {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;
    private final AppsFlyerClient c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public pn(String str, String str2, AppsFlyerClient appsFlyerClient) {
        zq3.h(str, "appsFlyerDevId");
        zq3.h(appsFlyerClient, "appsFlyerClient");
        this.a = str;
        this.b = str2;
        this.c = appsFlyerClient;
    }

    @Override // defpackage.ic
    public void a(Bundle bundle) {
        zq3.h(bundle, "bundle");
        bundle.putString("af_id", this.b);
        bundle.putString("dev_key", this.a);
    }

    @Override // defpackage.ic
    public void b(Map map) {
        zq3.h(map, "builder");
        String str = this.b;
        if (str != null) {
            map.put("af_id", str);
        }
        map.put("dev_key", this.a);
    }

    @Override // defpackage.ic
    public boolean c(uc ucVar) {
        zq3.h(ucVar, "event");
        return (ucVar instanceof on) && this.c.g();
    }
}
