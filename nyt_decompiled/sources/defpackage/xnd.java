package defpackage;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class xnd implements gqd {
    private final kke a;
    private final s1e b;
    private final PackageInfo c;
    private final hie d;

    public xnd(kke kkeVar, s1e s1eVar, PackageInfo packageInfo, hie hieVar) {
        this.a = kkeVar;
        this.b = s1eVar;
        this.c = packageInfo;
        this.d = hieVar;
    }

    public static /* synthetic */ ynd a(final xnd xndVar) {
        final ArrayList arrayList = xndVar.b.g;
        return arrayList == null ? new ynd() { // from class: und
            @Override // defpackage.fqd
            public final void a(Object obj) {
            }
        } : arrayList.isEmpty() ? new ynd() { // from class: vnd
            @Override // defpackage.fqd
            public final void a(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new ynd() { // from class: wnd
            @Override // defpackage.fqd
            public final void a(Object obj) {
                xnd.this.b(arrayList, (Bundle) obj);
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
    
        if (r9 == 3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnd.b(java.util.ArrayList, android.os.Bundle):void");
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 26;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: tnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return xnd.a(xnd.this);
            }
        });
    }
}
