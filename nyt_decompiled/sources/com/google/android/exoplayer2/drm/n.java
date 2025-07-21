package com.google.android.exoplayer2.drm;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.m;
import com.google.android.exoplayer2.drm.n;
import defpackage.a84;
import defpackage.rq2;
import defpackage.sv5;
import defpackage.ur;
import defpackage.w76;
import defpackage.wq2;
import defpackage.yo5;
import defpackage.z19;
import defpackage.zf0;
import defpackage.zj0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class n implements m {
    public static final m.c d = new m.c() { // from class: sq2
        @Override // com.google.android.exoplayer2.drm.m.c
        public final m a(UUID uuid) {
            m A;
            A = n.A(uuid);
            return A;
        }
    };
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, sv5 sv5Var) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId a = sv5Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            wq2.a(ur.e(playbackComponent)).setLogSessionId(a);
        }
    }

    private n(UUID uuid) {
        ur.e(uuid);
        ur.b(!zf0.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (zf0.d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m A(UUID uuid) {
        try {
            return C(uuid);
        } catch (UnsupportedDrmException unused) {
            a84.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + InstructionFileId.DOT);
            return new k();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(z19.d);
    }

    public static n C(UUID uuid) {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    private static byte[] p(byte[] bArr) {
        yo5 yo5Var = new yo5(bArr);
        int u = yo5Var.u();
        short w = yo5Var.w();
        short w2 = yo5Var.w();
        if (w != 1 || w2 != 1) {
            a84.g("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short w3 = yo5Var.w();
        Charset charset = zj0.e;
        String F = yo5Var.F(w3, charset);
        if (F.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = F.indexOf("</DATA>");
        if (indexOf == -1) {
            a84.j("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = F.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + F.substring(indexOf);
        int i = u + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i);
        allocate.putShort(w);
        allocate.putShort(w2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    private static String q(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? "" : (z19.a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return zf0.c.equals(uuid) ? com.google.android.exoplayer2.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = defpackage.zf0.e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = defpackage.w76.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = p(r4)
            byte[] r4 = defpackage.w76.a(r0, r4)
        L18:
            int r1 = defpackage.z19.a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = defpackage.zf0.d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = defpackage.z19.c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = defpackage.z19.d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = defpackage.w76.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.n.s(java.util.UUID, byte[]):byte[]");
    }

    private static String t(UUID uuid, String str) {
        return (z19.a < 26 && zf0.c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return (z19.a >= 27 || !zf0.c.equals(uuid)) ? uuid : zf0.b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData y(UUID uuid, List list) {
        if (!zf0.d.equals(uuid)) {
            return (DrmInitData.SchemeData) list.get(0);
        }
        if (z19.a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) list.get(0);
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) list.get(i2);
                byte[] bArr = (byte[]) ur.e(schemeData2.data);
                if (z19.c(schemeData2.mimeType, schemeData.mimeType) && z19.c(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) && w76.c(bArr)) {
                    i += bArr.length;
                }
            }
            byte[] bArr2 = new byte[i];
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                byte[] bArr3 = (byte[]) ur.e(((DrmInitData.SchemeData) list.get(i4)).data);
                int length = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i3, length);
                i3 += length;
            }
            return schemeData.b(bArr2);
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(i5);
            int g = w76.g((byte[]) ur.e(schemeData3.data));
            int i6 = z19.a;
            if (i6 < 23 && g == 0) {
                return schemeData3;
            }
            if (i6 >= 23 && g == 1) {
                return schemeData3;
            }
        }
        return (DrmInitData.SchemeData) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.a(this, bArr, i, i2, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public Map a(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.m
    public byte[] c() {
        return this.b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.m
    public void d(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public void e(final m.b bVar) {
        this.b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: tq2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                n.this.z(bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.m
    public void f(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public int g() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.m
    public void h(byte[] bArr, sv5 sv5Var) {
        if (z19.a >= 31) {
            try {
                a.b(this.b, bArr, sv5Var);
            } catch (UnsupportedOperationException unused) {
                a84.j("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.m
    public boolean j(byte[] bArr, String str) {
        if (z19.a >= 31) {
            return a.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.m
    public void k(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (zf0.c.equals(this.a)) {
            bArr2 = com.google.android.exoplayer2.drm.a.b(bArr2);
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public m.a m(byte[] bArr, List list, int i, HashMap hashMap) {
        DrmInitData.SchemeData schemeData;
        byte[] bArr2;
        String str;
        if (list != null) {
            schemeData = y(this.a, list);
            bArr2 = s(this.a, (byte[]) ur.e(schemeData.data));
            str = t(this.a, schemeData.mimeType);
        } else {
            schemeData = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] r = r(this.a, keyRequest.getData());
        String q = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(q) && schemeData != null && !TextUtils.isEmpty(schemeData.licenseServerUrl)) {
            q = schemeData.licenseServerUrl;
        }
        return new m.a(r, q, z19.a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    @Override // com.google.android.exoplayer2.drm.m
    public synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.m
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public rq2 i(byte[] bArr) {
        return new rq2(u(this.a), bArr, z19.a < 21 && zf0.d.equals(this.a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.b.getPropertyString(str);
    }
}
