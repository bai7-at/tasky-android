package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import com.nytimes.android.subauth.core.purr.model.PrivacyDirectives;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceKind;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceName;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import org.threeten.bp.Duration;
import org.threeten.bp.Instant;

/* loaded from: classes4.dex */
public final class p96 implements o96 {
    public static final String COOKIE_FMT = "%s=%s";
    public static final a Companion = new a(null);
    private static final String LEGACY_OPT_IN_VALUE = "OPT_IN";
    private static final String LEGACY_PREF_LOCAL_TO_AGENT = "valueLocalToAgent";
    private static final String LEGACY_PREF_STORED_BY_NYT = "valueStoredByNyt";
    public static final String NYT_DOMAIN = ".nytimes.com";
    public static final String TCF_COOKIE = "fides_string";
    private final SharedPreferences defaultSharedPrefs;
    private boolean didLastTCFSaveFailInCurrentAppSession;
    private final JsonAdapter<PrivacyDirectives> directivesAdapter;
    private final JsonAdapter<UserPrivacyPreference> inputAdapter;
    private final i moshi;
    private final c05 nytCookieProvider;
    private final SharedPreferences purrSharedPreferences;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public p96(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, c05 c05Var) {
        zq3.h(sharedPreferences, "purrSharedPreferences");
        zq3.h(sharedPreferences2, "defaultSharedPrefs");
        zq3.h(c05Var, "nytCookieProvider");
        this.purrSharedPreferences = sharedPreferences;
        this.defaultSharedPrefs = sharedPreferences2;
        this.nytCookieProvider = c05Var;
        i d = new i.b().d();
        zq3.g(d, "build(...)");
        this.moshi = d;
        JsonAdapter<PrivacyDirectives> c = d.c(PrivacyDirectives.class);
        zq3.g(c, "adapter(...)");
        this.directivesAdapter = c;
        JsonAdapter<UserPrivacyPreference> c2 = d.c(UserPrivacyPreference.class);
        zq3.g(c2, "adapter(...)");
        this.inputAdapter = c2;
        z();
    }

    private final void A(SharedPreferences.Editor editor, Set set, Map map) {
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Object obj = map.get(str);
            if (obj instanceof String) {
                editor.putString(str, (String) obj);
            } else if (obj instanceof Double) {
                editor.putInt(str, (int) ((Number) obj).doubleValue());
            } else if (obj instanceof Integer) {
                editor.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Boolean) {
                editor.putBoolean(str, ((Boolean) obj).booleanValue());
            } else {
                if (zq3.c(obj, Boolean.valueOf(obj != null))) {
                    ul8.a.z("PURR").u("Unexpected TCF Decoded info type: (" + str + ": " + obj + "). Saving value as String", new Object[0]);
                    editor.putString(str, obj.toString());
                } else {
                    editor.remove(str);
                }
            }
        }
    }

    private final void B(Map map) {
        Set keySet;
        Set<String> stringSet = this.defaultSharedPrefs.getStringSet("Purr.TCF.Decoded.Info.Keys", null);
        if (stringSet != null) {
            SharedPreferences.Editor edit = this.defaultSharedPrefs.edit();
            ArrayList arrayList = new ArrayList();
            for (Object obj : stringSet) {
                if (!zq3.c((String) obj, "Purr.TCF.Tcf_String")) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                edit.remove((String) it2.next());
            }
            edit.remove("Purr.TCF.Decoded.Info.Keys");
            edit.commit();
        }
        if (map == null || (keySet = map.keySet()) == null) {
            return;
        }
        SharedPreferences.Editor edit2 = this.defaultSharedPrefs.edit();
        Set<String> c1 = kotlin.collections.i.c1(keySet);
        edit2.putStringSet("Purr.TCF.Decoded.Info.Keys", c1);
        zq3.e(edit2);
        A(edit2, c1, map);
        edit2.commit();
    }

    static /* synthetic */ void C(p96 p96Var, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        p96Var.B(map);
    }

    private final boolean w() {
        String string = this.purrSharedPreferences.getString("Purr.Directives.LastTS", null);
        if (string != null) {
            return Instant.parse(string).plusSeconds(t().getSeconds()).isAfter(Instant.now());
        }
        return false;
    }

    private final PrivacyDirectives x() {
        String string = this.purrSharedPreferences.getString("Purr.Directives", null);
        if (string != null) {
            return this.directivesAdapter.fromJson(string);
        }
        return null;
    }

    private final UserPrivacyPreference y() {
        String string = this.purrSharedPreferences.getString("Purr.Pref", null);
        JSONObject jSONObject = string != null ? new JSONObject(string) : null;
        Object obj = jSONObject != null ? jSONObject.get(LEGACY_PREF_LOCAL_TO_AGENT) : null;
        Object obj2 = jSONObject != null ? jSONObject.get(LEGACY_PREF_STORED_BY_NYT) : null;
        if (obj2 != null) {
            return new UserPrivacyPreference(UserPrivacyPreferenceName.CCPA, zq3.c(obj2, LEGACY_OPT_IN_VALUE) ? UserPrivacyPreferenceValue.OPT_IN : UserPrivacyPreferenceValue.OPT_OUT, UserPrivacyPreferenceKind.REGI);
        }
        if (obj != null) {
            return new UserPrivacyPreference(UserPrivacyPreferenceName.CCPA, zq3.c(obj, LEGACY_OPT_IN_VALUE) ? UserPrivacyPreferenceValue.OPT_IN : UserPrivacyPreferenceValue.OPT_OUT, UserPrivacyPreferenceKind.AGENT);
        }
        return null;
    }

    private final void z() {
        UserPrivacyPreference y;
        if (!this.purrSharedPreferences.contains("Purr.Pref") || (y = y()) == null) {
            return;
        }
        this.purrSharedPreferences.edit().remove("Purr.Pref").apply();
        o(y);
    }

    @Override // defpackage.o96
    public PrivacyDirectives a() {
        return x();
    }

    @Override // defpackage.o96
    public void b(String str) {
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.putString("Purr.Reject_All_TCF", str);
        edit.commit();
    }

    @Override // defpackage.o96
    public List c() {
        ArrayList arrayList = null;
        Set<String> stringSet = this.purrSharedPreferences.getStringSet("Purr.Pref.V2", null);
        if (stringSet != null) {
            Set<String> set = stringSet;
            arrayList = new ArrayList(kotlin.collections.i.w(set, 10));
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                UserPrivacyPreference fromJson = this.inputAdapter.fromJson((String) it2.next());
                zq3.e(fromJson);
                arrayList.add(fromJson);
            }
        }
        return arrayList;
    }

    @Override // defpackage.o96
    public boolean d() {
        return this.didLastTCFSaveFailInCurrentAppSession;
    }

    @Override // defpackage.o96
    public void e(String str) {
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.putString("Purr.Accept_All_TCF", str);
        edit.commit();
    }

    @Override // defpackage.o96
    public AgentTCFInfo f() {
        String string = this.purrSharedPreferences.getString("Purr.Agent.TCF", null);
        String string2 = this.purrSharedPreferences.getString("Purr.Agent.TCF.Hash", null);
        if (string == null || string2 == null) {
            return null;
        }
        return new AgentTCFInfo(string, string2);
    }

    @Override // defpackage.o96
    public void g(Duration duration) {
        zq3.h(duration, "duration");
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.putString("Purr.Directives.CacheTTL", duration.toString());
        edit.commit();
    }

    @Override // defpackage.o96
    public void h() {
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.putBoolean("Purr.TCF.Save.Failed", true);
        edit.commit();
        this.didLastTCFSaveFailInCurrentAppSession = true;
    }

    @Override // defpackage.o96
    public TCFInfo i() {
        String string = this.defaultSharedPrefs.getString("Purr.TCF.Tcf_String", null);
        Set<String> stringSet = this.defaultSharedPrefs.getStringSet("Purr.TCF.Decoded.Info.Keys", null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ?> all = this.defaultSharedPrefs.getAll();
        if (stringSet != null) {
            for (String str : stringSet) {
                zq3.e(str);
                linkedHashMap.put(str, all.get(str));
            }
        }
        return new TCFInfo(string, linkedHashMap, this.purrSharedPreferences.getString("Purr.TCF_Notices_Hash", null), this.purrSharedPreferences.getString("Purr.Latest_Notices_Hash", null));
    }

    @Override // defpackage.o96
    public String j() {
        return this.purrSharedPreferences.getString("Purr.Accept_All_TCF", null);
    }

    @Override // defpackage.o96
    public void k() {
        SharedPreferences.Editor edit = this.defaultSharedPrefs.edit();
        edit.remove("Purr.TCF.Tcf_String");
        edit.commit();
        C(this, null, 1, null);
        SharedPreferences.Editor edit2 = this.purrSharedPreferences.edit();
        edit2.remove("Purr.TCF_Notices_Hash");
        edit2.remove("Purr.Latest_Notices_Hash");
        edit2.remove("Purr.TCF.Save.Failed");
        edit2.remove("Purr.Agent.TCF");
        edit2.remove("Purr.Agent.TCF.Hash");
        edit2.commit();
        this.didLastTCFSaveFailInCurrentAppSession = false;
    }

    @Override // defpackage.o96
    public void l() {
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.remove("Purr.Directives");
        edit.remove("Purr.Directives.LastTS");
        edit.commit();
    }

    @Override // defpackage.o96
    public void m() {
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.remove("Purr.Pref.V2");
        edit.commit();
    }

    @Override // defpackage.o96
    public void n(PrivacyDirectives privacyDirectives) {
        zq3.h(privacyDirectives, "directives");
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.putString("Purr.Directives", this.directivesAdapter.toJson(privacyDirectives));
        edit.putString("Purr.Directives.LastTS", Instant.now().toString());
        edit.commit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r0 != null) goto L23;
     */
    @Override // defpackage.o96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference r7) {
        /*
            r6 = this;
            java.lang.String r0 = "input"
            defpackage.zq3.h(r7, r0)
            java.util.List r0 = r6.c()
            if (r0 == 0) goto L79
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference r3 = (com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference) r3
            com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceName r4 = r3.getName()
            com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceName r5 = r7.getName()
            if (r4 != r5) goto L38
            com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceKind r3 = r3.getKind()
            com.nytimes.android.subauth.core.purr.model.UserPrivacyPreferenceKind r4 = r7.getKind()
            if (r3 != r4) goto L38
            goto L16
        L38:
            r1.add(r2)
            goto L16
        L3c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.i.w(r1, r2)
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference r2 = (com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference) r2
            com.squareup.moshi.JsonAdapter<com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference> r3 = r6.inputAdapter
            java.lang.String r2 = r3.toJson(r2)
            r0.add(r2)
            goto L4b
        L61:
            java.util.Set r0 = kotlin.collections.i.b1(r0)
            if (r0 == 0) goto L79
            com.squareup.moshi.JsonAdapter<com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference> r1 = r6.inputAdapter
            java.lang.String r1 = r1.toJson(r7)
            r0.add(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.i.c1(r0)
            if (r0 == 0) goto L79
            goto L83
        L79:
            com.squareup.moshi.JsonAdapter<com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference> r0 = r6.inputAdapter
            java.lang.String r7 = r0.toJson(r7)
            java.util.Set r0 = kotlin.collections.b0.d(r7)
        L83:
            android.content.SharedPreferences r6 = r6.purrSharedPreferences
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r7 = "Purr.Pref.V2"
            android.content.SharedPreferences$Editor r6 = r6.putStringSet(r7, r0)
            r6.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p96.o(com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference):void");
    }

    @Override // defpackage.o96
    public void p(TCFInfo tCFInfo) {
        zq3.h(tCFInfo, "tcfInfo");
        String tcfString = tCFInfo.getTcfString();
        SharedPreferences.Editor edit = this.defaultSharedPrefs.edit();
        edit.putString("Purr.TCF.Tcf_String", tcfString);
        edit.commit();
        this.nytCookieProvider.r(tcfString);
        B(tCFInfo.getDecodedInfo());
        SharedPreferences.Editor edit2 = this.purrSharedPreferences.edit();
        edit2.putString("Purr.TCF_Notices_Hash", tCFInfo.getTcfNoticesHash());
        edit2.putString("Purr.Latest_Notices_Hash", tCFInfo.getLatestNoticesHash());
        edit2.remove("Purr.TCF.Save.Failed");
        edit2.commit();
        this.didLastTCFSaveFailInCurrentAppSession = false;
    }

    @Override // defpackage.o96
    public PrivacyDirectives q() {
        if (w()) {
            return x();
        }
        return null;
    }

    @Override // defpackage.o96
    public boolean r() {
        return this.purrSharedPreferences.getBoolean("Purr.TCF.Save.Failed", false);
    }

    @Override // defpackage.o96
    public void s() {
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.remove("Purr.Directives.LastTS");
        edit.commit();
    }

    @Override // defpackage.o96
    public Duration t() {
        String string = this.purrSharedPreferences.getString("Purr.Directives.CacheTTL", null);
        Duration parse = string != null ? Duration.parse(string) : null;
        return parse == null ? o96.Companion.a() : parse;
    }

    @Override // defpackage.o96
    public String u() {
        return this.purrSharedPreferences.getString("Purr.Reject_All_TCF", null);
    }

    @Override // defpackage.o96
    public void v(AgentTCFInfo agentTCFInfo) {
        zq3.h(agentTCFInfo, "agentTCFInfo");
        SharedPreferences.Editor edit = this.purrSharedPreferences.edit();
        edit.putString("Purr.Agent.TCF", agentTCFInfo.getAgentTcfString());
        edit.putString("Purr.Agent.TCF.Hash", agentTCFInfo.getAgentTCFNoticesHash());
        edit.commit();
    }
}
