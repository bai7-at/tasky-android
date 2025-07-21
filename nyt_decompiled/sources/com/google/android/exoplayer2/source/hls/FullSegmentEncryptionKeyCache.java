package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import defpackage.ur;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class FullSegmentEncryptionKeyCache {
    private final LinkedHashMap a;

    public FullSegmentEncryptionKeyCache(final int i) {
        this.a = new LinkedHashMap<Uri, byte[]>(i + 1, 1.0f, false) { // from class: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.a.put((Uri) ur.e(uri), (byte[]) ur.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.a.remove(ur.e(uri));
    }
}
