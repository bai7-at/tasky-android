package defpackage;

import com.facebook.AuthenticationTokenClaims;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class aq0 {
    private final String a;
    private final boolean b;
    private final boolean c;

    public static final class a {
        private final String a;
        private boolean b;
        private boolean c;

        public a(String str) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
        }

        public final aq0 a() {
            return new aq0(this.a, this.b, this.c, null);
        }
    }

    public /* synthetic */ aq0(String str, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2);
    }

    private aq0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
