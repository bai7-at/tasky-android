package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zmd implements fqd {
    private final boolean a;

    public zmd(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.a);
    }
}
