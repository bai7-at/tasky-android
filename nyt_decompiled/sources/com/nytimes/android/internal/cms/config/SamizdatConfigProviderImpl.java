package com.nytimes.android.internal.cms.config;

import com.nytimes.android.internal.cms.CmsEnvironment;
import defpackage.is7;
import defpackage.q77;
import defpackage.qs2;
import defpackage.r77;
import defpackage.t77;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SamizdatConfigProviderImpl implements t77 {
    private final String a;
    private final String b;
    private final is7 c;
    private final q77 d;
    private String e;
    private final qs2 f;

    public SamizdatConfigProviderImpl(String str, String str2, is7 is7Var, q77 q77Var) {
        zq3.h(str2, "headerLanguage");
        zq3.h(is7Var, "simpleAuthRequestSigner");
        zq3.h(q77Var, "samizdatBaseUrlGetter");
        this.a = str;
        this.b = str2;
        this.c = is7Var;
        this.d = q77Var;
        this.f = new qs2() { // from class: com.nytimes.android.internal.cms.config.SamizdatConfigProviderImpl$urlProvider$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                q77 q77Var2;
                String str3;
                q77 q77Var3;
                String str4;
                q77 q77Var4;
                q77Var2 = SamizdatConfigProviderImpl.this.d;
                if (q77Var2.b().mo865invoke() == CmsEnvironment.STAGING) {
                    q77Var4 = SamizdatConfigProviderImpl.this.d;
                    return q77Var4.a();
                }
                str3 = SamizdatConfigProviderImpl.this.e;
                if (str3 == null) {
                    q77Var3 = SamizdatConfigProviderImpl.this.d;
                    return q77Var3.a();
                }
                str4 = SamizdatConfigProviderImpl.this.e;
                zq3.e(str4);
                return str4;
            }
        };
    }

    @Override // defpackage.t77
    public r77 a() {
        return new r77(this.c, this.f, true, true, this.b, this.a);
    }
}
