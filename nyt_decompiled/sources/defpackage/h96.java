package defpackage;

import android.content.Context;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.WindowState;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.subauth.core.devsettings.purr.MockMutatePurrTCFGraphQLResults;
import com.nytimes.android.subauth.core.devsettings.purr.MockQueryPurrDirectivesGraphQLResults;
import com.nytimes.android.subauth.core.devsettings.purr.PurrEmailOptInResultOverride;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class h96 {
    public static final h96 a = new h96();

    private h96() {
    }

    public final un1 a(String str) {
        DevSettingSwitchItem a2;
        a2 = DevSettingSwitchItemKt.a("Enable Fail on Save PURR (Mutate PURR Prefs)", (r23 & 2) != 0 ? null : "Will Fail on Mutate PURR Prefs", (r23 & 4) != 0 ? null : "No Override on Fail Mutate PURR Prefs", "PURR.Mutate.Prefs.Enable.Fail", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable Fail on Save PURR (Mutate PURR Prefs)" : str == null ? "Enable Fail on Save PURR (Mutate PURR Prefs)" : str, (r23 & 512) != 0 ? null : null);
        return a2;
    }

    public final un1 b(String str) {
        DevSettingSwitchItem a2;
        a2 = DevSettingSwitchItemKt.a("Enable Fail on Save TCF (Mutate PURR TCF)", (r23 & 2) != 0 ? null : "Will Fail on Mutate PURR TCF", (r23 & 4) != 0 ? null : "No Override on Fail Mutate PURR TCF", "PURR.Mutate.TCF.Enable.Fail", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable Fail on Save TCF (Mutate PURR TCF)" : str == null ? "Enable Fail on Save TCF (Mutate PURR TCF)" : str, (r23 & 512) != 0 ? null : null);
        return a2;
    }

    public final un1 c(String str) {
        DevSettingSwitchItem a2;
        a2 = DevSettingSwitchItemKt.a("Enable Fail on Query PURR Directives", (r23 & 2) != 0 ? null : "Will Fail on Query PURR Directives", (r23 & 4) != 0 ? null : "No Override on Fail Query PURR Directives", "PURR.Query.Directives.Enable.Fail", (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : false, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : null, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Enable Fail on Query PURR Directives" : str == null ? "Enable Fail on Query PURR Directives" : str, (r23 & 512) != 0 ? null : null);
        return a2;
    }

    public final un1 d(Context context, String str) {
        zq3.h(context, "context");
        List<MockMutatePurrTCFGraphQLResults> C0 = d.C0(MockMutatePurrTCFGraphQLResults.values());
        ArrayList arrayList = new ArrayList(i.w(C0, 10));
        for (MockMutatePurrTCFGraphQLResults mockMutatePurrTCFGraphQLResults : C0) {
            arrayList.add(new zn1(mockMutatePurrTCFGraphQLResults.name(), mockMutatePurrTCFGraphQLResults.name(), null, false, 12, null));
        }
        return new DevSettingChoiceListPreferenceItem("Override Mutate PURR TCF GraphQL Responses", "mock_mutate_purr_prefs_graphql", arrayList, null, null, r41.a.a(), str == null ? "Override Mutate PURR TCF GraphQL Responses" : str, false, false, 408, null).j(context);
    }

    public final un1 e(Context context, String str) {
        zq3.h(context, "context");
        List<MockQueryPurrDirectivesGraphQLResults> C0 = d.C0(MockQueryPurrDirectivesGraphQLResults.values());
        ArrayList arrayList = new ArrayList(i.w(C0, 10));
        for (MockQueryPurrDirectivesGraphQLResults mockQueryPurrDirectivesGraphQLResults : C0) {
            arrayList.add(new zn1(mockQueryPurrDirectivesGraphQLResults.name(), mockQueryPurrDirectivesGraphQLResults.name(), null, false, 12, null));
        }
        return new DevSettingChoiceListPreferenceItem("Override Query PURR DirectivesGraphQL Responses", "mock_query_purr_directives_graphql", arrayList, null, null, r41.a.a(), str == null ? "Override Query PURR DirectivesGraphQL Responses" : str, false, false, 408, null).j(context);
    }

    public final un1 f(Context context, String str) {
        zq3.h(context, "context");
        List e = d.e(PurrEmailOptInResultOverride.values());
        ArrayList arrayList = new ArrayList(i.w(e, 10));
        Iterator it2 = e.iterator();
        while (it2.hasNext()) {
            arrayList.add(((PurrEmailOptInResultOverride) it2.next()).name());
        }
        List b = ao1.b(arrayList, false);
        return new DevSettingChoiceListPreferenceItem("Override Email Opt In Result", "Purr.Mutate.EmailOptIn.Override", b, (tn1) b.get(0), null, r41.a.a(), str == null ? "Override Email Opt In Result" : str, false, false, WindowState.NORMAL, null).j(context);
    }
}
