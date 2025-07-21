package defpackage;

import com.nytimes.android.subauth.core.di.SubauthModule;
import okhttp3.Interceptor;

/* loaded from: classes4.dex */
public abstract class t78 implements ba2 {
    public static Interceptor a(SubauthModule subauthModule, u86 u86Var) {
        return (Interceptor) g16.e(subauthModule.f(u86Var));
    }
}
