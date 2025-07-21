package com.nytimes.android.subauth.core.database.userdata.subscription;

import androidx.annotation.Keep;
import com.nytimes.android.subauth.core.auth.network.UserDetailsException;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionEntitlement;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* loaded from: classes4.dex */
public abstract class UserSubscriptionProduct {
    private final String rawValue;

    public static final class a extends UserSubscriptionProduct {
        public static final a INSTANCE = new a();

        private a() {
            super("ATHLETIC", null);
        }
    }

    public static final class b extends UserSubscriptionProduct {
        public static final b INSTANCE = new b();

        private b() {
            super("AUDIO", null);
        }
    }

    public static final class c extends UserSubscriptionProduct {
        public static final c INSTANCE = new c();

        private c() {
            super("COOKING", null);
        }
    }

    public static final class d extends UserSubscriptionProduct {
        public static final d INSTANCE = new d();

        private d() {
            super("GAMES", null);
        }
    }

    public static final class e extends UserSubscriptionProduct {
        public static final e INSTANCE = new e();

        private e() {
            super("NEWS", null);
        }
    }

    public static final class f extends UserSubscriptionProduct {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(str, null);
            zq3.h(str, "value");
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.value, ((f) obj).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Unknown(value=" + this.value + ")";
        }
    }

    public static final class g extends UserSubscriptionProduct {
        public static final g INSTANCE = new g();

        private g() {
            super("WIRECUTTER", null);
        }
    }

    public /* synthetic */ UserSubscriptionProduct(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final UserSubscriptionEntitlement getMatchingEntitlement() {
        if (zq3.c(this, c.INSTANCE)) {
            return UserSubscriptionEntitlement.d.INSTANCE;
        }
        if (zq3.c(this, d.INSTANCE)) {
            return UserSubscriptionEntitlement.f.INSTANCE;
        }
        if (zq3.c(this, e.INSTANCE)) {
            return UserSubscriptionEntitlement.g.INSTANCE;
        }
        if (zq3.c(this, b.INSTANCE)) {
            return UserSubscriptionEntitlement.c.INSTANCE;
        }
        if (zq3.c(this, g.INSTANCE)) {
            return UserSubscriptionEntitlement.o.INSTANCE;
        }
        if (zq3.c(this, a.INSTANCE)) {
            return UserSubscriptionEntitlement.b.INSTANCE;
        }
        throw new UserDetailsException("Unknown product: " + this.rawValue, null, false, 6, null);
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    private UserSubscriptionProduct(String str) {
        this.rawValue = str;
    }
}
