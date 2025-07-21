package type;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class OnsiteMessagingInput {
    private final nk5 abra;
    private final nk5 abraAllocations;
    private final nk5 abraIntegration;
    private final nk5 abraParameters;
    private final nk5 accessException;
    private final nk5 algoeverything;
    private final nk5 anonymousEntitlements;
    private final nk5 canUseApplePay;
    private final nk5 continent;
    private final nk5 country;
    private final nk5 debug;
    private final nk5 deviceType;
    private final nk5 isGamesHybridWebView;
    private final nk5 jkidd;
    private final nk5 language;
    private final nk5 meter;
    private final nk5 name;
    private final nk5 now;
    private final nk5 offerEligibility;
    private final nk5 pageViewID;
    private final nk5 production;
    private final nk5 referrer;
    private final nk5 samizdat;
    private final nk5 scenario;
    private final nk5 subinfo;
    private final nk5 subscriberScore;
    private final nk5 units;
    private final nk5 uri;
    private final nk5 url;
    private final nk5 userState;
    private final nk5 userstate;
    private final nk5 version;

    public OnsiteMessagingInput() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    public final nk5 component1() {
        return this.name;
    }

    public final nk5 component10() {
        return this.country;
    }

    public final nk5 component11() {
        return this.continent;
    }

    public final nk5 component12() {
        return this.meter;
    }

    public final nk5 component13() {
        return this.jkidd;
    }

    public final nk5 component14() {
        return this.subinfo;
    }

    public final nk5 component15() {
        return this.samizdat;
    }

    public final nk5 component16() {
        return this.abra;
    }

    public final nk5 component17() {
        return this.offerEligibility;
    }

    public final nk5 component18() {
        return this.userState;
    }

    public final nk5 component19() {
        return this.userstate;
    }

    public final nk5 component2() {
        return this.version;
    }

    public final nk5 component20() {
        return this.algoeverything;
    }

    public final nk5 component21() {
        return this.units;
    }

    public final nk5 component22() {
        return this.scenario;
    }

    public final nk5 component23() {
        return this.debug;
    }

    public final nk5 component24() {
        return this.production;
    }

    public final nk5 component25() {
        return this.now;
    }

    public final nk5 component26() {
        return this.language;
    }

    public final nk5 component27() {
        return this.anonymousEntitlements;
    }

    public final nk5 component28() {
        return this.abraIntegration;
    }

    public final nk5 component29() {
        return this.abraParameters;
    }

    public final nk5 component3() {
        return this.url;
    }

    public final nk5 component30() {
        return this.abraAllocations;
    }

    public final nk5 component31() {
        return this.accessException;
    }

    public final nk5 component32() {
        return this.subscriberScore;
    }

    public final nk5 component4() {
        return this.uri;
    }

    public final nk5 component5() {
        return this.referrer;
    }

    public final nk5 component6() {
        return this.deviceType;
    }

    public final nk5 component7() {
        return this.pageViewID;
    }

    public final nk5 component8() {
        return this.canUseApplePay;
    }

    public final nk5 component9() {
        return this.isGamesHybridWebView;
    }

    public final OnsiteMessagingInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, nk5 nk5Var11, nk5 nk5Var12, nk5 nk5Var13, nk5 nk5Var14, nk5 nk5Var15, nk5 nk5Var16, nk5 nk5Var17, nk5 nk5Var18, nk5 nk5Var19, nk5 nk5Var20, nk5 nk5Var21, nk5 nk5Var22, nk5 nk5Var23, nk5 nk5Var24, nk5 nk5Var25, nk5 nk5Var26, nk5 nk5Var27, nk5 nk5Var28, nk5 nk5Var29, nk5 nk5Var30, nk5 nk5Var31, nk5 nk5Var32) {
        zq3.h(nk5Var, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(nk5Var2, "version");
        zq3.h(nk5Var3, "url");
        zq3.h(nk5Var4, "uri");
        zq3.h(nk5Var5, "referrer");
        zq3.h(nk5Var6, "deviceType");
        zq3.h(nk5Var7, "pageViewID");
        zq3.h(nk5Var8, "canUseApplePay");
        zq3.h(nk5Var9, "isGamesHybridWebView");
        zq3.h(nk5Var10, "country");
        zq3.h(nk5Var11, "continent");
        zq3.h(nk5Var12, "meter");
        zq3.h(nk5Var13, "jkidd");
        zq3.h(nk5Var14, "subinfo");
        zq3.h(nk5Var15, "samizdat");
        zq3.h(nk5Var16, "abra");
        zq3.h(nk5Var17, "offerEligibility");
        zq3.h(nk5Var18, "userState");
        zq3.h(nk5Var19, "userstate");
        zq3.h(nk5Var20, "algoeverything");
        zq3.h(nk5Var21, "units");
        zq3.h(nk5Var22, "scenario");
        zq3.h(nk5Var23, "debug");
        zq3.h(nk5Var24, "production");
        zq3.h(nk5Var25, "now");
        zq3.h(nk5Var26, "language");
        zq3.h(nk5Var27, "anonymousEntitlements");
        zq3.h(nk5Var28, "abraIntegration");
        zq3.h(nk5Var29, "abraParameters");
        zq3.h(nk5Var30, "abraAllocations");
        zq3.h(nk5Var31, "accessException");
        zq3.h(nk5Var32, "subscriberScore");
        return new OnsiteMessagingInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6, nk5Var7, nk5Var8, nk5Var9, nk5Var10, nk5Var11, nk5Var12, nk5Var13, nk5Var14, nk5Var15, nk5Var16, nk5Var17, nk5Var18, nk5Var19, nk5Var20, nk5Var21, nk5Var22, nk5Var23, nk5Var24, nk5Var25, nk5Var26, nk5Var27, nk5Var28, nk5Var29, nk5Var30, nk5Var31, nk5Var32);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnsiteMessagingInput)) {
            return false;
        }
        OnsiteMessagingInput onsiteMessagingInput = (OnsiteMessagingInput) obj;
        return zq3.c(this.name, onsiteMessagingInput.name) && zq3.c(this.version, onsiteMessagingInput.version) && zq3.c(this.url, onsiteMessagingInput.url) && zq3.c(this.uri, onsiteMessagingInput.uri) && zq3.c(this.referrer, onsiteMessagingInput.referrer) && zq3.c(this.deviceType, onsiteMessagingInput.deviceType) && zq3.c(this.pageViewID, onsiteMessagingInput.pageViewID) && zq3.c(this.canUseApplePay, onsiteMessagingInput.canUseApplePay) && zq3.c(this.isGamesHybridWebView, onsiteMessagingInput.isGamesHybridWebView) && zq3.c(this.country, onsiteMessagingInput.country) && zq3.c(this.continent, onsiteMessagingInput.continent) && zq3.c(this.meter, onsiteMessagingInput.meter) && zq3.c(this.jkidd, onsiteMessagingInput.jkidd) && zq3.c(this.subinfo, onsiteMessagingInput.subinfo) && zq3.c(this.samizdat, onsiteMessagingInput.samizdat) && zq3.c(this.abra, onsiteMessagingInput.abra) && zq3.c(this.offerEligibility, onsiteMessagingInput.offerEligibility) && zq3.c(this.userState, onsiteMessagingInput.userState) && zq3.c(this.userstate, onsiteMessagingInput.userstate) && zq3.c(this.algoeverything, onsiteMessagingInput.algoeverything) && zq3.c(this.units, onsiteMessagingInput.units) && zq3.c(this.scenario, onsiteMessagingInput.scenario) && zq3.c(this.debug, onsiteMessagingInput.debug) && zq3.c(this.production, onsiteMessagingInput.production) && zq3.c(this.now, onsiteMessagingInput.now) && zq3.c(this.language, onsiteMessagingInput.language) && zq3.c(this.anonymousEntitlements, onsiteMessagingInput.anonymousEntitlements) && zq3.c(this.abraIntegration, onsiteMessagingInput.abraIntegration) && zq3.c(this.abraParameters, onsiteMessagingInput.abraParameters) && zq3.c(this.abraAllocations, onsiteMessagingInput.abraAllocations) && zq3.c(this.accessException, onsiteMessagingInput.accessException) && zq3.c(this.subscriberScore, onsiteMessagingInput.subscriberScore);
    }

    public final nk5 getAbra() {
        return this.abra;
    }

    public final nk5 getAbraAllocations() {
        return this.abraAllocations;
    }

    public final nk5 getAbraIntegration() {
        return this.abraIntegration;
    }

    public final nk5 getAbraParameters() {
        return this.abraParameters;
    }

    public final nk5 getAccessException() {
        return this.accessException;
    }

    public final nk5 getAlgoeverything() {
        return this.algoeverything;
    }

    public final nk5 getAnonymousEntitlements() {
        return this.anonymousEntitlements;
    }

    public final nk5 getCanUseApplePay() {
        return this.canUseApplePay;
    }

    public final nk5 getContinent() {
        return this.continent;
    }

    public final nk5 getCountry() {
        return this.country;
    }

    public final nk5 getDebug() {
        return this.debug;
    }

    public final nk5 getDeviceType() {
        return this.deviceType;
    }

    public final nk5 getJkidd() {
        return this.jkidd;
    }

    public final nk5 getLanguage() {
        return this.language;
    }

    public final nk5 getMeter() {
        return this.meter;
    }

    public final nk5 getName() {
        return this.name;
    }

    public final nk5 getNow() {
        return this.now;
    }

    public final nk5 getOfferEligibility() {
        return this.offerEligibility;
    }

    public final nk5 getPageViewID() {
        return this.pageViewID;
    }

    public final nk5 getProduction() {
        return this.production;
    }

    public final nk5 getReferrer() {
        return this.referrer;
    }

    public final nk5 getSamizdat() {
        return this.samizdat;
    }

    public final nk5 getScenario() {
        return this.scenario;
    }

    public final nk5 getSubinfo() {
        return this.subinfo;
    }

    public final nk5 getSubscriberScore() {
        return this.subscriberScore;
    }

    public final nk5 getUnits() {
        return this.units;
    }

    public final nk5 getUri() {
        return this.uri;
    }

    public final nk5 getUrl() {
        return this.url;
    }

    public final nk5 getUserState() {
        return this.userState;
    }

    public final nk5 getUserstate() {
        return this.userstate;
    }

    public final nk5 getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + this.version.hashCode()) * 31) + this.url.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.referrer.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.pageViewID.hashCode()) * 31) + this.canUseApplePay.hashCode()) * 31) + this.isGamesHybridWebView.hashCode()) * 31) + this.country.hashCode()) * 31) + this.continent.hashCode()) * 31) + this.meter.hashCode()) * 31) + this.jkidd.hashCode()) * 31) + this.subinfo.hashCode()) * 31) + this.samizdat.hashCode()) * 31) + this.abra.hashCode()) * 31) + this.offerEligibility.hashCode()) * 31) + this.userState.hashCode()) * 31) + this.userstate.hashCode()) * 31) + this.algoeverything.hashCode()) * 31) + this.units.hashCode()) * 31) + this.scenario.hashCode()) * 31) + this.debug.hashCode()) * 31) + this.production.hashCode()) * 31) + this.now.hashCode()) * 31) + this.language.hashCode()) * 31) + this.anonymousEntitlements.hashCode()) * 31) + this.abraIntegration.hashCode()) * 31) + this.abraParameters.hashCode()) * 31) + this.abraAllocations.hashCode()) * 31) + this.accessException.hashCode()) * 31) + this.subscriberScore.hashCode();
    }

    public final nk5 isGamesHybridWebView() {
        return this.isGamesHybridWebView;
    }

    public String toString() {
        return "OnsiteMessagingInput(name=" + this.name + ", version=" + this.version + ", url=" + this.url + ", uri=" + this.uri + ", referrer=" + this.referrer + ", deviceType=" + this.deviceType + ", pageViewID=" + this.pageViewID + ", canUseApplePay=" + this.canUseApplePay + ", isGamesHybridWebView=" + this.isGamesHybridWebView + ", country=" + this.country + ", continent=" + this.continent + ", meter=" + this.meter + ", jkidd=" + this.jkidd + ", subinfo=" + this.subinfo + ", samizdat=" + this.samizdat + ", abra=" + this.abra + ", offerEligibility=" + this.offerEligibility + ", userState=" + this.userState + ", userstate=" + this.userstate + ", algoeverything=" + this.algoeverything + ", units=" + this.units + ", scenario=" + this.scenario + ", debug=" + this.debug + ", production=" + this.production + ", now=" + this.now + ", language=" + this.language + ", anonymousEntitlements=" + this.anonymousEntitlements + ", abraIntegration=" + this.abraIntegration + ", abraParameters=" + this.abraParameters + ", abraAllocations=" + this.abraAllocations + ", accessException=" + this.accessException + ", subscriberScore=" + this.subscriberScore + ")";
    }

    public OnsiteMessagingInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, nk5 nk5Var11, nk5 nk5Var12, nk5 nk5Var13, nk5 nk5Var14, nk5 nk5Var15, nk5 nk5Var16, nk5 nk5Var17, nk5 nk5Var18, nk5 nk5Var19, nk5 nk5Var20, nk5 nk5Var21, nk5 nk5Var22, nk5 nk5Var23, nk5 nk5Var24, nk5 nk5Var25, nk5 nk5Var26, nk5 nk5Var27, nk5 nk5Var28, nk5 nk5Var29, nk5 nk5Var30, nk5 nk5Var31, nk5 nk5Var32) {
        zq3.h(nk5Var, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(nk5Var2, "version");
        zq3.h(nk5Var3, "url");
        zq3.h(nk5Var4, "uri");
        zq3.h(nk5Var5, "referrer");
        zq3.h(nk5Var6, "deviceType");
        zq3.h(nk5Var7, "pageViewID");
        zq3.h(nk5Var8, "canUseApplePay");
        zq3.h(nk5Var9, "isGamesHybridWebView");
        zq3.h(nk5Var10, "country");
        zq3.h(nk5Var11, "continent");
        zq3.h(nk5Var12, "meter");
        zq3.h(nk5Var13, "jkidd");
        zq3.h(nk5Var14, "subinfo");
        zq3.h(nk5Var15, "samizdat");
        zq3.h(nk5Var16, "abra");
        zq3.h(nk5Var17, "offerEligibility");
        zq3.h(nk5Var18, "userState");
        zq3.h(nk5Var19, "userstate");
        zq3.h(nk5Var20, "algoeverything");
        zq3.h(nk5Var21, "units");
        zq3.h(nk5Var22, "scenario");
        zq3.h(nk5Var23, "debug");
        zq3.h(nk5Var24, "production");
        zq3.h(nk5Var25, "now");
        zq3.h(nk5Var26, "language");
        zq3.h(nk5Var27, "anonymousEntitlements");
        zq3.h(nk5Var28, "abraIntegration");
        zq3.h(nk5Var29, "abraParameters");
        zq3.h(nk5Var30, "abraAllocations");
        zq3.h(nk5Var31, "accessException");
        zq3.h(nk5Var32, "subscriberScore");
        this.name = nk5Var;
        this.version = nk5Var2;
        this.url = nk5Var3;
        this.uri = nk5Var4;
        this.referrer = nk5Var5;
        this.deviceType = nk5Var6;
        this.pageViewID = nk5Var7;
        this.canUseApplePay = nk5Var8;
        this.isGamesHybridWebView = nk5Var9;
        this.country = nk5Var10;
        this.continent = nk5Var11;
        this.meter = nk5Var12;
        this.jkidd = nk5Var13;
        this.subinfo = nk5Var14;
        this.samizdat = nk5Var15;
        this.abra = nk5Var16;
        this.offerEligibility = nk5Var17;
        this.userState = nk5Var18;
        this.userstate = nk5Var19;
        this.algoeverything = nk5Var20;
        this.units = nk5Var21;
        this.scenario = nk5Var22;
        this.debug = nk5Var23;
        this.production = nk5Var24;
        this.now = nk5Var25;
        this.language = nk5Var26;
        this.anonymousEntitlements = nk5Var27;
        this.abraIntegration = nk5Var28;
        this.abraParameters = nk5Var29;
        this.abraAllocations = nk5Var30;
        this.accessException = nk5Var31;
        this.subscriberScore = nk5Var32;
    }

    public /* synthetic */ OnsiteMessagingInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, nk5 nk5Var7, nk5 nk5Var8, nk5 nk5Var9, nk5 nk5Var10, nk5 nk5Var11, nk5 nk5Var12, nk5 nk5Var13, nk5 nk5Var14, nk5 nk5Var15, nk5 nk5Var16, nk5 nk5Var17, nk5 nk5Var18, nk5 nk5Var19, nk5 nk5Var20, nk5 nk5Var21, nk5 nk5Var22, nk5 nk5Var23, nk5 nk5Var24, nk5 nk5Var25, nk5 nk5Var26, nk5 nk5Var27, nk5 nk5Var28, nk5 nk5Var29, nk5 nk5Var30, nk5 nk5Var31, nk5 nk5Var32, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6, (i & 64) != 0 ? nk5.a.b : nk5Var7, (i & 128) != 0 ? nk5.a.b : nk5Var8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nk5.a.b : nk5Var9, (i & 512) != 0 ? nk5.a.b : nk5Var10, (i & 1024) != 0 ? nk5.a.b : nk5Var11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nk5.a.b : nk5Var12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? nk5.a.b : nk5Var13, (i & 8192) != 0 ? nk5.a.b : nk5Var14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? nk5.a.b : nk5Var15, (i & 32768) != 0 ? nk5.a.b : nk5Var16, (i & 65536) != 0 ? nk5.a.b : nk5Var17, (i & 131072) != 0 ? nk5.a.b : nk5Var18, (i & 262144) != 0 ? nk5.a.b : nk5Var19, (i & 524288) != 0 ? nk5.a.b : nk5Var20, (i & Constants.MB) != 0 ? nk5.a.b : nk5Var21, (i & 2097152) != 0 ? nk5.a.b : nk5Var22, (i & 4194304) != 0 ? nk5.a.b : nk5Var23, (i & 8388608) != 0 ? nk5.a.b : nk5Var24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? nk5.a.b : nk5Var25, (i & 33554432) != 0 ? nk5.a.b : nk5Var26, (i & 67108864) != 0 ? nk5.a.b : nk5Var27, (i & 134217728) != 0 ? nk5.a.b : nk5Var28, (i & 268435456) != 0 ? nk5.a.b : nk5Var29, (i & 536870912) != 0 ? nk5.a.b : nk5Var30, (i & 1073741824) != 0 ? nk5.a.b : nk5Var31, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? nk5.a.b : nk5Var32);
    }
}
