package defpackage;

import com.google.gson.Gson;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.messaging.regibundle.models.RegibundleData;
import com.nytimes.android.messaging.regibundle.models.RegibundleDataKt;
import com.nytimes.android.utils.AppPreferences;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ku6 {
    private final cb2 a;
    private final AppPreferences b;
    private final a c;
    private final qv6 d;
    private final float e;

    public ku6(cb2 cb2Var, AppPreferences appPreferences, a aVar, qv6 qv6Var) {
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(aVar, "eCommClient");
        zq3.h(qv6Var, "remoteConfig");
        this.a = cb2Var;
        this.b = appPreferences;
        this.c = aVar;
        this.d = qv6Var;
        this.e = qv6Var.q();
    }

    public final boolean a(int i) {
        RegibundleData defaultRegibundleData;
        if (this.c.a() || i <= this.e) {
            return false;
        }
        if (this.d.D().length() > 0) {
            Object fromJson = new Gson().fromJson(this.d.D(), (Class<Object>) RegibundleData.class);
            zq3.e(fromJson);
            defaultRegibundleData = (RegibundleData) fromJson;
        } else {
            defaultRegibundleData = RegibundleDataKt.defaultRegibundleData();
        }
        if (this.b.k("PREF_SUB_MESSAGE_LAST_SEEN", 0L) + TimeUnit.HOURS.toMillis(defaultRegibundleData.getSubscription().getHoursBetweenRecurrence()) > Calendar.getInstance().getTimeInMillis()) {
            return false;
        }
        this.b.g("PREF_SUB_MESSAGE_LAST_SEEN", Calendar.getInstance().getTimeInMillis());
        return true;
    }
}
