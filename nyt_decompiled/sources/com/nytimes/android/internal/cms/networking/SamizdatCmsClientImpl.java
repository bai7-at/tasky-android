package com.nytimes.android.internal.cms.networking;

import defpackage.by0;
import defpackage.fm8;
import defpackage.s77;
import defpackage.t77;
import defpackage.z38;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SamizdatCmsClientImpl implements s77 {
    public static final a Companion = new a(null);
    private final SamizdatApi a;
    private final t77 b;
    private final fm8 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SamizdatCmsClientImpl(SamizdatApi samizdatApi, t77 t77Var, fm8 fm8Var) {
        zq3.h(samizdatApi, "samizdatApi");
        zq3.h(t77Var, "samizdatConfigProvider");
        zq3.h(fm8Var, "timeSkewAdjuster");
        this.a = samizdatApi;
        this.b = t77Var;
        this.c = fm8Var;
    }

    private final Object c(SamizdatRequest samizdatRequest, by0 by0Var) {
        return this.a.fetch(samizdatRequest.o(), samizdatRequest.d(), samizdatRequest.g(), samizdatRequest.h(), samizdatRequest.f(), samizdatRequest.k().c(), samizdatRequest.e(), samizdatRequest.c(), samizdatRequest.i(), samizdatRequest.j(), by0Var);
    }

    public final SamizdatRequest a(String str) {
        zq3.h(str, "url");
        z38 z38Var = z38.a;
        String format = String.format(Locale.US, "%s%s", Arrays.copyOf(new Object[]{this.b.a().a().mo865invoke(), str}, 2));
        zq3.g(format, "format(...)");
        return new SamizdatRequest(format, this.c.d(), this.b.a(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r25, com.nytimes.android.internal.cms.networking.SamizdatRequest r26, int r27, defpackage.by0 r28) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.cms.networking.SamizdatCmsClientImpl.b(java.lang.String, com.nytimes.android.internal.cms.networking.SamizdatRequest, int, by0):java.lang.Object");
    }

    @Override // defpackage.s77
    public Object fetch(String str, by0 by0Var) {
        return b(str, a(str), 1, by0Var);
    }
}
