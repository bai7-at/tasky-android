package defpackage;

import android.app.Application;
import android.os.Bundle;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class pi2 implements ic {
    public static final a Companion = new a(null);
    private final Application a;
    private final xp1 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public pi2(Application application, xp1 xp1Var) {
        zq3.h(application, "context");
        zq3.h(xp1Var, "deviceUtilsProxy");
        this.a = application;
        this.b = xp1Var;
    }

    @Override // defpackage.ic
    public void a(Bundle bundle) {
        zq3.h(bundle, "bundle");
        if (this.b.a(this.a)) {
            bundle.putString("is_tablet", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
    }

    @Override // defpackage.ic
    public void b(Map map) {
        zq3.h(map, "builder");
        if (this.b.a(this.a)) {
            map.put("isTablet", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
    }

    @Override // defpackage.ic
    public boolean c(uc ucVar) {
        zq3.h(ucVar, "event");
        return true;
    }
}
