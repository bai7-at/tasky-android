package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class knd implements fqd {
    private final String a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public knd(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.a.isEmpty()) {
            bundle.putString("inspector_extras", this.a);
        }
        bundle.putInt("test_mode", this.b ? 1 : 0);
        bundle.putInt("linked_device", this.c ? 1 : 0);
        if (this.b || this.c) {
            if (((Boolean) pla.c().a(mpa.d9)).booleanValue()) {
                bundle.putInt("risd", !this.d ? 1 : 0);
            }
            if (((Boolean) pla.c().a(mpa.h9)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.e);
            }
        }
    }
}
