package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.android.exoplayer2.drm.m;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.ImmutableMap;
import defpackage.t18;
import defpackage.ur;
import defpackage.z19;
import defpackage.z91;
import defpackage.zf0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import zendesk.core.Constants;

/* loaded from: classes2.dex */
public final class o implements p {
    private final a.InterfaceC0194a a;
    private final String b;
    private final boolean c;
    private final Map d;

    public o(String str, boolean z, a.InterfaceC0194a interfaceC0194a) {
        ur.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.a = interfaceC0194a;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }

    private static byte[] c(a.InterfaceC0194a interfaceC0194a, String str, byte[] bArr, Map map) {
        t18 t18Var = new t18(interfaceC0194a.a());
        com.google.android.exoplayer2.upstream.b a = new b.C0195b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i = 0;
        com.google.android.exoplayer2.upstream.b bVar = a;
        while (true) {
            try {
                z91 z91Var = new z91(t18Var, bVar);
                try {
                    try {
                        return z19.a1(z91Var);
                    } catch (HttpDataSource$InvalidResponseCodeException e) {
                        String d = d(e, i);
                        if (d == null) {
                            throw e;
                        }
                        i++;
                        bVar = bVar.a().j(d).a();
                    }
                } finally {
                    z19.n(z91Var);
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(a, (Uri) ur.e(t18Var.s()), t18Var.f(), t18Var.k(), e2);
            }
        }
    }

    private static String d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = httpDataSource$InvalidResponseCodeException.responseCode;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = httpDataSource$InvalidResponseCodeException.headerFields) == null || (list = map.get(HttpHeader.LOCATION)) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] a(UUID uuid, m.d dVar) {
        return c(this.a, dVar.b() + "&signedRequest=" + z19.E(dVar.a()), null, Collections.emptyMap());
    }

    @Override // com.google.android.exoplayer2.drm.p
    public byte[] b(UUID uuid, m.a aVar) {
        String b = aVar.b();
        if (this.c || TextUtils.isEmpty(b)) {
            b = this.b;
        }
        if (TextUtils.isEmpty(b)) {
            b.C0195b c0195b = new b.C0195b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(c0195b.i(uri).a(), uri, ImmutableMap.o(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = zf0.e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : zf0.c.equals(uuid) ? Constants.APPLICATION_JSON : Mimetypes.MIMETYPE_OCTET_STREAM);
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.d) {
            hashMap.putAll(this.d);
        }
        return c(this.a, b, aVar.a(), hashMap);
    }

    public void e(String str, String str2) {
        ur.e(str);
        ur.e(str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }
}
