package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.subauth.core.devsettings.overrides.EntitlementOverrideSetting;
import defpackage.yn1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class d78 {
    public static final d78 a = new d78();

    private d78() {
    }

    public final Set a(Context context) {
        zq3.h(context, "context");
        List C0 = d.C0(EntitlementOverrideSetting.values());
        ArrayList arrayList = new ArrayList(i.w(C0, 10));
        Iterator it2 = C0.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EntitlementOverrideSetting) it2.next()).name());
        }
        return b0.d(new DevSettingChoiceListPreferenceItem("Set Google Play Entitlements Overrides. Requires Restart. Will adjust your subscription status", "subauth.entitlement_override.key", ao1.b(arrayList, true), null, null, new yn1.b("Subauth-Entitlements"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, true, 152, null).j(context));
    }
}
