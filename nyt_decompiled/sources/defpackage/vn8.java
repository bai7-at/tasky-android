package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class vn8 {
    private final SharedPreferences a;
    private final com.nytimes.android.entitlements.a b;
    private final b c;
    private Asset d;
    private final MutableStateFlow e;
    private final StateFlow f;
    static final /* synthetic */ iv3[] g = {zt6.f(new MutablePropertyReference1Impl(vn8.class, "tooltipLinkSharing", "getTooltipLinkSharing()Z", 0))};
    public static final a Companion = new a(null);
    public static final int h = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements lp6 {
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;

        b(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        @Override // defpackage.lp6
        public /* bridge */ /* synthetic */ void a(Object obj, iv3 iv3Var, Object obj2) {
            c(obj, iv3Var, ((Boolean) obj2).booleanValue());
        }

        @Override // defpackage.lp6, defpackage.hp6
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean getValue(Object obj, iv3 iv3Var) {
            zq3.h(obj, "thisRef");
            zq3.h(iv3Var, "property");
            return Boolean.valueOf(vn8.this.a.getBoolean(this.b, this.c));
        }

        public void c(Object obj, iv3 iv3Var, boolean z) {
            zq3.h(obj, "thisRef");
            zq3.h(iv3Var, "property");
            SharedPreferences sharedPreferences = vn8.this.a;
            String str = this.b;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str, z);
            edit.apply();
        }
    }

    public vn8(SharedPreferences sharedPreferences, com.nytimes.android.entitlements.a aVar) {
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(aVar, "eCommClient");
        this.a = sharedPreferences;
        this.b = aVar;
        this.c = b("TOOLTIP_LINK_SHARING", true);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final b b(String str, boolean z) {
        return new b(str, z);
    }

    private final boolean e() {
        return this.c.getValue(this, g[0]).booleanValue();
    }

    private final void j(boolean z) {
        this.c.c(this, g[0], z);
    }

    public final boolean c() {
        return !((Boolean) this.f.getValue()).booleanValue();
    }

    public final void d() {
        j(false);
        this.e.setValue(Boolean.FALSE);
    }

    public final StateFlow f() {
        return this.f;
    }

    public final void g(Asset asset) {
        zq3.h(asset, "asset");
        this.d = asset;
        this.e.setValue(Boolean.valueOf(h() && e()));
    }

    public final boolean h() {
        Asset asset = this.d;
        String url = asset != null ? asset.getUrl() : null;
        return this.b.m() && url != null && !rb5.k(url) && AssetUtils.isShareableCollection(this.d);
    }

    public final void i() {
        j(true);
    }

    public final void k() {
        this.e.setValue(Boolean.valueOf(!((Boolean) r1.getValue()).booleanValue()));
    }
}
