package defpackage;

import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.utilities.ParamProviderKt;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes3.dex */
public abstract class u {
    public static final Map a(AbraTest abraTest) {
        zq3.h(abraTest, "abraTest");
        return t.m(du8.a("test", abraTest.getTestName()), du8.a("variant", abraTest.getAbraMetaData().getAbraVariant()), du8.a("config_ver", abraTest.getAbraMetaData().getConfigVersion()), du8.a("variant_or_fallback", abraTest.getAbraMetaData().getFallbackVariant()), du8.a("did_abra_error", Boolean.valueOf(abraTest.getAbraMetaData().getDidAbraFail())), du8.a(ParamProviderKt.PARAM_INTEGRATION, abraTest.getAbraMetaData().getIntegration()), du8.a("input", abraTest.getAbraMetaData().getInput()));
    }
}
