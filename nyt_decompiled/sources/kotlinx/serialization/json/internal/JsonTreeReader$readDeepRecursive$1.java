package kotlinx.serialization.json.internal;

import com.comscore.streaming.ContentType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.g1;
import defpackage.it2;
import defpackage.od1;
import defpackage.ww8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

@fc1(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {ContentType.LONG_FORM_ON_DEMAND}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements it2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, by0 by0Var) {
        super(3, by0Var);
        this.this$0 = jsonTreeReader;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(od1 od1Var, ww8 ww8Var, by0 by0Var) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, by0Var);
        jsonTreeReader$readDeepRecursive$1.L$0 = od1Var;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g1 g1Var;
        g1 g1Var2;
        JsonElement f;
        JsonPrimitive j;
        JsonPrimitive j2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            od1 od1Var = (od1) this.L$0;
            g1Var = this.this$0.a;
            byte I = g1Var.I();
            if (I == 1) {
                j2 = this.this$0.j(true);
                return j2;
            }
            if (I == 0) {
                j = this.this$0.j(false);
                return j;
            }
            if (I != 6) {
                if (I == 8) {
                    f = this.this$0.f();
                    return f;
                }
                g1Var2 = this.this$0.a;
                g1.z(g1Var2, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            JsonTreeReader jsonTreeReader = this.this$0;
            this.label = 1;
            obj = jsonTreeReader.h(od1Var, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return (JsonElement) obj;
    }
}
