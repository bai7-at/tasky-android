package defpackage;

import com.google.android.gms.internal.ads.zzaqj;

/* loaded from: classes2.dex */
final class wsa implements bba {
    final /* synthetic */ String a;
    final /* synthetic */ kxa b;

    wsa(yza yzaVar, String str, kxa kxaVar) {
        this.a = str;
        this.b = kxaVar;
    }

    @Override // defpackage.bba
    public final void a(zzaqj zzaqjVar) {
        fgb.g("Failed to load URL: " + this.a + "\n" + zzaqjVar.toString());
        this.b.zza(null);
    }
}
