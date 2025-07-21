package defpackage;

import com.datadog.android.api.storage.EventType;
import defpackage.ir5;

/* loaded from: classes2.dex */
public final class l75 implements ir5 {
    @Override // defpackage.ir5
    public boolean a(bp6 bp6Var, byte[] bArr, EventType eventType) {
        zq3.h(bp6Var, "event");
        zq3.h(eventType, "eventType");
        return false;
    }

    @Override // defpackage.ir5
    public void b(String str) {
        zq3.h(str, "batchId");
    }

    @Override // defpackage.ir5
    public void c(ir5 ir5Var) {
        zq3.h(ir5Var, "targetStrategy");
    }

    @Override // defpackage.ir5
    public void d(String str) {
        zq3.h(str, "batchId");
    }

    @Override // defpackage.ir5
    public ir5.a e() {
        return null;
    }

    @Override // defpackage.ir5
    public void f() {
    }
}
