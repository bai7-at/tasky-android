package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzdl;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class r9g implements ksb {
    private final njc a;

    public r9g(njc njcVar) {
        this.a = njcVar;
    }

    @Override // defpackage.ksb
    public final otb a(Context context, ayf ayfVar, ayf ayfVar2, d2g d2gVar, okc okcVar, Executor executor, List list, long j) {
        try {
            ((ksb) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(njc.class).newInstance(this.a)).a(context, ayfVar, ayfVar2, d2gVar, okcVar, executor, list, 0L);
            return null;
        } catch (Exception e) {
            if (e instanceof zzdl) {
                throw ((zzdl) e);
            }
            throw new zzdl(e, -9223372036854775807L);
        }
    }
}
