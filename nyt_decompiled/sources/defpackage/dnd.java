package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class dnd implements fqd {
    private final Boolean a;

    public dnd(Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = this.a;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
