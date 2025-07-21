package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class AllAccessPackageData {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final List h;
    private final List i;
    private final String j;
    private final String k;

    public AllAccessPackageData(String str, @bt3(name = "sub_headline") String str2, @bt3(name = "free_trial_headline") String str3, @bt3(name = "free_trial_sub_headline") String str4, String str5, @bt3(name = "month_sku_id") String str6, @bt3(name = "year_sku_id") String str7, @bt3(name = "main_bullets") List<AllAccessValuePropData> list, @bt3(name = "sku_schedules") List<AllAccessSkuOverrideData> list2, @bt3(name = "monthly_badge") String str8, @bt3(name = "yearly_badge") String str9) {
        zq3.h(str, "headline");
        zq3.h(str2, "subHeadline");
        zq3.h(str3, "freeTrialHeadline");
        zq3.h(str4, "freeTrialSubHeadline");
        zq3.h(str5, "description");
        zq3.h(str6, "monthSkuId");
        zq3.h(str7, "yearSkuId");
        zq3.h(list, "mainBullets");
        zq3.h(list2, "skuSchedules");
        zq3.h(str8, "monthlyBadge");
        zq3.h(str9, "yearlyBadge");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = list;
        this.i = list2;
        this.j = str8;
        this.k = str9;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final AllAccessPackageData copy(String str, @bt3(name = "sub_headline") String str2, @bt3(name = "free_trial_headline") String str3, @bt3(name = "free_trial_sub_headline") String str4, String str5, @bt3(name = "month_sku_id") String str6, @bt3(name = "year_sku_id") String str7, @bt3(name = "main_bullets") List<AllAccessValuePropData> list, @bt3(name = "sku_schedules") List<AllAccessSkuOverrideData> list2, @bt3(name = "monthly_badge") String str8, @bt3(name = "yearly_badge") String str9) {
        zq3.h(str, "headline");
        zq3.h(str2, "subHeadline");
        zq3.h(str3, "freeTrialHeadline");
        zq3.h(str4, "freeTrialSubHeadline");
        zq3.h(str5, "description");
        zq3.h(str6, "monthSkuId");
        zq3.h(str7, "yearSkuId");
        zq3.h(list, "mainBullets");
        zq3.h(list2, "skuSchedules");
        zq3.h(str8, "monthlyBadge");
        zq3.h(str9, "yearlyBadge");
        return new AllAccessPackageData(str, str2, str3, str4, str5, str6, str7, list, list2, str8, str9);
    }

    public final String d() {
        return this.a;
    }

    public final List e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllAccessPackageData)) {
            return false;
        }
        AllAccessPackageData allAccessPackageData = (AllAccessPackageData) obj;
        return zq3.c(this.a, allAccessPackageData.a) && zq3.c(this.b, allAccessPackageData.b) && zq3.c(this.c, allAccessPackageData.c) && zq3.c(this.d, allAccessPackageData.d) && zq3.c(this.e, allAccessPackageData.e) && zq3.c(this.f, allAccessPackageData.f) && zq3.c(this.g, allAccessPackageData.g) && zq3.c(this.h, allAccessPackageData.h) && zq3.c(this.i, allAccessPackageData.i) && zq3.c(this.j, allAccessPackageData.j) && zq3.c(this.k, allAccessPackageData.k);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.j;
    }

    public final List h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String i() {
        return this.b;
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.k;
    }

    public String toString() {
        return "AllAccessPackageData(headline=" + this.a + ", subHeadline=" + this.b + ", freeTrialHeadline=" + this.c + ", freeTrialSubHeadline=" + this.d + ", description=" + this.e + ", monthSkuId=" + this.f + ", yearSkuId=" + this.g + ", mainBullets=" + this.h + ", skuSchedules=" + this.i + ", monthlyBadge=" + this.j + ", yearlyBadge=" + this.k + ")";
    }

    public /* synthetic */ AllAccessPackageData(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? i.l() : list, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? i.l() : list2, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9);
    }
}
