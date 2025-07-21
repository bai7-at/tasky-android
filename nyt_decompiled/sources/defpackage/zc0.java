package defpackage;

import android.graphics.Shader;

/* loaded from: classes.dex */
public abstract class zc0 {

    public static final class a extends ho7 {
        final /* synthetic */ Shader e;

        a(Shader shader) {
            this.e = shader;
        }

        @Override // defpackage.ho7
        public Shader b(long j) {
            return this.e;
        }
    }

    public static final ho7 a(Shader shader) {
        return new a(shader);
    }
}
