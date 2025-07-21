package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride;
import com.nytimes.android.subauth.core.network.config.SubauthEnvironment;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.util.SubauthSetupException;
import com.nytimes.subauth.ui.SubauthUserUIManager;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class r98 implements t98, SubauthUserUIDebugAPI {
    public static final b b = new b(null);
    public static final int c = 8;
    private static v98 d;
    private final SubauthUserUIManager a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v98 a() {
            return r98.d;
        }

        private b() {
        }
    }

    public /* synthetic */ r98(Context context, NYTUser nYTUser, c05 c05Var, o98 o98Var, p78 p78Var, com.nytimes.android.subauth.core.purr.a aVar, PurrDirectiveOverrider purrDirectiveOverrider, f68 f68Var, kt2 kt2Var, SubauthListenerManager subauthListenerManager, SubauthEnvironment subauthEnvironment, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, nYTUser, c05Var, o98Var, p78Var, aVar, purrDirectiveOverrider, f68Var, kt2Var, subauthListenerManager, subauthEnvironment);
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public void a(LIREErrorStateOverride lIREErrorStateOverride) {
        zq3.h(lIREErrorStateOverride, "errorState");
        this.a.a(lIREErrorStateOverride);
    }

    @Override // defpackage.t98
    public Object b(Context context, SubauthUiParams subauthUiParams, by0 by0Var) {
        return this.a.b(context, subauthUiParams, by0Var);
    }

    @Override // defpackage.t98
    public Object c(Context context, boolean z, SubauthUiParams subauthUiParams, by0 by0Var) {
        Object c2 = this.a.c(context, z, subauthUiParams, by0Var);
        return c2 == kotlin.coroutines.intrinsics.a.h() ? c2 : ww8.a;
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public void d(SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS overrideCustomLoginWithNYTS) {
        zq3.h(overrideCustomLoginWithNYTS, TransferTable.COLUMN_STATE);
        this.a.d(overrideCustomLoginWithNYTS);
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public boolean e() {
        return this.a.e();
    }

    @Override // com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI
    public void f(DeleteAccountStatusOverride deleteAccountStatusOverride) {
        zq3.h(deleteAccountStatusOverride, "errorState");
        this.a.f(deleteAccountStatusOverride);
    }

    public Flow h() {
        return this.a.g();
    }

    public Flow i() {
        return this.a.h();
    }

    public Flow j() {
        return this.a.i();
    }

    public Object k(Context context, SubauthUiParams subauthUiParams, by0 by0Var) {
        return this.a.j(context, subauthUiParams, by0Var);
    }

    public Flow l() {
        return this.a.k();
    }

    public Object m(Context context, SubauthUiParams subauthUiParams, by0 by0Var) {
        return this.a.l(context, subauthUiParams, by0Var);
    }

    private r98(Context context, NYTUser nYTUser, c05 c05Var, o98 o98Var, p78 p78Var, com.nytimes.android.subauth.core.purr.a aVar, PurrDirectiveOverrider purrDirectiveOverrider, f68 f68Var, kt2 kt2Var, SubauthListenerManager subauthListenerManager, SubauthEnvironment subauthEnvironment) {
        w98 a2 = q71.a().b(new x98(nYTUser, c05Var, o98Var, p78Var, aVar, purrDirectiveOverrider, subauthListenerManager, f68Var, subauthEnvironment, context)).a();
        d = a2;
        zq3.e(a2);
        this.a = a2.c();
        CustomLoginWithNYTSProvider customLoginWithNYTSProvider = CustomLoginWithNYTSProvider.a;
        customLoginWithNYTSProvider.d(kt2Var);
        customLoginWithNYTSProvider.a(context);
    }

    public static final class a {
        private NYTUser a;
        private c05 b;
        private o98 c;
        private p78 d;
        private com.nytimes.android.subauth.core.purr.a e;
        private PurrDirectiveOverrider f;
        private f68 g;
        private kt2 h;
        private SubauthListenerManager i;
        private SubauthEnvironment j;

        public a(NYTUser nYTUser, c05 c05Var, o98 o98Var, p78 p78Var, com.nytimes.android.subauth.core.purr.a aVar, PurrDirectiveOverrider purrDirectiveOverrider, f68 f68Var, kt2 kt2Var, SubauthListenerManager subauthListenerManager, SubauthEnvironment subauthEnvironment) {
            this.a = nYTUser;
            this.b = c05Var;
            this.c = o98Var;
            this.d = p78Var;
            this.e = aVar;
            this.f = purrDirectiveOverrider;
            this.g = f68Var;
            this.h = kt2Var;
            this.i = subauthListenerManager;
            this.j = subauthEnvironment;
        }

        public final r98 a(Context context) {
            zq3.h(context, "context");
            if (this.a == null || this.c == null || this.j == null || this.i == null) {
                throw new SubauthSetupException("Need Subauth to setup SubauthUserUI module");
            }
            if (this.b == null) {
                throw new SubauthSetupException("Need Subauth for NYT Cookie Provider to setup SubauthUserUI module");
            }
            if (this.d == null) {
                throw new SubauthSetupException("Need Subauth for Login Linking API to setup SubauthUserUI module");
            }
            if (this.e == null) {
                throw new SubauthSetupException("Need Subauth for PURR to setup SubauthUserUI module");
            }
            if (this.f == null) {
                throw new SubauthSetupException("Need Subauth for PURR to setup SubauthUserUI module");
            }
            NYTUser nYTUser = this.a;
            zq3.e(nYTUser);
            c05 c05Var = this.b;
            zq3.e(c05Var);
            o98 o98Var = this.c;
            zq3.e(o98Var);
            p78 p78Var = this.d;
            zq3.e(p78Var);
            com.nytimes.android.subauth.core.purr.a aVar = this.e;
            zq3.e(aVar);
            PurrDirectiveOverrider purrDirectiveOverrider = this.f;
            zq3.e(purrDirectiveOverrider);
            f68 f68Var = this.g;
            if (f68Var == null) {
                Resources resources = context.getResources();
                zq3.g(resources, "getResources(...)");
                f68Var = new uj1(resources, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, 134217726, null).a();
            }
            kt2 kt2Var = this.h;
            SubauthListenerManager subauthListenerManager = this.i;
            zq3.e(subauthListenerManager);
            SubauthEnvironment subauthEnvironment = this.j;
            zq3.e(subauthEnvironment);
            return new r98(context, nYTUser, c05Var, o98Var, p78Var, aVar, purrDirectiveOverrider, f68Var, kt2Var, subauthListenerManager, subauthEnvironment, null);
        }

        public final a b(Subauth subauth) {
            zq3.h(subauth, "subauth");
            this.a = subauth.i();
            this.b = subauth.h();
            this.c = subauth.p();
            this.d = subauth.g();
            this.e = subauth.k();
            this.f = subauth.l();
            this.j = subauth.n();
            this.i = subauth.o();
            return this;
        }

        public final a c(f68 f68Var) {
            zq3.h(f68Var, "subauthConfig");
            this.g = f68Var;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f) && zq3.c(this.g, aVar.g) && zq3.c(this.h, aVar.h) && zq3.c(this.i, aVar.i) && zq3.c(this.j, aVar.j);
        }

        public int hashCode() {
            NYTUser nYTUser = this.a;
            int hashCode = (nYTUser == null ? 0 : nYTUser.hashCode()) * 31;
            c05 c05Var = this.b;
            int hashCode2 = (hashCode + (c05Var == null ? 0 : c05Var.hashCode())) * 31;
            o98 o98Var = this.c;
            int hashCode3 = (hashCode2 + (o98Var == null ? 0 : o98Var.hashCode())) * 31;
            p78 p78Var = this.d;
            int hashCode4 = (hashCode3 + (p78Var == null ? 0 : p78Var.hashCode())) * 31;
            com.nytimes.android.subauth.core.purr.a aVar = this.e;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            PurrDirectiveOverrider purrDirectiveOverrider = this.f;
            int hashCode6 = (hashCode5 + (purrDirectiveOverrider == null ? 0 : purrDirectiveOverrider.hashCode())) * 31;
            f68 f68Var = this.g;
            int hashCode7 = (hashCode6 + (f68Var == null ? 0 : f68Var.hashCode())) * 31;
            kt2 kt2Var = this.h;
            int hashCode8 = (hashCode7 + (kt2Var == null ? 0 : kt2Var.hashCode())) * 31;
            SubauthListenerManager subauthListenerManager = this.i;
            int hashCode9 = (hashCode8 + (subauthListenerManager == null ? 0 : subauthListenerManager.hashCode())) * 31;
            SubauthEnvironment subauthEnvironment = this.j;
            return hashCode9 + (subauthEnvironment != null ? subauthEnvironment.hashCode() : 0);
        }

        public String toString() {
            return "Builder(nytUser=" + this.a + ", nytCookieProvider=" + this.b + ", subauthUser=" + this.c + ", loginLinkingAPI=" + this.d + ", purrManager=" + this.e + ", purrDirectiveOverrider=" + this.f + ", subauthConfig=" + this.g + ", customLoginWithNYTSLambda=" + this.h + ", subauthListenerManager=" + this.i + ", subauthEnvironment=" + this.j + ")";
        }

        public /* synthetic */ a(NYTUser nYTUser, c05 c05Var, o98 o98Var, p78 p78Var, com.nytimes.android.subauth.core.purr.a aVar, PurrDirectiveOverrider purrDirectiveOverrider, f68 f68Var, kt2 kt2Var, SubauthListenerManager subauthListenerManager, SubauthEnvironment subauthEnvironment, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : nYTUser, (i & 2) != 0 ? null : c05Var, (i & 4) != 0 ? null : o98Var, (i & 8) != 0 ? null : p78Var, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : purrDirectiveOverrider, (i & 64) != 0 ? null : f68Var, (i & 128) != 0 ? null : kt2Var, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : subauthListenerManager, (i & 512) != 0 ? null : subauthEnvironment);
        }
    }
}
