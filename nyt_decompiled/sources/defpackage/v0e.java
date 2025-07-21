package defpackage;

import android.util.JsonReader;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcbp;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v0e {
    public final String A;
    public final zzcbp B;
    public final String C;
    public final JSONObject D;
    public final JSONObject E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final int R;
    public final int S;
    public final boolean T;
    public final boolean U;
    public final String V;
    public final v1e W;
    public final boolean X;
    public final boolean Y;
    public final int Z;
    public final List a;
    public final String a0;
    public final int b;
    public final int b0;
    public final List c;
    public final String c0;
    public final List d;
    public final boolean d0;
    public final List e;
    public final q7b e0;
    public final int f;
    public final zzs f0;
    public final List g;
    public final String g0;
    public final List h;
    public final boolean h0;
    public final List i;
    public final JSONObject i0;
    public final List j;
    public final boolean j0;
    public final String k;
    public final JSONObject k0;
    public final String l;
    public final boolean l0;
    public final zzcag m;
    public final String m0;
    public final List n;
    public final boolean n0;
    public final List o;
    public final String o0;
    public final List p;
    public final String p0;
    public final List q;
    public final String q0;
    public final int r;
    public final boolean r0;
    public final List s;
    public final int s0;
    public final z0e t;
    public final String t0;
    public final List u;
    public final List u0;
    public final List v;
    public final JSONObject w;
    public final String x;
    public final String y;
    public final String z;

    v0e(JsonReader jsonReader) {
        List list;
        List list2;
        char c;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgaa t = zzgaa.t();
        zzgaa t2 = zzgaa.t();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        List list3 = t;
        List list4 = t2;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i3 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        int i4 = 0;
        z0e z0eVar = null;
        zzcbp zzcbpVar = null;
        q7b q7bVar = null;
        zzs zzsVar = null;
        String str19 = null;
        int i5 = -1;
        int i6 = -1;
        List list5 = emptyList11;
        List list6 = emptyList12;
        List list7 = emptyList13;
        List list8 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        String str20 = str18;
        String str21 = str20;
        int i7 = 0;
        int i8 = 0;
        zzcag zzcagVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? "" : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_name")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("recursive_server_response_data")) {
                        c = 'E';
                        break;
                    }
                    c = 65535;
                    break;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_consent")) {
                        c = 'F';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1785028569:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("parallel_key")) {
                        c = 'H';
                        break;
                    }
                    c = 65535;
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_name")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("nofill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("test_mode_enabled")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("extras")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("fill_urls")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_complete_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("valid_from_timestamp")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_id")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -570101180:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("late_load_urls")) {
                        c = 'I';
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rtb_native_required_assets")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_timeout_ms")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("content_url")) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("native_required_asset_viewability")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_offline_ad")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("id")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("data")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("request_id")) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_closable_area_disabled")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("consent_form_action_identifier")) {
                        c = 'G';
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("transaction_id")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rewards")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapter_response_info_key")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("cache_hit_urls")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_id")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_reward_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str22.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    emptyList = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 1:
                    i7 = b(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 2:
                    emptyList2 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 3:
                    emptyList3 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 4:
                    emptyList4 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 5:
                    i8 = c(jsonReader.nextInt());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 6:
                    emptyList5 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 7:
                    emptyList6 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\b':
                    emptyList7 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\t':
                    str21 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\n':
                    str20 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 11:
                    zzcagVar = zzcag.t0(t6b.e(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\f':
                    emptyList8 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\r':
                    emptyList9 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    break;
                case 14:
                    emptyList10 = t6b.d(jsonReader);
                    emptyList9 = list;
                    break;
                case 15:
                    list5 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 16:
                    i = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 17:
                    list6 = w0e.a(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 18:
                    z0eVar = new z0e(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 19:
                    list8 = w0e.a(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 20:
                    list7 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 21:
                    str = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 22:
                    jSONObject12 = t6b.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 23:
                    str2 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 24:
                    str3 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case EventType.SUBS /* 25 */:
                    str4 = t6b.h(jsonReader).toString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case EventType.CDN /* 26 */:
                    zzcbpVar = zzcbp.t0(t6b.h(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 27:
                    str5 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 28:
                    jSONObject7 = t6b.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    jSONObject8 = t6b.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '%':
                    i5 = d(jsonReader.nextString());
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '&':
                    i2 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '(':
                    str6 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ')':
                    jSONObject9 = t6b.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ',':
                    i3 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '-':
                    i6 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '.':
                    str7 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '/':
                    str8 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '0':
                    z11 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '1':
                    q7bVar = q7b.a(t6b.h(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '2':
                    jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '3':
                    zzsVar = zzs.t0(t6b.h(jsonReader));
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '4':
                    str9 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    z12 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '6':
                    jSONObject10 = t6b.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '7':
                    str10 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '8':
                    str17 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '9':
                    if (((Boolean) mpa.O6.l()).booleanValue()) {
                        str11 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ':':
                    if (((Boolean) mpa.O6.l()).booleanValue()) {
                        str12 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ';':
                    if (((Boolean) mpa.O6.l()).booleanValue()) {
                        str13 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (((Boolean) mpa.O6.l()).booleanValue()) {
                        str14 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    z13 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '>':
                    jSONObject11 = t6b.h(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '?':
                    z14 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case '@':
                    str19 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'A':
                    z15 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'B':
                    list3 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    z16 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'D':
                    str15 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'E':
                    str16 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'F':
                    z17 = jsonReader.nextBoolean();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'G':
                    i4 = jsonReader.nextInt();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case 'H':
                    str18 = jsonReader.nextString();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    list4 = t6b.d(jsonReader);
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    emptyList10 = list2;
                    emptyList9 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.a = emptyList;
        this.b = i7;
        this.c = emptyList2;
        this.d = emptyList3;
        this.g = emptyList4;
        this.f = i8;
        this.h = emptyList5;
        this.i = emptyList6;
        this.j = emptyList7;
        this.k = str21;
        this.l = str20;
        this.m = zzcagVar;
        this.n = emptyList8;
        this.o = emptyList9;
        this.p = emptyList10;
        this.q = list5;
        this.r = i;
        this.s = list6;
        this.t = z0eVar;
        this.u = list7;
        this.v = list8;
        this.x = str;
        this.w = jSONObject12;
        this.y = str2;
        this.z = str3;
        this.A = str4;
        this.B = zzcbpVar;
        this.C = str5;
        this.D = jSONObject7;
        this.E = jSONObject8;
        this.K = z;
        this.L = z2;
        this.M = z3;
        this.N = z4;
        this.O = z5;
        this.P = z6;
        this.Q = z7;
        this.R = i5;
        this.S = i2;
        this.U = z8;
        this.V = str6;
        this.W = new v1e(jSONObject9);
        this.X = z9;
        this.Y = z10;
        this.Z = i3;
        this.a0 = str7;
        this.b0 = i6;
        this.c0 = str8;
        this.d0 = z11;
        this.e0 = q7bVar;
        this.f0 = zzsVar;
        this.g0 = str9;
        this.h0 = z12;
        this.i0 = jSONObject10;
        this.F = str10;
        this.G = str11;
        this.H = str12;
        this.I = str13;
        this.J = str14;
        this.j0 = z13;
        this.k0 = jSONObject11;
        this.l0 = z14;
        this.m0 = str19;
        this.n0 = z15;
        this.e = list3;
        this.T = z16;
        this.o0 = str15;
        this.p0 = str16;
        this.q0 = str17;
        this.r0 = z17;
        this.s0 = i4;
        this.u0 = list4;
        this.t0 = str18;
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int b(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int c(int i) {
        if (i == 0 || i == 1 || i == 3) {
            return i;
        }
        return 0;
    }

    private static final int d(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
