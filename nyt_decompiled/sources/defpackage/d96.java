package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.g;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrOptOutStatus;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.model.PurrLocation;
import com.nytimes.android.subauth.core.purr.network.Environment;
import java.util.List;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public interface d96 extends r86, y86 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final Environment a(Context context) {
            zq3.h(context, "context");
            SharedPreferences b = g.b(context);
            zq3.g(b, "getDefaultSharedPreferences(...)");
            Environment a2 = f22.a(b);
            return a2 == null ? Environment.PRODUCTION : a2;
        }

        public final PurrLocation b(Context context) {
            zq3.h(context, "context");
            String string = g.b(context).getString("nyt.purr.location_key", "NO_OVERRIDE");
            zq3.e(string);
            return PurrLocation.valueOf(string);
        }
    }

    Object a(by0 by0Var);

    Object b(boolean z, by0 by0Var);

    Flow c(List list);

    PrivacyConfiguration d();

    String g();

    PurrOptOutStatus l();
}
