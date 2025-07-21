package defpackage;

import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import com.nytimes.android.subauth.core.purr.model.PrivacyDirectives;
import com.nytimes.android.subauth.core.purr.model.UserPrivacyPreference;
import java.util.List;
import org.threeten.bp.Duration;

/* loaded from: classes4.dex */
public interface o96 {
    public static final a Companion = a.$$INSTANCE;
    public static final String KEY_ACCEPT_ALL_TCF = "Purr.Accept_All_TCF";
    public static final String KEY_AGENT_TCF = "Purr.Agent.TCF";
    public static final String KEY_AGENT_TCF_HASH = "Purr.Agent.TCF.Hash";
    public static final String KEY_LATEST_NOTICES_HASH = "Purr.Latest_Notices_Hash";
    public static final String KEY_PURR_DIRECTIVES = "Purr.Directives";
    public static final String KEY_PURR_DIRECTIVES_CACHE_TTL = "Purr.Directives.CacheTTL";
    public static final String KEY_PURR_DIRECTIVES_LAST_TS = "Purr.Directives.LastTS";
    public static final String KEY_PURR_PREF = "Purr.Pref";
    public static final String KEY_PURR_PREF_V2 = "Purr.Pref.V2";
    public static final String KEY_REJECT_ALL_TCF = "Purr.Reject_All_TCF";
    public static final String KEY_TCF_COOKIE_STRING = "Purr.TCF.Tcf_String";
    public static final String KEY_TCF_DECODED_INFO_KEYS = "Purr.TCF.Decoded.Info.Keys";
    public static final String KEY_TCF_NOTICES_HASH = "Purr.TCF_Notices_Hash";
    public static final String KEY_TCF_SAVE_FAILED = "Purr.TCF.Save.Failed";

    public static final class a {
        static final /* synthetic */ a $$INSTANCE = new a();
        public static final String KEY_ACCEPT_ALL_TCF = "Purr.Accept_All_TCF";
        public static final String KEY_AGENT_TCF = "Purr.Agent.TCF";
        public static final String KEY_AGENT_TCF_HASH = "Purr.Agent.TCF.Hash";
        public static final String KEY_LATEST_NOTICES_HASH = "Purr.Latest_Notices_Hash";
        public static final String KEY_PURR_DIRECTIVES = "Purr.Directives";
        public static final String KEY_PURR_DIRECTIVES_CACHE_TTL = "Purr.Directives.CacheTTL";
        public static final String KEY_PURR_DIRECTIVES_LAST_TS = "Purr.Directives.LastTS";
        public static final String KEY_PURR_PREF = "Purr.Pref";
        public static final String KEY_PURR_PREF_V2 = "Purr.Pref.V2";
        public static final String KEY_REJECT_ALL_TCF = "Purr.Reject_All_TCF";
        public static final String KEY_TCF_COOKIE_STRING = "Purr.TCF.Tcf_String";
        public static final String KEY_TCF_DECODED_INFO_KEYS = "Purr.TCF.Decoded.Info.Keys";
        public static final String KEY_TCF_NOTICES_HASH = "Purr.TCF_Notices_Hash";
        public static final String KEY_TCF_SAVE_FAILED = "Purr.TCF.Save.Failed";
        private static final Duration PURR_DIRECTIVES_CACHE_TTL_DEFAULT;

        static {
            Duration ofHours = Duration.ofHours(6L);
            zq3.g(ofHours, "ofHours(...)");
            PURR_DIRECTIVES_CACHE_TTL_DEFAULT = ofHours;
        }

        private a() {
        }

        public final Duration a() {
            return PURR_DIRECTIVES_CACHE_TTL_DEFAULT;
        }
    }

    PrivacyDirectives a();

    void b(String str);

    List c();

    boolean d();

    void e(String str);

    AgentTCFInfo f();

    void g(Duration duration);

    void h();

    TCFInfo i();

    String j();

    void k();

    void l();

    void m();

    void n(PrivacyDirectives privacyDirectives);

    void o(UserPrivacyPreference userPrivacyPreference);

    void p(TCFInfo tCFInfo);

    PrivacyDirectives q();

    boolean r();

    void s();

    Duration t();

    String u();

    void v(AgentTCFInfo agentTCFInfo);
}
