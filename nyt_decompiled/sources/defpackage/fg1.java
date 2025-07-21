package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class fg1 implements bn {
    private final AtomicReference a;

    public fg1(String str) {
        zq3.h(str, "initialVersion");
        this.a = new AtomicReference(str);
    }

    @Override // defpackage.bn
    public void a(String str) {
        zq3.h(str, "value");
        this.a.set(str);
    }

    @Override // defpackage.bn
    public String getVersion() {
        Object obj = this.a.get();
        zq3.g(obj, "value.get()");
        return (String) obj;
    }
}
