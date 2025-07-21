package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import com.nytimes.android.subauth.devsettings.items.SubauthCommonDevSettingFactory;
import com.nytimes.android.subauth.devsettings.items.SubauthNYTUserDevSettingFactory;
import com.nytimes.android.subauth.devsettings.items.SubauthPurchaseDevSettingFactory;
import com.nytimes.android.subauth.devsettings.items.SubauthUserDevSettingFactory;
import com.nytimes.android.subauth.devsettings.items.SubauthUserUiDevSettingFactory;
import defpackage.yn1;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class g15 {
    public static final g15 a = new g15();

    private g15() {
    }

    private final un1 a(Context context, Subauth subauth) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(SubauthCommonDevSettingFactory.a.a(context, subauth.m(), subauth.q()));
        return new DevSettingGroupExpandable("Subauth Common - Dev Settings", i.X0(linkedHashSet), null, false, new yn1.b("Subauth"), "2", false, false, 204, null);
    }

    private final un1 c(NYTUser nYTUser) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(SubauthNYTUserDevSettingFactory.a.e(nYTUser));
        return new DevSettingGroupExpandable("Subauth NYTUser - Dev Settings", i.X0(linkedHashSet), null, false, new yn1.b("Subauth"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false, 204, null);
    }

    private final un1 d(Context context, b98 b98Var, CoroutineScope coroutineScope) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(SubauthPurchaseDevSettingFactory.a.a(context, b98Var, coroutineScope));
        linkedHashSet.addAll(d78.a.a(context));
        return new DevSettingGroupExpandable("Subauth Purchase - Dev Settings", i.X0(linkedHashSet), null, false, new yn1.b("Subauth"), "4", false, false, 204, null);
    }

    private final un1 e(Context context, NYTUser nYTUser, q98 q98Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(SubauthUserDevSettingFactory.a.j(context, nYTUser, q98Var));
        return new DevSettingGroupExpandable("Subauth User - Dev Settings", i.X0(linkedHashSet), null, false, new yn1.b("Subauth"), "3", false, false, 204, null);
    }

    private final un1 f(Context context, SubauthUserUIDebugAPI subauthUserUIDebugAPI) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (subauthUserUIDebugAPI.e()) {
            linkedHashSet.addAll(SubauthUserUiDevSettingFactory.a.k(context));
        }
        SubauthUserUiDevSettingFactory subauthUserUiDevSettingFactory = SubauthUserUiDevSettingFactory.a;
        linkedHashSet.addAll(subauthUserUiDevSettingFactory.e(context, subauthUserUIDebugAPI));
        linkedHashSet.addAll(subauthUserUiDevSettingFactory.j(context));
        linkedHashSet.addAll(subauthUserUiDevSettingFactory.i(context, subauthUserUIDebugAPI));
        linkedHashSet.addAll(subauthUserUiDevSettingFactory.f(context, subauthUserUIDebugAPI));
        linkedHashSet.addAll(subauthUserUiDevSettingFactory.l(context));
        return new DevSettingGroupExpandable("Subauth User UI - Dev Settings", i.X0(linkedHashSet), null, false, new yn1.b("Subauth"), "5", false, false, 204, null);
    }

    public final Set b(Context context, Subauth subauth, SubauthUserUIDebugAPI subauthUserUIDebugAPI, CoroutineScope coroutineScope) {
        zq3.h(context, "context");
        zq3.h(subauth, "subauth");
        zq3.h(coroutineScope, "applicationScope");
        NYTUser i = subauth.i();
        Set h = b0.h(c(i), a(context, subauth), e(context, i, subauth.f()), d(context, subauth.e(), coroutineScope));
        if (subauthUserUIDebugAPI != null) {
            h.add(a.f(context, subauthUserUIDebugAPI));
        }
        return h;
    }
}
