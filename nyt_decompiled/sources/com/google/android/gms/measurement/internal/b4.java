package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* loaded from: classes3.dex */
final class b4 implements Runnable {
    private final URL a;
    private final byte[] b;
    private final z3 c;
    private final String d;
    private final Map e;
    final /* synthetic */ c4 f;

    public b4(c4 c4Var, String str, URL url, byte[] bArr, Map map, z3 z3Var) {
        this.f = c4Var;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(z3Var);
        this.a = url;
        this.b = bArr;
        this.c = z3Var;
        this.d = str;
        this.e = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0109: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:81:0x0108 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x010d: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:78:0x010b */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b4.run():void");
    }
}
