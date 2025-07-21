package defpackage;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;

/* loaded from: classes5.dex */
public class au6 {
    public xu3 a(FunctionReference functionReference) {
        return functionReference;
    }

    public vu3 b(Class cls) {
        return new bl0(cls);
    }

    public wu3 c(Class cls, String str) {
        return new wm5(cls, str);
    }

    public ev3 d(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public fv3 e(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public gv3 f(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public jv3 g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kv3 h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public String i(tt2 tt2Var) {
        String obj = tt2Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String j(Lambda lambda) {
        return i(lambda);
    }
}
