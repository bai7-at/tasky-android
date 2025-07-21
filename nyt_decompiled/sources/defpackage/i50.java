package defpackage;

import android.os.Bundle;
import com.nytimes.xwords.hybrid.utils.ErrorType;

/* loaded from: classes4.dex */
public abstract class i50 {
    public static final ErrorType a(h50 h50Var) {
        String string;
        ErrorType valueOf;
        zq3.h(h50Var, "<this>");
        Bundle arguments = h50Var.getArguments();
        if (arguments == null || (string = arguments.getString("ERROR_TYPE_KEY")) == null || (valueOf = ErrorType.valueOf(string)) == null) {
            throw new IllegalArgumentException("Error type argument not provided");
        }
        return valueOf;
    }
}
