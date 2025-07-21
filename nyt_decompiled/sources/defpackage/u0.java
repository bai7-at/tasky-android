package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.provider.Settings;
import androidx.preference.g;
import com.nytimes.android.abra.models.TestSpec;
import com.nytimes.android.abra.utilities.ParamProvider;
import com.nytimes.android.subauth.core.auth.network.response.d;
import com.nytimes.android.utils.AppPreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes3.dex */
public final class u0 implements ParamProvider {
    private final boolean a;
    private final Context b;
    private final List c;
    private final AppPreferences d;
    private final String e;
    private final b04 f;

    public u0(boolean z, Context context, List list, AppPreferences appPreferences, String str, b04 b04Var) {
        zq3.h(context, "context");
        zq3.h(list, "testSpecs");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(str, "appVersion");
        zq3.h(b04Var, "subauthClient");
        this.a = z;
        this.b = context;
        this.c = list;
        this.d = appPreferences;
        this.e = str;
        this.f = b04Var;
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public String getAbraBundleUrl() {
        return ParamProvider.DefaultImpls.getAbraBundleUrl(this);
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public String getAgentId() {
        String string = Settings.Secure.getString(this.b.getContentResolver(), "android_id");
        zq3.g(string, "getString(...)");
        return string;
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public TimeZone getCurrentTimeZone() {
        return ParamProvider.DefaultImpls.getCurrentTimeZone(this);
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public Map getExtraParameters() {
        Map n = t.n(du8.a("app_version", this.e));
        String D = ((z58) this.f.get()).D();
        Set c1 = i.c1(((z58) this.f.get()).h().i());
        d a = ((z58) this.f.get()).a();
        if (D != null) {
            n.put("regi_id", D);
        }
        if (c1 != null && (!c1.isEmpty())) {
            n.put("user_entitlements", i.u0(c1, ",", null, null, 0, null, null, 62, null));
        }
        if (a != null) {
            n.put("targeting_api_data", a.a());
        }
        return n;
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public String getIntegration() {
        String string = this.b.getString(zl6.abra_v12_integration_prd);
        zq3.g(string, "getString(...)");
        if (!this.a) {
            return string;
        }
        String string2 = this.b.getString(zl6.com_nytimes_android_phoenix_abra_v12_ENVIRONMENT);
        zq3.g(string2, "getString(...)");
        String string3 = g.b(this.b).getString(string2, string);
        return string3 == null ? string : string3;
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public Map getOverrides() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TestSpec testSpec : this.c) {
            String l = this.d.l("abraV12_" + testSpec.getTestName(), null);
            if (l != null && l.length() != 0) {
                linkedHashMap.put(testSpec.getTestName(), l);
            }
        }
        return linkedHashMap;
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public PointF getViewPort(Context context) {
        return ParamProvider.DefaultImpls.getViewPort(this, context);
    }

    @Override // com.nytimes.android.abra.utilities.ParamProvider
    public Object onNetworkUpdate(by0 by0Var) {
        Object g = ((z58) this.f.get()).g(by0Var);
        return g == a.h() ? g : ww8.a;
    }
}
