package defpackage;

import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public interface jx2 extends KSerializer {

    public static final class a {
        public static KSerializer[] a(jx2 jx2Var) {
            return yv5.a;
        }
    }

    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
