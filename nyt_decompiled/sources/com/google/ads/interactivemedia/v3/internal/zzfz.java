package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzfz implements zzga {
    private zzfz() {
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x00a9: MOVE (r7 I:??[OBJECT, ARRAY]) = (r0 I:??[OBJECT, ARRAY]), block:B:59:0x00a8 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.impl.data.zzbj zza(com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData r8) {
        /*
            r7 = this;
            r7 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lad
            java.lang.String r1 = r8.url()     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lad
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lad
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lad
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Lab java.io.IOException -> Lad
            java.lang.String r7 = "User-Agent"
            java.lang.String r1 = r8.userAgent()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r0.setRequestProperty(r7, r1)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            int r7 = r8.connectionTimeoutMs()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r0.setConnectTimeout(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            int r7 = r8.readTimeoutMs()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r0.setReadTimeout(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData$RequestType r7 = r8.requestType()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData$RequestType r1 = com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData.RequestType.POST     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r7 != r1) goto L5e
            r7 = 1
            r0.setDoOutput(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r7 = 0
            r0.setChunkedStreamingMode(r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            java.lang.String r7 = r8.content()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r7 == 0) goto L5e
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L52
            byte[] r7 = r7.getBytes(r2)     // Catch: java.lang.Throwable -> L52
            r1.write(r7)     // Catch: java.lang.Throwable -> L52
            r1.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L5e
        L4e:
            r7 = move-exception
            goto La8
        L50:
            r7 = move-exception
            goto Lb1
        L52:
            r7 = move-exception
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r1 = move-exception
            com.google.ads.interactivemedia.v3.internal.zzfx.zza(r7, r1)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
        L5d:
            throw r7     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
        L5e:
            java.io.InputStream r7 = r0.getInputStream()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L82
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r2.<init>()     // Catch: java.lang.Throwable -> L82
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L82
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L82
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L82
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L82
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L82
        L78:
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L84
            r2.append(r1)     // Catch: java.lang.Throwable -> L82
            goto L78
        L82:
            r1 = move-exception
            goto L9d
        L84:
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L8d
            r7.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
        L8d:
            java.lang.String r7 = r0.getContentType()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            r0.disconnect()
            java.lang.String r8 = r8.id()
            com.google.ads.interactivemedia.v3.impl.data.zzbj r7 = com.google.ads.interactivemedia.v3.impl.data.zzbj.forResponse(r8, r1, r7)
            return r7
        L9d:
            if (r7 == 0) goto La7
            r7.close()     // Catch: java.lang.Throwable -> La3
            goto La7
        La3:
            r7 = move-exception
            com.google.ads.interactivemedia.v3.internal.zzfx.zza(r1, r7)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
        La7:
            throw r1     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
        La8:
            r8 = r7
            r7 = r0
            goto Ld5
        Lab:
            r8 = move-exception
            goto Ld5
        Lad:
            r0 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
        Lb1:
            boolean r7 = r7 instanceof java.net.SocketTimeoutException     // Catch: java.lang.Throwable -> L4e
            if (r7 == 0) goto Lc5
            java.lang.String r7 = r8.id()     // Catch: java.lang.Throwable -> L4e
            r8 = 101(0x65, float:1.42E-43)
            com.google.ads.interactivemedia.v3.impl.data.zzbj r7 = com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(r7, r8)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Lc4
            r0.disconnect()
        Lc4:
            return r7
        Lc5:
            java.lang.String r7 = r8.id()     // Catch: java.lang.Throwable -> L4e
            r8 = 100
            com.google.ads.interactivemedia.v3.impl.data.zzbj r7 = com.google.ads.interactivemedia.v3.impl.data.zzbj.forError(r7, r8)     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto Ld4
            r0.disconnect()
        Ld4:
            return r7
        Ld5:
            if (r7 == 0) goto Lda
            r7.disconnect()
        Lda:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzfz.zza(com.google.ads.interactivemedia.v3.impl.data.NetworkRequestData):com.google.ads.interactivemedia.v3.impl.data.zzbj");
    }

    /* synthetic */ zzfz(zzfy zzfyVar) {
    }
}
