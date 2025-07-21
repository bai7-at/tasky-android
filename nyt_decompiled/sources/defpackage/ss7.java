package defpackage;

import com.nytimes.android.abra.AbraVariant;
import com.nytimes.android.abra.models.TestSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ss7 implements TestSpec {
    private final String a;
    private final AbraVariant[] b;
    private final AbraVariant c;
    private final boolean d;
    private final List e;
    private final String f;

    public ss7(String str, AbraVariant[] abraVariantArr, AbraVariant abraVariant, boolean z) {
        zq3.h(str, "testName");
        zq3.h(abraVariantArr, "values");
        zq3.h(abraVariant, "controlVariant");
        this.a = str;
        this.b = abraVariantArr;
        this.c = abraVariant;
        this.d = z;
        ArrayList arrayList = new ArrayList(abraVariantArr.length);
        for (AbraVariant abraVariant2 : abraVariantArr) {
            arrayList.add(abraVariant2.getVariantName());
        }
        this.e = arrayList;
        this.f = this.c.getVariantName();
    }

    @Override // com.nytimes.android.abra.models.TestSpec
    public Class getDataType() {
        return TestSpec.DefaultImpls.getDataType(this);
    }

    @Override // com.nytimes.android.abra.models.TestSpec
    public String getDefaultVariant() {
        return this.f;
    }

    @Override // com.nytimes.android.abra.models.TestSpec
    public String getTestName() {
        return this.a;
    }

    @Override // com.nytimes.android.abra.models.TestSpec
    public AbraVariant getTestType(String str) {
        AbraVariant abraVariant;
        zq3.h(str, "selectedVariant");
        AbraVariant[] abraVariantArr = this.b;
        int length = abraVariantArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                abraVariant = null;
                break;
            }
            abraVariant = abraVariantArr[i];
            if (zq3.c(abraVariant.getVariantName(), str)) {
                break;
            }
            i++;
        }
        return abraVariant == null ? this.c : abraVariant;
    }

    @Override // com.nytimes.android.abra.models.TestSpec
    public List getVariants() {
        return this.e;
    }

    @Override // com.nytimes.android.abra.models.TestSpec
    public boolean isLocked() {
        return this.d;
    }

    public /* synthetic */ ss7(String str, AbraVariant[] abraVariantArr, AbraVariant abraVariant, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, abraVariantArr, (i & 4) != 0 ? (AbraVariant) d.a0(abraVariantArr) : abraVariant, (i & 8) != 0 ? true : z);
    }
}
