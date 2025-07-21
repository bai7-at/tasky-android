package com.nytimes.android.subauth.core.database.userdata.subscription;

import androidx.annotation.Keep;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* loaded from: classes4.dex */
public abstract class UserSubscriptionEntitlement {
    private final String rawValue;

    public static final class a extends UserSubscriptionEntitlement {
        public static final a INSTANCE = new a();

        private a() {
            super("AAA", null);
        }
    }

    public static final class b extends UserSubscriptionEntitlement {
        public static final b INSTANCE = new b();

        private b() {
            super("ATH", null);
        }
    }

    public static final class c extends UserSubscriptionEntitlement {
        public static final c INSTANCE = new c();

        private c() {
            super("AUD", null);
        }
    }

    public static final class d extends UserSubscriptionEntitlement {
        public static final d INSTANCE = new d();

        private d() {
            super("CKG", null);
        }
    }

    public static final class e extends UserSubscriptionEntitlement {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(str, null);
            zq3.h(str, "value");
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.value, ((e) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Custom(value=" + this.value + ")";
        }
    }

    public static final class f extends UserSubscriptionEntitlement {
        public static final f INSTANCE = new f();

        private f() {
            super("XWD", null);
        }
    }

    public static final class g extends UserSubscriptionEntitlement {
        public static final g INSTANCE = new g();

        private g() {
            super("MM", null);
        }
    }

    public static final class h extends UserSubscriptionEntitlement {
        public static final h INSTANCE = new h();

        private h() {
            super("MSD", null);
        }
    }

    public static final class i extends UserSubscriptionEntitlement {
        public static final i INSTANCE = new i();

        private i() {
            super("MTD", null);
        }
    }

    public static final class j extends UserSubscriptionEntitlement {
        public static final j INSTANCE = new j();

        private j() {
            super("MOW", null);
        }
    }

    public static final class k extends UserSubscriptionEntitlement {
        public static final k INSTANCE = new k();

        private k() {
            super("PAU", null);
        }
    }

    public static final class l extends UserSubscriptionEntitlement {
        public static final l INSTANCE = new l();

        private l() {
            super("SPT", null);
        }
    }

    public static final class m extends UserSubscriptionEntitlement {
        public static final m INSTANCE = new m();

        private m() {
            super("VAR", null);
        }
    }

    public static final class n extends UserSubscriptionEntitlement {
        public static final n INSTANCE = new n();

        private n() {
            super("VZN3", null);
        }
    }

    public static final class o extends UserSubscriptionEntitlement {
        public static final o INSTANCE = new o();

        private o() {
            super("WC", null);
        }
    }

    public /* synthetic */ UserSubscriptionEntitlement(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public final UserSubscriptionProduct matchingSubscription() {
        if (zq3.c(this, d.INSTANCE)) {
            return UserSubscriptionProduct.c.INSTANCE;
        }
        if (zq3.c(this, f.INSTANCE)) {
            return UserSubscriptionProduct.d.INSTANCE;
        }
        if (zq3.c(this, g.INSTANCE)) {
            return UserSubscriptionProduct.e.INSTANCE;
        }
        if (zq3.c(this, c.INSTANCE)) {
            return UserSubscriptionProduct.b.INSTANCE;
        }
        if (zq3.c(this, o.INSTANCE)) {
            return UserSubscriptionProduct.g.INSTANCE;
        }
        if (zq3.c(this, b.INSTANCE)) {
            return UserSubscriptionProduct.a.INSTANCE;
        }
        return null;
    }

    private UserSubscriptionEntitlement(String str) {
        this.rawValue = str;
    }
}
