package kotlinx.serialization.json.internal;

import defpackage.at3;
import defpackage.hk7;
import defpackage.nk7;
import defpackage.r26;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes5.dex */
public abstract class TreeJsonEncoderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(SerialDescriptor serialDescriptor) {
        return (serialDescriptor.d() instanceof r26) || serialDescriptor.d() == hk7.b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final JsonElement c(at3 at3Var, Object obj, nk7 nk7Var) {
        zq3.h(at3Var, "<this>");
        zq3.h(nk7Var, "serializer");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new f(at3Var, new ss2() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$writeJson$encoder$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void b(JsonElement jsonElement) {
                zq3.h(jsonElement, "it");
                Ref$ObjectRef.this.element = jsonElement;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                b((JsonElement) obj2);
                return ww8.a;
            }
        }).t(nk7Var, obj);
        T t = ref$ObjectRef.element;
        if (t != 0) {
            return (JsonElement) t;
        }
        zq3.z("result");
        return null;
    }
}
