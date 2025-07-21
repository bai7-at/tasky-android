package defpackage;

/* loaded from: classes3.dex */
final class p9g implements njc {
    private static final fhe a = ihe.a(new fhe() { // from class: l9g
        @Override // defpackage.fhe
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object invoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                if (invoke != null) {
                    return (njc) invoke;
                }
                throw null;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    /* synthetic */ p9g(n9g n9gVar) {
    }
}
