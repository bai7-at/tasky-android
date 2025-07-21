package defpackage;

import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.font.r;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes.dex */
public final class ef implements r {
    private final int b;

    public ef(int i) {
        this.b = i;
    }

    @Override // androidx.compose.ui.text.font.r
    public o a(o oVar) {
        int i = this.b;
        return (i == 0 || i == Integer.MAX_VALUE) ? oVar : new o(uo6.m(oVar.p() + this.b, 1, NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef) && this.b == ((ef) obj).b;
    }

    public int hashCode() {
        return Integer.hashCode(this.b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.b + ')';
    }
}
