package defpackage;

/* loaded from: classes3.dex */
public final class r0d implements v3f {
    private final l4f a;

    public r0d(l4f l4fVar) {
        this.a = l4fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L13;
     */
    @Override // defpackage.l4f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        /*
            r3 = this;
            l4f r3 = r3.a
            n6c r3 = (defpackage.n6c) r3
            s1e r3 = r3.a()
            zoa r0 = defpackage.mpa.m7
            kpa r1 = defpackage.pla.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L51
            com.google.android.gms.ads.internal.client.zzl r0 = r3.d
            java.lang.String r0 = r0.zzx
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "request_id"
            if (r1 != 0) goto L36
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L36
            r1.<init>(r0)     // Catch: org.json.JSONException -> L36
            java.lang.String r0 = r1.getString(r2)     // Catch: org.json.JSONException -> L36
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L36
            if (r1 != 0) goto L36
            goto L61
        L36:
            com.google.android.gms.ads.internal.client.zzl r0 = r3.d
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L51
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L51
            com.google.android.gms.ads.internal.client.zzl r3 = r3.d     // Catch: org.json.JSONException -> L51
            com.google.android.gms.ads.internal.client.zzc r3 = r3.zzs     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = r3.zza     // Catch: org.json.JSONException -> L51
            r0.<init>(r3)     // Catch: org.json.JSONException -> L51
            java.lang.String r0 = r0.getString(r2)     // Catch: org.json.JSONException -> L51
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L51
            if (r3 == 0) goto L61
        L51:
            java.util.Random r3 = defpackage.kia.e()
            int r3 = r3.nextInt()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3 = r3 & r0
            java.lang.String r0 = java.lang.String.valueOf(r3)
        L61:
            defpackage.d4f.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0d.zzb():java.lang.Object");
    }
}
