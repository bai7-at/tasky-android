package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class nqd implements gqd {
    private final kke a;
    private final Context b;

    public nqd(kke kkeVar, Context context) {
        this.a = kkeVar;
        this.b = context;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(2:4|2)|5|6|(3:63|64|(19:66|67|9|10|11|(13:13|14|(1:16)(2:46|(3:49|(3:52|(2:55|56)(1:54)|50)|57))|17|18|(2:20|(7:22|23|(5:25|26|27|(1:31)|42)(1:44)|(1:33)(1:40)|(1:35)(1:39)|36|37))|45|23|(0)(0)|(0)(0)|(0)(0)|36|37)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37))|8|9|10|11|(0)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009b A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b2, blocks: (B:11:0x008f, B:13:0x009b), top: B:10:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ defpackage.lqd a() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqd.a():lqd");
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 38;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: mqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nqd.this.a();
            }
        });
    }
}
